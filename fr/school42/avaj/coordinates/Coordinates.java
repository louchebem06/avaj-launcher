package fr.school42.avaj.coordinates;

public class Coordinates {
	
	private int _longiture, _latitude, _height;

	public Coordinates(int longitude, int latitude, int height) {
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

}
