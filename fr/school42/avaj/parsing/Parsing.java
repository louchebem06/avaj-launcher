package fr.school42.avaj.parsing;

import java.util.ArrayList;
import java.util.List;

import fr.school42.avaj.aircraft.AircraftFactory;
import fr.school42.avaj.aircraft.Flyable;

public class Parsing {

	public static int getIter(Object [] lines) throws Exception {
		int iter = 0;
		String line = lines[0].toString();
		String msgException = "Ligne 0 is not valid";

		try {
			iter = Integer.parseInt(line);
		} catch (Exception e) {
			throw new Exception(msgException);
		}

		if (iter < 0)
			throw new Exception(msgException);

		return (iter);
	}

	public static List<Flyable> getAircrafts(Object [] lines) throws Exception {
		List<Flyable> aircrafts = new ArrayList<Flyable>();

		for (int i = 1; i < lines.length; i++) {
			String line = lines[i].toString();
			String type, name;
			int longitude, latitude, height;
			String[] split = line.split(" ");

			if (split.length != 5)
				throw new Exception("Ligne " + (i + 1) + " is not valid");

			type = split[0];
			name = split[1];
			try {
				longitude = Integer.parseInt(split[2]);
				latitude = Integer.parseInt(split[3]);
				height = Integer.parseInt(split[4]);
			} catch (Exception e) {
				throw new Exception("Ligne " + (i + 1) + " is not valid");
			}
			Flyable aircraft = AircraftFactory.newAircraft(type, name, longitude, latitude, height);
			aircrafts.add(aircraft);
		}

		return (aircrafts);
	}
}
