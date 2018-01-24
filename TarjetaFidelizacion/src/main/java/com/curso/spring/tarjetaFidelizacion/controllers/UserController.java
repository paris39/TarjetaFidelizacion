/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;
import com.curso.spring.tarjetaFidelizacion.dto.UserDto;
import com.curso.spring.tarjetaFidelizacion.services.UserService;

/**
 * Controlador de las operaciones de Usuario (Clientes y Operadores)
 * 
 * @author jparis
 */
@Controller
@RequestMapping(path="/user")
public class UserController {
	
	/**
	 * Ponemos este objeto en el Request, porque formulario.jsp lo busca, y la primera vez que se renderiza el formulario.jsp,
	 * "al no pasar por controller", no existirá el objeto
	 * 
	 * @return
	 */
	@ModelAttribute("user")
	public UserDto user() {
		return new ClientDto();
	}
	
	@Autowired
	private UserService userService;
	
	/**
	 * Login de un usuario en la aplicación
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
