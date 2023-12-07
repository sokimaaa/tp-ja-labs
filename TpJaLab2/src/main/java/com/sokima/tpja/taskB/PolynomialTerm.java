package com.sokima.tpja.taskB;

/**
 * Leaf class representing a term with a variable raised to a power, e.g.
 * P(x) = ... + ax^b,
 * a - coefficient, b - exponent
 */
public class PolynomialTerm implements PolynomialComponent {
    private Integer coefficient;
    private Integer exponent;

    @Override
    public PolynomialComponent addPoly(PolynomialComponent polynomialComponent) {
        if (polynomialComponent instanceof PolynomialTerm poly) {
            if (this.exponent.equals(poly.exponent)) {
                return new PolynomialTerm(this.coefficient + poly.coefficient, this.exponent);
            } else {
                final Polynomial polynomial = new Polynomial();
                polynomial.addComponent(poly);
                polynomial.addComponent(this);
                return polynomial;
            }
        } else if (polynomialComponent instanceof PolynomialConstant poly) {
            final Polynomial polynomial = new Polynomial();
            polynomial.addComponent(this);
            polynomial.addComponent(poly);
            return polynomial;
        } else if (polynomialComponent instanceof Polynomial poly) {
            final Polynomial polynomial = new Polynomial();
            for (final PolynomialComponent component : poly.getComponents()) {
                if (component.isTerm()) {
                    final PolynomialTerm term = (PolynomialTerm) component;
                    if (term.exponent.equals(this.exponent)) {
                        this.coefficient += term.coefficient;
                    } else {
                        polynomial.addComponent(component);
                    }
                } else {
                    polynomial.addComponent(component);
                }
            }

            polynomial.addComponent(this);
            return polynomial;
        }

        return this;
    }

    @Override
    public boolean isTerm() {
        return true;
    }

    public PolynomialTerm() {
    }

    public PolynomialTerm(Integer coefficient, Integer exponent) {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public Integer getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public Integer getExponent() {
        return exponent;
    }

    public void setExponent(Integer exponent) {
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        return "PolynomialTerm{" +
                "coefficient=" + coefficient +
                ", exponent=" + exponent +
                '}';
    }
}
