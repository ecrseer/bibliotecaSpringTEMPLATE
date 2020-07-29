package br.com.codenation.Transporte.service;

import br.com.codenation.Transporte.model.Combustivel;
import br.com.codenation.Transporte.repository.CombustivelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CombustivelServiceImpl implements CombustivelService{

    @Autowired
    private CombustivelRepository transporteRepository;


    @Override
    public List<Combustivel> findAll() {
        return this.transporteRepository.findAll();
    }

    @Override
    public Combustivel save(Combustivel tran) {
        return transporteRepository.save(tran);
    }

    @Override
    public List<Combustivel> findByNomeContaining(String nome) {
        return transporteRepository.findByNomeContaining(nome);
    }
}
