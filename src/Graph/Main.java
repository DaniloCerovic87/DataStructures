package Graph;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        System.out.println(graph.addVertex("A"));
        System.out.println(graph.addVertex("B"));
        graph.printGraph();
        System.out.println(graph.addEdge("A", "B"));
        System.out.println(graph.addEdge("A", "C"));
        graph.printGraph();
        System.out.println(graph.removeEdge("A", "C"));
        System.out.println(graph.removeEdge("A", "B"));
        graph.printGraph();
        System.out.println(graph.removeVertex("A"));
        graph.printGraph();
        System.out.println(graph.removeVertex("B"));
        graph.printGraph();
    }

}
