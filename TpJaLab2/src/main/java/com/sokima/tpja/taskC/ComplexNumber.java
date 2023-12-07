package com.sokima.tpja.taskC;

public class ComplexNumber implements Summarable<ComplexNumber>, Multiplable<ComplexNumber> {
    private static final String I = "i";

    private final Integer realPart;
    private final Integer imaginePart;

    @Override
    public ComplexNumber multiply(final ComplexNumber that) {
        // (a + bi) · (c + di) = (ac – bd) + (ad + bc)i
        return new ComplexNumber(
                this.realPart * that.realPart - that.imaginePart * that.imaginePart,
                this.realPart * that.imaginePart + this.imaginePart * that.realPart
                );
    }

    @Override
    public ComplexNumber sum(final ComplexNumber complexNumber) {
        return new ComplexNumber(this.realPart + complexNumber.realPart, this.imaginePart + complexNumber.imaginePart);
    }

    public ComplexNumber(final Integer realPart, final Integer imaginePart) {
        this.realPart = realPart;
        this.imaginePart = imaginePart;
    }

    public Integer getRealPart() {
        return realPart;
    }

    public Integer getImaginePart() {
        return imaginePart;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("ComplexNumber[");
        if (realPart != 0) {
            builder.append(realPart);
        }

        if (imaginePart > 0 && realPart != 0) {
            builder.append("+")
                    .append(imaginePart)
                    .append(I);
        }

        if (imaginePart > 0 && realPart == 0) {
            builder.append(imaginePart)
                    .append(I);
        }

        if (imaginePart < 0) {
            builder.append(imaginePart)
                    .append(I);
        }

        return builder.append("]").toString();
    }
}
