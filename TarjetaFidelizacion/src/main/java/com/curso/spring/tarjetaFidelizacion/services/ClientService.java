/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

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
	public long queryPoints(Client client);
}