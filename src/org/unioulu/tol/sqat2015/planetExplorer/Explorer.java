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
	
	public void turnRight() {
		
	}
	
	public void turnLeft() {
		if (direction.equalsIgnoreCase("North"))
			direction = "West";
		else if (direction.equalsIgnoreCase("West"))
			direction = "South";
		else if (direction.equalsIgnoreCase("South"))
			direction = "East";
		else if (direction.equalsIgnoreCase("East"))
			direction = "North";
	}
}
