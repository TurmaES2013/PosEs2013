/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.teste;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author alunos
 */
public class App {
    
    public static void main(String args[]) {
        Configuration cfg = new Configuration().configure();
        SchemaExport ex = new SchemaExport(cfg);
        ex.create(true, true);
    }
    
}
