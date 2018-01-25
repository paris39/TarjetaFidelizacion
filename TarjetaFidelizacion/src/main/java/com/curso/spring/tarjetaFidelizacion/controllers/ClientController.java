/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.services.ClientService;

/**
 * Controlador de las operaciones de Usuario (Clientes y Operadores)
 * 
 * @author jparis
 */
@Controller
public class ClientController {
	
	/**
	 * Ponemos este objeto en el Request, porque formulario.jsp lo busca, y la primera vez que se renderiza el formulario.jsp,
	 * "al no pasar por controller", no existirá el objeto
	 * 
	 * @return
	 */
	@ModelAttribute("client")
	public Client client() {
		return new Client();
	}
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(path = "/clientLogin", method = RequestMethod.GET)
	public String loginInit (Map<String, Object> model) {		
		return "clientLogin";
	}
	
	/**
	 * Consult de puntos de un cliente
	 * 
	 * @param client
	 * @return
	 */
	@RequestMapping(path="/pointsQuery", method=RequestMethod.GET)
	public long pointsQuery(Client client) {
		// Crear dto
		
		return clientService.queryPoints(client);
	}
	
}