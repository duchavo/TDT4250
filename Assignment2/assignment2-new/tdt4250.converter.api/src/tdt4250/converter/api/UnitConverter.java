package tdt4250.converter.api;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UnitConverter {
	
	private static final String DEFAULT_MESSAGE = "Sorry, the conversion method does not exist";
	private Collection<UnitConverterInterface> unitConversions = new ArrayList<UnitConverterInterface>();
	
	public void addUnitConversion(UnitConverterInterface uci) {
		unitConversions.add(uci);
	}
	
	public void removeUnitConversion(UnitConverterInterface uci) {
		unitConversions.remove(uci);
	}
	
	public UnitConverter(UnitConverterInterface... uci) {
		unitConversions.addAll(Arrays.asList(uci));
	}
	
	private UnitConverterResult convert(String fromUnit, String toUnit, double value, 
			Iterable<UnitConverterInterface> unitConversions) {
		StringBuilder messages = new StringBuilder();
		URI link = null;
		boolean success = false;
		for (UnitConverterInterface uci: unitConversions) {
			UnitConverterResult result = uci.convert(fromUnit, toUnit, value);
			if (result.isSuccess()) {
				messages.append(result.getMessage());
				messages.append("(" + uci.getUnitName() + ")\n");
				success = true;
				if (link == null) {
					link = result.getLink();
				}
			}
		}
		if (messages.length() == 0) {
			messages.append(DEFAULT_MESSAGE);
		}
		return new UnitConverterResult(success, messages.toString(), link);
	}
	
	public UnitConverterResult convert(String fromUnit, String toUnit, double value, String unitName) {
		return convert(fromUnit, toUnit, value, unitConversions.stream().filter(unitConversion -> unitConversion.getUnitName().equals(unitName)).collect(Collectors.toList()));
	}
	
	public UnitConverterResult convert(String fromUnit, String toUnit, double value) {
		return convert(fromUnit, toUnit, value, this.unitConversions);
	}
	

}
