package tdt4250.converter.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Converter {
	TemperatureConverter convertTemp(String type, double value);
	UnitConverter convertUnit(String type, double value);
	CurrencyConverter convertCurrency(String type, double value);
}
