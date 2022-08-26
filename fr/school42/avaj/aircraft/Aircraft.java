package fr.school42.avaj.aircraft;

import fr.school42.avaj.coordinates.Coordinates;

public abstract class Aircraft {

	private long _id;
	private String _name;
	public Coordinates _coodinates;
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

}
