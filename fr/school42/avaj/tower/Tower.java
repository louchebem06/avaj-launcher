package fr.school42.avaj.tower;

import fr.school42.avaj.aircraft.Flyable;

public class Tower {
	
	protected Flyable _observer = null;

	public void register(Flyable flyable) {
		_observer = flyable;
		System.out.println(this + ": " + _observer + " registered to weather tower.");
	}

	public void unregister(Flyable flyable) {
		if (_observer != null)
			System.out.println(this + ": " + _observer + " unregistered from weather tower.");
		_observer = null;
	}

	public void conditionsChanged() {

	}

	public String toString() {
		return ("Tower says");
	}

}
