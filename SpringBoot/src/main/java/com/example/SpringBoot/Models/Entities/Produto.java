package com.example.SpringBoot.Models.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity // Toda entidade precisa chamar o @Entity
		// @Id e @Entity são notações obrigatorias.
public class Produto {
	// Toda entidade precisa de um id.

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// Gerado uma estrategia propria.
	// Gera uma chave de autoincremento.
	private int id;
	
				// Aplicando validações
	@NotBlank // Significa que a string não pode ser vazia
	private String nome;
	// Daqui para cima foi criado primeiro
	
	@Min(0) // Significa que o valor tem que ser no minimo 0. Não pode ser negativo.
	private double preco;
	
	@Min(0) // Minimo 0.
	@Max(1) // Maximo 1.
	private double desconto;

	
	// Daqui para baixo foi criado primeio
	public Produto() {

	}

	// Construtor criado depois para inserir os dados do preço e desconto;
	// Usado o caminho "Generate Constructor using Fields". Atenção para desmarcar o
	// ID, pois foi declarado como autoincremento;

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	/*
	 * public Produto(String nome) { // Esse aqui é um construtor; super(); // Ele
	 * foi criado primeiro, mas foi substituido; this.nome = nome; }
	 */

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

	// Gerados os Getters and Setters dos preco e desconto;
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
// Alt + Shif + S - Para abrir as opções e clicar na opção de gerar os gettres e setters.
// Ou Clicar com o direito do mouse e na opção Source abre a mesma janela. 
