package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 107
// Finish time: 16:30
public class PlanetExplorer {
		
	final private Explorer explorer;
	final private Planet planet;
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		explorer = new Explorer();
		planet = new Planet(x, y);
		planet.placeObstacles(obstacles);
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
	
		if (command.isEmpty())
			explorer.resetPosition();
		
		for (char c : command.toCharArray()) {
			
			switch (c) {
				case 'r':
					explorer.turnRight();
					break;
				case 'l':
					explorer.turnLeft();
					break;
				case 'b':
					explorer.moveBack();
					break;
				case 'f':
					explorer.moveForward();
					break;
			}
			explorer.positionAndObstacleCheck(planet);
		}
	
		return explorer.getPosition() + explorer.getObstacles();
	}
	
	public Explorer getExplorer() {
		return explorer;
	}
	
	public Planet getPlanet() {
		return planet;
	}
	
	public int getPlanetWidth() {
		return planet.getSizeX();
	}
	
	public int getPlanetHeight() {
		return planet.getSizeY();
	}
	
}
