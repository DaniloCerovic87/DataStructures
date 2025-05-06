package Graph;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        System.out.println(graph.addVertex("A"));
        System.out.println(graph.addVertex("B"));
        graph.printGraph();
        graph.addEdge("A", "B");
        graph.printGraph();
    }

}
