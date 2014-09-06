package graphs.unweighten;

/**
 * Finds euler cycle in graph if exists.Else 
 */

import java.util.List;

public class OylerCycleInGraph {

	public static void main(String[] args) {
		// model the graph
		int[][] verticies = new int[7][7];

		Graph graph = new Graph(verticies);
		graph.addEdge(6, 1);
		graph.addEdge(1, 6);
		graph.addEdge(1, 2);
		graph.addEdge(2, 1);
		graph.addEdge(2, 3);
		graph.addEdge(3, 2);
		graph.addEdge(3, 6);
		graph.addEdge(6, 3);
		graph.addEdge(1, 4);
		graph.addEdge(4, 1);
		graph.addEdge(4, 2);
		graph.addEdge(2, 4);
		graph.addEdge(2, 5);
		graph.addEdge(5, 2);
		graph.addEdge(5, 1);
		graph.addEdge(1, 5);

		List<Integer> visitedNodes = graph.findEulerCycle();
		for (Integer node : visitedNodes) {
			System.out.print(node + "-> ");
		}
	}

}
