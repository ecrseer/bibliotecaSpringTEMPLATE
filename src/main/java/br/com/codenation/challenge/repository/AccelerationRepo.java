package br.com.codenation.challenge.repository;

import br.com.codenation.challenge.entity.Acceleration;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccelerationRepo extends CrudRepository<Acceleration,Long> {
    List<Acceleration> findAll();

   // List<Acceleration> findByCompanyId(Long id);


}
