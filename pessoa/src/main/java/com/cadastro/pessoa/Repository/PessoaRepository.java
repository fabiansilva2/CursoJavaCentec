package com.cadastro.pessoa.Repository;

import org.springframework.data.repository.CrudRepository;

import com.cadastro.pessoa.Model.PessoaModel;

public interface PessoaRepository extends CrudRepository<PessoaModel, Integer>{

}
