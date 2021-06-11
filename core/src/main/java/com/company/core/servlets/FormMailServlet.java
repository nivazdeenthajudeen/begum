package com.company.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class, immediate = true, property = { 
		"sling.servlet.paths=/api/custommail",
		"sling.servlet.methods=GET",
		"sling.servlet.methods=POST"})
public class FormMailServlet extends SlingAllMethodsServlet {

	private static final long serialVersionUID = -5818604642186300929L;

	private Logger logger;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		Logger logger = LoggerFactory.getLogger(this.getClass().getName());
		logger.debug("GET Method Called");
		
	}
	
	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		Logger logger = LoggerFactory.getLogger(this.getClass().getName());
		logger.debug("POST Method Called");
		
	}

}
