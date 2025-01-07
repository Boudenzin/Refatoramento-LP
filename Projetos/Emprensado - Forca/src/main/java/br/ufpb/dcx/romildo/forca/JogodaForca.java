package br.ufpb.dcx.romildo.forca;

import javax.swing.*;
import java.util.Random;

public class JogodaForca {

    public static char[] converterVazio(String palavra) {
        int quantLetras = palavra.length();
        char [] palavraConvertida = new char[quantLetras];
        for (int k =0; k<quantLetras; k++) {
            palavraConvertida[k] = '_';
        }
        return palavraConvertida;
    }
    public static void mostrarPalavra(char[] palavraEscondida) {
        for (char c : palavraEscondida) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void vireAsLetras(char [] palavraMostrada, String palavra, char letra) {
        for (int k = 0; k < palavra.length(); k++) {
            if (palavra.charAt(k) == letra) {
                palavraMostrada[k] = letra;
            }
        }
    }

    public static boolean temLetrasaDescobrir(char[] palavraMostrada) {
        for (char c : palavraMostrada) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }
    public static void main (String [] args) {
        String[] palavras = {"Computador", "Elefante", "Abacaxi", "Girafa", "Piano", "Chapéu", "Bicicleta", "Maçã", "Tigre", "Relógio", "Caneta", "Avião", "Sapato", "Borboleta", "Morango", "Violão", "Papagaio", "Helicóptero", "Banana", "Tigela", "Lápis", "Leão", "Cachorro", "Esquilo", "Martelo", "Árvore", "Camiseta", "Leite", "Papel", "Carro"};
        Random rd = new Random();
        int randomNumber = rd.nextInt(palavras.length);
        String palavra = palavras[randomNumber];
        boolean continuar = true;
        char[] palavraMostrada = converterVazio(palavra);
        int numTentativa = 6;

        System.out.println("Bem-vindo ao Jogo da Forca!");
        System.out.println("Advinhe a palavra");

        while (continuar) {
            mostrarPalavra(palavraMostrada);
            char letra = Character.toUpperCase(JOptionPane.showInputDialog("Digite uma letra").charAt(0));
            if (!Character.isLetter(letra)) {
                System.out.println("Por favor, digite apenas letras");
                continue;
            }
            vireAsLetras(palavraMostrada, palavra, letra);
            if (temLetrasaDescobrir(palavraMostrada)) {
                numTentativa--;
                if (numTentativa == 0) {
                    System.out.println("Números de tentativa esgotado. A palavra era: "+ palavra);
                    continuar = false;
                } else {
                    System.out.println("Letra errada! Você tem " + numTentativa + " tentativas restantes");
                }

            } else {
                System.out.println("Parabéns! Você ganhou. A palavra é: " + palavra);
                continuar = false;

            }
        }
    }
}
