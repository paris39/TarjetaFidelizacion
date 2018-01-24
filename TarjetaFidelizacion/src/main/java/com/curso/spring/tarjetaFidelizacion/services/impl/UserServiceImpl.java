/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.services.UserService;

/**
 * @author jparis
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public boolean login(String login, String password) {
		// Validar usuario y contraseña
		return true;
	}
}
