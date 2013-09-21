/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.negocio;

/**
 *
 * @author alunos
 */
public class Bairro {
    
    private int id;
    private String descricao;
    private Cidade cidade;

    
    
    public Bairro(Cidade cidade)
    {
        this.setCidade(cidade);
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
    
    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
