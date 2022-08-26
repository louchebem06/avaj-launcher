package fr.school42.avaj.parsing;

public class Argv {

	public static String getArg(String [] argv) throws Exception {
		int argvLen = argv.length;

		if (argvLen < 1)
			throw new Exception("Not enough argument");
		else if (argvLen > 1)
			throw new Exception("Too much argument");

		return (argv[0]);
	}
}
