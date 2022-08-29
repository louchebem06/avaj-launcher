package fr.school42.avaj.tower;

import fr.school42.avaj.aircraft.Coordinates;

public class WeatherTower extends Tower {
	
	public String getWeather(Coordinates coordinates) {
		if (_observer == null)
			return (null);
		
		return (WeatherProvider.getCurrentWeather(coordinates));
	}

	private void changeWeather() {
		
	}

}
