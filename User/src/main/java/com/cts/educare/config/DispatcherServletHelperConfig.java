package com.cts.educare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration // register this class as config class
@EnableWebMvc // enable the web mvc special annotation support
@ComponentScan("com.cts.educare") // enabled the component scanning
public class DispatcherServletHelperConfig {

	// programmatically exposing the bean...
	// method that create the required object explicitly
	// inject dependency (by calling method explicitly)
	// return the object to expose as bean
	@Bean   // will be used by container to manage beans
	public ViewResolver viewResolver() {
		
		// create object
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		// inject dependency (calling setter method)
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		// return object to expose as bean
		return viewResolver;
		
	}
	
}