package br.com.codenation.Transporte.service;

import br.com.codenation.Transporte.model.Combustivel;

import java.util.List;

public interface CombustivelService {
    List<Combustivel> findAll();
    Combustivel save(Combustivel tran);
    List<Combustivel> findByNomeContaining(String nome);

}
