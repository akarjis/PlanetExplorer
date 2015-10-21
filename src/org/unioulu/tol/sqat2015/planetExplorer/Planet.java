package org.unioulu.tol.sqat2015.planetExplorer;

public class Planet {

	final private int sizeX;
	final private int sizeY;
	
	private boolean[][] cells;
	
	public Planet(int x, int y) {
		sizeX = x;
		sizeY = y;
		cells = new boolean[x][y];
	}
	
	public boolean getCell(int x, int y) {
		return cells[x][y];
	}
	
	public int getSizeX() {
		return sizeX;
	}
	
	public int getSizeY() {
		return sizeY;
	}
	
	public void placeObstacles(String obstacles) {
		
		
		boolean repeat = true;
		int index = 0;
		
		while (repeat) {
			try {
				int x = Integer.parseInt(obstacles.charAt(index + 1) + "" ); 
				int y = Integer.parseInt(obstacles.charAt(index + 3) + "" );
				cells[x][y] = true;
				
				index += 8;
			} catch (Exception e) {
				repeat = false;
			}
		}
	}
}
