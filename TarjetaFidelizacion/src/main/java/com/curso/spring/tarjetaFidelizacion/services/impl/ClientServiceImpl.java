/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;
import com.curso.spring.tarjetaFidelizacion.marshall.ClientMarshall;
import com.curso.spring.tarjetaFidelizacion.persistence.dao.ClientDAO;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.services.ClientService;
import com.curso.spring.tarjetaFidelizacion.services.OfferService;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientServiceException;

/**
 * @author jparis
 */
@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private CardService cardService;
	
	@Autowired
	private OfferService offerService;
	
	@Autowired
	private ClientMarshall clientMarshall;
	
	@Autowired
	private ClientDAO clientDAO;

	@Override
	public long queryPoints(ClientDto client) {
		return 0;
	}

	@Override
	public boolean clientLogin(ClientDto client) {
		// TODO
		if (client.getLogin().equalsIgnoreCase(client.getPassword())) {
			client.setPassword(null); // Limpieza de password
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void newClient(ClientDto newClient) throws ClientServiceException {
		Client client = clientMarshall.marshall(newClient);
		
		try {
			clientDAO.insertClient(client);
		} catch (HibernateException e) {
			throw new ClientServiceException(e.getMessage());
		}
	}
	
	@Override
	public List<CardDto> listCard(ClientDto client) {
		// Buscar tarjetas asociadas a clientes
		return cardService.listCardByClient(clientMarshall.marshall(client));
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