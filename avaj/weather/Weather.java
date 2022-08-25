package avaj.weather;

import java.util.ArrayList;
import java.util.List;

import avaj.aircraft.AbstractAircraft;
import avaj.position.Position;

public class Weather {
	
	private static List<Integer> _register = new ArrayList<Integer>();

	public Weather() {}

	public String toString() {
		return ("Tower says");
	}

	public void add(AbstractAircraft aircraft) {
		System.out.println(this + ": " + aircraft + " registered to weather tower. ✅");
		_register.add(aircraft.getId());
	}

	private String _getWeather(Position pos) {
		String [] weather = {"SUN", "RAIN", "FOG", "SNOW"};
		Integer x = pos.getX();
		Integer y = pos.getY();
		Integer z = pos.getZ();

		Integer r = (x+y+z) % 4;
		return (weather[r]);
	}

	public String get(AbstractAircraft aircraft) {
		for (Integer id : _register) {
			if (id == aircraft.getId()) {
				Integer z = aircraft.getPos().getZ();
				if (z <= 0) {
					_remove(aircraft);
					return (null);
				}
				return (_getWeather(aircraft.getPos()));
			}
		}
		return (null);
	}

	private void _remove(AbstractAircraft aircraft) {
		int index = 0;
		for (Integer id : _register) {
			if (id == aircraft.getId()) {
				_register.remove(index);
				System.out.println(this + ": " + aircraft + " unregistered from weather tower. 🚪");
				break ;
			}
			index++;
		}
	}

}
