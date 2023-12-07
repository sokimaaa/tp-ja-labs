package com.sokima.tpja.inheritance.util;

import com.sokima.tpja.inheritance.model.CaloricityCalculator;
import com.sokima.tpja.inheritance.model.salad.vegetable.Vegetable;

import java.util.Comparator;
import java.util.List;

public final class VegetableUtils {

    private VegetableUtils() {
        throw new UnsupportedOperationException("Util class shouldn't be instantiated");
    }

    public static List<Vegetable> filterByCaloricity(
            final List<Vegetable> vegetables,
            final double lowerBound,
            final double upperBound
    ) {
        return vegetables.stream()
                .filter(vegetable -> {
                            final Double caloricity = vegetable.calculateCaloricity();
                            return caloricity > lowerBound && caloricity < upperBound;
                        }
                )
                .toList();
    }

    public static List<Vegetable> sortByCaloricity(final List<Vegetable> vegetables) {
        return vegetables.stream()
                .sorted(
                        Comparator.<Vegetable>comparingDouble(CaloricityCalculator::calculateCaloricity).reversed()
                )
                .toList();
    }

    public static List<Vegetable> sortByWeight(final List<Vegetable> vegetables) {
        return vegetables.stream()
                .sorted(
                        Comparator.comparingDouble(Vegetable::getWeight).reversed()
                )
                .toList();
    }
}
