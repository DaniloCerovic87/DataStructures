package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {

    private HashMap<String, List<String>> adjList = new HashMap<>();

    public HashMap<String, List<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

}
