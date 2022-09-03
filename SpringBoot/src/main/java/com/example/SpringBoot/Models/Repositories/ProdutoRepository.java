package com.example.SpringBoot.Models.Repositories;
// Foi criada uma nova interface como um novo pacote com o nome de Repositories
// Criada a classe Produto repository

import org.springframework.data.repository.CrudRepository;

import com.example.SpringBoot.Models.Entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	// Estender ao repositorio CrudRepository
	// Dentro do <> Estender a classe Produto
	// Após a virgula é o tipo de identificador, que no caso desse é um inteiro. É o tipo relacionado ao ID do produto.
	

}


// Ver o conceito de injeção de dependencia.
// É preciso separar todas as reponsabilidades.
// Parei antes de criar o novo controller. Deverá ser criado o controller ProdutoController
