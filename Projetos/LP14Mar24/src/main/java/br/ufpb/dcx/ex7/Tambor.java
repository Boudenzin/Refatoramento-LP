package br.ufpb.dcx.ex7;

public class Tambor implements EmissorDeSom {

    public String tamanho;
    public String marca;

    public Tambor (String tamanho, String marca) {
        this.tamanho = tamanho;
        this.marca = marca;
    }
    @Override
    public String emitirSom() {
        return "tum tum";
    }

    public String getTamanho() {
        return this.tamanho;
    }
    public String getMarca() {
        return this.marca;
    }
}
