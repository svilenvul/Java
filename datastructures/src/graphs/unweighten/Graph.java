package graphs.unweighten;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

/**
 * Represents a directed unweighted graph structure.
 */
public class Graph {
	// Contains the vertices of the graph

	private int vertices[][];

	/**
	 * Constructs the graph.
	 * 
	 * @param vertices
	 *            - the vertices of the graph.
	 */
	public Graph(int[][] vertices) {
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
	public void addEdge(int i, int j) {
		vertices[i][j] = 1;
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
		return vertices[i][j] == 1;
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
			if (vertices[i][j] == 1) {
				successors.add(j);
			}
		}

		return successors;
	}

	public Set<Integer> getVerticies() {
		Set<Integer> edges = new HashSet<Integer>();
		for (int i = 0; i < vertices.length; i++) {
			for (int j = 0; j < vertices[0].length; j++) {
				if (vertices[i][j] == 1) {
					edges.add(j);
					edges.add(i);
				}
			}
		}
		return edges;
	}

	public List<Integer> findEulerCycle() {

		Stack<Integer> temp = new Stack<Integer>();
		List<Integer> visitedNodes = new LinkedList<Integer>();

		int startVertcy = this.getVerticies().iterator().next();
		temp.push(startVertcy);
		while (!(temp.isEmpty())) {

			int current = temp.peek();
			List<Integer> successors = this.getSuccessors(current);

			if (successors.isEmpty()) {
				visitedNodes.add(temp.pop());
				continue;
			}
			int next = successors.get(0);
			if (next != 0) {
				temp.push(next);
				this.removeEdge(current, next);
				this.removeEdge(next, current);
			}
		}
		return visitedNodes;
	}

	public List<Integer> findShortestPath(int first, int last) {
		Queue<Integer> visited = new LinkedList<Integer>();
		Stack<Integer> parent = new Stack<Integer>();
		visited.add(first);
		parent.add(0);
		parent.add(first);
		while (visited.size() > 0) {
			int lastVisited = visited.poll();
			List<Integer> successors = this.getSuccessors(lastVisited);
			for (Integer child : successors) {
				parent.add(lastVisited);
				parent.add(child);
				if (child == last) {
					List<Integer> path = findPath(parent, first);
					return path;
				}
				visited.add(child);
			}
		}
		return null;

	}

	private static List<Integer> findPath(Stack<Integer> parent, int first) {
		List<Integer> path = new LinkedList<>();

		int parentOfElement;
		path.add(parent.pop());
		while (!(parent.isEmpty())) {
			parentOfElement = parent.pop();
			if (parentOfElement == first) {
				path.add(first);
				return path;
			}
			while (!(parent.isEmpty())) {
				int curValue = parent.pop();
				if (curValue == parentOfElement) {
					path.add(curValue);
					break;
				}
			}

		}
		return null;
	}

	public List<Integer> topologicalSort() {
		Set<Integer> elements = this.getVerticies();
		List<Integer> topologicalOrder = new LinkedList<Integer>();
		int nodeToDelete = 0;

		while (!elements.isEmpty()) {
			// Find task(node) with no previous tasks
			for (int i : elements) {
				if (nodeToDelete != 0) {
					continue;
				}
				nodeToDelete = i;
				for (int j : elements) {
					if (this.hasEdge(j, i)) {
						nodeToDelete = 0;
					}
				}
			}
			topologicalOrder.add(nodeToDelete);

			for (int i : elements) {
				this.removeEdge(nodeToDelete, i);
			}
			elements.remove(nodeToDelete);

			nodeToDelete = 0;
		}
		return topologicalOrder;
	}

}