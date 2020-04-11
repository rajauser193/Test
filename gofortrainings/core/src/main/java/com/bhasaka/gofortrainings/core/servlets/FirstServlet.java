package com.bhasaka.gofortrainings.core.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

@Component(service=Servlet.class,
property= {"sling.servlet.resourceTypes=gofortrainings/components/page/homepage"})
public class FirstServlet extends SlingSafeMethodsServlet {
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       out.write("welcome to first serrvlet");

	
	}

}
