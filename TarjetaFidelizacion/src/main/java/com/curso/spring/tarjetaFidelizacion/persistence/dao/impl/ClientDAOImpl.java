/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.curso.spring.tarjetaFidelizacion.persistence.dao.BaseDAO;
import com.curso.spring.tarjetaFidelizacion.persistence.dao.ClientDAO;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientPersistenceException;

/**
 * @author jparis
 */
//@Repository
//@Transactional
public class ClientDAOImpl extends BaseDAO implements ClientDAO {

	@Override
	public void insertClient(Client client) throws ClientPersistenceException {
		try {
//			Session session = sessionFactory.getCurrentSession(); // Creando la sesión el TransactionManager
//			
//			session.persist(client); // Hibernate se encarga de construir la consulta de INSERT en base a los datos de la Entidad
//			session.flush();
		} catch (HibernateException e) {
			throw new ClientPersistenceException(e.getMessage());
		}
	}

	@Override
	public boolean clientLogin(Client client) throws ClientPersistenceException {
		try {
//			Session session = sessionFactory.getCurrentSession();
		
		
			// TODO Auto-generated method stub
			return false;
		} catch (HibernateException e) {
			throw new ClientPersistenceException(e.getMessage());
		}
	}
	
}