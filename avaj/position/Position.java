package avaj.position;

import java.util.HashMap;

public class Position {
	private HashMap<String, Integer> pos = new HashMap<String, Integer>();

	public Position(Integer x, Integer y, Integer z) {
		pos.put("x", x);
		pos.put("y", y);
		pos.put("z", z);
	}

	public HashMap<String, Integer> getPos() {
		return (pos);
	}

	public Integer getZ() {
		return (pos.get("z"));
	}

	public Integer getY() {
		return (pos.get("y"));
	}

	public Integer getX() {
		return (pos.get("x"));
	}

	public void add(String key, Integer addValue) {
		if (key.equals("x") || key.equals("y") || key.equals("z")) {
			Integer value = pos.get(key);
			value += addValue;
			if (key == "z") {
				if (value > 100)
					value = 100;
				else if (value < 0)
					value = 0;
			}
			pos.put(key, value);
		}
	}
}
