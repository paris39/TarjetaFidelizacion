/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.exception;

import org.hibernate.HibernateException;

/**
 * @author jparis
 */
public class ClientServiceException extends HibernateException {
	private static final long serialVersionUID = -8116491080757024742L;

	/**
	 * @param message
	 */
	public ClientServiceException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public ClientServiceException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public ClientServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}