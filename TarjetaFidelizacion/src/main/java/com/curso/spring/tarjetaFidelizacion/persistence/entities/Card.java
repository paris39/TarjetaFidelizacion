/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author jparis
 */
@Entity
@Table(name = "CARD")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Client.class)
	@JoinColumn(name="CLIENT_ID", nullable = false)
	private Client client;
	@OneToMany(mappedBy = "card", cascade = CascadeType.ALL)
	private Set<Movement> movements;
	
	public Card() {
		super();
	}
	
	/**
	 * @param id
	 * @param client
	 * @param movements
	 */
	public Card(Integer id, Client client, Set<Movement> movements) {
		super();
		this.id = id;
		this.client = client;
		this.movements = movements;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

	/**
	 * @return the movements
	 */
	public Set<Movement> getMovements() {
		return movements;
	}

	/**
	 * @param movements the movements to set
	 */
	public void setMovements(Set<Movement> movements) {
		this.movements = movements;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", client=" + client + ", movements=" + movements + "]";
	}
	
}