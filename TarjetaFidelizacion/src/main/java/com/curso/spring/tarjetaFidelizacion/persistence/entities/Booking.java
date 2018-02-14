/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author jparis
 */
@Entity
@Table(name = "BOOKING")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private Date date;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="TYPE_ID")
	private Type type;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="MOVEMENT_ID", nullable = false)
	private Movement movement;
	
	public Booking() {
		super();
	}

	/**
	 * @param id
	 * @param date
	 * @param type
	 * @param movement
	 */
	public Booking(int id, Date date, Type type, Movement movement) {
		super();
		this.id = id;
		this.date = date;
		this.type = type;
		this.movement = movement;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the movement
	 */
	public Movement getMovement() {
		return movement;
	}

	/**
	 * @param movement the movement to set
	 */
	public void setMovement(Movement movement) {
		this.movement = movement;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", date=" + date + ", type=" + type + ", movement=" + movement + "]";
	}
		
}