package fr.school42.avaj.tower;

import fr.school42.avaj.aircraft.Flyable;
import fr.school42.avaj.writeFile.WriteFile;

public class Tower {
	
	protected Flyable _observer = null;

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
		_observer = null;
	}

	public void conditionsChanged() {

	}

	public String toString() {
		return ("Tower says");
	}

}
