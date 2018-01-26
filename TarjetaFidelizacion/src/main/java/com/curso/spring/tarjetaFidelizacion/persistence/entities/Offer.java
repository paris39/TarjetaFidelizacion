/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Date;

/**
 * @author jparis
 */
public class Offer {
	
	private int id;
	private Date initDate;
	private Date endDate;
	private float price;
	private String initPlace;
	private String endPlace;
	private Operator operator;
	
	public Offer() {
		super();
	}
	
	/**
	 * @param initDate
	 * @param endDate
	 * @param price
	 * @param initPlace
	 * @param endPlace
	 * @param operator
	 */
	public Offer(Date initDate, Date endDate, float price, String initPlace, String endPlace, Operator operator) {
		super();
		this.initDate = initDate;
		this.endDate = endDate;
		this.price = price;
		this.initPlace = initPlace;
		this.endPlace = endPlace;
		this.operator = operator;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the initDate
	 */
	public Date getInitDate() {
		return initDate;
	}
	
	/**
	 * @param initDate the initDate to set
	 */
	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}
	
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * @return the initPlace
	 */
	public String getInitPlace() {
		return initPlace;
	}
	
	/**
	 * @param initPlace the initPlace to set
	 */
	public void setInitPlace(String initPlace) {
		this.initPlace = initPlace;
	}
	
	/**
	 * @return the endPlace
	 */
	public String getEndPlace() {
		return endPlace;
	}
	
	/**
	 * @param endPlace the endPlace to set
	 */
	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	/**
	 * @return the operator
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
}