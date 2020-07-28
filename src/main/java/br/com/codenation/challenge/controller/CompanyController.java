package br.com.codenation.challenge.controller;

import br.com.codenation.challenge.entity.Company;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    public Optional<Company> findById(@PathVariable Long id){
        return null;
    }
}
