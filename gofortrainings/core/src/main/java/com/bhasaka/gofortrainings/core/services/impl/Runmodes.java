package com.bhasaka.gofortrainings.core.services.impl;

import java.net.URL;
import java.util.Set;

import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.settings.SlingSettingsService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(name="custom-rumode",immediate=true)
public abstract class Runmodes implements SlingSettingsService {
	
	
	
	private SlingSettingsService sling;
	
	Set<String> run =sling.getRunModes();
 
	

	public Set<String> getRun() {
		return run;
	}

	

}
