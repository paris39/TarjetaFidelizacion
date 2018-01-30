/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.marshall;

import org.springframework.stereotype.Component;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.dto.OperatorDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Operator;

/**
 * @author jparis
 */
@Component
public class OperatorMarshall {

	public OperatorMarshall() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Conversión de OperatorDto a Operator
	 * 
	 * @param operatorDto
	 * @return
	 */
	public Operator operatorMarshall (OperatorDto operatorDto) {
		Operator operator = new Operator();
		
		operator.setLogin(operatorDto.getLogin());
		operator.setPassword(operatorDto.getPassword());
		operator.setName(operatorDto.getName());
		operator.setNif(operator.getNif());
		operator.setWeb(operatorDto.getWeb());
		operator.setEmail(operatorDto.getEmail());
		operator.setConversionFactor(operatorDto.getConversionFactor());
		// Buscar tipo
		//operator.setType(type);
		
		return operator;
	}
	
	/**
	 * Conversión de Client a ClientDto
	 * 
	 * @param client
	 * @return
	 */
	public ClientDto clientUnMarshall (Client client) {
		ClientDto clientDto = new ClientDto();
		
		clientDto.setId(client.getId());
		clientDto.setLogin(client.getLogin());
		clientDto.setName(client.getName());
		clientDto.setSurname(client.getSurname());
		clientDto.setPoints(client.getPoints());
		
		return clientDto;
	}
	
}