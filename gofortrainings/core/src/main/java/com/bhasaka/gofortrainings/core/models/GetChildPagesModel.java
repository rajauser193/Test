package com.bhasaka.gofortrainings.core.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class )
public class GetChildPagesModel {
	

	@ScriptVariable
	private Page currentPage;

	List<Map<String, String>> childrenPagesList;
	
	
	public List<Map<String, String>> getChildrenPagesList() {
		return childrenPagesList;
	}


	@PostConstruct
	private void init() {
		
		childrenPagesList = new ArrayList<Map<String, String>>();
		Iterator<Page> childPages = currentPage.listChildren();
		
		while (childPages.hasNext()) {
			
			Map<String, String> childPagesMap = new HashMap<>();
			Page childPage = childPages.next();
			ValueMap properties = childPage.getProperties();
			childPagesMap.put("title", properties.get("pageTitle", String.class));
			childPagesMap.put("path", childPage.getPath());

			childrenPagesList.add(childPagesMap);
		}

	}


	
	
	}
	
	
