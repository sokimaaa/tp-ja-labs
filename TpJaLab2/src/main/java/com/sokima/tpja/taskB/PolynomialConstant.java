package com.sokima.tpja.taskB;

/**
 * Leaf class representing a constant term, e.g.
 * P(x) = ... + 5
 */
public class PolynomialConstant implements PolynomialComponent {
    private Integer constant;

    @Override
    public PolynomialComponent addPoly(final PolynomialComponent polynomialComponent) {
        if (polynomialComponent instanceof PolynomialConstant poly) {
            return new PolynomialConstant(this.constant + poly.getConstant());
        } else if (polynomialComponent instanceof PolynomialTerm poly) {
            final Polynomial polynomial = new Polynomial();
            polynomial.addComponent(poly);
            polynomial.addComponent(this);
            return polynomial;
        } else if (polynomialComponent instanceof Polynomial poly) {
            final Polynomial polynomial = new Polynomial();
            for (final PolynomialComponent component : poly.getComponents()) {
                if (component.isConstant()) {
                    this.constant += ((PolynomialConstant) component).getConstant();
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
    public boolean isConstant() {
        return true;
    }

    public PolynomialConstant() {
    }

    public PolynomialConstant(Integer constant) {
        this.constant = constant;
    }

    public Integer getConstant() {
        return constant;
    }

    public void setConstant(Integer constant) {
        this.constant = constant;
    }

    @Override
    public String toString() {
        return "PolynomialConstant{" +
                "constant=" + constant +
                "}";
    }
}
