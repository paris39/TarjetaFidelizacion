/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;
import com.curso.spring.tarjetaFidelizacion.services.OperatorService;

/**
 * @author jparis
 */
@Service
public class OperatorServiceImpl implements OperatorService {
	
	// Llamadas a DTO (@Repository) mediante @Autowired

	@Override
	public boolean newOperator(Operator newOperator) {
		return false;
	}

	@Override
	public boolean operatorLogin(OperatorDto operator) {
		return false;
	}
}