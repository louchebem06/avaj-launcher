package fr.school42.avaj.simulator;

import java.util.ArrayList;
import java.util.List;

import fr.school42.avaj.aircraft.Flyable;
import fr.school42.avaj.parsing.Argv;
import fr.school42.avaj.parsing.ReadFile;
import fr.school42.avaj.tower.WeatherTower;
import fr.school42.avaj.parsing.Parsing;

public class Simulator {

	private static int _iteration;
	private static List<Flyable> _aircrafts = new ArrayList<Flyable>();
	
	public static void main(String argv[]) {
		try {
			String av = Argv.getArg(argv);
			Object [] lines = ReadFile.get(av);
			_iteration = Parsing.getIter(lines);
			_aircrafts = Parsing.getAircrafts(lines);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		for (Flyable aircraft : _aircrafts) {
			aircraft.registerTower(new WeatherTower());
		}

		for (int i = 0; i < _iteration; i++) {
			for (Flyable aircraft : _aircrafts) {
				aircraft.updateCondition();
			}
		}
	}

}
