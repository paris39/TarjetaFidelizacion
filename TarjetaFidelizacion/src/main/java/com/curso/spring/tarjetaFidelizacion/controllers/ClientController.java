/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.services.ClientService;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientServiceException;

/**
 * Controlador de las operaciones de Clientes
 * 
 * @author jparis
 */
@Controller
//@SessionAttributes("client")
public class ClientController {
	
	/*** Beans ***/
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private UtilController utilController;
	
	/*** CONSTANTES ***/ 
	public static final String CLIENT = "client";
	public static final String CARD = "card";
	public static final String CARDS = "cards";
	public static final String ERROR = "error";
	
	// Views constantes
	private static final String CLIENT_LOGIN = "clientLogin";
	private static final String CLIENT_PANEL = "clientPanel";
	private static final String NEW_CLIENT = "newClient";
	
	// Paths constantes
	private static final String PATH_CLIENT_LOGIN = "/clientLogin";
	private static final String PATH_CLIENT_PANEL = "/clientPanel";
	private static final String PATH_NEW_CLIENT = "/newClient";
	
	/**
	 * Ponemos este objeto en el Request, porque formulario.jsp lo busca, y la primera vez que se renderiza el formulario.jsp,
	 * "al no pasar por controller", no existirá el objeto
	 * 
	 * @return new client
	 */
	@ModelAttribute(CLIENT)
	public ClientDto client() {
		return new ClientDto();
	}
	
	@ModelAttribute(CARD)
	public CardDto card() {
		return new CardDto();
	}
	
	@RequestMapping(path = PATH_CLIENT_LOGIN, method = RequestMethod.GET)
	public String loginInit (Map<String, Object> model) {		
		return CLIENT_LOGIN;
	}
	
	@RequestMapping(path = PATH_NEW_CLIENT, method = RequestMethod.GET)
	public String newClientInit (Map<String, Object> model) {		
		return NEW_CLIENT;
	}
	
	@RequestMapping(path = PATH_CLIENT_PANEL, method = RequestMethod.GET)
	public String clientPanelInit (Map<String, Object> model, HttpSession session) {
		if (null != model.get(CLIENT)) {
			model.put(CLIENT, (ClientDto) session.getAttribute(CLIENT));
		}
		return CLIENT_PANEL;
	}
	
	@RequestMapping(path = PATH_CLIENT_LOGIN, method = RequestMethod.POST)
	public String clientLogin (@Valid @ModelAttribute ClientDto clientDto, Errors errors, HttpSession session, ModelMap model) {
		try {
			clientDto = clientService.clientLogin(clientDto);
			
			utilController.modelAndSessionClientUtil(session, model, clientDto);			
			
			if (null != clientDto) {
				return CLIENT_PANEL;			
			} else {
				// Mensaje de error al usuario TODO
				return CLIENT_LOGIN;
			}
		} catch (ClientServiceException e) {
			Error error = new Error(e.getMessage());
			session.setAttribute(ERROR, error);
			
			return CLIENT_LOGIN;
		}
	}
	
	@RequestMapping(path = PATH_NEW_CLIENT, method = RequestMethod.POST)
	public String newClient (@Valid @ModelAttribute ClientDto newClient, Errors errors, HttpSession session, ModelMap model) {
		try {
			newClient = clientService.newClient(newClient);
			
			utilController.modelAndSessionClientUtil(session, model, newClient);
			
			return CLIENT_PANEL;
		} catch (ClientServiceException e) {
			Error error = new Error(e.getMessage());
			session.setAttribute(ERROR, error);

			return NEW_CLIENT;
		}
	}
	
}