package com.bhasaka.gofortrainings.core.servlets;

import javax.servlet.Servlet;

import org.osgi.service.component.annotations.Component;

@Component(service=Servlet.class,
property= {"sling.servlet.paths=/bin/fd",
		   "sling.servlet.resourceTypes=hjhh"
})
public class ServletImpl{
	

}
