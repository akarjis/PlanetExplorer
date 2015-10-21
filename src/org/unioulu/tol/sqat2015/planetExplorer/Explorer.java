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
	
	public void resetPosition() {
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

	public char getDirection() {
		return direction.charAt(0);
	}
	
	public String getPosition() {
		return "(" + getX() + "," + getY() + "," + getDirection() + ")";
	}
	
	public void turnRight() {
		if (direction.equalsIgnoreCase("North"))
			direction = "East";
		else if (direction.equalsIgnoreCase("East"))
			direction = "South";
		else if (direction.equalsIgnoreCase("South"))
			direction = "West";
		else if (direction.equalsIgnoreCase("West"))
			direction = "North";
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
