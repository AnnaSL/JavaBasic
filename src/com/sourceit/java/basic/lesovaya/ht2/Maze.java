package com.sourceit.java.basic.lesovaya.ht2;

public class Maze {
	Cell[][] grid;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze testMaze = new Maze();
		Cell[][] maze = new Cell[6][6];
		maze = testMaze.getMaze();

	}
	
	public Cell[][] getMaze(){
		grid = new Cell[6][6];
		//public Cell(boolean leftBorder, boolean rightBorder, boolean topBorder, boolean bottomBorder)
		grid[0][0] = new Cell(true,false,true,false);
		grid[0][1] = new Cell(false,false,true,true);
		grid[0][2] = new Cell(false,false,true,false);
		grid[0][3] = new Cell(false,true,true,false);
		grid[0][4] = new Cell(true,false,true,true);
		grid[0][5] = new Cell(false,false,true,true);
		grid[1][0] = new Cell(true,false,false,false);
		grid[1][1] = new Cell(false,true,true,true);
		grid[1][2] = new Cell(true,true,false,false);
		grid[1][3] = new Cell(true,false,false,false);
		grid[1][4] = new Cell(false,false,true,true);
		grid[1][5] = new Cell(false,false,true,true);
		grid[2][0] = new Cell(true,false,false,true);
		grid[2][1] = new Cell(false,false,true,true);
		grid[2][2] = new Cell(false,false,false,true);
		grid[2][3] = new Cell(true,false,false,false);
		grid[2][4] = new Cell(true,false,true,false);
		grid[2][5] = new Cell(false,true,true,false);
		grid[3][0] = new Cell(true,true,true,false);
		grid[3][1] = new Cell(true,false,true,false);
		grid[3][2] = new Cell(false,true,true,true);
		grid[3][3] = new Cell(true,false,false,false);
		grid[3][4] = new Cell(false,false,false,true);
		grid[3][5] = new Cell(false,true,false,true);
		grid[4][0] = new Cell(true,false,false,false);
		grid[4][1] = new Cell(false,false,false,false);
		grid[4][2] = new Cell(false,false,true,true);
		grid[4][3] = new Cell(false,false,false,true);
		grid[4][4] = new Cell(false,true,true,false);
		grid[4][5] = new Cell(true,true,true,false);
		grid[5][0] = new Cell(true,true,false,true);
		grid[5][1] = new Cell(true,false,false,true);
		grid[5][2] = new Cell(false,false,true,true);
		grid[5][3] = new Cell(false,true,true,true);
		grid[5][4] = new Cell(true,false,false,true);
		grid[5][5] = new Cell(false,true,false,true);
		
		return grid;
	}
	/**
	 * Prepares grid for building of labyrinth
	 * @param n - count of rows
	 * @param m - count of columns
	 * @return
	 */
	private Cell[][] getGrid(int n, int m){		
		grid = new Cell[n][m];
		for(int i = 0; i < n - 1; i++){
			for(int j=0; j < m - 1; j++){
				grid[i][j] = new Cell(true,true,true,true);
			}
		}
		
		return grid;
	}

}
