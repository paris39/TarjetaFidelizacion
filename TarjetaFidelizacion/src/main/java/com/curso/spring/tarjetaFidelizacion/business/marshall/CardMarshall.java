/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.business.marshall;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Card;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
@Component
public class CardMarshall {

	public CardMarshall() {}
	
	/**
	 * Conversi�n de CardDto a Card
	 * 
	 * @param cardDto
	 * @return
	 */
	public Card marshall (CardDto cardDto) {
		Card card = new Card();
		
		if (null != cardDto) {
			card.setId(cardDto.getId());
			card.setClient(new Client(cardDto.getClientId()));
		}
		
		return card;
	}
	
	/**
	 * Conversi�n de lista de CardDto a lista de Card
	 * 
	 * @param cardDtoList
	 * @return
	 */
	public List<Card> marshallList (List<CardDto> cardDtoList) {
		List<Card> cardList = new ArrayList<Card>();
		
		if (null != cardDtoList) {
			for (CardDto cardDto : cardDtoList) {
				cardList.add(marshall(cardDto));
			}
		}
		
		return cardList;
	}
	
	
	/**
	 * Conversi�n de Card a CardDto
	 * 
	 * @param card
	 * @return
	 */
	public CardDto unMarshall (Card card) {
		CardDto cardDto = new CardDto();
		
		if (null != card) {
			cardDto.setId(card.getId());
			if (null != card.getClient()) {
				cardDto.setClientId(card.getClient().getId());
			} else {
				cardDto.setClientId(null);
			}
		}
		
		return cardDto;
	}
	
	/**
	 * Conversi�n de lista de Card a lista de CardDto
	 * 
	 * @param cardList
	 * @return
	 */
	public List<CardDto> unMarshallList (List<Card> cardList) {
		List<CardDto> cardDtoList = new ArrayList<CardDto>();
		
		if (null != cardList) {
			for (Card card : cardList) {
				cardDtoList.add(unMarshall(card));
			}
		}
		
		return cardDtoList;
	}
	
	/**
	 * Conversi�n de Set de Card a lista de CardDto
	 * 
	 * @param cardSet
	 * @return
	 */
	public List<CardDto> unMarshallSet (Set<Card> cardSet) {
		List<CardDto> cardDtoList = new ArrayList<CardDto>();
		
		if (null != cardSet) {
			for (Card card : cardSet) {
				cardDtoList.add(unMarshall(card));
			}
		}
		
		return cardDtoList;
	}
	
}