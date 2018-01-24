/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;

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
	public boolean newClient (ClientDto newClient);
	
	/**
	 * Alta de un nuevo Operador
	 * 
	 * @param newOperator
	 * @return
	 */
	public boolean newOperator (OperatorDto newOperator);
}