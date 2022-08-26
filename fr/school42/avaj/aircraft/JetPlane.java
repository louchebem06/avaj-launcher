package fr.school42.avaj.aircraft;

import fr.school42.avaj.coordinates.Coordinates;
import fr.school42.avaj.tower.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {
	
	private WeatherTower _weatherTower;

	public JetPlane(String name, Coordinates coodinates) {
		super(name, coodinates);
	}

	public void updateCondition() {

	}

	public void registerTower(WeatherTower weatherTower) {

	}

}
