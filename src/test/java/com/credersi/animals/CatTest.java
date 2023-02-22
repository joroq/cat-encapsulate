package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testFeedingOnce() {
		Cat cat = new Cat();
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
	}
	
	@Test
	public void testFeedingUntilNotHungry() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	
	@Test
	public void testRuns() {
		Cat cat = new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	
	@Test
	public void testFeedAndRun() {
		Cat cat = new Cat();
		cat.runs();
		cat.feeds();
		assertEquals(cat.howHungry(), 60);
	}
	
	@Test
	public void testCatLives() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assertTrue(cat.isAlive());
	}
	
	@Test
	public void testCatDiesAfterNineDeaths() {
		Cat cat = new Cat();
		for (int i = 0; i < 9; i++) {
			cat.runs();
			cat.runs();
		}
		assertTrue(!cat.isAlive());
	}
	
	@Test
	public void testCatAliveAfterEightDeaths() {
		Cat cat = new Cat();
		for (int i = 0; i < 8; i++) {
			cat.runs();
			cat.runs();
		}
		assertTrue(cat.isAlive());
	}
}