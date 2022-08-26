package fr.school42.avaj.aircraft;

import fr.school42.avaj.coordinates.Coordinates;

public abstract class Aircraft {

	protected long _id;
	protected String _name;
	protected Coordinates _coodinates;
	private static long _idCounter = 0;

	public Aircraft(String name, Coordinates coodinates) {
		_id = nextId();
		_name = name;
		_coodinates = coodinates;
	}

	private long nextId() {
		_idCounter++;
		return (_idCounter);
	}

	public String toString() {
		return (this.getClass().getSimpleName() + "#" + _name + "(" + _id + ")");
	}

	protected String _getMessage(String weather) {
		switch (weather) {
			case "SUN":
				return ("Chaud");
			case "SNOW":
				return ("Neige");
			case "RAIN":
				return ("Pluis");
			case "FOG":
				return ("Brouillard");
		}
		return (null);
	}
}
