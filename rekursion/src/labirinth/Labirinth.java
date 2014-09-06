package labirinth;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Labirinth {
	
	public static void main (String[] args) {
		char[][] maze = {
				{' ',' ', ' ', '*', ' ', '*', ' '},
				{'*', '*', ' ', '*', ' ', '*', '*'},
				{' ', ' ', ' ', ' ', ' ', ' ', ' '},
				{' ', '*', '*', '*', '*', '*', ' '},
				{' ', ' ', ' ', ' ', ' ', ' ', ' '},
			};
		printMaze(maze);
		
		Scanner input = new Scanner (System.in);
		System.out.println ("Set starting row");
		int rowStart = input.nextInt();
		System.out.println ("Set starting column");
		int colStart = input.nextInt();			
				
		System.out.println ("Set exit row");
		int rowExit = input.nextInt();
		System.out.println ("Set exit column");
		int colExit = input.nextInt();		
		
		defineMaze (maze, rowStart, colStart, rowExit, colExit);			
	}
	
	private static void defineMaze ( char[][] maze, int rowStart, int colStart, int rowExit, int colExit) {
		if (isFree (maze, rowExit, colExit) == false) {
			System.out.println("The end position is not empty !");
			return;
		}
		if (isFree (maze, rowStart, colStart) == false) {
			System.out.println("The start  position is not empty !");
			return;
		}
		Queue <Integer>  rows = new LinkedList<Integer>();
		Queue <Integer>  cols = new LinkedList<Integer>();		
		rows.offer(rowStart);
		cols.offer(colStart);		
		maze [rowExit][colExit] ='å';			
		int [][] distance = new int[maze.length][maze[0].length];
		for (int i = 0; i < distance.length; i++){
			for (int l = 0; l < distance[0].length; l++) {
				distance [i][l] = -1;
			}
		}
		distance [rowStart][colStart] = 0;		
		boolean hasExit = false;
		
		while (!(rows.isEmpty() && cols.isEmpty())){
			hasExit = findExit(maze, distance, rows, cols);
			if (hasExit == true) {
				break;
			}
		}			
		
		if(hasExit == true) {
			printMaze(maze);
		} else {
			System.out.print("No exit: ");	
		}
				
		
	}	
	private static boolean findExit (char [][] maze, int [][] distance, Queue <Integer> rows, Queue <Integer> cols) {			
		int row = rows.poll();
		int col = cols.poll();
		if (maze[row][col] == 'å') {
			findPath (maze, distance, row, col, distance[row][col]);
			return true;							
		}
		//Mark current cell as visited
		maze[row][col] = 'v';
		
		if (isFree (maze, row, col - 1)){
			rows.offer(row);
			cols.offer(col - 1);			
			distance [row][col - 1] = distance [row][col] + 1;				
		}
		if (isFree(maze, row - 1, col)){			
			rows.offer (row - 1);
			cols.offer (col);					
			distance [row-1][col] = distance [row][col] + 1;
		}
		if (isFree (maze,row, col+1)){			
			rows.offer(row);
			cols.offer(col+1);			
			distance [row][col+1] = distance [row][col] + 1;
		}
		if (isFree(maze,row + 1, col)){			
			rows.offer(row + 1);
			cols.offer(col);						
			distance [row + 1][col] = distance [row][col] + 1;		
		}	
		return false;
	}
	
	private static boolean isFree (char [][] maze, int row, int col) {
		if ((col < 0) || (row < 0) ||(col >= maze[0].length) ||
				(row >= maze.length) || maze[row][col] == '*' || maze[row][col] == 'v') { 
			return false;
		}else {
			return true;
		}
	}	
	
	private static void findPath (char [][] maze, int [][] distance, int row, int col, int current) {
		if ((col<0) || (row<0) ||(col >= distance[0].length) || (row >= distance.length) ||
				(distance [row][col] < 0) || (distance [row][col] > current)) {
			return;
		}if (distance [row][col] == 0){
			maze [row][col] = 's';			
		} else if (distance [row][col] == current - 1){
			maze [row][col] = 'p';
			distance [row][col] = -1;
			current--;			
		}		
		findPath (maze, distance, row - 1, col, current);
		findPath (maze, distance, row + 1, col, current);		
		findPath (maze, distance, row, col - 1, current);
		findPath (maze, distance, row, col + 1, current);
		
		removeVisited (maze);		
	}	
	
	private static void removeVisited (char [][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int l = 0; l < maze[0].length ; l++){
				if (maze [i][l] =='v'){
					maze [i][l] = ' ';
				}			
			}
		}
	}
	
	private static void printMaze(char [][]maze) {
		System.out.print("  ");
		for(int l = 0; l < maze[0].length; l++){
			System.out.print(l + " ");
		}
		System.out.println();
		for(int i = 0; i < maze.length ; i++) {
			System.out.print(i  +" ");
			for(int l = 0; l < maze[0].length; l++){
				System.out.print(maze[i][l] + " ");
			}
			System.out.println();
		}
		
	}
	
}
