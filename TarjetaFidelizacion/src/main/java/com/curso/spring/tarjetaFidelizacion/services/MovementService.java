/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import java.util.List;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.MovementDto;

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
	
	
	/**
	 * Devuelve todos los movimientos de un Cliente
	 * 
	 * @param client
	 * @return
	 */
	public List<MovementDto> listAllMovementsByClient (ClientDto client);
}