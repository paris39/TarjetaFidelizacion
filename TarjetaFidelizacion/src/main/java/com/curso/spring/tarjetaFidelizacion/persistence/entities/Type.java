/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

/**
 * @author jparis
 */
public class Type {
	
	private int id;
	private String description;
	
	public Type() {
		super();
	}

	/**
	 * @param id
	 * @param description
	 */
	public Type(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}