package com.bhasaka.gofortrainings.core.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhasaka.gofortrainings.core.services.FirstServices;

@Component(name="SecondService component",immediate=true)
public class SecondService {
	
	private static final Logger log=LoggerFactory.getLogger(FirstService.class);
	
	@Reference
	FirstServices fs;

	@Activate
	public void activate() {
		log.info("second service  activated",fs.getInfo());
		
	}
	@Deactivate
	public void deactive() {
		log.info("second  service decactivated");
		
	}
	@Modified
	public void updated() {
		log.info("second  service modified");
		
	}
	
	

}
