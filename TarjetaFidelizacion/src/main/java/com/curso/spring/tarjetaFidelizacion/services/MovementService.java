/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

/**
 * @author jparis
 */
public interface MovementService {
	
	/**
	 * Nuevo movimiento
	 * 
	 * @param cardId
	 * @param description
	 * @param quantity
	 * @return
	 */
	public boolean newMovement (long cardId, String description, long quantity);
}