package graphs.unweighten;

/**
 *  Sorts graph topologically
 */

import java.util.List;

public class SortGraphTopologically {

	public static void main(String[] args) {

		int[][] verticies = new int[12][12];
		Graph graph = new Graph(verticies);
		graph.addEdge(7, 11);
		graph.addEdge(11, 9);
		graph.addEdge(11, 2);
		graph.addEdge(5, 11);
		graph.addEdge(7, 8);
		graph.addEdge(11, 10);
		graph.addEdge(3, 8);
		graph.addEdge(3, 10);
		graph.addEdge(8, 9);

		List<Integer> order = graph.topologicalSort();
		for (Integer node : order) {
			System.out.print(node + " ");
		}

	}

}
