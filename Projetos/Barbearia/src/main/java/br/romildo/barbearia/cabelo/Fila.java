package br.romildo.barbearia.cabelo;

public class Fila {

    private String nome;
    private String tipo;
    private double preco;
    private boolean debt;

    public Fila(String nome, String tipo, double preco, boolean debt) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.debt = debt;
    }
    public Fila() {
        this("","",0.0, false);

    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
    public double getPreco() {
        return preco;
    }
    public boolean getDebtConfirm () {
        return debt;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    public void setPreco(double precoNovo) {
        this.preco = precoNovo;
    }
    public void setDebt(boolean statusNovo) {
        this.debt = statusNovo;
    }
    public void setTipo(String tipoNovo) {
        this.tipo = tipoNovo;
    }
    public String toString() {
        return String.format("""
        Nome: %s
        Tipo: %s
        Preço: %.2f
        """, nome, tipo, preco);
    }


}
