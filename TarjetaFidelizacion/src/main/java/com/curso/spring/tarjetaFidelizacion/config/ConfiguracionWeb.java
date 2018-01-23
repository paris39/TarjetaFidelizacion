/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author jparis
 */
@Configuration
@EnableWebMvc // Se crean HandleMappings
@ComponentScan(basePackages="com.curso.spring.tarjetaFidelizacion") // Se le añaden los paquetes dónde encontrar los beans o componentes de Spring
public class ConfiguracionWeb implements WebMvcConfigurer {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) { // Si se pierde el EndPoint GET en FormController está esta solución
		WebMvcConfigurer.super.addViewControllers(registry);
		
		registry.addViewController("/formulario").setViewName("formulario");
	}
	
	/**
	 * @return
	 */
	@Bean
	public View miVista() {
		return new InternalResourceView("/WEB-INF/jsps/index.jsp");
	}
	
	/**
	 * @return
	 */
	@Bean
	public ViewResolver beanNameViewResolver() {
		BeanNameViewResolver viewResolver = new BeanNameViewResolver();
		viewResolver.setOrder(1);
		return viewResolver;
	}
	
	/**
	 * @return
	 */
	@Bean
	public ViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/jsps/", ".jsp");
	}
	
}