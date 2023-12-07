package com.sokima.tpja.inheritance.model.salad.meal;

import com.sokima.tpja.inheritance.model.salad.SaladComponent;

public abstract class Meal implements SaladComponent {
    private final Double weight;
    // some other fields


    protected Meal(final Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
}
