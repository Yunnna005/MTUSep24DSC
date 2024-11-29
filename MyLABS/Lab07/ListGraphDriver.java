package Lab07;

public class ListGraphDriver {
    public static void main(String[] args) {
        ListGraph graph = new ListGraph(4, true);
        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        System.out.println("Edge between 0 and 1: " + graph.isEdge(0, 1));
        System.out.println("Edge between 1 and 0: " + graph.isEdge(1, 0)); // Directed
        System.out.println("Edge between 2 and 3: " + graph.isEdge(2, 3));

        System.out.println("Removing edge between 0 and 1...");
        graph.removeEdge(0, 1);
        System.out.println("Edge between 0 and 1: " + graph.isEdge(0, 1));
    }
}
