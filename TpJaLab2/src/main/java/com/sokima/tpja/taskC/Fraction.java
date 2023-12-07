package com.sokima.tpja.taskC;

public class Fraction implements Summarable<Fraction> {

    // up
    private final ComplexNumber divider;

    // down
    private final ComplexNumber dividend;

    @Override
    public Fraction sum(final Fraction that) {
        final var newDividend = this.dividend.multiply(that.dividend);
        final var newThisDivider = this.divider.multiply(that.dividend);
        final var newThatDivider = that.divider.multiply(this.dividend);
        final var newDivider = newThisDivider.sum(newThatDivider);
        return new Fraction(newDivider, newDividend);
    }

    public Fraction(final ComplexNumber divider, final ComplexNumber dividend) {
        this.divider = divider;
        this.dividend = dividend;
    }

    public ComplexNumber getDividend() {
        return dividend;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        return builder.append("Fraction[")
                .append(divider)
                .append(",")
                .append(dividend)
                .append("]")
                .toString();
    }
}
