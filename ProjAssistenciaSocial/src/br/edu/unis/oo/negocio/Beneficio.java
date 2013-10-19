/*
 João Carlos
 */
package br.edu.unis.oo.negocio;

public class Beneficio {
    public int id;
    public String descricao;
    public int status;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    @Override
    public String toString(){
        return descricao;
    }
}
