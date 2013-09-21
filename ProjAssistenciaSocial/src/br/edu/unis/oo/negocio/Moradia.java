/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.negocio;

/**
 *
 * @author alunos
 */
public class Moradia {
    private int id;
    private String numero;
    private String complemento;
    private int qtdBanheiro;
    private int coletaLixo;
    private int coletaEsgoto;
    private int aguaTratada;
    private Logradouro logradouro;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getQtdBanheiro() {
        return qtdBanheiro;
    }

    public void setQtdBanheiro(int qtdBanheiro) {
        this.qtdBanheiro = qtdBanheiro;
    }

    public int getColetaLixo() {
        return coletaLixo;
    }

    public void setColetaLixo(int coletaLixo) {
        this.coletaLixo = coletaLixo;
    }

    public int getColetaEsgoto() {
        return coletaEsgoto;
    }

    public void setColetaEsgoto(int coletaEsgoto) {
        this.coletaEsgoto = coletaEsgoto;
    }

    public int getAguaTratada() {
        return aguaTratada;
    }

    public void setAguaTratada(int aguaTratada) {
        this.aguaTratada = aguaTratada;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Logradouro logradouro) {
        this.logradouro = logradouro;
    }
    
    
    public Moradia(Logradouro l)
    {
        this.logradouro = l;
    }
}
