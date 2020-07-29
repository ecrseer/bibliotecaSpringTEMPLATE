package br.com.codenation.Transporte.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "combustiv")
public class Combustivel {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) private Long idC;

    private String nome;

}
