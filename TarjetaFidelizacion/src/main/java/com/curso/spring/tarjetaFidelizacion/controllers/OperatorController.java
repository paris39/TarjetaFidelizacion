/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;
import com.curso.spring.tarjetaFidelizacion.services.OperatorService;

/**
 * Controlador de las operaciones de Usuario (Clientes y Operadores)
 * 
 * @author jparis
 */
@Controller
public class OperatorController {
	
	/**
	 * Ponemos este objeto en el Request, porque formulario.jsp lo busca, y la primera vez que se renderiza el formulario.jsp,
	 * "al no pasar por controller", no existirá el objeto
	 * 
	 * @return new client
	 */
	@ModelAttribute("operator")
	public OperatorDto operator() {
		return new OperatorDto();
	}
	
	@Autowired
	private OperatorService operatorService;
	
	// Views constantes
	private static final String OPERATOR_LOGIN = "operatorLogin";
	private static final String OPERATOR_PANEL = "operatorPanel";
	
	// Paths constantes
	private static final String PATH_OPERATOR_LOGIN = "/operatorLogin";
	
	@RequestMapping(path = PATH_OPERATOR_LOGIN, method = RequestMethod.GET)
	public String initLogin (Map<String, Object> model) {		
		return OPERATOR_LOGIN;
	}
	
	/**
	 * Login de un operador en la aplicación
	 * 
	 * @param operator
	 * @return
	 */
	@RequestMapping(path = PATH_OPERATOR_LOGIN, method = RequestMethod.POST)
	public String operatorLogin(@Valid @ModelAttribute OperatorDto operator, Errors errors) {
		if (operatorService.operatorLogin(operator)) {
			return OPERATOR_PANEL;			
		} else {
			return OPERATOR_LOGIN;
		}
	}
	
	/**
	 * Alta de Nuevo Operador
	 * 
	 * @param newOperator
	 * @return
	 */
	@RequestMapping(path="/newOperator", method=RequestMethod.POST)
	public String newOperator(Operator newOperator) {		
		if (operatorService.newOperator(newOperator)) {
			return "true";
		} else {
			return "error";	
		}
	}
	
}