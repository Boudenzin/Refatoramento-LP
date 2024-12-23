package br.ufpb.dcx.romildo;

public class Cachorro {

    private String nome;
    private String raca;
    public String emitirSom() {
        return "bark";
    }
    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return this.nome;
    }
    public String getRaca() {
        return this.raca;
    }
    @Override
    public String toString() {
        return String.format ("""
                Nome do Cachorro: %s
                Raça do Cachorro: %s
                
                """, this.nome, this.raca);

    }
}
