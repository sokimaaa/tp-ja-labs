package com.sokima.tpja.inheritance.model.salad;

import com.sokima.tpja.inheritance.model.CaloricityCalculator;
import com.sokima.tpja.inheritance.model.Dish;

public interface SaladComponent extends Dish, CaloricityCalculator {
    // some salad specific params-
}
