package br.romildo.barbearia.cabelo;

public class Divida {

    private String nome;
    private String divida;
    private String temDivida;
    private double juros;

    public Divida(String nome, String divida) {
        this.nome = nome;
        this.divida = divida;

    }

    public void temDivida() {
        if (this.divida.equalsIgnoreCase("S")) {
            this.temDivida = "SIM";
            } else {
            this.temDivida = "NÃO";
        }
    }
    public double Juros(double preco) {
        double juros = (1+0.1);
        this.juros = (preco*juros);
        return this.juros;
    }

    public void valorDebt() {}
    public String toString() {
        return String.format("""
                Dívida = %s
                Juros: %.2f
                """,this.temDivida,this.juros);
    }
}

