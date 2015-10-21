package org.unioulu.tol.sqat2015.planetExplorer;

import java.util.List;

public class Explorer {
	
	private int x;
	private int y;
	private String direction = "";
	private List<String> foundObstacles;

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
	
	public String getObstacles() {
		String ret = "";
		
		for (String s : foundObstacles)
			ret += s;
		
		return ret;
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

	public void moveForward() {
		if (direction.equalsIgnoreCase("North"))
			y--;
		else if (direction.equalsIgnoreCase("West"))
			x--;
		else if (direction.equalsIgnoreCase("South"))
			y++;
		else if (direction.equalsIgnoreCase("East"))
			x++;
	}
	
	public void moveBack() {
		if (direction.equalsIgnoreCase("North"))
			y++;
		else if (direction.equalsIgnoreCase("West"))
			x++;
		else if (direction.equalsIgnoreCase("South"))
			y--;
		else if (direction.equalsIgnoreCase("East"))
			x--;
	}
	
	public void positionAndObstacleCheck(Planet planet) {
		
		// Check position first
		if (x < 0)
			x = planet.getSizeX() -1;
		else if (x >= planet.getSizeX())
			x = 0;
		else if (y < 0)
			y = planet.getSizeY() -1;
		else if (y >= planet.getSizeX())
			y = 0;
		
		// Check if obstacle found
		
		if (planet.getCell(x, y)) {
			if (foundObstacles == null)
				foundObstacles = new ArrayList<>();
			
			foundObstacles.add("(" + x + "," + y +")");
		}
			
		
	}
}
