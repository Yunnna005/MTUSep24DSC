package Lab07.Tests;

import static org.junit.jupiter.api.Assertions.*;

import Lab07.MatrixGraph;
import org.junit.jupiter.api.Test;

public class MatrixGraphTest {

    @Test
    public void testAddEdge() {
        MatrixGraph graph = new MatrixGraph(4, false);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        assertTrue(graph.isEdge(0, 1));
        assertTrue(graph.isEdge(1, 0));
        assertTrue(graph.isEdge(2, 3));
        assertFalse(graph.isEdge(0, 3));
    }

    @Test
    public void testRemoveEdge() {
        MatrixGraph graph = new MatrixGraph(4, true);
        graph.addEdge(0, 1);
        graph.removeEdge(0, 1);
        assertFalse(graph.isEdge(0, 1));
    }
}
