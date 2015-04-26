package test.java.giorgi.example;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import main.java.giorgi.example.ConcreteSubjectOne;
import main.java.giorgi.example.Observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConcreteSubjectOneTest {

	static final String subjectState = "Hello Mock";
	ConcreteSubjectOne underTest;

	@Before
	public void setUp() throws Exception {
		underTest = mock(ConcreteSubjectOne.class);
		when(underTest.getSubjectState()).thenReturn(subjectState);
	}

	@After
	public void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	public void testGetSubjectState() {
		String actual = underTest.getSubjectState();
		assertEquals(subjectState, actual);
		verify(underTest).getSubjectState();
	}

	@Test
	public void testSetSubjectState() {
		underTest.setSubjectState(subjectState);
		verify(underTest).setSubjectState(subjectState);
		verify(underTest).notifyObservers();
	}

	@Test
	public void testAttach() {
		underTest.attach(null);
		verify(underTest).attach(null);
	}

	@Test
	public void testDetach() {
		underTest.detach(null);
		verify(underTest).detach(null);
	}

	@Test
	public void testNotifyObservers() {
		underTest.notifyObservers();
		verify(underTest).notifyObservers();
		// Part two
		underTest = new ConcreteSubjectOne();
		Observer observer = mock(Observer.class);
		underTest.attach(observer);
		underTest.notifyObservers();
		verify(observer).update();
	}

}
