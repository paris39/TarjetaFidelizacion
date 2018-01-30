/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

/**
 * @author jparis
 */
public class OperatorDto extends UserDto {
	
	@NotEmpty
	@Length(min=9, max=9)
	private String nif;
	private String web;
	private String conversionFactor;
	private boolean admin;
	
	public OperatorDto() {
		super();
	}

	/**
	 * @param id
	 * @param login
	 * @param password
	 * @param name
	 * @param email
	 */
	public OperatorDto(int id, String login, String password, String name, String email) {
		super(id, login, password, name, email);
	}

	/**
	 * @param nif
	 * @param web
	 * @param idType
	 * @param conversionFactor
	 * @param admin
	 */
	public OperatorDto(String nif, String web, String conversionFactor, boolean admin) {
		super();
		this.nif = nif;
		this.web = web;
		this.conversionFactor = conversionFactor;
		this.admin = admin;
	}

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setCif(String nif) {
		this.nif = nif;
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

	/**
	 * @return the admin
	 */
	public boolean isAdmin() {
		return admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
}