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
	
	

}
