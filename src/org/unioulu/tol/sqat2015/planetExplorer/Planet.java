package org.unioulu.tol.sqat2015.planetExplorer;

public class Planet {

	private boolean[][] cells;
	
	public Planet(int x, int y) {
		cells = new boolean[x][y];
	}
	
	public boolean getCell(int x, int y) {
		return cells[x][y];
	}
	
	

}
