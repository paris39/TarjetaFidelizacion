/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author jparis
 */
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// Se le indican las opciones del contexto de Spring. En nuestro caso por Anotaciones. WebApplicationContext > F4 (Type Hierarchy) > Focus On...
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		
		webApplicationContext.setConfigLocation("com.curso.spring.mvc.config");
		
		Dynamic servlet = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(webApplicationContext));
		
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
	}
	
}