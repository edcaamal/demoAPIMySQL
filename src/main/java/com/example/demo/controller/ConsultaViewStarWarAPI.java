package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.StarWarResultDTO;

@Controller
public class ConsultaViewStarWarAPI {

	@GetMapping("/view")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="1") String name, Model model) {
		String titulo = "Página SprinBot Incio";
		model.addAttribute("name", name);
		model.addAttribute("titulo", titulo);
		
		StarWarResultDTO starWViewtDTO = starWarResultDTO (name);
		model.addAttribute("starWViewtDTO", starWViewtDTO);
		
		return "inicio";
	}
	
	public StarWarResultDTO starWarResultDTO (String sw) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<StarWarResultDTO> resp =
				restTemplate
				   .getForEntity(
						String.format("https://swapi.dev/api/people/%s", sw),
						StarWarResultDTO.class);
		return resp.getBody();
	}
	

	
}
