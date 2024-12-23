package br.ufpb.Samuel.Romildo.Pessoa;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome () {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nomeNovo) {
        this.nome = nomeNovo;
    }
    public void setIdade(int idadeNovo) {
        this.idade = idadeNovo;

    }

    public boolean ehDeMaior() {
        if (this.idade>=18) {
            return true;
        }
        else {
            return false;
        }
    }
}
