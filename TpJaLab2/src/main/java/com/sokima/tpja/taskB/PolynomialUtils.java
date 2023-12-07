package com.sokima.tpja.taskB;

public final class PolynomialUtils {

    private PolynomialUtils() {
        throw new UnsupportedOperationException("Util class shouldn't be instantiated");
    }

    public static void printPolynomial(final PolynomialComponent polynomialComponent) {
        System.out.println(printPolynomial(new StringBuilder(), polynomialComponent));
    }

    private static StringBuilder printPolynomial(final StringBuilder polynomialBuilder, final PolynomialComponent polynomialComponent) {
        if (polynomialComponent instanceof PolynomialConstant polynomialConstant) {
            if (!polynomialBuilder.isEmpty()) {
                final Integer constant = polynomialConstant.getConstant();
                if (constant == 0) {
                    // we dont want to see such constant
                } else if (constant > 0) {
                    polynomialBuilder.append("+")
                            .append(constant);
                } else {
                    polynomialBuilder.append(constant);
                }
            } else {
                final Integer constant = polynomialConstant.getConstant();
                if (constant == 0) {
                    // we dont want to see such constant
                } else {
                    polynomialBuilder.append(polynomialConstant.getConstant());
                }
            }
        }

        if (polynomialComponent instanceof PolynomialTerm polynomialTerm) {
            if (!polynomialBuilder.isEmpty()) {
                final Integer coefficient = polynomialTerm.getCoefficient();
                if (coefficient == 0) {
                    // we dont want to see polynomial
                } else if (coefficient > 0) {
                    polynomialBuilder.append("+")
                            .append(coefficient)
                            .append("x^")
                            .append(polynomialTerm.getExponent());
                } else {
                    polynomialBuilder.append(coefficient)
                            .append("x^")
                            .append(polynomialTerm.getExponent());
                }
            } else {
                final Integer coefficient = polynomialTerm.getCoefficient();
                if (coefficient == 0) {
                    // we dont want to see polynomial
                } else {
                    polynomialBuilder.append(coefficient)
                            .append("x^")
                            .append(polynomialTerm.getExponent());
                }
            }
        }

        if (polynomialComponent instanceof Polynomial polynomial) {
            for (final PolynomialComponent component : polynomial.getComponents()) {
                printPolynomial(polynomialBuilder, component);
            }
        }

        return polynomialBuilder;
    }
}
