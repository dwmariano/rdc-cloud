package br.gov.pe.sefaz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

	
	@GetMapping(path = "/")
	public String menu(){
		return "menu";
	}
	
	@GetMapping(path = "/logout")
	public String logout(){
		return "redirect:/";
	}
	
}

