package br.ufpb.dcx.romildo.forcagpt;

import java.util.Scanner;

public class ForcaGpt {
    private static final String[] PALAVRAS = {"banana", "computador", "programacao", "elefante", "girafa"};
    private static String palavraSecreta;
    private static char[] letrasDescobertas;
    private static int tentativasRestantes;

    public static void main(String[] args) {
        iniciarJogo();

        while (tentativasRestantes > 0 && !jogoTerminou()) {
            mostrarProgresso();
            char letra = pedirPalpite();
            if (!verificarPalpite(letra)) {
                tentativasRestantes--;
            }
        }

        if (jogoTerminou()) {
            System.out.println("Parabéns! Você acertou a palavra: " + palavraSecreta);
        } else {
            System.out.println("Você perdeu! A palavra correta era: " + palavraSecreta);
        }
    }

    private static void iniciarJogo() {
        palavraSecreta = PALAVRAS[(int) (Math.random() * PALAVRAS.length)];
        letrasDescobertas = new char[palavraSecreta.length()];
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }
        tentativasRestantes = 6;
    }

    private static void mostrarProgresso() {
        System.out.println("Palavra: ");
        for (char c : letrasDescobertas) {
            System.out.print(c + " ");
        }
        System.out.println("\nTentativas Restantes: " + tentativasRestantes);
    }

    private static char pedirPalpite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra: ");
        return scanner.next().charAt(0);
    }

    private static boolean verificarPalpite(char letra) {
        boolean acertou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            if (palavraSecreta.charAt(i) == letra) {
                letrasDescobertas[i] = letra;
                acertou = true;
            }
        }
        return acertou;
    }

    private static boolean jogoTerminou() {
        for (char c : letrasDescobertas) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}

