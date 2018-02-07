/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.OfferDto;
import com.curso.spring.tarjetaFidelizacion.services.MovementService;
import com.curso.spring.tarjetaFidelizacion.services.OfferService;

/**
 * @author jparis
 */
@Service
public class OfferServiceImpl implements OfferService {
	
	@Autowired
	private MovementService movementService;
	
	@Override
	public List<OfferDto> listAllOffer() {
		return new ArrayList<OfferDto>();
	}

	@Override
	public List<OfferDto> listOfferByCriterial(Date initDate, Date endDate, float minPrice, float maxPrice,
			String initZone, String endZone) {
		return new ArrayList<OfferDto>();
	}

	@Override
	public boolean bookOffer(CardDto card, OfferDto offer, long quantity) {
		return movementService.newMovement(card.getId(), offer.getDescription(), quantity);
	}

}