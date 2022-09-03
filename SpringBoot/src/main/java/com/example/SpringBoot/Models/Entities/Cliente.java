package com.example.SpringBoot.Models.Entities;

public class Cliente {
	
	//digitar os metodos
	private int id;
	private String nome;
	private String cpf;
	
	// Apertar Ctrl + 3, chamar o metodo "Generate Constructor Using Fields".
	
	public Cliente(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	//Ctrl + 3, chamar o metodo "Generate Getters and Setters"

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	

}
