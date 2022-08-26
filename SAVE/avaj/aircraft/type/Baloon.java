package SAVE.avaj.aircraft.type;

import SAVE.avaj.aircraft.AbstractAircraft;
import SAVE.avaj.position.Position;

public class Baloon extends AbstractAircraft {

	public Baloon(String name, Integer x, Integer y, Integer z) {
		_type = "Baloon";
		_name = name;
		_id = _lastId;
		_pos = new Position(x, y, z);
		_lastId++;
	}

	public void changeWeather(String weather) {
		switch(weather) {
			case "SUN":
				_pos.add("x", 2);
				_pos.add("z", 4);
				break;
			case "RAIN":
				_pos.add("z", -5);
				break;
			case "FOG":
				_pos.add("z", -3);
				break;
			case "SNOW":
				_pos.add("z", -15);
				break;
		}
		System.out.println(this + ": " + _getMessage(weather));
	}

}
