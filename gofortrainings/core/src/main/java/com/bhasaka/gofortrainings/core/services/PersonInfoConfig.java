package com.bhasaka.gofortrainings.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;

@ObjectClassDefinition(name="pesonInfoconfig service")
public @interface PersonInfoConfig {
	
	@AttributeDefinition(name="enble profile")
	public String Profile_enable();
	@AttributeDefinition(name="enble name")
	public String Profile_name();
	@AttributeDefinition(name="enble gender",options= {
			@Option(label="MALE",value="male"),
			@Option(label="FEMALE",value="female")
	})
	public String Profile_Gender();
	@AttributeDefinition(name="enble nicknames")
	public String[] Profile_nicknames();
	
	
	

}
