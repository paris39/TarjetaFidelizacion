/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.services.MovementService;

/**
 * @author jparis
 */
@Service
public class MovementServiceImpl implements MovementService {

	public MovementServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean newMovement(long cardId, String description, long quantity) {
		// Buscar tarjeta
		
		// TODO Auto-generated method stub
		return false;
	}

}