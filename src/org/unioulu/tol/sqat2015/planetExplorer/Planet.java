package org.unioulu.tol.sqat2015.planetExplorer;

import java.util.Arrays;
import java.util.Iterator;

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
		
	    String str = obstacles.replaceAll("[^-?0-9]+", " "); 
	    Iterator<String> itr = Arrays.asList(str.trim().split(" ")).iterator();
	    
	    while(itr.hasNext()) {
	    	
	    	int x = Integer.parseInt(itr.next());
	    	int y = Integer.parseInt(itr.next());
	    	
	    	cells[x][y] = true;
	    }
	    
	}
}
