/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;

/**
 * @author jparis
 */
public class ClientValidator implements Validator {

	public ClientValidator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return ClientDto.class.equals(clazz); // Cuando se valide la clase ClientDto
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub

	}

}