/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;
import com.curso.spring.tarjetaFidelizacion.services.MovementService;

/**
 * @author jparis
 */
@Service
public class MovementServiceImplq implements MovementService {

	/**
	 * 
	 */
	public MovementServiceImplq() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.curso.spring.tarjetaFidelizacion.services.MovementService#newMovement(com.curso.spring.tarjetaFidelizacion.dto.CardDto, com.curso.spring.tarjetaFidelizacion.dto.OfferDto, int)
	 */
	@Override
	public boolean newMovement(CardDto card, OfferDto offer, int quantity) {
		// TODO Auto-generated method stub
		return false;
	}

}