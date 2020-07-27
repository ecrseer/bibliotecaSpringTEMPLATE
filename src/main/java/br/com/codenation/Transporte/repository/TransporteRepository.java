package br.com.codenation.Transporte.repository;

import br.com.codenation.Transporte.model.Transporte;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransporteRepository extends CrudRepository<Transporte,Long>{

    List<Transporte> findAll();

    List<Transporte> findByNomeContaining(String nome);



}
