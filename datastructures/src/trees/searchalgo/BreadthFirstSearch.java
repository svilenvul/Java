package trees.searchalgo;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		String dirpath = "C:\\";
		printAllSubPaths(dirpath);
	}

	public static void printAllSubPaths(String dirpath) {
		// we get all it subdirectories and files
		Queue<File> visited = new LinkedList<File>();
		visited.add(new File(dirpath));
		while (visited.size() > 0) {
			File currdir = visited.remove();
			System.out.println(visited.poll());
			File[] children = currdir.listFiles();
			if (children != null) {
				for (File child : children) {
					if (child != null) {
						visited.add(child);
					}
				}
			}
		}
	}

}
