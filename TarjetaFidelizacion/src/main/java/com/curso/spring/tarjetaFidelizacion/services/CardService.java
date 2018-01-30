/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import java.util.List;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 *
 */
public interface CardService {
	
	/**
	 * Devuelve un listado de tarjetas por cliente
	 * 
	 * @param client
	 * @return
	 */
	public List<CardDto> listCardByClient (Client client);
}