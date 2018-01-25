/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;
import com.curso.spring.tarjetaFidelizacion.services.UserService;

/**
 * @author jparis
 */
@Service
public class UserServiceImpl implements UserService {
	
	// Llamadas a DTO (@Repository) mediante @Autowired
	
	@Override
	public boolean login(String login, String password) {
		// Validar usuario y contraseña
		return true;
	}

	@Override
	public boolean newClient(ClientDto newClient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean newOperator(OperatorDto newOperator) {
		// TODO Auto-generated method stub
		return false;
	}
}