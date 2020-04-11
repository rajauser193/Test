package com.bhasaka.gofortrainings.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class)
public class MultiFieldValuesModel {
	


	@ValueMapValue
	private String link;


	@ValueMapValue
	private String label;

	
	public String getLink() {
		return link;
	}


	public String getLabel() {
		return label;
	}


	}
	
	

