package com.sokima.tpja.taskC;

public class Main {

    public static void main(String[] args) {
        final ComplexNumber divider1 = new ComplexNumber(3, 0);
        final ComplexNumber dividend1 = new ComplexNumber(2, 0);

        final ComplexNumber divider2 = new ComplexNumber(3, 0);
        final ComplexNumber dividend2 = new ComplexNumber(2, 0);

        final Fraction fraction1 = new Fraction(divider1, dividend1);
        final Fraction fraction2 = new Fraction(divider2, dividend2);

        // could be written Simplify Fraction method that not asked by task
        System.out.println(fraction1.sum(fraction2));
    }
}
