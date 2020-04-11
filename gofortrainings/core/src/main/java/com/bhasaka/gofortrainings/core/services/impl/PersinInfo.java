package com.bhasaka.gofortrainings.core.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhasaka.gofortrainings.core.services.PersonInfoConfig;

@Component(name="personconfig info",immediate=true)
@Designate(ocd=PersonInfoConfig.class)
public class PersinInfo {
	
	private boolean enable;
	private String name;
	private String gender;
	private String[] nicknames;
	
	private static final Logger log=LoggerFactory.getLogger(PersinInfo.class);
	
	@Activate 
	public void activate(PersonInfoConfig config) {
		log.info("enable profile:{}"+config.Profile_enable());
		log.info("profile name:{}"+config.Profile_name());
		log.info("profile gender:{}"+config.Profile_Gender());
		if(config.Profile_nicknames()!=null)
		log.info("prooile nickname:{}"+config.Profile_nicknames().length);
	}
	
	
	

}
