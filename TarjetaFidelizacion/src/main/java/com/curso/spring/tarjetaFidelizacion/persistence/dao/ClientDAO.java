/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
@Repository
public interface ClientDAO extends JpaRepository<Client, Long> {
	
	/**
	 * @param login
	 * @return
	 */
	public Client findByLogin(String login);
}