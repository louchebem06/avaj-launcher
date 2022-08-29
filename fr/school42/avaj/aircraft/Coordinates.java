package fr.school42.avaj.aircraft;

public class Coordinates {
	
	private int _longiture, _latitude, _height;

	Coordinates(int longitude, int latitude, int height) {
		_longiture = longitude;
		_latitude = latitude;
		_height = height;
	}

	public int getLongitude() {
		return (_longiture);
	}

	public int getLatitude() {
		return (_latitude);
	}

	public int getHeight() {
		return (_height);
	}

	public void addLongitude(int v) {
		_longiture += v;
	}

	public void addLatitude(int v) {
		_latitude += v;
	}

	public void addHeight(int v) {
		_height += v;
		if (_height > 100)
			_height = 100;
	}

	public void removeLongitude(int v) {
		_longiture -= v;
	}

	public void removeLatitude(int v) {
		_latitude -= v;
	}

	public void removeHeight(int v) {
		_height -= v;
		if (_height < 0)
			_height = 0;
	}

}
