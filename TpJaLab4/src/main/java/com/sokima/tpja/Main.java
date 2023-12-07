package com.sokima.tpja;

public class Main {
    public static void main(String[] args) {
        final TripleIntegerFunction<Integer> tripleIntegerFunction = new MaxTripleIntegerFunction();
        final TripleIntegerFunction<Integer> tripleIntegerFunctionLambda = (int1, int2, int3) -> Math.max(Math.max(int1, int2), int3);

        final Integer apply = tripleIntegerFunction.apply(1, 2, 3);
        final Integer applyLambda = tripleIntegerFunctionLambda.apply(1, 2, 3);
        System.out.println(apply + " : " + applyLambda);
    }
}