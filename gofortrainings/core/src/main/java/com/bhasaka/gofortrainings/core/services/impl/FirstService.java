package com.bhasaka.gofortrainings.core.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhasaka.gofortrainings.core.services.FirstServices;

@Component(service=FirstService.class,immediate=true)
public class FirstService implements FirstServices{
	
	private static final Logger log=LoggerFactory.getLogger(FirstService.class);
	
	@Activate
	public void activate() {
		log.info("fi srstervice component activated");
		
	}
	@Deactivate
	public void deactive() {
		log.info("first service component decactivated");
		
	}
	@Modified
	public void updated() {
		log.info("first service component modified");
		
	}
	@Override
	public String getInfo() {
	  return "firstservice overisd mothod";
		
	}

}
