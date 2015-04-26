package test.java.giorgi.example;

import static org.junit.Assert.*;
import main.java.giorgi.example.ConcreteSubjectOne;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConcreteSubjectOneTest {
	ConcreteSubjectOne underTest;

	@Before
	private void setUp() {
		underTest = new ConcreteSubjectOne();
	}

	@After
	private void tearDown() {
		underTest = null;
	}

	@Test
	public void testGetSubjectState() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSubjectState() {
		fail("Not yet implemented");
	}

}
