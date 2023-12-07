package com.sokima.tpja.inheritance.model.salad.meal;

public class ChickenMeal extends Meal {
    private static final Integer CALORICITY_PER_WEIGHT = 115;

    public ChickenMeal(final Double weight) {
        super(weight);
    }

    @Override
    public Double calculateCaloricity() {
        return getWeight() * CALORICITY_PER_WEIGHT;
    }
}
