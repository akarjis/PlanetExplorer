package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Explorer;
import org.unioulu.tol.sqat2015.planetExplorer.Planet;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	private PlanetExplorer planetExplorer;
	private Explorer explorer;
	private Planet planet;

	@Before
	public void setUp() {
		planetExplorer = new PlanetExplorer(100,100, "(1,1)(3,3)(99,99");
		explorer = planetExplorer.getExplorer();
		planet = planetExplorer.getPlanet();
	}
	
	@After
	public void tearDown() {
		planetExplorer = null;
		explorer = null;
	}
	
	@Test
	public void testPlanetSize() {
		assertEquals(100, planetExplorer.getPlanetHeight());
		assertEquals(100, planetExplorer.getPlanetWidth());
	}
	
	@Test
	public void testObstacle() {
		assertTrue(planet.getCell(1, 1));
	}
	
	@Test
	public void testObstacles() {
		assertTrue(planet.getCell(1, 1));
		assertTrue(planet.getCell(3, 3));
		assertTrue(planet.getCell(99, 99));
	}
	
	@Test
	public void testExplorerMoveCommandOnce() {
		String returnString = planetExplorer.executeCommand("b");
		assertEquals("(0,1,N)", returnString);
	}
	
	@Test
	public void testExplorerMoveCommandMultiple() {
		String returnString = planetExplorer.executeCommand("bbrff");
		assertEquals("(2,2,E)", returnString);
	}
	
	@Test
	public void testExplorerMoveCommandWrapping() {
		String returnString = planetExplorer.executeCommand("f");
		assertEquals("(0,99,N)", returnString);
		returnString = planetExplorer.executeCommand("lf");
		assertEquals("(99,99,W)", returnString);
		returnString = planetExplorer.executeCommand("blf");
		assertEquals("(0,0,S)", returnString);
	}
	
	@Test
	public void testExplorerEmptyCommandReturnToStart() {
		String returnString = planetExplorer.executeCommand("lll");
		returnString = planetExplorer.executeCommand("");
		assertEquals("(0,0,N)", returnString);
	}
	
	@Test
	public void testExplorerTurnCommandOnce() {
		planetExplorer.executeCommand("r");
		assertEquals("E", String.valueOf(explorer.getDirection()));
	}
	
	@Test
	public void testExplorerTurnCommandMultiple() {
		planetExplorer.executeCommand("lll");
		assertEquals("E", String.valueOf(explorer.getDirection()));
	}
	
	@Test
	public void testPlanetExplorerCommandReturnString() {
		String returnString = planetExplorer.executeCommand("lll");
		assertEquals("(0,0,E)", returnString);
	}
	
	@Test
	public void testExplorerStartLocation() {
		assertEquals(0, explorer.getX());
		assertEquals(0, explorer.getY());
		assertEquals("N", String.valueOf(explorer.getDirection()));
	}
	
	@Test
	public void testExplorerTurningLeft() {
		explorer.turnLeft();
		assertEquals("W", String.valueOf(explorer.getDirection()));
		explorer.turnLeft();
		assertEquals("S", String.valueOf(explorer.getDirection()));
		explorer.turnLeft();
		assertEquals("E", String.valueOf(explorer.getDirection()));
		explorer.turnLeft();
		assertEquals("N", String.valueOf(explorer.getDirection()));
	}
	
	@Test
	public void testExplorerTurningRight() {
		explorer.turnRight();
		assertEquals("E", String.valueOf(explorer.getDirection()));
		explorer.turnRight();
		assertEquals("S", String.valueOf(explorer.getDirection()));
		explorer.turnRight();
		assertEquals("W", String.valueOf(explorer.getDirection()));
		explorer.turnRight();
		assertEquals("N", String.valueOf(explorer.getDirection()));
	}
}
