package main.java.giorgi.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	protected List<Observer> observers;

	public Subject() {
		observers = new ArrayList<Observer>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update();
	}
}
