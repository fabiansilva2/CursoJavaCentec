package com.example.SpringBoot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.Models.Entities.Produto;
import com.example.SpringBoot.Models.Repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos") //Quando fizer uma requisição para esta url, do tipo post;
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	// Neste caso o spring vai criar um objeto.
	// Aqui vai começar a injeção de dependencias. Serve para começar a salvar no banco de dados.
	
	@PostMapping // Ele vai reconhecer pelo postmapping e requestmapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) { // e vai jogar para o construtor novoProduto;
		Produto produto = new Produto(nome);
		produtoRepository.save(produto); // Instanciei o produtoRepository para começar a salvar no banco de dados.
		// Isso aqui é um construtor
		// Ele está instanciando a model Produto.
		// ResponseBody não é obrigatorio, apenas para saber que é o corpo da requisição.
		
		return produto;
	}

}
