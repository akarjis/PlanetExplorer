package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.Explorer;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	private PlanetExplorer planetExplorer;
	private Explorer explorer;

	@Before
	public void setUp() {
		planetExplorer = new PlanetExplorer(100,100, "(1,1)");
		explorer = planetExplorer.getExplorer();
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
	public void testExplorerTurnCommand() {
		planetExplorer.executeCommand("r");
		assertEquals("E", String.valueOf(explorer.getDirection()));
		planetExplorer.executeCommand("r");
		assertEquals("S", String.valueOf(explorer.getDirection()));
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
