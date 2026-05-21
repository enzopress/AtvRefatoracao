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
        System.out.println("Endereço: " + rua + ", " + numero + " - " + bairro);
        System.out.println("Cidade: " + cidade + " - " + estado);
        System.out.println("CEP: " + cep);
    }

    public String getEnderecoCompleto() {
        return rua + ", " + numero + " - " + bairro + ", " + cidade + " - " + estado + ", " + cep;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
}
