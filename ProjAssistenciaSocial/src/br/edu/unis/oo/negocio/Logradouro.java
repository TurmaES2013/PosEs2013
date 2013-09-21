/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.negocio;

/**
 *
 * @author alunos
 */
public class Logradouro {
    
    private int id;
    private String descricao;
    private String cep;
    private Bairro bairro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    private Logradouro(Bairro b)
    {
        this.bairro = b;
    }
    
}
