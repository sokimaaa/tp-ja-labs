package com.sokima.tpja;

public class MaxTripleIntegerFunction implements TripleIntegerFunction<Integer> {
    @Override
    public Integer apply(Integer int1, Integer int2, Integer int3) {
        return Math.max(Math.max(int1, int2), int3);
    }
}
