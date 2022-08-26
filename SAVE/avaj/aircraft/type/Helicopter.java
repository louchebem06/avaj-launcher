package SAVE.avaj.aircraft.type;

import SAVE.avaj.aircraft.AbstractAircraft;
import SAVE.avaj.position.Position;

public class Helicopter extends AbstractAircraft {

	public Helicopter(String name, Integer x, Integer y, Integer z) {
		_type = "Helicopter";
		_name = name;
		_id = _lastId;
		_pos = new Position(x, y, z);
		_lastId++;
	}

	public void changeWeather(String weather) {
		switch(weather) {
			case "SUN":
				_pos.add("x", 10);
				_pos.add("z", 2);
				break;
			case "RAIN":
				_pos.add("x", 5);
				break;
			case "FOG":
				_pos.add("x", 1);
				break;
			case "SNOW":
				_pos.add("z", -12);
				break;
		}
		System.out.println(this + ": " + _getMessage(weather));
	}

}
