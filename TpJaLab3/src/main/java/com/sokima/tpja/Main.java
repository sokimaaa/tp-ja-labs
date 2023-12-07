package com.sokima.tpja;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = AdjacencyList.Builder.<String>newGraphBuilder(5)
                .setGraphNode(0, "Vertex-1", new int[] {1, 2})
                .setGraphNode(1, "Vertex-2", new int[] {3})
                .setGraphNode(2, "Vertex-3", new int[] {1})
                .setGraphNode(3, "Vertex-4", new int[] {3, 4})
                .setGraphNode(4, "Vertex-5")
                .buildGraph();

        final Graph<String> updatedGraph1 = graph.addVertex(4, "New-Vertex-5");
        final Graph<String> updatedGraph = graph.addVertex(5, "Vertex-6", new int[] {1});

        System.out.println(updatedGraph1);
        updatedGraph1.forEach(System.out::println);
    }
}