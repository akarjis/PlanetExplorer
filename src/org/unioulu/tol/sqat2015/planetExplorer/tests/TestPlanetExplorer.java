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
		assertEquals("North", explorer.getDirection());
	}
	
	@Test
	public void testExplorerTurning() {
		explorer.turnLeft();
		assertEquals("West", explorer.getDirection());
		explorer.turnLeft();
		assertEquals("South", explorer.getDirection());
		explorer.turnLeft();
		assertEquals("East", explorer.getDirection());
		
		
	}
}
