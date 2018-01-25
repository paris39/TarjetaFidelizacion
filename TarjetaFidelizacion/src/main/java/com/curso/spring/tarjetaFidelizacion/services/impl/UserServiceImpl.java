/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;
import com.curso.spring.tarjetaFidelizacion.services.UserService;

/**
 * @author jparis
 */
@Service
public class UserServiceImpl implements UserService {
	
	// Llamadas a DTO (@Repository) mediante @Autowired
	
	@Override
	public boolean login(String login, String password) {
		// Validar usuario y contrase�a
		return true;
	}

	@Override
	public boolean newClient(Client newClient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean newOperator(Operator newOperator) {
		// TODO Auto-generated method stub
		return false;
	}
}