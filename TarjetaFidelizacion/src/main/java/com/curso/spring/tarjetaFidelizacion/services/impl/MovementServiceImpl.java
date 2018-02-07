/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.MovementDto;
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

	@Override
	public List<MovementDto> listAllMovementsByClient(ClientDto client) {
		return new ArrayList<MovementDto>();
	}
	
}