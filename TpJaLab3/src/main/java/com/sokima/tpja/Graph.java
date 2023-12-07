package com.sokima.tpja;

import java.util.Iterator;

public interface Graph<T> extends Iterable<T> /* extends Collection<T> */ {

    int size();

    @Override
    Iterator<T> iterator();

    /**
     * Makes copy of graph with a new added vertex, without edges.
     *
     * @param vertex the vertex identifier
     * @param value  the vertex value
     * @return {@link Graph<T>}
     */
    Graph<T> addVertex(final int vertex, final T value);

    /**
     * Makes copy of graph with a new added vertex.
     *
     * @param vertex the vertex identifier
     * @param value  the vertex value
     * @param edges  the edges identifiers
     * @return {@link Graph<T>}
     */
    Graph<T> addVertex(final int vertex, final T value, final int[] edges);
}
