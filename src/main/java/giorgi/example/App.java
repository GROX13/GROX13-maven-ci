package main.java.giorgi.example;

public class App {

	public static void main(String[] args) {
		ConcreteSubjectOne s = new ConcreteSubjectOne();

		s.attach(new ConcreteObserverOne(s, "X"));
		s.attach(new ConcreteObserverOne(s, "Y"));
		s.attach(new ConcreteObserverOne(s, "Z"));

		s.setSubjectState("ABC");
		s.notifyObservers();
	}

}
