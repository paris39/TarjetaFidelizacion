/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;
import com.curso.spring.tarjetaFidelizacion.marshall.ClientMarshall;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.services.ClientService;
import com.curso.spring.tarjetaFidelizacion.services.OfferService;

/**
 * @author jparis
 */
@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private OfferService offerService;
	
	@Autowired
	private ClientMarshall clientMarshall;

	@Override
	public long queryPoints(ClientDto client) {
		return 0;
	}

	@Override
	public boolean clientLogin(ClientDto client) {
		// TODO
		if (client.getLogin().equalsIgnoreCase(client.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean newClient(ClientDto newClient) {
		Client client = clientMarshall.clientMarshall(newClient);
		
		//clientDao.save(client);
		
		return false;
	}
	
	@Override
	public List<CardDto> listCard(ClientDto client) {
		// Buscar tarjetas asociadas a clientes
		
		return null;
	}
	
	@Override
	public List<OfferDto> listAllOffer() {
		return offerService.listAllOffer();
	}

	@Override
	public List<OfferDto> listOfferByCriterial(Date initDate, Date endDate, float minPrice, float maxPrice,
			String initZone, String endZone) {
		return offerService.listOfferByCriterial(initDate, endDate, minPrice, maxPrice, initZone, endZone);
	}

	@Override
	public boolean bookOffer(CardDto card, OfferDto offer, int quantity) {
		return offerService.bookOffer(card, offer, quantity);
	}


}