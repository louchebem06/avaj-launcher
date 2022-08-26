package SAVE.avaj.aircraft;

import SAVE.avaj.position.Position;

public abstract class AbstractAircraft {

	protected String _type;
	protected String _name;
	protected Integer _id;
	protected Position _pos;
	protected static Integer _lastId = 1;
	protected static String _sun = "Caliente, caliente, caliente !!!!!! ☀️"; 
	protected static String _rain = "Miaou, Miaou, Miaou 🌧"; 
	protected static String _fog = "Fog is the coquetry of the sun 🌫"; 
	protected static String _snow = "At Candlemas, great snow and coldness. ❄️"; 

	public abstract void changeWeather(String weather);

	public Position getPos() {
		return (_pos);
	}

	public String toString() {
		return (_type + "#" + _name + "(" + _id + ")");
	}

	protected String _getMessage(String weather) {
		switch (weather) {
			case "SUN":
				return (_sun);
			case "RAIN":
				return (_rain);
			case "FOG":
				return (_fog);
			case "SNOW":
				return (_snow);
		}
		return (null);
	}

	public Integer getId() {
		return (_id);
	}
}
