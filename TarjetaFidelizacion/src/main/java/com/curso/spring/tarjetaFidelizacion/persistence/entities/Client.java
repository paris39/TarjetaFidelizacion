/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

/**
 * @author jparis
 *
 */
public class Client {
	
	private int id;
	private String login;
	private String password;
	private String name;
	private String surname;
	private long points;
	
		
	public Client() {
		super();
	}

	/**
	 * @param login
	 * @param password
	 * @param name
	 * @param surname
	 * @param points
	 */
	public Client(String login, String password, String name, String surname, long points) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.points = points;
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
	
}