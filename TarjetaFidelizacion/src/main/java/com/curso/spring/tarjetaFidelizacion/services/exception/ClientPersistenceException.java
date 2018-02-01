/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.exception;

import org.hibernate.HibernateException;

/**
 * @author jparis
 */
public class ClientPersistenceException extends HibernateException {
	private static final long serialVersionUID = -8116491080757024742L;

	/**
	 * @param message
	 */
	public ClientPersistenceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ClientPersistenceException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ClientPersistenceException(String message, Throwable cause) {
		super(message, cause);
	}

}