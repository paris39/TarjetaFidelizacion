/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;
import com.curso.spring.tarjetaFidelizacion.services.UserService;

/**
 * Controlador de las operaciones de Usuario (Clientes y Operadores)
 * 
 * @author jparis
 */
@Controller
public class UserController {
	
	@Autowired
	//@Qualifier(value="userService")
	private UserService userService;
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String iniciarLogin (Map<String, Object> model) {
		// La l�gica a continuaci�n, es sustituida por los m�todos anotados por @ModelAttribute
		// Invocamos la l�gica para recuperar los datos del G�nero
		
		// servicio.obtenerGeneros();
		// model.put("generos", new String[] {"Masculino", "Femenino"});
		
		return "login";
	}
	
	/**
	 * Login de un usuario en la aplicaci�n
	 * 
	 * @param login
	 * @param password
	 * @return
	 */
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String login(String login, String password) {
		if (userService.login(login, password)) {
			return "true";
		} else {
			return "error";	
		}
	}
	
	/**
	 * Alta de Nuevo cliente
	 * 
	 * @param newClient
	 * @return
	 */
	@RequestMapping(path="/newClient", method=RequestMethod.POST)
	public String newClient(ClientDto newClient) {		
		if (userService.newClient(newClient)) {
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
	public String newOperator(OperatorDto newOperator) {		
		if (userService.newOperator(newOperator)) {
			return "true";
		} else {
			return "error";	
		}
	}
	
}
