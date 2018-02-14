/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

/**
 * @author jparis
 */
public abstract class UserDto {
	
	private Integer id;
	@NotEmpty
	@Length(min=3)
	private String login;
	@NotEmpty
	@Length(min=6)
	private String password;
	@Length(min=6)
	private String repeatPassword;
	@NotEmpty
	private String name;
	@Email
	@NotEmpty
	private String email;
	
	
	public UserDto() {
		super();
	}

	/**
	 * @param id
	 * @param login
	 * @param password
	 * @param name
	 */
	public UserDto(Integer id, String login, String password, String name, String email) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	/**
	 * @param login
	 * @param password
	 */
	public UserDto (String login, String password) {
		this.login = login;
		this.password = password;
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
	 * @return the repeatPassword
	 */
	public String getRepeatPassword() {
		return repeatPassword;
	}

	/**
	 * @param repeatPassword the repeatPassword to set
	 */
	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
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
	
}