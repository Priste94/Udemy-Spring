package com.xantrix.webapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	//ciao

	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		return new Class[]
		{ 
			WebApplicationContextConfig.class 
		};
	}

	@Override
	protected String[] getServletMappings() 
	{
		return new String[] { "/" };
	}

}
