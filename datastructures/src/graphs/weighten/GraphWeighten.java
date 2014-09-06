package graphs.weighten;

import java.util.LinkedList;
import java.util.List;
 
/**
 * Represents a directed unweighted graph structure.
 * @author Vesko Kolev
 */
public class GraphWeighten {
    // Contains the vertices of the graph
    static private int vertices[][]=new int [10][10] ;
   
    /**
     * Constructs the graph.
     * @param vertices - the vertices of the graph.
     */
    public GraphWeighten(int[][] vertices) {
        this.vertices = vertices;
    }
   
    /**
     * Adds new edge from i to j.
     * @param i - the starting vertex.
     * @param j - the ending vertex.
     */
    public void addEdge(int i, int j,int weight) {
        vertices[i][j] = weight;
    }
    public int getWeight (int i, int j) {
    	return vertices [i][j];
    }
    /**
     * Removes the edge from i to j if such exists.
     * @param i - the starting vertex.
     * @param j - the ending vertex.
     */
    public void removeEdge(int i, int j) {
        vertices[i][j] = 0;
    }
   
    /**
     * Checks whether there is an edge between vertex i and j.
     * @param i - the starting vertex.
     * @param j - the ending vertex.
     * @return true if there is an edge between
     * vertex i and vertex j.
     */
    public boolean hasEdge(int i, int j) {
        return vertices[i][j] > 0;
    }
   
    /**
     * Returns the successors of a given vertex.
     * @param i - the vertex.
     * @return list with all successors of the given vertex.
     */
   
    public List<Integer> getSuccessors(int i) {
        List<Integer> successors = new LinkedList<Integer>();
        
        for (int j = 0; j < vertices[i].length; j++) {
            if (vertices[i][j] > 0) {
                successors.add(j);
            }
        }
       
        return successors;
    }   	
    	
}
