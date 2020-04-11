package com.bhasaka.gofortrainings.core.services.impl;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

import com.bhasaka.gofortrainings.core.services.ReadResourceData;
import com.bhasaka.gofortrainings.core.services.ResourcePathConfig;

@Component(service=ResourcePathService.class,immediate=true)
@Designate(ocd=ResourcePathConfig.class)
public class ResourcePathService {
	
	@Reference
	ReadResourceData rs;
	@SlingObject
	ResourceResolver resolver;
	
	
	@Activate
	public void activate(ResourcePathConfig resConfig) {
		
		String path=resConfig.resource_Path();
		rs.readResourceData(resolver, path);
		
		
	}

}
