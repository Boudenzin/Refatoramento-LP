package br.romildo.barbearia.cabelo;

public class Cadastro {

    private String nome;
    private String tipo;
    private Dinheiro debt;

    public Cadastro(String nome, String tipo, Dinheiro debt) {
        this.nome = nome;
        this.tipo = tipo;
        this.debt = debt;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Dinheiro getDebtConfirm () {
        return debt;
    }
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setDebt(Dinheiro statusNovo) {
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
        Dívida: %s
        Juros: %.2f
        """, nome, tipo, debt.getPreco(), debt.getTemDivida(), debt.getJuros());
    }


}
