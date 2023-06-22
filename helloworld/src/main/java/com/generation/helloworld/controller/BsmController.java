package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class BsmController {
	
	@GetMapping
	public String bsm() {
		return "As BSM da Generation:"
				+ " Persistência, "
				+ "Mentalidade de Crescimento, "
				+ "Responsabilidade Pessoal, "
				+ "Orientação ao Futuro,Comunicação, "
				+ "Proatividade, Orientação ao Detalhe, "
				+ "Trabalho em Equipe";
	}

}
