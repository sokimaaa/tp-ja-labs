package com.sokima.tpja.inheritance.actor;

import com.sokima.tpja.inheritance.model.Dish;
import com.sokima.tpja.inheritance.model.EmptyDish;
import com.sokima.tpja.inheritance.model.salad.Salad;
import com.sokima.tpja.inheritance.model.salad.meal.ChickenMeal;
import com.sokima.tpja.inheritance.model.salad.vegetable.Carrot;

import java.util.ArrayList;

public class Chef {
    public Dish cookDish(final String order) {
        return switch (order) {
            case "primary salad" -> {
                final Salad salad = new Salad(new ArrayList<>());
                final Carrot carrot = new Carrot(300.);
                final ChickenMeal chickenMeal = new ChickenMeal(500.);

                salad.addSaladComponent(carrot);
                salad.addSaladComponent(chickenMeal);

                yield salad;
            }
            case "vegetable salad" -> {
                final Salad salad = new Salad(new ArrayList<>());
                final Carrot carrot = new Carrot(300.);

                salad.addSaladComponent(carrot);

                yield salad;
            }
            default -> new EmptyDish();
        };
    }
}
