package com.sokima.tpja.inheritance.model.salad;

import com.sokima.tpja.inheritance.model.CaloricityCalculator;

import java.util.List;

public class Salad implements SaladComponent {
    private final List<SaladComponent> saladComponents;

    public Salad(final List<SaladComponent> saladComponents) {
        this.saladComponents = saladComponents;
    }

    public void addSaladComponent(final SaladComponent component) {
        this.saladComponents.add(component);
    }

    public List<SaladComponent> getSaladComponents() {
        return saladComponents;
    }

    @Override
    public Double calculateCaloricity() {
        return saladComponents.stream()
                .mapToDouble(CaloricityCalculator::calculateCaloricity)
                .sum();
    }
}
