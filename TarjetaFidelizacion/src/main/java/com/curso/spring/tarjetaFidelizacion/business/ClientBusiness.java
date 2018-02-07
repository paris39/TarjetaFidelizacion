/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.curso.spring.tarjetaFidelizacion.business.marshall.ClientMarshall;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;
import com.curso.spring.tarjetaFidelizacion.persistence.entities.Client;

/**
 * @author jparis
 */
@Component
public class ClientBusiness {
	
	@Autowired
	ClientMarshall clientMarshall;
	
	/**
	 * Comprueba si el Login del cliente es correcto
	 * 
	 * @param clientDto
	 * @param client
	 * @return
	 */
	public ClientDto testLogin (ClientDto clientDto, Client client) {
		if (null != clientDto && null != client) {
			if (clientDto.getLogin().equals(client.getLogin())
					&& clientDto.getPassword().equals(client.getPassword())) {
				clientDto.setPassword(null);
				clientDto = clientMarshall.unMarshall(client);
				return clientDto;
			}
		}
		return null;
	}
}