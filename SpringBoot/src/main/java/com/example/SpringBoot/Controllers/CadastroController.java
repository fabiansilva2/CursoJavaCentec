package com.example.SpringBoot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroController {
	
	@GetMapping("/cadastro")
	public String cadastroProduto() {
		return "cadastro";
	}
	// falta terminar

}
