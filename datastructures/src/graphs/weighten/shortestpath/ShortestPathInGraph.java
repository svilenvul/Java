package graphs.weighten.shortestpath;

/**
 * The program finds the shortest path between nodes in a graph.
 * It reads all data from text file and print the result on the console.
 * The result is formatted:  <cost> <path>
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class ShortestPathInGraph {

	public static void main(String[] args) throws URISyntaxException {
		URL inputFile = ShortestPathInGraph.class.getResource("data/map.txt");
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		Queue<Integer> startAndEndNode = new LinkedList<Integer>();

		// Call method to read the text file
		GraphWeightenUndirected graph = defineGraph(inputFile, visited,
				startAndEndNode);

		while (!startAndEndNode.isEmpty()) {
			int start = startAndEndNode.poll();
			int end = startAndEndNode.poll();
			int sum = 0;
			TreeMap<Integer, Stack<Integer>> allPaths = new TreeMap<Integer, Stack<Integer>>();
			Stack<Integer> currentPath = new Stack<Integer>();
			findAllPaths(graph, allPaths, sum, start, end, visited, currentPath);
			printShortestPath(allPaths);
		}

	}

	/**
	 * Reads .txt file with all nodes and cost between them; start and end
	 * nodes.
	 *
	 * @return a graph model, based on the input data.
	 */
	public static GraphWeightenUndirected defineGraph(URL inputFile,
			HashMap<Integer, Boolean> visited, Queue<Integer> startAndEndNode)
			throws URISyntaxException {
		String inputFileName = inputFile.toString();
		Scanner fileReader = null;

		GraphWeightenUndirected graph = new GraphWeightenUndirected();

		try {
			fileReader = new Scanner(new File(inputFile.toURI()));
			System.out.println("File " + inputFileName + " opened.");

			String line = null;
			while (!(line = fileReader.nextLine()).isEmpty()) {
				String[] pointData = line.split(" +");
				char xCoor = pointData[0].charAt(0);
				int xCoordinate = convertCharToInt(xCoor);
				visited.put(xCoordinate, false);

				char yCoor = pointData[1].charAt(0);
				int yCoordinate = convertCharToInt(yCoor);
				visited.put(yCoordinate, false);

				int weight = Integer.parseInt(pointData[2]);

				// Defines edges of the graph
				graph.addEdge(xCoordinate, yCoordinate, weight);
			}
			while (!(line = fileReader.nextLine()).isEmpty()) {
				String[] pointData = line.split(" +");
				char xCoor = pointData[0].charAt(0);
				int xCoordinate = convertCharToInt(xCoor);
				startAndEndNode.offer(xCoordinate);

				char yCoor = pointData[1].charAt(0);
				int yCoordinate = convertCharToInt(yCoor);
				startAndEndNode.offer(yCoordinate);
			}
			return graph;

		} catch (FileNotFoundException fnf) {
			System.out.println("File " + inputFileName + " not found.");
		} catch (NullPointerException npe) {
			System.out.println("File " + inputFileName + " not found.");
		} catch (NoSuchElementException noe) {
			System.out.println("File " + inputFileName + " readen.");
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
		}
		return graph;
	}

	// Convert A to 1, B to 2 ...
	public static int convertCharToInt(char letter) {
		int value = Character.getNumericValue(letter) - 9;
		return value;
	}

	// Convert 1 to A, 2 to B ...
	public static char convertIntToChar(int value) {
		char letter = (char) (value + 64);
		return letter;
	}

	/**
	 * Uses backtracking algorithm to find all paths between two nodes. Saves
	 * all paths and their cost in a TreeMap.
	 */
	public static void findAllPaths(GraphWeightenUndirected graph,
			TreeMap<Integer, Stack<Integer>> allPaths, int sum, int startNode,
			int endNode, HashMap<Integer, Boolean> visited,
			Stack<Integer> currentPath) {

		// We have found the end node
		if (startNode == endNode) {
			currentPath.push(endNode);
			Stack<Integer> temp = new Stack<Integer>();
			temp.addAll(currentPath);
			allPaths.put(sum, temp);
			currentPath.pop();
			return;
		}
		// We have found a cycle
		if (visited.get(startNode)) {
			return;
		}
		// Mark current node as visited
		visited.put(startNode, true);
		List<Integer> childs = graph.getSuccessors(startNode);
		currentPath.push(startNode);
		// Search for all children
		for (int child : childs) {
			int cost = graph.getWeight(startNode, child);
			sum += cost;
			findAllPaths(graph, allPaths, sum, child, endNode, visited,
					currentPath);
			sum -= cost;
		}
		// Mark current node as free
		visited.put(startNode, false);
		currentPath.pop();
	}

	public static void printShortestPath(
			TreeMap<Integer, Stack<Integer>> allPaths) {
		if (allPaths.isEmpty()) {
			System.out.println("No path !");
		} else {
			System.out.print(allPaths.firstEntry().getKey() + " ");
			Stack<Integer> shortestPath = allPaths.firstEntry().getValue();
			for (Integer i : shortestPath) {
				char letter = convertIntToChar(i);
				System.out.print(letter);
			}
			System.out.println();
		}
	}

}
