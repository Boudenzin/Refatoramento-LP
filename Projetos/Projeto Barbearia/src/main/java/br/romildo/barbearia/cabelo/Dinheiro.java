package br.romildo.barbearia.cabelo;

public class Dinheiro {

    private double preco;
    private String temDivida;
    private double juros;
    public static final double taxaJuros = 0.1;

    public Dinheiro(double preco, String divida) {
        this.preco = preco;
        this.juros = 0.0;
        this.temDivida = "NÃO";

        if (divida.equalsIgnoreCase("S")) {
            this.juros = this.preco * taxaJuros;
            this.preco += this.juros;
            this.temDivida = "SIM";
        }
    }

    public double getPreco() {
        return this.preco;
    }

    public double getJuros() {
        return this.juros;
    }
    public String getTemDivida() {
        return this.temDivida;
    }

}

