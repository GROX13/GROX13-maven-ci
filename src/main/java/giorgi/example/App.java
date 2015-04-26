package main.java.giorgi.example;

public class App {

	public static void main(String[] args) {
		ConcreteSubjectOne s = new ConcreteSubjectOne();

		s.attach(new ConcreteObserverOne(s, "X"));
		s.attach(new ConcreteObserverOne(s, "Y"));
		s.attach(new ConcreteObserverOne(s, "Z"));
		s.setSubjectState("ABC");
		System.out.println();

		ConcreteObserverOne temp = new ConcreteObserverOne(s, "A");
		s.attach(temp);
		s.setSubjectState("ACD");
		System.out.println();

		s.detach(temp);
		s.setSubjectState("ABCD");
		System.out.println();
	}
}
