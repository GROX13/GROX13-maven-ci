package main.java.giorgi.example;

public class ConcreteObserverOne implements Observer {

	private String name;
	private String observerState;
	private ConcreteSubjectOne subject;

	public ConcreteObserverOne(ConcreteSubjectOne subject, String name) {
		this.name = name;
		setSubject(subject);
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(ConcreteSubjectOne subject) {
		this.subject = subject;
	}

	@Override
	public void update() {
		this.observerState = subject.getSubjectState();
		System.out.println("Observer " + name + "'s new name is "
				+ observerState + "!");
	}
}
