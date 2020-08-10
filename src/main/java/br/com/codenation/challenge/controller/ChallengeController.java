package br.com.codenation.challenge.controller;

import br.com.codenation.challenge.entity.Challenge;
import br.com.codenation.challenge.service.ChallengeService;
import br.com.codenation.challenge.service.interfaces.ChallengeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/challenge")
public class ChallengeController {

   @Autowired
   private ChallengeServiceInterface servico;

    @GetMapping
    public Iterable<Challenge> findAll(){
        return this.servico.findAll();
    }


    @PostMapping
    public Challenge save(@RequestBody Challenge chall){
        return servico.save(chall);
    }

    @GetMapping("/{name}")
    public  Challenge findByName(@PathVariable String name){
        return servico.findByName(name);
    }

}
