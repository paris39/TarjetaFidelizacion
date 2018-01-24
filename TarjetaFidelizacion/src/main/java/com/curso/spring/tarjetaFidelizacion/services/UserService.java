/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

/**
 * @author jparis
 */
public interface UserService {
	
	/**
	 * Login de usuario
	 * 
	 * @param login
	 * @param password
	 */
	public boolean login (String login, String password);
}