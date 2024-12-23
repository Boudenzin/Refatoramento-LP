package br.ufpb.dcx.ex7;

public class Cachorro implements EmissorDeSom {
    private String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public String emitirSom() {
        return "au au";
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
