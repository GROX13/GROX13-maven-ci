package test.java.giorgi.example;

import static org.junit.Assert.*;
import main.java.giorgi.example.ConcreteObserverOne;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConcreteObserverOneTest {
	ConcreteObserverOne underTest;

	@Before
	private void setUp() {
//		underTest = new ConcreteObserverOne(subject, name);
	}

	@After
	private void tearDown() {
		underTest = null;
	}

	@Test
	public void testGetSubject() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSubject() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
