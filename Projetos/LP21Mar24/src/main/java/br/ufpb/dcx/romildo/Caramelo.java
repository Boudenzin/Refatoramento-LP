package br.ufpb.dcx.romildo;

public class Caramelo extends Cachorro{
    private String lugar;

    public Caramelo (String nome, String lugar) {
        super(nome,"Caramelo");
        this.lugar = lugar;
    }
    public String getLugar() {
        return this.lugar;
    }
}
