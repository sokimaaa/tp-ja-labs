package com.sokima.tpja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AdjacencyList<T> implements Graph<T> {
    // Adjacency List Graph Implementation
    // Non-oriented

    private final int[][] adjacencyMatrix;
    private final T[] vertexes;
    private Iterator<T> iterator;

    @SuppressWarnings("unchecked")
    private AdjacencyList(final int vertexCount) {
        this.adjacencyMatrix = new int[vertexCount][vertexCount];
        this.vertexes = (T[]) new Object[vertexCount];
    }

    @Override
    public Iterator<T> iterator() {
        if (iterator == null) {
            return List.of(vertexes).iterator();
        }

        return iterator;
    }

    @Override
    public AdjacencyList<T> addVertex(final int vertex, final T value) {
        return addVertex(vertex, value, new int[0]);
    }

    @Override
    public AdjacencyList<T> addVertex(final int vertex, final T value, final int[] edges) {
        var tBuilder = Builder.<T>newGraphBuilder(vertex + 1);
        for (int i = 0; i < this.vertexes.length; i++) {
            final int[] adjacencyMatrixForI = adjacencyMatrix[i];

            tBuilder = tBuilder.setGraphNode(i, vertexes[i], getEdges(adjacencyMatrixForI));
        }

        tBuilder.setGraphNode(vertex, value, edges);
        return tBuilder.buildGraph();
    }

    private int[] getEdges(int[] adjacencyMatrixForI) {
        List<Integer> edges = new ArrayList<>();
        for (int i = 0; i < adjacencyMatrixForI.length; i++) {
            if (adjacencyMatrixForI[i] == 1) {
                edges.add(i);
            }
        }

        return edges.stream().mapToInt(x -> x).toArray();
    }

    @Override
    public int size() {
        return vertexes.length;
    }

    private void setNode(final int vertex, final T value) {
        setNode(vertex, value, new int[0]);
    }

    private void setNode(final int vertex, final T value, final int[] edges) {
        assert vertex < vertexes.length; // for sake of simplicity
        vertexes[vertex] = value;

        for (final int edge : edges) {
            assert edge < vertexes.length;

            adjacencyMatrix[vertex][edge] = 1;
            adjacencyMatrix[edge][vertex] = 1;
        }
    }

    private void setIterator(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("AdjacencyMatrix[\n");
        for (int[] line : adjacencyMatrix) {
            builder.append(Arrays.toString(line))
                    .append('\n');
        }
        return builder.append("]").toString();
    }

    public static class Builder<T> {
        private final AdjacencyList<T> adjacencyList;

        private Builder(final int vertexCount) {
            this.adjacencyList = new AdjacencyList<>(vertexCount);
        }

        public static <F> Builder<F> newGraphBuilder(final int vertexCount) {
            return new Builder<>(vertexCount);
        }

        public Builder<T> setGraphNode(final int vertex, final T value) {
            adjacencyList.setNode(vertex, value);
            return this;
        }

        public Builder<T> setGraphNode(final int vertex, final T value, final int[] edges) {
            adjacencyList.setNode(vertex, value, edges);
            return this;
        }

        public Builder<T> setGraphIterator(final Iterator<T> iterator) {
            adjacencyList.setIterator(iterator);
            return this;
        }

        public AdjacencyList<T> buildGraph() {
            return this.adjacencyList;
        }
    }

    private record Node<T>(
            T value
    ) {
    }
}
