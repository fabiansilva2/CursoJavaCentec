package com.cadastro.pessoa.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro.pessoa.Model.PessoaModel;
import com.cadastro.pessoa.Repository.PessoaRepository;


@RestController
@RequestMapping("api/cadastropessoa")
@CrossOrigin("/*")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public Iterable<PessoaModel> obterPessoas(){
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<PessoaModel> obterPessoaPorId(@PathVariable int id){
		return pessoaRepository.findById(id);
	}
	
	@PostMapping
	public @ResponseBody PessoaModel novaPessoa(@Valid PessoaModel pessoa) {
		pessoaRepository.save(pessoa);
		return pessoa;
	}
	
	@PutMapping
	public @ResponseBody PessoaModel alterarPessoa(@Valid PessoaModel pessoa) {
		pessoaRepository.save(pessoa);
		return pessoa;
	}
	
	@DeleteMapping("{id}")
	public void excluirPessoa(@PathVariable int id) {
		pessoaRepository.deleteById(id);
	}

}
