package br.com.codenation.Transporte.controller;

import br.com.codenation.Transporte.model.Transporte;
import br.com.codenation.Transporte.service.TransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transporte")
public class TransporteController {

    @Autowired private TransporteService transporteService;

    @GetMapping
    public Iterable<Transporte> findAll(){
        return this.transporteService.findAll();
    }

    @PostMapping
    public Transporte save(@RequestBody Transporte trans){ return this.transporteService.save(trans);}

    @GetMapping("/byNome/{nome}")
    public List<Transporte> findByNomeContaining(@PathVariable("nome") String nome){
        return this.transporteService.findByNomeContaining(nome);
    };
}
