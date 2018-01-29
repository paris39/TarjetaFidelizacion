/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.tarjetaFidelizacion.dto.MovementDto;
import com.curso.spring.tarjetaFidelizacion.services.MovementService;

/**
 * @author jparis
 */
@RestController
@RequestMapping("/MovementRestService")
public class MovementRestServiceController {
	
	@Autowired
	private MovementService movementService;

	@ModelAttribute("movement")
	public MovementDto movement() {
		return new MovementDto();
	}
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> newMovement(@RequestBody MovementDto movement) throws URISyntaxException {
		
		movementService.newMovement(movement.getCardId(), movement.getDescription(), movement.getQuantity());
		
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(new URI("http://localhost:8080/TarjetaFidelizacion/MovementRestService/" + movement.getId()));
		
		return new ResponseEntity<>("Este dato llega al cliente en el body", headers, HttpStatus.CREATED);
	}
}