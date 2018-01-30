/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jparis
 */
public abstract class BaseDAO {
	
	@Autowired
	protected SessionFactory sessionFactory;

}