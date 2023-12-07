package com.sokima.tpja;

@FunctionalInterface
public interface TripleIntegerFunction<T> {
    T apply(Integer int1, Integer int2, Integer int3);
}
