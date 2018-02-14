/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author jparis
 */
@Entity
@Table(name = "TYPE")
public class Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String description;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "types")
	private Set<Operator> operators;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
	private Set<Booking> bookings;
	
	public Type() {
		super();
	}

	/**
	 * @param id
	 * @param description
	 * @param operators
	 * @param bookings
	 */
	public Type(int id, String description, Set<Operator> operators, Set<Booking> bookings) {
		super();
		this.id = id;
		this.description = description;
		this.operators = operators;
		this.bookings = bookings;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	 * @return the operators
	 */
	public Set<Operator> getOperators() {
		return operators;
	}

	/**
	 * @param operators the operators to set
	 */
	public void setOperators(Set<Operator> operators) {
		this.operators = operators;
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
		return "Type [id=" + id + ", description=" + description + ", operators=" + operators + ", bookings=" + bookings
				+ "]";
	}	
	
}