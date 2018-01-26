/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Movement;
import com.curso.spring.tarjetaFidelizacion.services.BookingService;

/**
 * @author jparis
 */
@Service
public class BookingServiceImpl implements BookingService {

	/**
	 * 
	 */
	public BookingServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.curso.spring.tarjetaFidelizacion.services.BookingService#newBooking(com.curso.spring.tarjetaFidelizacion.persistence.entities.Movement)
	 */
	@Override
	public boolean newBooking(Movement movement) {
		// TODO Auto-generated method stub
		return false;
	}

}