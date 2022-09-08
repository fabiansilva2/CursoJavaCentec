package com.example.SpringBoot.Models.Repositories;
// Foi criada uma nova interface como um novo pacote com o nome de Repositories
// Criada a classe Produto repository

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;

import com.example.SpringBoot.Models.Entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome); 	
	
	// criado depois o PagingAndSortingRepository
	// Estender ao repositorio CrudRepository
	// Dentro do <> Estender a classe Produto
	// Após a virgula é o tipo de identificador, que no caso desse é um inteiro. É o tipo relacionado ao ID do produto.

//	Outra forma de fazer pela Query
//	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
//	public Iterable<Produto> searchByNameLike(@Param("nome") String nome); 
	

}
// Ver o conceito de injeção de dependencia.
// É preciso separar todas as reponsabilidades.