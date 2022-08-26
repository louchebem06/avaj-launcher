package SAVE.avaj.simulation;

import java.util.List;

import SAVE.avaj.aircraft.AbstractAircraft;
import SAVE.avaj.file.FileSimulator;
import SAVE.avaj.weather.Weather;

public class Simulation {

	public Simulation(Integer iter, List<AbstractAircraft> aircrafts) {
		Weather weather = new Weather();

		FileSimulator.createNewFile();

		for (AbstractAircraft aircraft : aircrafts) {
			weather.add(aircraft);
		}
		for (int i = 0; i < iter; i++) {
			for (AbstractAircraft aircraft : aircrafts) {
				String weatherString = weather.get(aircraft);
				if (weatherString != null)
					aircraft.changeWeather(weatherString);
			}
		}
	}

}
