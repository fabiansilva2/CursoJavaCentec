package com.example.ProjetoCentec.Controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjetoCentec.Models.ProdutoModel;
import com.example.ProjetoCentec.Models.Repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

//	Forma Simples
//	@PostMapping
//	public ProdutoModel novoProduto(@RequestParam String nome) {
//		ProdutoModel produto = new ProdutoModel(nome);
//		return produto;
		
//	}

//	Inserindo dependencias.
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public @ResponseBody ProdutoModel novoProduto(@RequestParam String nome) {
		ProdutoModel produto = new ProdutoModel(nome);
		produtoRepository.save(produto);
		return produto;
		
	}
	
	@GetMapping
	public Iterable<ProdutoModel> obterProdutos() {
		return produtoRepository.findAll();

	}
	
	@GetMapping("/{id}") // Pesquisa no navegador pelo ID.
	public Optional<ProdutoModel> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@PutMapping
	private ProdutoModel alterarProduto(ProdutoModel produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	

}

// Linha 26: @Autowired - É para inserir automaticamente dentro do atributo produtoRepository. 
// Linha 26: Que no caso ele vai gerar o ID sequencial automaticamente.
// Linha 30: @ResponseBody serve para deixar claro que essa requisição faz parte do corpo da resposta.
// Linha 32: Instanciado o Objeto dentro da variavel produto.
