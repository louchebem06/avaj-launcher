package fr.school42.avaj.aircraft;

import fr.school42.avaj.tower.WeatherTower;
import fr.school42.avaj.writeFile.WriteFile;

public class Baloon extends Aircraft implements Flyable {

	private WeatherTower _weatherTower;

	Baloon(String name, Coordinates coodinates) {
		super(name, coodinates);
	}

	public void updateCondition() {
		String weather = _weatherTower.getWeather(_coodinates);
		
		if (weather == null)
			return;

		switch (weather) {
			case "SUN":
				_coodinates.addLongitude(2);
				_coodinates.addHeight(4);
				break;
			case "RAIN":
				_coodinates.removeHeight(5);
				break;
			case "FOG":
				_coodinates.removeHeight(3);
				break;
			case "SNOW":
				_coodinates.removeHeight(15);
				break;
		}

		if (_coodinates.getHeight() == 0)
			_weatherTower.unregister(this);
		else {
			try {
				WriteFile.print(this + ": " + _getMessage(weather));
			} catch (Exception e) {
				System.out.println("Error: " + e);
				System.exit(1);
			}
		}
	}

	public void registerTower(WeatherTower weatherTower) {
		_weatherTower = weatherTower;
		_weatherTower.register(this);
	}

}
