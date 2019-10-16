package tdt4250.converter.api;

import java.util.Dictionary;
import java.util.Hashtable;

public class CurrencyConverter {
	
	Dictionary<String, Double> currency = new Hashtable<String, Double>();
	
	public CurrencyConverter() {
		currency.put("Dollar", 0.10964);
		currency.put("Euro", 0.100247833);
		currency.put("Pounds", 0.089141793);
	}
	
	public String convertCurrency(String type, double value) {
		try {
			return currency.get(type) * value + " " + type;

		} catch (NullPointerException e) {}
		return "";
	}
	
	public void addCurrency(String type, double value) {
		if (currency.get(type) == null) {
			currency.put(type, value);
		}
	}
	
	public void removeCurrency(String type) {
		if (currency.get(type) != null) {
			currency.remove(type);
		}
	}


}
