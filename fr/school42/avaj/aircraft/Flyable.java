package fr.school42.avaj.aircraft;

import fr.school42.avaj.tower.WeatherTower;

public interface Flyable {
	public void updateCondition();
	public void registerTower(WeatherTower weatherTower);
}
