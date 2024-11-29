package Lab07;

public class MatrixGraph extends AbstractGraph {
    //entries in matrix are 1.0 or 0.0
    //1.0 indicates an edge.
    //0.0 indicates no edge
    
    private double[][] matrix;
    
    public MatrixGraph(int nV, boolean direct){
        super(nV, direct);
        matrix = new double[nV][nV];
        for (int row = 0; row < nV; row++)
            for (int col = 0; col < nV; col++)
                    matrix[row][col] = 0.0;        
    }

    public boolean isEdge(int source, int dest) {
        if (matrix[source][dest] == 1.0)
            return true;
        else
            return false;
        
    }

    public void addEdge(int s, int d) {

        if (s < 0 || s >= getNumVertices() || d < 0 || d >= getNumVertices()) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        matrix[s][d] = 1.0;
        if (!isDirected()) {
            matrix[d][s] = 1.0;
        }
        if (s < 0 || s >= getNumVertices())
            throw new IllegalArgumentException();
        // likewise for d
        matrix[s][d] = 1.0;
        if (!isDirected())
            matrix[d][s] = 1.0;
    }

    public void removeEdge(int s, int d) {
        if (s < 0 || s >= getNumVertices() || d < 0 || d >= getNumVertices()) {
            throw new IllegalArgumentException("Invalid vertex index");
        }
        matrix[s][d] = 0.0;
        if (!isDirected()) {
            matrix[d][s] = 0.0;
        }
    }
}
