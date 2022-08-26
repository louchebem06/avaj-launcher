package fr.school42.avaj.parsing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ReadFile {

	public static Object[] get(String pathFile) throws Exception {
		FileInputStream fis;
		File file = new File(pathFile);
		fis = new FileInputStream(file);

		String fileName = file.getName();
		if (!fileName.equals("scenario.txt")) {
			fis.close();
			throw new Exception("File name is not scenario.txt");
		}

		InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(isr);
		Object lines[] = br.lines().toArray();
		fis.close();

		return (lines);
	}

}
