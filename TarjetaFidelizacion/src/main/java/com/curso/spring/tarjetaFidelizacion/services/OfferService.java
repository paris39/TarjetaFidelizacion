/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services;

import java.util.Date;
import java.util.List;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;

/**
 * @author jparis
 */
public interface OfferService {
	
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
	 * Reserva de oferta por parte de una tarjeta fidelización
	 * 
	 * @param card
	 * @param offer
	 * @param quantity
	 * @return
	 */
	public boolean bookOffer(CardDto card, OfferDto offer, long quantity);
}