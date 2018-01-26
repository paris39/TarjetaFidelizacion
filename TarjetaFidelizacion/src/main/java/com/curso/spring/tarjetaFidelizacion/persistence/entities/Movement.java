/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Date;

/**
 * @author jparis
 */
public class Movement {
	private long id;
	private Card card;
	private Date date;
	private long quantity;
	private String description;
	
	public Movement() {
		super();
	}
	
	/**
	 * @param id
	 * @param card
	 * @param date
	 * @param quantity
	 * @param description
	 */
	public Movement(long id, Card cardId, Date date, long quantity, String description) {
		super();
		this.id = id;
		this.card = cardId;
		this.date = date;
		this.quantity = quantity;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @param card the card to set
	 */
	public void setCardId(Card card) {
		this.card = card;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the quantity
	 */
	public long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}