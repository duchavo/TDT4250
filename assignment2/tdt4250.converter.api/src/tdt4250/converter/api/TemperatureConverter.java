package tdt4250.converter.api;


public class TemperatureConverter {

	public String convertTemp(String type, double value) {
		try {
			if (type.equals("F")) {
				return value * 9/5 + 32 + " F";
			}
			if (type.equals("C")) {
				return (value - 32) * 9/5 + " C";
			}
		} catch (NullPointerException e) {}
		return "";
	}
}
