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
@ComponentScan(basePackages="com.curso.spring.tarjetaFidelizacion") // Se le añaden los paquetes dónde encontrar los beans o componentes de Spring
public class WebConfig implements WebMvcConfigurer {
	
	/*** CONSTANTES ***/
	// RUTAS DE VISTAS
	private static final String PATH_JSPS = "/WEB-INF/jsps/";
	private static final String PATH_CLIENT = "/WEB-INF/jsps/client";
	private static final String PATH_OPERATOR = "/WEB-INF/jsps/operator";
	
	// RUTA DE INTERNACIONALIZACION
	private static final String PATH_MESSAGES = "/WEB-INF/messages";
	
	// RECURSOS
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
	}
	
	/*** VISTAS ***/
	// Cliente	
	@Bean
	public View clientLogin() {
		return new InternalResourceView(PATH_CLIENT + "/login.jsp");
	}
	
	@Bean
	public View clientPanel() {
		return new InternalResourceView(PATH_CLIENT + "/panel.jsp");
	}
	
	@Bean
	public View newClient() {
		return new InternalResourceView(PATH_CLIENT + "/new_client.jsp");
	}
	
	// Operador
	@Bean
	public View operatorLogin() {
		return new InternalResourceView(PATH_OPERATOR + "/login.jsp");
	}
	
	@Bean
	public View operatorPanel() {
		return new InternalResourceView(PATH_OPERATOR + "/panel.jsp");
	}
	
	@Bean
	public View newOperator() {
		return new InternalResourceView(PATH_OPERATOR + "/new_operator.jsp");
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
		return new InternalResourceViewResolver(PATH_JSPS, ".jsp");
	}
	
	/*** MESSAGES ***/
	@Bean
	public MessageSource messageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		
		messageSource.setBasenames(PATH_MESSAGES);
		
		return messageSource;
	}
	
	/*** INTERCEPTORS ***/
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		
		registry.addInterceptor(localeChangeInterceptor());
	}
	
	/**
	 * Cambia el lenguaje añadiendo en la barra de dirección ?locale=xx, junto con el Interceptor anterior
	 * 
	 * @return
	 */
	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		return new LocaleChangeInterceptor();
	}

}