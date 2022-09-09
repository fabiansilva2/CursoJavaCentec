package com.example.ProjetoCentec.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;
	
	public ProdutoModel(){ // Construtor
		
	}

	public ProdutoModel(String nome) { // Model referenciada 
		super();
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
// Linha 11: Chamei a dependencia para criar um ID.
// Linha 12: Informei que a variavel que vai guardar um ID será gerada automaticamente.
// linha 12: A Propria IDE se encarrega de por de forma sequencial
// Linha 15: Criei uma variavel para guardar os dados.
// Linha 15: Para instanciar um novo atributo para guardar os dados no banco, apenas crio uma nova variavel, 
// Linha 15: Crio os getters e setters e depois gero o construtor usando fieldes. 
// Linha 17: Construtor: Se não fizer o contrutor fica dando erro na consulta.