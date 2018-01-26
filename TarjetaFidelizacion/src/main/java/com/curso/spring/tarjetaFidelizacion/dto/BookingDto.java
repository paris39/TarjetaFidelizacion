/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

import java.util.Date;

/**
 * @author jparis
 *
 */
public class BookingDto {
	
	private int id;
	private Date date;

	public BookingDto() {
		super();
	}

	/**
	 * @param id
	 * @param date
	 */
	public BookingDto(int id, Date date) {
		super();
		this.id = id;
		this.date = date;
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
	
}