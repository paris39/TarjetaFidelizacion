/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;

/**
 * @author jparis
 */
public interface UserService {
	
	/**
	 * Login de usuario
	 * 
	 * @param login
	 * @param password
	 */
	public boolean login (String login, String password);
	
	/**
	 * Alta de un nuevo cliente
	 * 
	 * @param newClient
	 * @return
	 */
	public boolean newClient (Client newClient);
	
	/**
	 * Alta de un nuevo Operador
	 * 
	 * @param newOperator
	 * @return
	 */
	public boolean newOperator (Operator newOperator);
}