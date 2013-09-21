/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unis.oo.negocio;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Richard Gerhardt
 */
public class Pessoa {
    private String nis;
    private String nome;
    private Date dataNascimento; 
    private String sexo;
    private Date dataCadastro;
    private String status;
    private String cpf;
    private String rg;
    private String certidaoNascimento;
    private int capaz;
    private Set<Renda> rendas = new HashSet<Renda>(); 
    private Set<Deficiencia> deficiencias = new HashSet<Deficiencia>();
    private Pessoa chefe;
    private Escolaridade escolaridade;
    private Vinculo parentesco;

    public List<Deficiencia> getDeficiencias() {
        return deficiencias;
    }

    public void setDeficiencias(List<Deficiencia> deficiencias) {
        this.deficiencias = deficiencias;
    }

    public Pessoa getChefe() {
        return chefe;
    }

    public void setChefe(Pessoa chefe) {
        this.chefe = chefe;
    }

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Vinculo getParentesco() {
        return parentesco;
    }

    public void setParentesco(Vinculo parentesco) {
        this.parentesco = parentesco;
    }
     
    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCertidaoNascimento() {
        return certidaoNascimento;
    }

    public void setCertidaoNascimento(String certidaoNascimento) {
        this.certidaoNascimento = certidaoNascimento;
    }

    public int getCapaz() {
        return capaz;
    }

    public void setCapaz(int capaz) {
        this.capaz = capaz;
    }

    public List<Renda> getRendas() {
        return rendas;
    }

    public void setRendas(List<Renda> rendas) {
        this.rendas = rendas;
    }
}   
