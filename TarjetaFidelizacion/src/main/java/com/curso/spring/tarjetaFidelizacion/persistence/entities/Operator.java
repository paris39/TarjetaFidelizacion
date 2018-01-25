/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

/**
 * @author jparis
 */
public class Operator {
	
	private int id;
	private String login;
	private String password;
	private String name;
	private String cif;
	private String web;
	private String conversionFactor;
	
	public Operator() {
		super();
	}

	/**
	 * @param login
	 * @param password
	 * @param name
	 * @param cif
	 * @param web
	 * @param idType
	 * @param conversionFactor
	 */
	public Operator(String login, String password, String name, String cif, String web, String conversionFactor) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.cif = cif;
		this.web = web;
		this.conversionFactor = conversionFactor;
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
	 * @return the cif
	 */
	public String getCif() {
		return cif;
	}

	/**
	 * @param cif the cif to set
	 */
	public void setCif(String cif) {
		this.cif = cif;
	}

	/**
	 * @return the web
	 */
	public String getWeb() {
		return web;
	}

	/**
	 * @param web the web to set
	 */
	public void setWeb(String web) {
		this.web = web;
	}

	/**
	 * @return the conversionFactor
	 */
	public String getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * @param conversionFactor the conversionFactor to set
	 */
	public void setConversionFactor(String conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	
}