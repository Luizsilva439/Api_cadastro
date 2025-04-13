package com.tccfatec.CadastroPessoas;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class PessoasModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    int telefone;
    String endereço;
    String bairro;
    int numero;


    public PessoasModel(){

    }

    public PessoasModel(String bairro, String endereço, String nome, int numero, int telefone) {
        this.bairro = bairro;
        this.endereço = endereço;
        this.nome = nome;
        this.numero = numero;
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
