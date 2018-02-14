/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.business.marshall;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Card;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
@Component
public class ClientMarshall {

	public ClientMarshall() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private CardMarshall cardMarshall;
	
	/**
	 * Conversión de ClientDto a Client
	 * 
	 * @param clientDto
	 * @return
	 */
	public Client marshall (ClientDto clientDto) {
		Client client = new Client();
		
		if (null != clientDto) {
			client.setLogin(clientDto.getLogin());
			client.setPassword(clientDto.getPassword());
			client.setEmail(clientDto.getEmail());
			client.setName(clientDto.getName());
			client.setSurname(clientDto.getSurname());
			client.setPoints(clientDto.getPoints());
			client.setCards(new HashSet<Card>());
		}
		
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
		
		if (null != client) {
			clientDto.setId(client.getId());
			clientDto.setLogin(client.getLogin());
			clientDto.setPassword(null); // Por seguridad
			clientDto.setEmail(client.getEmail());
			clientDto.setName(client.getName());
			clientDto.setSurname(client.getSurname());
			clientDto.setPoints(client.getPoints());
			clientDto.setCards(cardMarshall.unMarshallSet(client.getCards()));
		}
		
		return clientDto;
	}
	
}