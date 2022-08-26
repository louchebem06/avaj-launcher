package SAVE.avaj.file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileSimulator {
	private static String _name = "simulation.txt";

	public static void createNewFile() {
		try {
			File simulationFile = new File(_name);
			Integer i = 0;
			while (!simulationFile.createNewFile()) {
				i++;
				_name = "simulation[" + i + "].txt";
				simulationFile = new File(_name);
			}
		} catch (Exception e) {
			System.out.println("Error: " + _name + " creation error");
			System.exit(1);
		}
	}

	public static void print(String str) {
		try {
			FileWriter fileWriter = new FileWriter(_name);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.print(str);
			printWriter.close();
		} catch (Exception e) {
			System.out.println("Error: write in " + _name);
			System.exit(1);
		}
	}

}
