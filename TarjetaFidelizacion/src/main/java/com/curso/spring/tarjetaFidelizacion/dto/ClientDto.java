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
	private String email;
	
		
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
	 * @param email
	 */
	public ClientDto(String surname, long points, String email) {
		super();
		this.surname = surname;
		this.points = points;
		this.email = email;
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

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}