package fr.school42.avaj.aircraft;

import fr.school42.avaj.tower.WeatherTower;

public interface Flyable {
	void updateCondition();
	void registerTower(WeatherTower weatherTower);
}
