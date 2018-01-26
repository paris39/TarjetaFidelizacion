/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Movement;

/**
 * @author jparis
 *
 */
public interface BookingService {
	
	/**
	 * Nueva oferta
	 * 
	 * @param movement
	 * @return
	 */
	public boolean newBooking (Movement movement);
}