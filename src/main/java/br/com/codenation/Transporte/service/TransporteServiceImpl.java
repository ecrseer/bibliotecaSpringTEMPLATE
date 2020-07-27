package br.com.codenation.Transporte.service;

import br.com.codenation.Transporte.model.Transporte;
import br.com.codenation.Transporte.repository.TransporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransporteServiceImpl implements TransporteService{

    @Autowired
    private TransporteRepository transporteRepository;


    @Override
    public List<Transporte> findAll() {
        return this.transporteRepository.findAll();
    }

    @Override
    public Transporte save(Transporte tran) {
        return transporteRepository.save(tran);
    }

    @Override
    public List<Transporte> findByNomeContaining(String nome) {
        return transporteRepository.findByNomeContaining(nome);
    }
}
