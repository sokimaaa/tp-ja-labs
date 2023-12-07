package com.sokima.tpja.inheritance.model.salad.vegetable;

import com.sokima.tpja.inheritance.model.salad.SaladComponent;

public abstract class Vegetable implements SaladComponent {
    private final Double weight;

    // some other fields

    protected Vegetable(final Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }
}
