package graphs.weighten.shortestpath;

import java.util.LinkedList;
import java.util.List;

/**
 * Represents a directed unweighted graph structure.
 * 
 * @author Vesko Kolev
 */
public class GraphWeightenUndirected {
	// Contains the vertices of the graph

	private static int[][] vertices = new int[10][10];

	public static int[][] getVertices() {
		return vertices;
	}

	public static void setVertices(int[][] vertices) {
		GraphWeightenUndirected.vertices = vertices;
	}

	/**
	 * Constructs the graph.
	 * 
	 * @param vertices
	 *            - the vertices of the graph.
	 */

	public GraphWeightenUndirected() {
	}

	public GraphWeightenUndirected(int[][] vertices) {
		this.vertices = vertices;
	}

	/**
	 * Adds new edge from i to j.
	 * 
	 * @param i
	 *            - the starting vertex.
	 * @param j
	 *            - the ending vertex.
	 */
	private void doubleCapacity(int newLenght) {
		int[][] newVerticies = new int[newLenght][newLenght];
		for (int k = 0; k < vertices.length; k++) {
			for (int m = 0; m < vertices[0].length; m++) {
				newVerticies[k][m] = vertices[k][m];
			}
		}
		vertices = newVerticies;
	}

	public void addEdge(int i, int j, int weight) {
		if (i >= vertices.length || j >= vertices[0].length) {
			int newLenght = Math.max(j, i) * 2;
			doubleCapacity(newLenght);
		}
		vertices[i][j] = weight;
		vertices[j][i] = weight;
	}

	public int getWeight(int i, int j) {
		return vertices[i][j];
	}

	/**
	 * Removes the edge from i to j if such exists.
	 * 
	 * @param i
	 *            - the starting vertex.
	 * @param j
	 *            - the ending vertex.
	 */
	public void removeEdge(int i, int j) {
		vertices[i][j] = 0;
		vertices[j][i] = 0;
	}

	public void removeNode(int i) {
		for (int j = 0; j < vertices[0].length; j++) {
			vertices[i][j] = 0;
			vertices[j][i] = 0;
		}
	}

	/**
	 * Checks whether there is an edge between vertex i and j.
	 * 
	 * @param i
	 *            - the starting vertex.
	 * @param j
	 *            - the ending vertex.
	 * @return true if there is an edge between vertex i and vertex j.
	 */
	public boolean hasEdge(int i, int j) {
		return vertices[i][j] > 0;
	}

	/**
	 * Returns the successors of a given vertex.
	 * 
	 * @param i
	 *            - the vertex.
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
