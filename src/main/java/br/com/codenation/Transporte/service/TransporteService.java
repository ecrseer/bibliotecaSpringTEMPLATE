package br.com.codenation.Transporte.service;

import br.com.codenation.Transporte.model.Transporte;

import java.util.List;

public interface TransporteService {
    List<Transporte> findAll();
    Transporte save(Transporte tran);
    List<Transporte> findByNomeContaining(String nome);

}
