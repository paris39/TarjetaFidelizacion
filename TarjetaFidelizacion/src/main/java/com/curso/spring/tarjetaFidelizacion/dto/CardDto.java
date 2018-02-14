/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

/**
 * @author jparis
 */
public class CardDto {
	
	private Integer id;
	private Integer clientId;
	
	/**
	 * 
	 */
	public CardDto() {
		super();
	}
	
	/**
	 * @param id
	 * @param clientId
	 */
	public CardDto(Integer id, Integer clientId) {
		super();
		this.id = id;
		this.clientId = clientId;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the clientId
	 */
	public Integer getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	
}