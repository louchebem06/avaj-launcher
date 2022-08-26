package SAVE;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import SAVE.avaj.aircraft.AbstractAircraft;
import SAVE.avaj.aircraft.type.Baloon;
import SAVE.avaj.aircraft.type.Helicopter;
import SAVE.avaj.aircraft.type.JetPlane;
import SAVE.avaj.simulation.Simulation;

import java.io.File;

public class Main {

	private static void _checkArg(String argv[]) {
		int argvLen = argv.length;

		if (argvLen < 1) {
			System.out.println("Please input value !");
			System.exit(1);
		} else if (argvLen > 1) {
			System.out.println("Too many arguments");
			System.exit(1);
		}
	}

	private static Object[] _readFile(String pathFile) {
		FileInputStream fis;
		try {
			File file = new File(pathFile);
			fis = new FileInputStream(file);

			String fileName = file.getName();
			if (!fileName.equals("scenario.txt")) {
				System.out.println("Error: Your filename is not scenario.txt");
				System.exit(1);
			}

			InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(isr);
			Object lines[] = br.lines().toArray();
			fis.close();
			return (lines);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			System.exit(1);
		}
		return (null);
	}

	private static void exceptionLine(Integer line) {
		System.out.println("Error: content is not valid in ligne " + line);
		System.exit(1);
	}

	private static Integer _setIter(String line) {
		Integer iter = 0;

		try {
			iter = Integer.parseInt(line);
		} catch (Exception e) {
			exceptionLine(1);
		}
		if (iter < 0) exceptionLine(1);

		return (iter);
	}

	private static AbstractAircraft getAircraft(String line, Integer nbLine) {
		AbstractAircraft aircraft = null;
	
		try {
			String type, name;
			Integer x, y, z;
			String[] split = line.split(" ");

			type = split[0];
			name = split[1];
			x = Integer.parseInt(split[2]);
			y = Integer.parseInt(split[3]);
			z = Integer.parseInt(split[4]);

			switch (type) {
				case "Baloon":
					aircraft = new Baloon(name, x, y, z);
					break;
				case "Helicopter":
					aircraft = new Helicopter(name, x, y, z);
					break;
				case "JetPlane":
					aircraft = new JetPlane(name, x, y, z);
					break;
				default:
					exceptionLine(nbLine);
			}
		} catch (Exception e) {
			exceptionLine(nbLine);
		}

		return (aircraft);
	}

	public static void main(String argv[]) {
		_checkArg(argv);
		Object lines[] = _readFile(argv[0]);
		Integer iter = _setIter(lines[0].toString());
		List<AbstractAircraft> aircrafts = new ArrayList<AbstractAircraft>();

		for (int i = 1; i < lines.length; i++)
			aircrafts.add(getAircraft(lines[i].toString(), i + 1));

		new Simulation(iter, aircrafts);
	}
}
