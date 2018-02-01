/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
public interface ClientDataDAO extends JpaRepository<Client, Long> {
	
	/**
	 * @param login
	 * @return
	 */
	public Client findByLogin(String login);
}