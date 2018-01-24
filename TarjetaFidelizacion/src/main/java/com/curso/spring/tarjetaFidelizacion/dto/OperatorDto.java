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
	private String cif;
	private String web;
	private String conversionFactor;
	
	public OperatorDto() {
		super();
	}

	/**
	 * @param id
	 * @param login
	 * @param password
	 * @param name
	 */
	public OperatorDto(int id, String login, String password, String name) {
		super(id, login, password, name);
	}

	/**
	 * @param cif
	 * @param web
	 * @param idType
	 * @param conversionFactor
	 */
	public OperatorDto(String cif, String web, String conversionFactor) {
		super();
		this.cif = cif;
		this.web = web;
		this.conversionFactor = conversionFactor;
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