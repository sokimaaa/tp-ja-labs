package com.sokima.tpja.taskB;

/**
 * e.g. Composite Pattern
 */
public interface PolynomialComponent {

    PolynomialComponent addPoly(final PolynomialComponent polynomialComponent);

    default boolean isConstant() {
        return false;
    }

    default boolean isTerm() {
        return false;
    }
}
