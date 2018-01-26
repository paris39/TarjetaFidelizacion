/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;

/**
 * @author jparis
 */
public interface OperatorService {
	
	/**
	 * Login de operador
	 * 
	 * @param login
	 * @param password
	 */
	public boolean operatorLogin (String login, String password);
	
	/**
	 * Alta de un nuevo Operador
	 * 
	 * @param newOperator
	 * @return
	 */
	public boolean newOperator (Operator newOperator);
}