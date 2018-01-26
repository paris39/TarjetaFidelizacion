/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

/**
 * @author jparis
 */
public class Card {
	
	private int id;
	private Client client;
	
	public Card() {
		super();
	}
	
	/**
	 * @param id
	 * @param client
	 */
	public Card(int id, Client client) {
		super();
		this.id = id;
		this.client = client;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	
}