package br.com.codenation.Transporte.controller;

import br.com.codenation.Transporte.model.Combustivel;
import br.com.codenation.Transporte.model.Transporte;
import br.com.codenation.Transporte.service.CombustivelService;
import br.com.codenation.Transporte.service.TransporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/combustivel")
public class CombustivelController {

    @Autowired private CombustivelService transporteService;

    @GetMapping
    public Iterable<Combustivel> findAll(Combustivel tran){
        return this.transporteService.findAll();
    }

    @PostMapping
    public Combustivel save(@RequestBody Combustivel trans){ return this.transporteService.save(trans);}

    @GetMapping("/byNome/{nome}")
    public List<Combustivel> findByNomeContaining(@PathVariable("nome") String nome){
        return this.transporteService.findByNomeContaining(nome);
    };
}
