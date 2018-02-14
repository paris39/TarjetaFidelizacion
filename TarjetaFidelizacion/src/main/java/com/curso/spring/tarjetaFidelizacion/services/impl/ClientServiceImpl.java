/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.business.ClientBusiness;
import com.curso.spring.tarjetaFidelizacion.business.marshall.ClientMarshall;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.persistence.dao.ClientDAO;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.services.ClientService;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientPersistenceException;
import com.curso.spring.tarjetaFidelizacion.services.exception.ClientServiceException;

/**
 * @author jparis
 */
@Service
public class ClientServiceImpl implements ClientService {
	
	/*** Beans auxiliares ***/
	// Clients
	@Autowired
	private ClientMarshall clientMarshall;
	
	@Autowired
	private ClientBusiness clientBusiness;
	
	/*** Beans de DAOs ***/
	@Autowired
	private ClientDAO clientDAO;
	
	// Constante para Añadir puntos por defecto al registrarse
	private static final Long DEFAULT_POINTS = new Long(0); // 0 puntos

	@Override
	@Transactional
	public ClientDto clientLogin(ClientDto clientDto) throws ClientServiceException {
		try {
			Client client = clientDAO.findByLogin(clientDto.getLogin());
			return clientBusiness.testLogin(clientDto, client);
		} catch (ClientPersistenceException e) {
			throw new ClientServiceException(e.getMessage());
		}
	}

	@Override
	@Transactional
	public ClientDto newClient(ClientDto newClient) throws ClientServiceException {		
		try {
			newClient.setPoints(DEFAULT_POINTS);
			Client newClientAux = clientDAO.saveAndFlush(clientMarshall.marshall(newClient));
			newClientAux.setPassword(null);
			return clientMarshall.unMarshall(newClientAux);
		} catch (ClientPersistenceException e) {
			throw new ClientServiceException(e.getMessage());
		}
	}

}