package tdt4250.converter.gogo;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.annotations.*;
import tdt4250.converter.api.Converter;

@Component(
		service = ConverterCommands.class, 
		property = {
			"osgi.command.scope=converter",
			"osgi.command.function=convertTo",
			"osgi.command.function=addUnit",
			"osgi.command.function=addCurrency"
		}
	)
public class ConverterCommands {

	// TODO: class provided by template
	
	public void convertTo(String convertType, String type, double value) {
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		try {
			for (ServiceReference<Converter> serviceReference : bc.getServiceReferences(Converter.class, null)) {
				Converter converter = bc.getService(serviceReference);
				if (converter != null) {
					try {
						if (convertType.equals("Temperature")) {
							System.out.println(converter.convertTemp(type, value));
						}
						else if (convertType.equals("Unit")) {
							System.out.println(converter.convertUnit(type, value));
						}
						else if (convertType.equals("Currency")) {
							System.out.println(converter.convertCurrency(type, value));
						}
					} finally {
						bc.ungetService(serviceReference);
					}
				}
				else {
					System.out.println(serviceReference.getProperties());
				}
			}
			
		} catch(InvalidSyntaxException e) {}
	}
	

}
