package com.sokima.tpja.inheritance;

import com.sokima.tpja.inheritance.actor.Chef;
import com.sokima.tpja.inheritance.actor.Waiter;
import com.sokima.tpja.inheritance.model.Dish;

import java.util.stream.Stream;

public class Restaurant {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Chef chef = new Chef();

        while (waiter.readyForNextOrder() && waiter.isNotTired()) {
            final String order = waiter.getOrder();
            final Dish dish = chef.cookDish(order);
            waiter.deliverDish(dish);
        }

        waiter.endJobDay();
    }
}
