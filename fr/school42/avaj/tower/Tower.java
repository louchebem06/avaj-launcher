package fr.school42.avaj.tower;

import fr.school42.avaj.aircraft.Flyable;
import fr.school42.avaj.writeFile.WriteFile;

public class Tower {
	
	private Flyable _observer = null;

	public void register(Flyable flyable) {
		_observer = flyable;
		try {
			WriteFile.print(this + ": " + _observer + " registered to weather tower.");
		} catch (Exception e) {
			System.out.println("Error: " + e);
			System.exit(1);
		}
	}

	public void unregister(Flyable flyable) {
		if (_observer != null) {
			try {
				WriteFile.print(this + ": " + _observer + " unregistered from weather tower.");
			} catch (Exception e) {
				System.out.println("Error: " + e);
				System.exit(1);
			}
		}
		conditionsChanged();
	}

	protected Flyable getObserver() {
		return (_observer);
	}

	protected void conditionsChanged() {
		_observer = null;
	}

	public String toString() {
		return ("Tower says");
	}

}
