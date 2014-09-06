package graphs.weighten;

/**
 * The programm finds the shortest paths cost between a given node and all other nodes
 *  in not oriented graph.It implements Djstra algorithm. 
 */

import java.util.Arrays;
import java.util.List;

public class MinimalCostInGraph {

	static int position;

	public static void main(String[] args) {
		int[][] graphMatrix = new int[20][20];
		int[] shortestPathCosts = { 999, 999, 999, 999, 999, 999, 999, 999, 999 };
		boolean[] visited = { true, false, false, false, false, false, false,
				false, false };

		GraphWeighten graph = new GraphWeighten(graphMatrix);
		graph.addEdge(1, 7, 90);
		graph.addEdge(7, 1, 20);
		graph.addEdge(1, 2, 20);
		graph.addEdge(1, 4, 80);
		graph.addEdge(5, 7, 30);
		graph.addEdge(4, 7, 20);
		graph.addEdge(5, 2, 50);
		graph.addEdge(2, 6, 10);
		graph.addEdge(6, 4, 40);
		graph.addEdge(3, 4, 10);
		graph.addEdge(3, 8, 20);
		graph.addEdge(3, 6, 50);
		graph.addEdge(6, 3, 10);

		int startEdge = 1;
		findShortestPaths(graph, shortestPathCosts, visited, startEdge);
		System.out.print(Arrays.toString(shortestPathCosts));

	}

	public static void findShortestPaths(GraphWeighten graph,
			int[] shortestPathCosts, boolean[] visited, int startEdge) {
		shortestPathCosts[startEdge] = 0;
		position = 0;
		// get the node with minimum value that is not visited
		for (int i = 1; i < shortestPathCosts.length; i++) {
			if (shortestPathCosts[i] < shortestPathCosts[position]
					&& visited[i] == false) {
				position = i;
			}
		}
		// check if the node isnt visited
		if (visited[position]) {
			return;
		}
		// System.out.print(position);
		// mark it as visited
		visited[position] = true;

		// get all the successors
		List<Integer> successors = graph.getSuccessors(position);
		for (Integer child : successors) {
			if (child != null) {
				if (shortestPathCosts[position]
						+ graph.getWeight(position, child) < shortestPathCosts[child]) {
					shortestPathCosts[child] = shortestPathCosts[position]
							+ graph.getWeight(position, child);
					// update values of adjacent nodes
				}
			}

		}
		findShortestPaths(graph, shortestPathCosts, visited, startEdge);
	}

}
