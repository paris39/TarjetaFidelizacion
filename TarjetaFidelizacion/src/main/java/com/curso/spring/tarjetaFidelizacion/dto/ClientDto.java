/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

import javax.validation.constraints.NotEmpty;

/**
 * @author jparis
 *
 */
public class ClientDto extends UserDto {
	
	@NotEmpty
	private String surname;
	private long points;
	
		
	public ClientDto() {
		super();
	}

	/**
	 * @param id
	 * @param login
	 * @param password
	 * @param name
	 */
	public ClientDto(int id, String login, String password, String name) {
		super(id, login, password, name);
	}

	/**
	 * @param surname
	 * @param points
	 */
	public ClientDto(String surname, long points) {
		super();
		this.surname = surname;
		this.points = points;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the points
	 */
	public long getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(long points) {
		this.points = points;
	}
	
}