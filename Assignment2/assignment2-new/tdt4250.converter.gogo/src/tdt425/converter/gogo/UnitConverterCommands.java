package tdt425.converter.gogo;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import org.osgi.service.component.annotations.*;
import org.apache.felix.service.command.Descriptor;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

import tdt4250.converter.api.UnitConverter;
import tdt4250.converter.api.UnitConverterResult;
import tdt4250.converter.api.UnitConverterInterface;

@Component(
		service = UnitConverterCommands.class,
		property = {
			"osgi.command.scope=unitConverter",
			"osgi.command.function=list",
			"osgi.command.function=add",
		}

	)
public class UnitConverterCommands {

	
	@Descriptor("Convert")
	public void convert() {
		
	}
	
	@Descriptor("list available conversions")
	public void list() {
		System.out.println("Unit conversions: ");
		BundleContext bc = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
		try {
			for (ServiceReference<UnitConverterInterface> sr : bc.getServiceReferences(UnitConverterInterface.class, null)) {
				UnitConverterInterface uci = bc.getService(sr);
				try {
					if (uci != null) {
						System.out.println(uci.getUnitName());
					}
				} finally {
					bc.ungetService(sr);
				}
				System.out.println(" ");
			}
		} catch (InvalidSyntaxException e) {}
		System.out.println();
	}
	
	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	private ConfigurationAdmin cm;

	
	@Descriptor("Add a new conversion")
	public void add() throws IOException, InvalidSyntaxException {
		
		
	}


	

}
