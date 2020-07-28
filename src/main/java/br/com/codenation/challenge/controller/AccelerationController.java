package br.com.codenation.challenge.controller;

import br.com.codenation.challenge.entity.Acceleration;
import br.com.codenation.challenge.service.AccelerationService;
import br.com.codenation.challenge.service.interfaces.AccelerationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/acceleration")
public class AccelerationController {

    @Autowired private AccelerationServiceInterface nterface;

    @GetMapping("/{id}")
    public Optional<Acceleration> findById(@PathVariable Long id)
    {
        return this.nterface.findById(id);
    }


}
