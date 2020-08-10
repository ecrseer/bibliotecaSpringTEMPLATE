package br.com.codenation.challenge.controller;

import br.com.codenation.challenge.entity.Acceleration;
import br.com.codenation.challenge.service.AccelerationService;
import br.com.codenation.challenge.service.interfaces.AccelerationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acceleration")
public class AccelerationController {

    @Autowired private AccelerationServiceInterface nterface;

    @GetMapping("/{id}")
    public Optional<Acceleration> findById(@PathVariable("id") Long id)
    {
        return this.nterface.findById(id);

    }
    @PostMapping
    public Acceleration save(@RequestBody Acceleration ace){
        return this.nterface.save(ace);

    }


    /*public List<Acceleration> findByCompanyId(@PathVariable Long companyID){
        return this.nterface.findByCompanyId(companyID);
    }*/


}
