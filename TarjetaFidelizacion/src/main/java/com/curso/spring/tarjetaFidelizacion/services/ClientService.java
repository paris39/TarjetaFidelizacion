/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;

/**
 * @author jparis
 */
public interface ClientService {
	
	/**
	 * Consulta de puntos de un cliente
	 * 
	 * @param client
	 * @return
	 */
	public long queryPoints(ClientDto client);
}