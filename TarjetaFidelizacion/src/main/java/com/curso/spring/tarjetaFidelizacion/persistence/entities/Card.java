/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

/**
 * @author jparis
 */
public class Card {
	
	private int id;
	private int clientId;
	
	public Card() {
		super();
	}
	
	/**
	 * @param id
	 * @param clientId
	 */
	public Card(int id, int clientId) {
		super();
		this.id = id;
		this.clientId = clientId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
}