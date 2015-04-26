package test.java.giorgi.example;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import main.java.giorgi.example.ConcreteObserverOne;
import main.java.giorgi.example.ConcreteSubjectOne;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ConcreteObserverOneTest {
	ConcreteSubjectOne subject;
	ConcreteObserverOne underTest;

	@Before
	public void setUp() {
		subject = mock(ConcreteSubjectOne.class);
		underTest = mock(ConcreteObserverOne.class);
		when(underTest.getSubject()).thenReturn(null);
	}

	@After
	public void tearDown() {
		subject = null;
		underTest = null;
	}

	@Test
	public void testGetSubject() {
		main.java.giorgi.example.Subject locale = underTest.getSubject();
		verify(underTest).getSubject();
		assertEquals(locale, null);
	}

	@Test
	public void testSetSubject() {
		underTest.setSubject(subject);
		verify(underTest).setSubject(subject);
	}

	@Test
	public void testUpdate() {
		// Part one of the test
		underTest.update();
		verify(underTest).update();
		// Part two of the test
		underTest = new ConcreteObserverOne(subject, "Observer One");
		underTest.setSubject(subject);
		underTest.update();
		verify(subject).getSubjectState();
	}

}
