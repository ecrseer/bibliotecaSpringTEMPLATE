package br.com.codenation.Transporte.repository;

import br.com.codenation.Transporte.model.Combustivel;
import br.com.codenation.Transporte.model.Transporte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CombustivelRepository extends CrudRepository<Combustivel,Long>{

    List<Combustivel> findAll();

    List<Combustivel> findByNomeContaining(String nome);



}
