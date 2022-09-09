package com.example.ProjetoCentec.Models.Repositories;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.ProjetoCentec.Models.ProdutoModel;

public interface ProdutoRepository extends CrudRepository<ProdutoModel, Integer>{
//public interface ProdutoRepository extends PagingAndSortingRepository<ProdutoModel, Integer>{ // Para puxar mais funções
	
//	public Iterable<ProdutoModel> findByNomeContainingIgnoreCase(String parteNome);

}
