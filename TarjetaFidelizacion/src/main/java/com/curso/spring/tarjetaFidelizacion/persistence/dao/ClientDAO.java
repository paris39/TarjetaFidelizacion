/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.dao;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientPersistenceException;

/**
 * @author jparis
 */
public interface ClientDAO {
	
	/**
	 * Inserción de un Cliente en base de datos
	 * 
	 * @param client
	 * @throws ClientPersistenceException
	 */
	public void insertClient(Client client) throws ClientPersistenceException;
	
	/**
	 * Login de cliente
	 * 
	 * @param client
	 * @return
	 * @throws ClientPersistenceException
	 */
	public boolean clientLogin(Client client) throws ClientPersistenceException;
}