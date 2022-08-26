package fr.school42.avaj.tower;

import fr.school42.avaj.coordinates.Coordinates;

public class WeatherProvider {
	
	private WeatherProvider _weatherProvider;
	private static String [] _weather = {"RAIN", "FOG", "SUN", "SNOW"};

	public WeatherProvider() {}

	public WeatherProvider getProvider() {
		return (_weatherProvider);
	}

	public String getCurrentWeather(Coordinates coordinates) {
		return ("TODO");
	}

}
