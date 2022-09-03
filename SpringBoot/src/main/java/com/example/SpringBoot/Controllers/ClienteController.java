package com.example.SpringBoot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Models.Entities.Cliente;

@RestController //usar o restcontroller
//@RequestMapping(path = "/clientes") //posso colocaro requestMapping aqui.
								// Em baixo posso encaminhar para varias URL's.
@RequestMapping("/clientes")	// tambem posso colocar dessa forma.
public class ClienteController {

	@GetMapping(path = "/setor1") //usar o getmapping // URL 1
	//@GetMapping("/setor1") //tambem posso colocar dessa forma
	public Cliente obterCliente() { //Não posso usar mesmo nome do metodo mais de uma vez.
		return new Cliente(30, "João", "987.654.321-98");

	}
	
	@GetMapping(path = "/setor2") // url só pode ser chamado uma vez por metodo // URL 2
	public Cliente obterCliente2() { //mudado o nome do metodo para não dar erro.
		return new Cliente(29, "José", "456.987.123-78");
		
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id) {
		return new Cliente(id, "Maria", "987.654.321-87");
		// Neste caso ele vai retornar uma url com /id
	}
	
	/*
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
		return new Cliente (id, "Joao Augusto", "444.666.888-99");
		// Neste caso ele vai retornar uma url com ?id=(numero digitado).
		// Exemplo: http://localhost:8080/clientes?id=123
	}
	 */
	
	@GetMapping
	public Cliente obterClientePorId3(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente (id, "Jose Augusto", "666.888.555-33");
		// Neste caso ele vai retornar uma url com ?id=(numero digitado).
		// Exmplo: http://localhost:8080/clientes?
		// Como não foi digitado nenhum id, retorna o valor padrão que é 1.

}

}
//usar a extensão do chrome JsonView. Traz um resultado Json Formatado.
