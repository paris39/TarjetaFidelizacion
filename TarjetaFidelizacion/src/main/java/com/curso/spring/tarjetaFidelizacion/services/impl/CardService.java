/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
@Service
public class CardService implements com.curso.spring.tarjetaFidelizacion.services.CardService {

	@Override
	public List<CardDto> listCardByClient(Client client) {
		// cardDao.searchCardByClient(client);
		
		return null;
	}

}