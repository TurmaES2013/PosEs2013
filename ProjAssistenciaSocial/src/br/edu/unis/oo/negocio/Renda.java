/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.negocio;

/**
 *
 * @author alunos
 */
public class Renda  {
     private int id;

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
     private String tipo;
     private double valor;

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
     }   

