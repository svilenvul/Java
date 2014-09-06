package trees.searchalgo;

import java.io.File;
import java.util.Stack;

public class DepthFirstSearch {

	public static void main(String[] args) {
		String dirpath = "C:\\";
		printAllSubPaths(dirpath);
	}

	public static void printAllSubPaths(String dirpath) {
		// we get all it subdirectories and files
		Stack<File> visited = new Stack<File>();
		visited.add(new File(dirpath));
		while (visited.size() > 0) {
			File currdir = visited.peek();
			System.out.println(visited.pop());
			File[] children = currdir.listFiles();
			if (children != null) {
				for (int i = children.length - 1; i > 0; i--) {
					if (children[i].isDirectory()) {
						visited.push(children[i]);
					}
				}
			}
		}
	}
}
