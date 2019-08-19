package com.cts.educare.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDeploymentDescriptor extends AbstractAnnotationConfigDispatcherServletInitializer {

	// return an array of classes : addition config classes (hibernate, security)
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	// returns array of classes : list of servlet helper classes
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {DispatcherServletHelperConfig.class};
	}

	// return an string array of url mapping
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		
		return new String[] {"/"};
	}

}
