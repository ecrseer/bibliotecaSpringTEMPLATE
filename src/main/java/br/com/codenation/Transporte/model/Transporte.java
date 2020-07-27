package br.com.codenation.Transporte.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transporte {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) Long id;

    String nome;
    Long velocidadeMax;


    public Transporte() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(Long velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
}
