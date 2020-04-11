package com.bhasaka.gofortrainings.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)

public class ArticleInfoModel {

	
	@ValueMapValue
	private String type;
	
	@ValueMapValue
	private String title;
	
	@ValueMapValue
	private String articleDescription;
   
	@ValueMapValue(name="sling:resourceType")
	private String slingResourceType;

	public String getType() {
		return type;
	}

	public String getTitle() {
		return title;
	}

	
	
	public String getArticleDescription() {
		return articleDescription;
	}

	public String getSlingresourcType() {
		return slingResourceType;
	}


}
