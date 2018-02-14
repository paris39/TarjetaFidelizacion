/**
 * 
 */
package com.curso.spring.tarjetaFidelizacion.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.curso.spring.tarjetaFidelizacion.dto.CardDto;
import com.curso.spring.tarjetaFidelizacion.dto.ClientDto;

/**
 * @author jparis
 */
@Component
public class UtilController {

	public UtilController() {}
	
	/**
	 * Añade en el modelo y en la sesión un objeto clientDto
	 * 
	 * @param session
	 * @param model
	 * @param clientDto
	 */
	public void modelAndSessionClientUtil (HttpSession session, ModelMap model, ClientDto clientDto) {
		model.addAttribute(ClientController.CLIENT, clientDto);
		model.addAttribute(ClientController.CARDS, clientDto.getCards());
		session.setAttribute(ClientController.CLIENT, clientDto);
		session.setAttribute(ClientController.CARDS, clientDto.getCards());
	}
	
	/**
	 * Añade en el modelo y en la sesión un objeto listCardDto
	 * 
	 * @param session
	 * @param model
	 * @param listCardDto
	 */
	public void modelAndSessionListCardUtil (HttpSession session, ModelMap model, List<CardDto> listCardDto) {
		model.addAttribute(ClientController.CARDS, listCardDto);
		session.setAttribute(ClientController.CARDS, listCardDto);
	}
	
}