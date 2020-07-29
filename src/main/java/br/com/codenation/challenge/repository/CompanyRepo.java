package br.com.codenation.challenge.repository;

import br.com.codenation.challenge.entity.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CompanyRepo extends CrudRepository<Company,Long> {


    Optional<Company> findById(Long id);
}
