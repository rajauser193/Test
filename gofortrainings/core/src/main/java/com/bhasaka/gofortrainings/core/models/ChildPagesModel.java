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
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;


@Model(adaptables=SlingHttpServletRequest.class)
public class ChildPagesModel {
	
	@ValueMapValue
	private String link;
	
	@ScriptVariable
	private PageManager pageManager;
	
    private List<Map<String, String>> pagesList;
 
	@PostConstruct
    public void init() {
		
		
       pagesList = new ArrayList<Map<String, String>>();
    
           Page pagePath=pageManager.getPage(link);
    
		Iterator<Page> childPages = pagePath.listChildren();
		
		while (childPages.hasNext()) {
			
			Map<String, String> childPagesMap = new HashMap<>();
			Page childPage = childPages.next();
			ValueMap properties = childPage.getProperties();
			childPagesMap.put("title", properties.get("pageTitle", String.class));
			childPagesMap.put("path", childPage.getPath());

			pagesList.add(childPagesMap);
		}

	}
	public List<Map<String, String>> getPagesList() {
		return pagesList;
	}

		}
	


