/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.tarjetaFidelizacion.services.UserService;

/**
 * @author jparis
 */
@Controller
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String login(String login, String password) {
		// Crear dto
		
		userService.login(login, password);
		
		return "miVista";	
	}
}
