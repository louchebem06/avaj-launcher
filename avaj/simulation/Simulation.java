package avaj.simulation;

import java.util.List;
import avaj.aircraft.AbstractAircraft;
import avaj.weather.Weather;

public class Simulation {

	public Simulation(Integer iter, List<AbstractAircraft> aircrafts) {
		Weather weather = new Weather();

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
