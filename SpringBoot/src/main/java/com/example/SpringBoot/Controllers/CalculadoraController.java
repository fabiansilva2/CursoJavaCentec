package com.example.SpringBoot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;

	}

	@GetMapping("/subtrair")
	public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
		return a - b;

	}

}


// soma = http://localhost:8080/calculadora/somar/5/6
// subtracao = http://localhost:8080/calculadora/subtrair?a=40&b=30
// Neste caso eu fiz as requisições diretamente no controller

