/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

/**
 * @author jparis
 */
public class OperatorDto extends UserDto {
	
	private String cif;
	private String web;
	private int idType;
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
	public OperatorDto(String cif, String web, int idType, String conversionFactor) {
		super();
		this.cif = cif;
		this.web = web;
		this.idType = idType;
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
	 * @return the idType
	 */
	public int getIdType() {
		return idType;
	}

	/**
	 * @param idType the idType to set
	 */
	public void setIdType(int idType) {
		this.idType = idType;
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