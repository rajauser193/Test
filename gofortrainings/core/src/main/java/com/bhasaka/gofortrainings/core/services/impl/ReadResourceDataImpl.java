package com.bhasaka.gofortrainings.core.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bhasaka.gofortrainings.core.services.ReadResourceData;
import com.bhasaka.gofortrainings.core.services.ResourcePathConfig;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;

@Component(service=ReadResourceDataImpl.class,immediate=true)
@Designate(ocd=ResourcePathConfig.class)

public class ReadResourceDataImpl implements ReadResourceData {
	
	private String path;
	
   private static final Logger log=LoggerFactory.getLogger(ReadResourceDataImpl.class);
	
	@Override
	public Map<Object, String> readResourceData(ResourceResolver resolver, String path) {
		Map<Object, String> resourceMap = new HashMap<>();
		Resource resource=resolver.getResource(path);
	    ValueMap properties=resource.getValueMap();
		resourceMap.put("title", properties.get("jcr:createdBy", String.class));
		
	    return resourceMap;
	}
	
	

	@Override
	public Map<Object,String> readResourceData(ResourceResolver resourceResolver) {
		
		Map<Object, String> resourceMap = new HashMap<>();
		Resource resource=resourceResolver.getResource(path);
	     ValueMap properties=resource.getValueMap();
	     
		resourceMap.put("title", properties.get("jcr:createdBy", String.class));
		
	    return resourceMap;
	}
	
	@Activate
	public void activate(ResourcePathConfig config) {
		path = config.resource_Path();
		log.info("welcom to config"+config.resource_Path());
		
		
	}
	

}
