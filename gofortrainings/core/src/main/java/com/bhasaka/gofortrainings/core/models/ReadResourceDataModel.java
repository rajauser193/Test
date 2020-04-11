package com.bhasaka.gofortrainings.core.models;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.bhasaka.gofortrainings.core.services.ReadResourceData;

@Model(adaptables=SlingHttpServletRequest.class )
public class ReadResourceDataModel {
	
	
	@OSGiService
	ReadResourceData rs;
	
	@ValueMapValue
	private String link;
  
	@SlingObject
	ResourceResolver resolver;
	
   private Map<Object, String> pagesList;
	
	@PostConstruct
	public void init() {
		
	 pagesList= rs.readResourceData(resolver,link);
	
	 
	}

	public Map<Object, String> getPagesList() {
		return pagesList;
	}

	

	

}
