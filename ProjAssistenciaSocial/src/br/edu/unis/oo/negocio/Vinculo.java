/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.negocio;

/**
 *
 * @author alunos
 */
public class Vinculo {
    
    private int id;
    private String descricao;
    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

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
    
}
