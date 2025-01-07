package br.ufpb.romildo.loja;

public class ProgramaRoupa {
    public static void main(String[] args) {
        Roupa roupa1 = new Roupa("Roupa de Formatura", Roupa.COR_AZUL, "p");
        Roupa roupa2 = new Roupa("Roupa de Formatura", "Azul Marinho", "G");
        System.out.println(roupa1.hashCode());
        System.out.println(roupa2.hashCode());
    }
}
