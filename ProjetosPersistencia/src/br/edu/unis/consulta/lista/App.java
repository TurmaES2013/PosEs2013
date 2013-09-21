package br.edu.unis.consulta.lista;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author weider
 */
public class App {

    public static void main(String args[]) {

        Configuration cfg = new Configuration().configure();
        SchemaExport ex = new SchemaExport(cfg);
        ex.create(true, true);

        SessionFactory sfac = new Configuration().configure().buildSessionFactory();
        Session se = sfac.openSession();

        //resultado em lista
        List pessoas = se.createQuery("from Pessoa where nome like 'we%' ").list();

        Iterator it = pessoas.iterator();

        System.out.println("Relação de pessoas");
        System.out.println("======= == =======");
        System.out.println(" ");

        while (it.hasNext()) {

            Pessoa p = (Pessoa) it.next();

            System.out.println("Cpf.....: " + p.getCpf());
            System.out.println("Nome....: " + p.getNome());
            System.out.println("Rg......: " + p.getRg());
            System.out.println("Endereço: " + p.getEndereco());
            System.out.println("Cidade..: " + p.getCidade());
            System.out.println(" ");

        }

    }

}
