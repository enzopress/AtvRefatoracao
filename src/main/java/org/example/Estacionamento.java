package org.example;

public class Estacionamento {

    private String nome;
    private String cnpj;


    public Estacionamento(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;

    }

    public void imprimirDados() {
        System.out.println("Estacionamento: " + nome);
        System.out.println("CNPJ: " + cnpj);

    }



    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
