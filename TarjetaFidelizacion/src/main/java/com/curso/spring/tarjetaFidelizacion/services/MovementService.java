/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;

/**
 * @author jparis
 */
public interface MovementService {
	
	/**
	 * Nuevo movimiento
	 * 
	 * @param card
	 * @param offer
	 * @param quantity
	 * @return
	 */
	public boolean newMovement (CardDto card, OfferDto offer, int quantity);
}