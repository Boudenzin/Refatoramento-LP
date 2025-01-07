package br.ufpb.dcx.romildo.restaurante.cardapio;

public class ItemDePedido {
    private String nome;
    private String tipo;
    private double preco;

    public ItemDePedido(String nome, String tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;


    }

    public ItemDePedido() {
        this.nome = "";
        this.tipo = "LANCHE"; //TODO: Converssar com o proprietário
        this.preco = 0.0;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void setTipo(String novoTipo) {
        this.tipo = novoTipo;
    }

    public String toString() {
        return "=> " + this.nome + " - R$ " + this.preco;
    }

}

