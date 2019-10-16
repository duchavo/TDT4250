package tdt4250.converter.api;

import java.util.Dictionary;
import java.util.Hashtable;

public class UnitConverter {

	Dictionary<String, Double> unit = new Hashtable<String, Double>();
	
	public UnitConverter() {
		unit.put("Pounds", 2.20462262);
		unit.put("Kg", 0.45359237);
	}
	
	public String convertUnit(String type, double value) { 
		try {
			return unit.get(type) * value + " " + type;
		} catch (NullPointerException e) {}
		return "";
	}
	
	public void addUnit(String type, double value) {
		if (unit.get(type) == null) {
			unit.put(type, value);
		}
	}
	
	public void removeUnit(String type, double value) {
		if (unit.get(type) != null) {
			unit.remove(type);
		}
	}

}
