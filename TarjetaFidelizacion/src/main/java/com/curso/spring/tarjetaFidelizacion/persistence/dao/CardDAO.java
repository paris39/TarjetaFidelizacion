/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.spring.tarjetaFidelizacion.persistence.entities.Card;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
@Repository
public interface CardDAO extends JpaRepository<Card, Integer> {
	
	/**
	 * @param login
	 * @return
	 */
	public List<Card> findByClient(Client client);
}