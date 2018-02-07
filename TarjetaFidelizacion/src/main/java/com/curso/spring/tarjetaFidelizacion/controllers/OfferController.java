/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;

/**
 * Controlador de las operaciones de Ofertas
 * 
 * @author jparis
 */
@Controller
@SessionAttributes("offer")
public class OfferController {
	
	/**
	 * Ponemos este objeto en el Request, porque formulario.jsp lo busca, y la primera vez que se renderiza el formulario.jsp,
	 * "al no pasar por controller", no existirá el objeto
	 * 
	 * @return new offer
	 */
	@ModelAttribute("offer")
	public OfferDto offer() {
		return new OfferDto();
	}
	
}