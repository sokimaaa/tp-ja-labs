package com.sokima.tpja.inheritance.model.salad.vegetable;

public class Carrot extends Vegetable {
    private static final Integer CALORICITY_PER_WEIGHT = 3;

    public Carrot(final Double weight) {
        super(weight);
    }

    @Override
    public Double calculateCaloricity() {
        return getWeight() * CALORICITY_PER_WEIGHT;
    }
}
