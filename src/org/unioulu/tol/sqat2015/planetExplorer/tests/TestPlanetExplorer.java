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
		explorer = new Explorer();
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
	public void testExplorerStartLocation() {
		assertEquals(0, explorer.getX());
		assertEquals(0, explorer.getY());
		assertEquals("N", explorer.getDirection());
	}
	
	@Test
	public void testExplorerTurningLeft() {
		explorer.turnLeft();
		assertEquals("W", explorer.getDirection());
		explorer.turnLeft();
		assertEquals("S", explorer.getDirection());
		explorer.turnLeft();
		assertEquals("E", explorer.getDirection());
		explorer.turnLeft();
		assertEquals("N", explorer.getDirection());
	}
	
	@Test
	public void testExplorerTurningRight() {
		explorer.turnRight();
		assertEquals("E", explorer.getDirection());
		explorer.turnRight();
		assertEquals("S", explorer.getDirection());
		explorer.turnRight();
		assertEquals("W", explorer.getDirection());
		explorer.turnRight();
		assertEquals("N", explorer.getDirection());
	}
}
