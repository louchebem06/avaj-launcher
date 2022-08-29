package fr.school42.avaj.tower;

import fr.school42.avaj.aircraft.Coordinates;

public class WeatherTower extends Tower {
	
	private Coordinates _coordinates;
	private String _weather;

	public String getWeather(Coordinates coordinates) {
		_coordinates = coordinates;
		changeWeather();
		return (getObserver() == null) ? null : _weather;
	}

	private void changeWeather() {
		_weather = WeatherProvider.getProvider().getCurrentWeather(_coordinates);
	}

}
