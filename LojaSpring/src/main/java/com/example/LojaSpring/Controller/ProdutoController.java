package com.example.LojaSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LojaSpring.Model.ProdutoModel;
import com.example.LojaSpring.Repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public @ResponseBody ProdutoModel novoProduto(ProdutoModel produto) {
		produtoRepository.save(produto); 
		return produto; 

	}
	
	@GetMapping
	public Iterable<ProdutoModel> obterProdutos(){
		return produtoRepository.findAll();
	}
	
	@PutMapping
	public ProdutoModel alterarProduto(ProdutoModel produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
		
	}
	
}

// Se fosse cadastrar somente o nome. 
// @PostMapping
// public ProdutoModel novoProduto(@RequestParam String nome) {
// ProdutoModel produto = new ProdutoModel(nome);
// return produto;


// Cadastrar o produto de uma forma mais complexa.
// public @ResponseBody ProdutoModel novoProduto(
// @RequestParam String nome,
// @RequestParam double preco) {
// novoProduto(nome, preco);
// ProdutoModel produto = new ProdutoModel(nome, preco);
// return produtoRepository.save(produto);


// @ResponseBody é uma das annotations mais úteis para o desenvolvimento de serviços RESTful usando o Spring MVC.
// Iterable é uma interface que determina que uma coleção pode ter seus elementos alcançados por uma estrutura foreach.
// @Autowired fornece controle sobre onde e como a ligação entre os beans deve ser realizada.