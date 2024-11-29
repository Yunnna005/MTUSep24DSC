package Lab07.Tests;

import Lab07.ListGraph;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListGraphTest {

    @Test
    public void testAddEdge() {
        ListGraph graph = new ListGraph(4, true);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        assertTrue(graph.isEdge(0, 1));
        assertFalse(graph.isEdge(1, 0));
        assertTrue(graph.isEdge(2, 3));
        assertFalse(graph.isEdge(0, 3));
    }

    @Test
    public void testRemoveEdge() {
        ListGraph graph = new ListGraph(4, false);
        graph.addEdge(0, 1);
        graph.removeEdge(0, 1);
        assertFalse(graph.isEdge(0, 1));
        assertFalse(graph.isEdge(1, 0));
    }
}
