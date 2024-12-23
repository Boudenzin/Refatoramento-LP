package br.ufpb.dcx.romildo;

public class ProgramaEmissores {
    public static void main(String[] args) {
        Cachorro dog1 = new Cachorro("Susy", "Cão da Montanha dos Pirineus");
        Cachorro dog2 = new Dalmata("101", "Uma mancha apenas");
        Cachorro dog3 = new Caramelo("Pinguço", "Bar do seu Zé");
        System.out.println(dog1.emitirSom());
        System.out.println(dog2.emitirSom());
        System.out.println(dog3.emitirSom());

        System.out.println(dog1);
    }
}