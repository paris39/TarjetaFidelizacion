/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@RequestMapping(path="/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	/**
	 * Consult de puntos de un cliente
	 * 
	 * @param client
	 * @return
	 */
	@RequestMapping(path="/pointsQuery", method=RequestMethod.GET)
	public long pointsQuery(ClientDto client) {
		// Crear dto
		
		return clientService.queryPoints(client);
	}
	
}