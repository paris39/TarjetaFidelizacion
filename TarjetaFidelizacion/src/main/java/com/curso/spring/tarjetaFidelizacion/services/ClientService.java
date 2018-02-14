/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientServiceException;

/**
 * @author jparis
 */
public interface ClientService {
	
	/**
	 * Login de cliente
	 * 
	 * @param client
	 * @return
	 * @throws ClientServiceException
	 */
	public ClientDto clientLogin (ClientDto client) throws ClientServiceException;
	
	/**
	 * Alta de un nuevo cliente
	 * 
	 * @param newClient
	 * @return
	 * @throws ClientServiceException
	 */
	public ClientDto newClient (ClientDto newClient) throws ClientServiceException;
	
}