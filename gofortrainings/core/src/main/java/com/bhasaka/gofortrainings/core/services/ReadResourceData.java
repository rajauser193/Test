package com.bhasaka.gofortrainings.core.services;

import java.util.Map;

import org.apache.sling.api.resource.ResourceResolver;


public interface ReadResourceData {
	
public Map<Object, String> readResourceData(ResourceResolver resolver, String path) ;
public Map<Object,String> readResourceData(ResourceResolver resourceResolver) ;


}
