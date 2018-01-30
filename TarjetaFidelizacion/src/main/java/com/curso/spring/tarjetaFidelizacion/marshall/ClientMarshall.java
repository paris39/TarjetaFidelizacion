/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.marshall;

import org.springframework.stereotype.Component;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
@Component
public class ClientMarshall {

	public ClientMarshall() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Conversión de ClientDto a Client
	 * 
	 * @param clientDto
	 * @return
	 */
	public Client marshall (ClientDto clientDto) {
		Client client = new Client();
		
		client.setLogin(clientDto.getLogin());
		client.setPassword(clientDto.getPassword());
		client.setEmail(clientDto.getEmail());
		client.setName(clientDto.getName());
		client.setSurname(clientDto.getSurname());
		client.setPoints(clientDto.getPoints());
		
		return client;
	}
	
	/**
	 * Conversión de Client a ClientDto
	 * 
	 * @param client
	 * @return
	 */
	public ClientDto unMarshall (Client client) {
		ClientDto clientDto = new ClientDto();
		
		clientDto.setId(client.getId());
		clientDto.setLogin(client.getLogin());
		clientDto.setName(client.getName());
		clientDto.setSurname(client.getSurname());
		clientDto.setPoints(client.getPoints());
		
		return clientDto;
	}
	
}