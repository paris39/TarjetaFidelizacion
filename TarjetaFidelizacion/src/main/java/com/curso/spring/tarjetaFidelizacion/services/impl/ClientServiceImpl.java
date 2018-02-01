/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.business.ClientBusiness;
import com.curso.spring.tarjetaFidelizacion.business.marshall.ClientMarshall;
import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;
import com.curso.spring.tarjetaFidelizacion.persistence.dao.ClientDAO;
import com.curso.spring.tarjetaFidelizacion.persistence.dao.ClientDataDAO;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.services.ClientService;
import com.curso.spring.tarjetaFidelizacion.services.OfferService;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientPersistenceException;
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
	
	//@Autowired
	private ClientDAO clientDAO;
	
	@Autowired
	private ClientDataDAO clientDataDAO;
	
	@Autowired
	private ClientBusiness clientBusiness;

	@Override
	public long queryPoints(ClientDto client) {
		return 0;
	}

	@Override
	public boolean clientLogin(ClientDto clientDto) throws ClientServiceException {
		try {
			Client client = clientDataDAO.findByLogin(clientDto.getLogin());
			return clientBusiness.testLogin(clientDto, client);
		} catch (ClientPersistenceException e) {
			throw new ClientServiceException(e.getMessage());
		}
	}

	@Override
	public void newClient(ClientDto newClient) throws ClientServiceException {		
		try {
			clientDataDAO.save(clientMarshall.marshall(newClient));
		} catch (ClientPersistenceException e) {
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