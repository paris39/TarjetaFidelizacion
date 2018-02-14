/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.config;

import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;

/**
 * Permite que todos los controladores gestionados por RequestMappinHandlerMapping, tengan esta configuraci�n com�n, dentro del paquete indicado
 * 
 * @author jparis
 */
@ControllerAdvice("com.curso.spring.tarjetaFidelizacion.controllers")
public class ControllersConfig {
	
	// Listado de ofertas
	@ModelAttribute("offers")
	public List<OfferDto> listOffers() {
		// Invocamos la l�gica para recuperar los datos del G�nero.
		return null;
	}
	
}