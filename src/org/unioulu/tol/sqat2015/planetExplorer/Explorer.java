package org.unioulu.tol.sqat2015.planetExplorer;

public class Explorer {
	
	private int x;
	private int y;
	private String direction = "";

	public Explorer() {
		direction = "North";
		x = 0;
		y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public String getDirection() {
		return direction;
	}
}
