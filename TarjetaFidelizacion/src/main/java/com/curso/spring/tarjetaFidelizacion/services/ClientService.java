/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import java.util.Date;
import java.util.List;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;

/**
 * @author jparis
 */
public interface ClientService {
	
	/**
	 * Login de cliente
	 * 
	 * @param client
	 * @return
	 */
	public boolean clientLogin (ClientDto client);
	
	/**
	 * Alta de un nuevo cliente
	 * 
	 * @param newClient
	 * @return
	 */
	public boolean newClient (ClientDto newClient);
	
	/**
	 * Listado de tarjetas de un determinado cliente
	 * 
	 * @param client
	 * @return
	 */
	public List<CardDto> listCard (ClientDto client);
	
	/**
	 * Consulta de puntos de un cliente
	 * 
	 * @param client
	 * @return
	 */
	public long queryPoints(ClientDto client);
	
	/**
	 * Consulta de todas las ofertas
	 * 
	 * @return
	 */
	public List<OfferDto> listAllOffer();
	
	/**
	 * Consulta de ofertas según criterio
	 * 
	 * @param initDate
	 * @param endDate
	 * @param minPrice
	 * @param maxPrice
	 * @param initZone
	 * @param endZone
	 * @return
	 */
	public List<OfferDto> listOfferByCriterial(Date initDate, Date endDate, float minPrice, float maxPrice, String initZone, String endZone);
	
	/**
	 * Reserva de oferta por parte de un cliente
	 * 
	 * @param card
	 * @param offer
	 * @param quantity
	 * @return
	 */
	public boolean bookOffer (CardDto card, OfferDto offer, int quantity);
	
}