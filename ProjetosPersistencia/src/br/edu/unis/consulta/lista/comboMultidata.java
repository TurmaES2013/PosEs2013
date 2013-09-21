/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.consulta.lista;

/**
 *
 * @author weiderrodrigues
 */
public class comboMultidata {
    
    private String valor;  
    private String texto;  
  
    public comboMultidata(String id, String label) {  
        this.valor = id;  
        this.texto = label;  
    }  
    public String getValor() {  
        return valor;  
    }  
      
    @Override  
    public String toString() {  
        return texto;  
    }  

    
}
