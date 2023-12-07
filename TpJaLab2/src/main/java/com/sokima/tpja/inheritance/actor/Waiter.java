package com.sokima.tpja.inheritance.actor;

import com.sokima.tpja.inheritance.model.Dish;

import java.util.Scanner;

public class Waiter {
    private final Scanner scanner = new Scanner(System.in);

    private int countDoneDishes = 0;

    public boolean readyForNextOrder() {
        return scanner.hasNext();
    }

    public boolean isNotTired() {
        return countDoneDishes < 5;
    }

    public void endJobDay() {
        scanner.close();
        System.out.println("Waiter is end his job today.");
    }

    public String getOrder() {
        return scanner.nextLine();
    }

    public void deliverDish(final Dish dish) {
        System.out.println("Dish[" + dish + "] is being delivered.");
        countDoneDishes++;
    }
}
