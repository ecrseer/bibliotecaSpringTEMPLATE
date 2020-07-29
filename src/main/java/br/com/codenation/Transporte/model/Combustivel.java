package br.com.codenation.Transporte.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "combustiv")
public class Combustivel {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) private Long idC;


   // private Transporte transporte;

    private String nome;

    public Combustivel(){
        super();
    }

   /* public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }*/

    public Long getIdC() {
        return idC;
    }

    public void setIdC(Long idC) {
        this.idC = idC;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
