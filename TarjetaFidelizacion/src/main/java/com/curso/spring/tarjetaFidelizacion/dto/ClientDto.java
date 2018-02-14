/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

import java.util.List;

import javax.validation.constraints.NotEmpty;

/**
 * @author jparis
 *
 */
public class ClientDto extends UserDto {
	
	@NotEmpty
	private String surname;
	private Long points;
	private List<CardDto> cards;
	
		
	public ClientDto() {
		super();
	}

	/**
	 * @param id
	 * @param login
	 * @param password
	 * @param name
	 * @param email
	 */
	public ClientDto(int id, String login, String password, String name, String email) {
		super(id, login, password, name, email);
	}

	/**
	 * @param surname
	 * @param points
	 */
	public ClientDto(String surname, Long points) {
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
	public Long getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(Long points) {
		this.points = points;
	}

	/**
	 * @return the cards
	 */
	public List<CardDto> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public void setCards(List<CardDto> cards) {
		this.cards = cards;
	}
	
}