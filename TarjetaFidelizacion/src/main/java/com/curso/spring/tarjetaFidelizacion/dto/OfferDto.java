/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

import java.util.Date;

/**
 * @author jparis
 */
public class OfferDto {
	private int id;
	private Date initDate;
	private Date endDate;
	private float price;
	private String initPlace;
	private String endPlace;
	
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
	
}