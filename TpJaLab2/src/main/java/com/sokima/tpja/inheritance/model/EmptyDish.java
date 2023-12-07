package com.sokima.tpja.inheritance.model;

public class EmptyDish implements Dish, CaloricityCalculator{
    @Override
    public Double calculateCaloricity() {
        return 0.;
    }
}
