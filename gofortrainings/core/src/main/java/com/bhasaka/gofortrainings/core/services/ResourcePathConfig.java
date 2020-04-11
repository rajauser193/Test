package com.bhasaka.gofortrainings.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="ResourcePathcofig service")
public @interface ResourcePathConfig {

	@AttributeDefinition(name="path configuration")
	public  String resource_path();

	String resource_Path();
}
