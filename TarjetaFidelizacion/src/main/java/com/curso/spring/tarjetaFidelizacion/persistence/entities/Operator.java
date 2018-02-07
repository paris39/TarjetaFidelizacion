/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.persistence.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author jparis
 */
@Entity
@Table(name = "OPERATOR")
public class Operator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(unique = true, nullable = false)
	private String login;
	@Column
	private String password;
	@Column
	private String name;
	@Column
	private String nif;
	@Column
	private String web;
	@Column
	private String email;
	@Column
	private String conversionFactor;
	@Column
	private boolean admin;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumns({ 
		@JoinColumn(name = "OPERATOR_ID", referencedColumnName = "ID"), 
		@JoinColumn(name = "TYPE_ID", referencedColumnName = "ID")})
	private Set<Type> types;
	@OneToMany(mappedBy = "operator")
	private Set<Movement> movements;
	@OneToMany(mappedBy = "operator")
	private Set<Offer> offers;
	
	
	public Operator() {
		super();
	}

	/**
	 * @param login
	 * @param password
	 * @param name
	 * @param nif
	 * @param web
	 * @param email
	 * @param conversionFactor
	 * @param admin
	 * @param types
	 * @param movements
	 * @param offers
	 */
	public Operator(String login, String password, String name, String nif, String web, String email, String conversionFactor, 
			boolean admin, Set<Type> types, Set<Movement> movements, Set<Offer> offers) {
		this.login = login;
		this.password = password;
		this.name = name;
		this.nif = nif;
		this.web = web;
		this.email = email;
		this.conversionFactor = conversionFactor;
		this.admin = admin;
		this.types = types;
		this.movements = movements;
		this.offers = offers;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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

	/**
	 * @return the types
	 */
	public Set<Type> getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(Set<Type> types) {
		this.types = types;
	}

	/**
	 * @return the movements
	 */
	public Set<Movement> getMovements() {
		return movements;
	}

	/**
	 * @param movements the movements to set
	 */
	public void setMovements(Set<Movement> movements) {
		this.movements = movements;
	}

	/**
	 * @return the offers
	 */
	public Set<Offer> getOffers() {
		return offers;
	}

	/**
	 * @param offers the offers to set
	 */
	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "Operator [id=" + id + ", login=" + login + ", password=" + password + ", name=" + name + ", nif=" + nif
				+ ", web=" + web + ", email=" + email + ", conversionFactor=" + conversionFactor + ", admin=" + admin
				+ ", types=" + types + ", movements=" + movements + ", offers=" + offers + "]";
	}
	
}