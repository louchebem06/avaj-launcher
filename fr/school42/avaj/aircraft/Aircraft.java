package fr.school42.avaj.aircraft;

public abstract class Aircraft {

	protected long _id;
	protected String _name;
	protected Coordinates _coodinates;
	private static long _idCounter = 0;

	protected Aircraft(String name, Coordinates coodinates) {
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
				return ("This is hot.");
			case "SNOW":
				return ("My rotor is going to freeze!");
			case "RAIN":
				return ("Damn you rain! You messed up my baloon.");
			case "FOG":
				return ("OMG! Winter is coming!");
		}
		return (null);
	}
}
