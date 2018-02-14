/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author jparis
 */
@Entity
@Table(name = "OFFER")
public class Offer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column
	private String description;
	@Column
	private Date initDate;
	@Column
	private Date endDate;
	@Column
	private float price;
	@Column
	private String initPlace;
	@Column
	private String endPlace;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="OPERATOR_ID", nullable = false)
	private Operator operator;
	
	public Offer() {
		super();
	}
	
	/**
	 * @param description;
	 * @param initDate
	 * @param endDate
	 * @param price
	 * @param initPlace
	 * @param endPlace
	 * @param operator
	 */
	public Offer(String description, Date initDate, Date endDate, float price, String initPlace, String endPlace, Operator operator) {
		super();
		this.description = description;
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
	public long getId() {
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

	@Override
	public String toString() {
		return "Offer [id=" + id + ", description=" + description + ", initDate=" + initDate + ", endDate=" + endDate
				+ ", price=" + price + ", initPlace=" + initPlace + ", endPlace=" + endPlace + ", operator=" + operator
				+ "]";
	}
	
}