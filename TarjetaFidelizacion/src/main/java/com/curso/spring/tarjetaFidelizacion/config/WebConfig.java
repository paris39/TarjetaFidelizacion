/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author jparis
 */
@Configuration
@EnableWebMvc // Se crean HandleMappings
@ComponentScan(basePackages="com.curso.spring.tarjetaFidelizacion") // Se le a�aden los paquetes d�nde encontrar los beans o componentes de Spring
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) { // Si se pierde el EndPoint GET en FormController est� esta soluci�n
		WebMvcConfigurer.super.addViewControllers(registry);
		
//		registry.addViewController("/formulario").setViewName("formulario");
	}
	
	
	/*** VISTAS ***/
	// Cliente
	@Bean
	public View clientLogin() {
		return new InternalResourceView("/WEB-INF/jsps/client/login.jsp");
	}
	
	@Bean
	public View clientPanel() {
		return new InternalResourceView("/WEB-INF/jsps/client/panel.jsp");
	}
	
	// Operador
	@Bean
	public View operatorLogin() {
		return new InternalResourceView("/WEB-INF/jsps/operator/login.jsp");
	}
	
	@Bean
	public View operatorPanel() {
		return new InternalResourceView("/WEB-INF/jsps/operator/panel.jsp");
	}
	
	/*** RESOLVERS ***/
	@Bean
	public ViewResolver beanNameViewResolver() {
		BeanNameViewResolver viewResolver = new BeanNameViewResolver();
		viewResolver.setOrder(1);
		return viewResolver;
	}
	
	@Bean
	public ViewResolver internalResourceViewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/jsps/", ".jsp");
	}
	
	/**
	 * @return
	 */
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		
		messageSource.setBasenames("/WEB-INF/messages");
		
		return messageSource;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		
		registry.addInterceptor(localeChangeInterceptor());
	}
	
	/**
	 * Cambia el lenguaje a�adiendo en la barra de direcci�n ?locale=xx, junto con el Interceptor anterior
	 * 
	 * @return
	 */
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		return new LocaleChangeInterceptor();
	}
	
}