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
	public void login (String login, String password);
}