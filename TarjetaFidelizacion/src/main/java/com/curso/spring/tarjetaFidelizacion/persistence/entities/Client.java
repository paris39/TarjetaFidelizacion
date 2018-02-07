/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author jparis
 */
@Entity
@Table(name = "CLIENT")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(unique = true, nullable = false)
	private String login;
	@Column
	private String password;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private Long points;
	@Column
	private String email;
	@OneToMany(mappedBy = "client")
	private Set<Card> cards;
	
		
	public Client() {
		super();
	}

	/**
	 * @param login
	 * @param password
	 * @param name
	 * @param surname
	 * @param points
	 * @param email
	 * @param cards
	 */
	public Client(String login, String password, String name, String surname, Long points, String email, Set<Card> cards) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.points = points;
		this.email = email;
		this.cards = cards;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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

	/**
	 * @return the cards
	 */
	public Set<Card> getCards() {
		return cards;
	}

	/**
	 * @param cards the cards to set
	 */
	public void setCards(Set<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + ", surname="
				+ surname + ", points=" + points + ", email=" + email + ", cards=" + cards + "]";
	}
	
}