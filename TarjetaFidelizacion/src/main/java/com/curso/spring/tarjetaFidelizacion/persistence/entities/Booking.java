/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Date;

/**
 * @author jparis
 *
 */
public class Booking {

	private int id;
	private Date fecha;
	private Type type;
	private Movement movement;
	
	public Booking() {
		super();
	}

	/**
	 * @param id
	 * @param fecha
	 * @param type
	 * @param movement
	 */
	public Booking(int id, Date fecha, Type type, Movement movement) {
		super();
		this.id = id;
		this.fecha = fecha;
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
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
		
}