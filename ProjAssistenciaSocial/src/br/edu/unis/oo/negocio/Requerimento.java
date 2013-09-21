/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.negocio;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Classe requerimento
 * @author marlon.hugo
 */
public class Requerimento {
    
    private int id;
    private Date data;
    private double valor;
    private int situacao;
    private String obs;
    private Pessoa pessoa;
    private Usuario responsavel;
    private Set<Beneficio> beneficios = new HashSet<Beneficio>(); 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public Set<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Set<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }
       
}
