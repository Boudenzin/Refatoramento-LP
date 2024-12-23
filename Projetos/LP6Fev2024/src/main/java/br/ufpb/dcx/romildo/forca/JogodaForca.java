package br.ufpb.dcx.romildo.forca;

import javax.swing.*;

public class JogodaForca {

    public static char [] converterVazio(String palavra) {
        int quantLetras = palavra.length();
        char [] palavraConvertida = new char[quantLetras];
        for (int k =0; k<quantLetras; k++) {
            palavraConvertida[k] = '_';
        }
        return palavraConvertida;
    }
    public static void mostrarPalavra(char[] palavraEscondida) {
        for (int k = 0; k< palavraEscondida.length; k++) {
            System.out.print(palavraEscondida[k]+" ");
        }
    }
    public static void vireAsLetras(char [] palavraMostrada, String palavra, char letra) {
        for (int k = 0; k< palavra.length(); k++) {
            if (palavra.charAt(k) == letra) {
                palavraMostrada[k] = letra;

            }
        }
    }

    public static boolean temLetrasaDescobrir(char[] palavraMostrada) {
        for (int k = 0; k < palavraMostrada.length; k++) {
            if (palavraMostrada[k] == '_') {
                return true;
            }
        }
        return false;
    }
    public static void main (String [] args) {
        String palavra = JOptionPane.showInputDialog("Digite a palavra a advinhar:");
        boolean continuar = true;
        char [] palavraMostrada = converterVazio(palavra);
        int numTentativa = 6;
        while (continuar) {
            mostrarPalavra(palavraMostrada);
            char letra = JOptionPane.showInputDialog("Digite uma letra").charAt(0);
            numTentativa --;
            vireAsLetras(palavraMostrada, palavra, letra);
            if (temLetrasaDescobrir(palavraMostrada)) {
                if (numTentativa == 0) {
                    System.out.println("Números de tentativa esgotado");
                    continuar = false;
                }

            } else {
                System.out.println("Você ganhou");
                continuar = false;

            }
        }
    }
}
