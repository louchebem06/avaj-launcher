package fr.school42.avaj.tower;

import fr.school42.avaj.aircraft.Coordinates;

public class WeatherProvider {
	
	private static WeatherProvider _weatherProvider = new WeatherProvider();
	private String [] _weather = {"RAIN", "FOG", "SUN", "SNOW"};

	private WeatherProvider() {
		_weatherProvider = this;
	}

	public static WeatherProvider getProvider() {
		return (_weatherProvider);
	}

	public String getCurrentWeather(Coordinates coordinates) {
		int index = (coordinates.getLongitude() + coordinates.getLatitude() + coordinates.getHeight()) % 4;
		return (_weather[index]);
	}

}
