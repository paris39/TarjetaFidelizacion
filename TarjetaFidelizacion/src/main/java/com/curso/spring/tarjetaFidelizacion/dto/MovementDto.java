/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

import java.util.Date;

/**
 * @author jparis
 */
public class MovementDto {
	private long id;
	private long cardId;
	private Date date;
	private long quantity;
	private String description;
	private long operatorId;
	
	public MovementDto() {
		super();
	}
	
	/**
	 * @param id
	 * @param cardId
	 * @param date
	 * @param quantity
	 * @param description
	 * @param operatorId
	 */
	public MovementDto(long id, long cardId, Date date, long quantity, String description, long operatorId) {
		super();
		this.id = id;
		this.cardId = cardId;
		this.date = date;
		this.quantity = quantity;
		this.description = description;
		this.operatorId = operatorId;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the cardId
	 */
	public long getCardId() {
		return cardId;
	}

	/**
	 * @param cardId the cardId to set
	 */
	public void setCardId(long cardId) {
		this.cardId = cardId;
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

	/**
	 * @return the operatorId
	 */
	public long getOperatorId() {
		return operatorId;
	}

	/**
	 * @param operatorId the operatorId to set
	 */
	public void setOperatorId(long operatorId) {
		this.operatorId = operatorId;
	}

}