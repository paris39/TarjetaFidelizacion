/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
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
@Table(name = "MOVEMENT")
public class Movement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private Date date;
	@Column
	private Long quantity;
	@Column
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OFFER_ID")
	private Offer offer;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CARD_ID", nullable = false)
	private Card card;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="OPERATOR_ID", nullable = false)
	private Operator operator;
	@OneToMany(mappedBy = "movement")
	private Set<Booking> bookings;
	
	public Movement() {
		super();
	}
	
	/**
	 * @param id
	 * @param card
	 * @param date
	 * @param quantity
	 * @param description
	 * @param offer
	 * @param operator
	 * @param bookings
	 */
	public Movement(long id, Date date, Long quantity, String description, Offer offer, Card card, Operator operator, Set<Booking> bookings) {
		super();
		this.id = id;
		this.card = card;
		this.date = date;
		this.quantity = quantity;
		this.description = description;
		this.offer = offer;
		this.operator = operator;
		this.bookings = bookings;
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
	public void setCard(Card card) {
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
	public Long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(Long quantity) {
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
	 * @return the offer
	 */
	public Offer getOffer() {
		return offer;
	}

	/**
	 * @param offer the offer to set
	 */
	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	/**
	 * @return the operator
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	/**
	 * @return the bookings
	 */
	public Set<Booking> getBookings() {
		return bookings;
	}

	/**
	 * @param bookings the bookings to set
	 */
	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Movement [id=" + id + ", date=" + date + ", quantity=" + quantity + ", description=" + description
				+ ", offer=" + offer + ", card=" + card + ", operator=" + operator + ", bookings=" + bookings + "]";
	}

}