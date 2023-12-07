package com.sokima.tpja.taskB;

import java.util.Arrays;

/**
 * Composite class representing a polynomial as a combination of terms + constants, e.g.
 * P(x) = x^2 + 5x^3 + 5
 */
public class Polynomial implements PolynomialComponent {
    private PolynomialComponent[] components = new PolynomialComponent[0];

    @Override
    public PolynomialComponent addPoly(PolynomialComponent polynomialComponent) {
        if (polynomialComponent instanceof PolynomialConstant poly) {
            return poly.addPoly(this);
        } else if (polynomialComponent instanceof PolynomialTerm poly) {
            return poly.addPoly(this);
        } else if (polynomialComponent instanceof Polynomial poly) {
            PolynomialComponent updatablePoly = this;

            for (final PolynomialComponent component : poly.getComponents()) {
                updatablePoly = updatablePoly.addPoly(component);
            }

            return updatablePoly;
        }

        return this;
    }

    public Polynomial() {
    }

    public Polynomial(PolynomialComponent[] components) {
        this.components = components;
    }

    public PolynomialComponent[] getComponents() {
        return components;
    }

    public void addComponent(PolynomialComponent component) {
        final PolynomialComponent[] newComponents = new PolynomialComponent[components.length + 1];
        System.arraycopy(components, 0, newComponents, 0, components.length);
        newComponents[components.length] = component;
        components = newComponents;
    }

    public void setComponents(PolynomialComponent[] components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "components=" + Arrays.toString(components) +
                '}';
    }
}
