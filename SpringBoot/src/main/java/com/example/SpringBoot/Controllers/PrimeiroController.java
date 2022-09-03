package com.example.SpringBoot.Controllers;
//criar a classe juntamente com o pacote

//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//inserir o @restController

public class PrimeiroController {
	// Dentro da visualização inserir o @RequestMapping
	
	//@RequestMapping(method = RequestMethod.GET)
	// posso deixar dessa forma, lembrando que o framework já puxa o get automarico.
	
	//@RequestMapping(method = RequestMethod.GET, path = "/ola")
	// Posso deixar desta forma. Encaminhado para outro diretorio.
	
	//@RequestMapping(path = "/ola")
	//Desta forma o codigo fica mais limpo.
	
	@RequestMapping(path = {"/ola", "ola2"})
	// Posso colocar dentro de um array, varios encaminhamentos.
	// posso inserir varias url's.
	
	// Pode usar os varios tipos de requisições http.
	//@GetMapping
	//@PostMapping
	//@PutMapping
	//@DeleteMapping
	
	public String ola() {
		// Inserir o metodo de visualização
		return "olá";
		// Solicitar o retorno da aplicação
	}
}
