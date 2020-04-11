package com.bhasaka.gofortrainings.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class ProductInfoModel {
	
	
	@ValueMapValue
	private String type;
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String productDescription;
   
	@ValueMapValue(name="sling:resourceType")
	private String slingResourceType;

	public String getType() {
		return type;
	}

	public String getTitle() {
		return title;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public String getSlingresourcType() {
		return slingResourceType;
	}
	
	
}
