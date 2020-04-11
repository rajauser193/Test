package com.bhasaka.gofortrainings.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.designer.Style;

@Model(adaptables = SlingHttpServletRequest.class)
public class BannerModel {

	@ScriptVariable
	private Style currentStyle;
	private String title1;

	@ScriptVariable
	private Page currentPage;

	private String pageTitle;

	public String getPageTitle() {
		return pageTitle;
	}

	public String getTitle1() {
		return title1;
	}

	@PostConstruct
	public void init() {
		pageTitle = currentPage.getPageTitle();

		title1 = currentStyle.get("title1", String.class);

	}

}
