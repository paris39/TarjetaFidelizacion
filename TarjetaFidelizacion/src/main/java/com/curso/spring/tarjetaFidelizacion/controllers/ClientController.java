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

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
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
	 * @return new client
	 */
	@ModelAttribute("client")
	public ClientDto client() {
		return new ClientDto();
	}
	
	@Autowired
	private ClientService clientService;
	
	// Views constantes
	private static final String CLIENT_LOGIN = "clientLogin";
	private static final String CLIENT_PANEL = "clientPanel";
	
	// Paths constantes
	private static final String PATH_CLIENT_LOGIN = "/clientLogin";
	private static final String PATH_POINTS_QUERY = "/pointsQuery";
	
	@RequestMapping(path = PATH_CLIENT_LOGIN, method = RequestMethod.GET)
	public String loginInit (Map<String, Object> model) {		
		return CLIENT_LOGIN;
	}
	
	@RequestMapping(path = PATH_CLIENT_LOGIN, method = RequestMethod.POST)
	public String clientLogin (@Valid @ModelAttribute ClientDto client, Errors errors) {
		if (clientService.clientLogin(client)) {
			return CLIENT_PANEL;			
		} else {
			return CLIENT_LOGIN;
		}
	}
	
	/**
	 * Consult de puntos de un cliente
	 * 
	 * @param client
	 * @return
	 */
	@RequestMapping(path = PATH_POINTS_QUERY, method = RequestMethod.GET)
	public long pointsQuery(ClientDto client) {
		// Crear dto
		
		return clientService.queryPoints(client);
	}
	
}