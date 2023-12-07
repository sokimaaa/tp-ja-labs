package com.sokima.tpja.taskB;

public class Main {

    public static void main(String[] args) {
        final Polynomial polynomial = new Polynomial();
        polynomial.addComponent(new PolynomialConstant(-10));
        polynomial.addComponent(new PolynomialTerm(-5, 5));
        polynomial.addComponent(new PolynomialTerm(3, 3));
        polynomial.addComponent(new PolynomialTerm(1, 1));

        PolynomialUtils.printPolynomial(polynomial);
        System.out.println("+");

        final Polynomial polynomial1 = new Polynomial();
        polynomial1.addComponent(new PolynomialConstant(-10));
        polynomial1.addComponent(new PolynomialTerm(99, 1));

        PolynomialUtils.printPolynomial(polynomial1);
        System.out.println("+");


        final Polynomial polynomial2 = new Polynomial();
        polynomial2.addComponent(new PolynomialTerm(3, 7));
        polynomial2.addComponent(new PolynomialTerm(7, 3));

        PolynomialUtils.printPolynomial(polynomial2);
        System.out.println("=");

        final PolynomialComponent polynomialComponent = polynomial
                .addPoly(polynomial2)
                .addPoly(polynomial1);

        PolynomialUtils.printPolynomial(polynomialComponent);
    }
}
