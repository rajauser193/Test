
	package com.bhasaka.gofortrainings.core.models;
	import  com.bhasaka.gofortrainings.core.models.MultiFieldValuesModel;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import javax.annotation.PostConstruct;

	import org.apache.sling.api.SlingHttpServletRequest;
	import org.apache.sling.api.resource.Resource;
	import org.apache.sling.models.annotations.Model;
	import org.apache.sling.models.annotations.injectorspecific.ChildResource;

	@Model(adaptables = SlingHttpServletRequest.class)
	public class MultiFieldModel {
		
		
        
		@ChildResource
		private Resource fields;
		
		
		private List<MultiFieldValuesModel> fieldList;

		@PostConstruct
		public void init() {
			
			fieldList=new ArrayList<MultiFieldValuesModel>();
			Iterator<Resource> child=fields.listChildren();
			while (child.hasNext()) {
				MultiFieldValuesModel properties=child.next().adaptTo(MultiFieldValuesModel.class);
				fieldList.add(properties);
			}
				
			}

		public List<MultiFieldValuesModel> getFieldList() {
			return fieldList;
		}
		

	}

