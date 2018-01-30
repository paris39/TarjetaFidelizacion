/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.dao;

import org.hibernate.HibernateException;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
public interface ClientDAO {
	
	/**
	 * Inserción de un Cliente en base de datos
	 * 
	 * @param client
	 * @throws HibernateException
	 */
	public void insertClient(Client client) throws HibernateException;
}