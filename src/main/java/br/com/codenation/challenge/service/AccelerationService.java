package br.com.codenation.challenge.service;


import br.com.codenation.challenge.entity.Acceleration;
import br.com.codenation.challenge.repository.AccelerationRepo;
import br.com.codenation.challenge.service.interfaces.AccelerationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccelerationService implements AccelerationServiceInterface {
    @Autowired private AccelerationRepo reposito;


    @Override
    public Optional<Acceleration> findById(Long id) {
        return this.reposito.findById(id);
    }

    @Override
    public List<Acceleration> findByCompanyId(Long companyId) {
        return null;//this.reposito.findByCompanyId(companyId);
    }

    @Override
    public Acceleration save(Acceleration object) {
        return this.reposito.save(object);
    }

    @Override
    public List<Acceleration> findAll() {
        return this.reposito.findAll();
    }


}
