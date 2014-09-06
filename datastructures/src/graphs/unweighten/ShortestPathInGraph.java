package graphs.unweighten;

/**
 * The programme finds and prints the shortest path between to edges in oriented graph
 */

import java.util.List;

public class ShortestPathInGraph {

	public static void main(String[] args) {
		int[][] verticies = new int[12][12];
		Graph graph = new Graph(verticies);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(6, 4);
		graph.addEdge(1, 6);
		graph.addEdge(6, 5);
		graph.addEdge(4, 7);
		graph.addEdge(7, 8);
		graph.addEdge(8, 9);
		graph.addEdge(7, 10);
		graph.addEdge(10, 11);
		graph.addEdge(11, 9);

		List<Integer> shortestPath = graph.findShortestPath(1, 10);

		for (Integer node : shortestPath) {
			System.out.print(node + " ");
		}
	}

}
