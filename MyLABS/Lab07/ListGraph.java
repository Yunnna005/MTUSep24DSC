package Lab07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListGraph extends AbstractGraph {
    private List<LinkedList<Integer>> adjacencyLists;

    public ListGraph(int nV, boolean direct){
        super(nV, direct);
        adjacencyLists = new ArrayList<>(nV);
        for (int i= 0;i < nV; i++) {
            adjacencyLists.add(new LinkedList<>());
        }
    }

    // In code below, s represents source of an edge and d represents destination of an edge
    // e.g. if (2, 3) is an edge, 2 is the source and 3 is the destination

    @Override
    public boolean isEdge(int s, int d) {
        return adjacencyLists.get(s).contains(d);
    }

    @Override
    public void addEdge(int s, int d) {

        if (s < 0 || s >= getNumVertices() || d < 0 || d >= getNumVertices()) {
            throw new IllegalArgumentException("Invalid vertex index");
        }

        // Or in 1 step:
        adjacencyLists.get(s).add(d);
        
        // Then if list is undirected, add s to d's list
        if (!isDirected()) {
            adjacencyLists.get(d).add(s);
        }
    }

    @Override
    public void removeEdge(int s, int d) {
        if (s < 0 || s >= getNumVertices() || d < 0 || d >= getNumVertices()) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        adjacencyLists.get(s).remove((Integer) d);
        if (!isDirected()) {
            adjacencyLists.get(d).remove((Integer) s);
        }
    }

    @Override
    public void bfs(int startVertex) {
        if (startVertex < 0 || startVertex >= getNumVertices()) {
            throw new IllegalArgumentException("Invalid start vertex");
        }

        int[] state = new int[getNumVertices()];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startVertex);
        state[startVertex] = 1;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.println("Visited vertex: " + currentVertex);
            state[currentVertex] = 2;

            for (int neighbor : adjacencyLists.get(currentVertex)) {
                if (state[neighbor] == 0) {
                    queue.offer(neighbor);
                    state[neighbor] = 1;
                }
            }
        }
    }
}
