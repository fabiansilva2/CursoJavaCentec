package com.example.SpringBoot.Controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.RequestParam; // foi retirado para simplificar as vlidações

import com.example.SpringBoot.Models.Entities.Produto;
import com.example.SpringBoot.Models.Repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos") // Quando fizer uma requisição para esta url, do tipo post;
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	// Neste caso o spring vai criar um objeto.
	// Aqui vai começar a injeção de dependencias. Serve para começar a salvar no
	// banco de dados.

	// @PostMapping // Ele vai reconhecer pelo postmapping e requestmapping
	/*
	 * public @ResponseBody Produto novoProduto(@RequestParam String
	 * nome, @RequestParam double preco,
	 * 
	 * @RequestParam double desconto) { // e vai jogar para o construtor
	 * novoProduto; Produto produto = new Produto(nome, preco, desconto);
	 * produtoRepository.save(produto); // Instanciei o produtoRepository para
	 * começar a salvar no banco de dados. // Isso aqui é um construtor // Ele está
	 * instanciando a model Produto. // ResponseBody não é obrigatorio, apenas para
	 * saber que é o corpo da // requisição.
	 */
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) // metodo com as opções post e put; 
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) { 
		produtoRepository.save(produto);
		return produto;
	}
	
//	@PostMapping // Registrar produtos
//	public @ResponseBody Produto novoProduto(@Valid Produto produto) { 
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@GetMapping // Consultar Produtos // A partir daqui posso pegar a url e colocar no navegador que vão aparecer os produtos cadastrados.
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
		
	}
	
	@GetMapping("/{id}") // Pesquisa no navegador pelo ID.
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);

	}
	
	@GetMapping("/nome/{parteNome}") // Pesquisa pelo nome.
	public Iterable<Produto> obterProdutoPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
//		return produtoRepository.searchByNameLike(parteNome); // Outra forma de fazer pela Query
		
	}
	
	// Consulta Paginada;
	@GetMapping("/pagina/{numeroPagina}") 
	public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina) {
		PageRequest page = PageRequest.of(numeroPagina, 2); // Neste caso só tem dois itens por pagina.
		return produtoRepository.findAll(page);

	}
	
//	@PutMapping
//	private Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}

}


