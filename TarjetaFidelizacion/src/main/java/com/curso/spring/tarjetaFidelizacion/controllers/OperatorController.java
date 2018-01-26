/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;
import com.curso.spring.tarjetaFidelizacion.services.OperatorService;

/**
 * Controlador de las operaciones de Usuario (Clientes y Operadores)
 * 
 * @author jparis
 */
@Controller
public class OperatorController {
	
	@Autowired
	//@Qualifier(value="userService")
	private OperatorService operatorService;
	
	@RequestMapping(path = "/operatorLogin", method = RequestMethod.GET)
	public String iniciarLogin (Map<String, Object> model) {
		// La lógica a continuación, es sustituida por los métodos anotados por @ModelAttribute
		// Invocamos la lógica para recuperar los datos del Género
		
		// servicio.obtenerGeneros();
		// model.put("generos", new String[] {"Masculino", "Femenino"});
		
		return "login";
	}
	
	/**
	 * Login de un operador en la aplicación
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	@RequestMapping(path="/operatorLogin", method=RequestMethod.POST)
	public String login(String login, String password) {
		if (operatorService.operatorLogin(login, password)) {
			return "true";
		} else {
			return "error";	
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