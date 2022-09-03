package com.example.SpringBoot.Models.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Toda entidade precisa chamar o @Entity
		// @Id e @Entity são notações obrigatorias.
public class Produto {
	// Toda entidade precisa de um id.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Gerado uma estrategia propria.
	// Gera uma chave de autoincremento.
	private int id;
	private String nome;

	public Produto() {

	}

	public Produto(String nome) {
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

// Alt + Shif + S - Para abrir as opções e clicar na opção de gerar os gettres e setters.
// Ou Clicar com o direito do mouse e na opção Source abre a mesma janela. 
