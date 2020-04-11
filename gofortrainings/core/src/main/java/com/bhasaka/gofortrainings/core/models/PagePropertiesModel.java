package com.bhasaka.gofortrainings.core.models;


import javax.annotation.PostConstruct;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=SlingHttpServletRequest.class)
public class PagePropertiesModel {
	

	@ValueMapValue
	private String link;
 
	@SlingObject
	private ResourceResolver resourceResolver;
	
	 private String pTitle;
		
		
	@PostConstruct
    public void init(){
		
		Resource resource=resourceResolver.getResource(link);
	    ValueMap properties=resource.getValueMap();
	    pTitle=properties.get("jcr:createdBy",String.class);
		
	}


	public String getpTitle() {
		return pTitle;
	}

	public String getLink() {
		return link;
	}	
	
}
