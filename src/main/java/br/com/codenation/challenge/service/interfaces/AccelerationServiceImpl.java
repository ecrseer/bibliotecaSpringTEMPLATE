package br.com.codenation.challenge.service.interfaces;

import br.com.codenation.challenge.entity.Acceleration;

import java.util.List;
import java.util.Optional;

public class AccelerationServiceImpl implements AccelerationServiceInterface {
    @Override
    public Optional<Acceleration> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Acceleration> findByCompanyId(Long companyId) {
        return null;
    }

    @Override
    public Acceleration save(Acceleration object) {
        return null;
    }
}
