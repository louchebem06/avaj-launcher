package fr.school42.avaj.aircraft;

public class AircraftFactory {
	
	public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) throws Exception {
		Coordinates coordinates = new Coordinates(longitude, latitude, height);

		switch (type) {
			case "Baloon":
				return (new Baloon(name, coordinates));
			case "Helicopter":
				return (new Helicopter(name, coordinates));
			case "JetPlane":
				return (new JetPlane(name, coordinates));
		}

		throw new Exception("Type " + type + " is incorect");
	}

}
