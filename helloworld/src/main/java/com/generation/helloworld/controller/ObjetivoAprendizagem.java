package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class ObjetivoAprendizagem {
	
	@GetMapping
	public String Objetivo() {
		return "Objetivo de aprendizagem da semana: "
				+ " Aprimorar o conhecimento em banco de dados ";
	}


}
