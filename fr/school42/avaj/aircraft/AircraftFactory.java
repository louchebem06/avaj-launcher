package fr.school42.avaj.aircraft;

import fr.school42.avaj.coordinates.Coordinates;

public class AircraftFactory {
	
	public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) throws Exception {
		Coordinates coordinates = new Coordinates(longitude, latitude, height);

		switch (type) {
			case "Baloon":
				return (new Baloon(name, coordinates));
			case "Helicopter":
				return (new Helicopter(name, coordinates));
			case "JetPlace":
				return (new JetPlane(name, coordinates));
		}

		throw new Exception("Type " + type + " is incorect");
	}

}
