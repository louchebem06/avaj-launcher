package fr.school42.avaj.tower;

import fr.school42.avaj.coordinates.Coordinates;

public class WeatherProvider {
	
	private static WeatherProvider _weatherProvider;
	private static String [] _weather = {"RAIN", "FOG", "SUN", "SNOW"};

	private WeatherProvider() {
		_weatherProvider = this;
	}

	public static WeatherProvider getProvider() {
		return (_weatherProvider);
	}

	public static String getCurrentWeather(Coordinates coordinates) {
		int index = (coordinates.getLongitude() + coordinates.getLatitude() + coordinates.getHeight()) % 4;
		return (_weather[index]);
	}

}
