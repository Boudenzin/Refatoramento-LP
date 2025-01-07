package br.test.romildo;

public class Produtos {
    private String nome;
    private double preco;
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public Produtos() {
        this("",0.0);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}

