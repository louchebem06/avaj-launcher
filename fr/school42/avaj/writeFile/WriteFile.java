package fr.school42.avaj.writeFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteFile {

	private static String _name = "simulation.txt";

	public static void createNewFile() throws Exception {
		File simulationFile = new File(_name);
		Integer i = 0;
		while (!simulationFile.createNewFile()) {
			i++;
			_name = "simulation[" + i + "].txt";
			simulationFile = new File(_name);
		}
	}

	public static void print(String str) throws Exception {
		File file = new File(_name);
		FileOutputStream fos = new FileOutputStream(file, true);
		PrintWriter printWriter = new PrintWriter(fos);
		printWriter.println(str);
		printWriter.close();
	}
	
}
