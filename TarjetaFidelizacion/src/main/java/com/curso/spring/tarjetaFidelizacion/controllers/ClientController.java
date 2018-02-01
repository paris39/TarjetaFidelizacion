/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.services.ClientService;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientServiceException;

/**
 * Controlador de las operaciones de Usuario (Clientes y Operadores)
 * 
 * @author jparis
 */
@Controller
@SessionAttributes("client")
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
	private static final String NEW_CLIENT = "newClient";
	
	// Paths constantes
	private static final String PATH_CLIENT_LOGIN = "/clientLogin";
	private static final String PATH_CLIENT_PANEL = "/clientPanel";
	private static final String PATH_NEW_CLIENT = "/newClient";
	private static final String PATH_POINTS_QUERY = "/pointsQuery";
	
	@RequestMapping(path = PATH_CLIENT_LOGIN, method = RequestMethod.GET)
	public String loginInit (Map<String, Object> model) {		
		return CLIENT_LOGIN;
	}
	
	@RequestMapping(path = PATH_NEW_CLIENT, method = RequestMethod.GET)
	public String newClientInit (Map<String, Object> model) {		
		return NEW_CLIENT;
	}
	
	@RequestMapping(path = PATH_CLIENT_PANEL, method = RequestMethod.GET)
	public String clientPanelInit (Map<String, Object> model) {		
		return CLIENT_PANEL;
	}
	
	@RequestMapping(path = PATH_CLIENT_LOGIN, method = RequestMethod.POST)
	public String clientLogin (@Valid @ModelAttribute ClientDto client, Errors errors, HttpSession session) {
		try {
			if (clientService.clientLogin(client)) {
				return CLIENT_PANEL;			
			} else {
				// Mensaje de error al usuario TODO
				session.setAttribute("client", client);
				return CLIENT_LOGIN;
			}
		} catch (ClientServiceException e) {
			Error error = new Error(e.getMessage());
			session.setAttribute("error", error);
			
			return CLIENT_LOGIN;
		}
	}
	
	@RequestMapping(path = PATH_NEW_CLIENT, method = RequestMethod.POST)
	public String newClient (@Valid @ModelAttribute ClientDto newClient, Errors errors, HttpSession session) {
		try {
			clientService.newClient(newClient);
			return CLIENT_PANEL;
		} catch (ClientServiceException e) {
			Error error = new Error(e.getMessage());
			session.setAttribute("error", error);

			return NEW_CLIENT;
		}
	}
	
	/**
	 * Consulta de puntos de un cliente
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