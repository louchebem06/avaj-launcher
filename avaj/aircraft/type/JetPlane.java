package avaj.aircraft.type;

import avaj.aircraft.AbstractAircraft;
import avaj.position.Position;

public class JetPlane extends AbstractAircraft {

	public JetPlane(String name, Integer x, Integer y, Integer z) {
		_type = "JetPlane";
		_name = name;
		_id = _lastId;
		_pos = new Position(x, y, z);
		_lastId++;
	}

	public void changeWeather(String weather) {
		switch(weather) {
			case "SUN":
				_pos.add("y", 10);
				_pos.add("z", 2);
				break;
			case "RAIN":
				_pos.add("y", 5);
				break;
			case "FOG":
				_pos.add("y", 1);
				break;
			case "SNOW":
				_pos.add("z", -7);
				break;
		}
		System.out.println(this + ": " + _getMessage(weather));
	}

}
