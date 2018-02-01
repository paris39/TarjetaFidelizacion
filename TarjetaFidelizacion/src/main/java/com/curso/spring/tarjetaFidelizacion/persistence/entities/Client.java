/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jparis
 */
@Entity
@Table(name = "CLIENT")
public class Client {
	
	@Id
	private int id;
	private String login;
	private String password;
	private String name;
	private String surname;
	private long points;
	private String email;
	
		
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
	 */
	public Client(String login, String password, String name, String surname, long points, String email) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.points = points;
		this.email = email;
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