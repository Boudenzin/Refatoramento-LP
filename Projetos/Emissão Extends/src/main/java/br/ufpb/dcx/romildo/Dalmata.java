package br.ufpb.dcx.romildo;

public class Dalmata extends Cachorro {

    private String tipoManchas;

    public Dalmata(String nome, String manchas) {
        super(nome, "Dalmata");
        this.tipoManchas = manchas;
    }
    public String getTipoManchas() {
        return this.tipoManchas;
    }
    @Override
    public String toString() {
        return super.toString() + String.format ("""
                Manchas: %s
             
                """, this.tipoManchas);
    }

}
