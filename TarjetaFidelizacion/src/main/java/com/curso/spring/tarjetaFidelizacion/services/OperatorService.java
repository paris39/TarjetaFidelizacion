/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;

/**
 * @author jparis
 */
public interface OperatorService {
	
	/**
	 * Login de operador
	 * 
	 * @param operator
	 */
	public boolean operatorLogin (OperatorDto operator);
	
	/**
	 * Alta de un nuevo Operador
	 * 
	 * @param newOperator
	 * @return
	 */
	public boolean newOperator (Operator newOperator);
}