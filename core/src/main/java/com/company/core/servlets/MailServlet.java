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
		"sling.servlet.methods=GET",
		"sling.servlet.methods=POST", 
		"sling.servlet.paths=/api/customformaction" })
public class MailServlet extends SlingAllMethodsServlet {

	private static final long serialVersionUID = -5639191410226442133L;

	private Logger logger;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		logger = LoggerFactory.getLogger(getClass());
	}

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		logger = LoggerFactory.getLogger(getClass());

	}

}
