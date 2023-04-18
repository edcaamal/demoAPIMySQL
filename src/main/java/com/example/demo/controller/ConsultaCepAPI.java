package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.CepResultDTO;

@RestController
@RequestMapping("/API/consulta-cep")
public class ConsultaCepAPI {
/*
	@GetMapping({""})
	public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		String titulo = "Inicio";
		model.addAttribute("name", name);
		model.addAttribute("titulo", titulo);
		return "inicio";
	}
*/	

	@GetMapping("{cep}")
	public CepResultDTO consultaCep (@PathVariable("cep") String cep, Model model) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CepResultDTO> resp =
				restTemplate
				   .getForEntity(
						String.format("https://viacep.com.br/ws/%s/json", cep),
						CepResultDTO.class);
		model.addAttribute("respCesp", resp);
		return resp.getBody();
	}
	
	
	// 01001000
	// 01025020
	/*

	@GetMapping("/greeting")
	public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		String titulo = "Inicio";
		model.addAttribute("name", name);
		model.addAttribute("titulo", titulo);
		return "inicio";
	}

	*/
}
