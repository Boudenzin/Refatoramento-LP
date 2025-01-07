package br.ufpb.dcx.romildo.emprensado;
import java.util.Scanner;
public class Advinha {

        public static int sorteiaNumeroInteiro(int maximo) {
            int x = (int) (Math.random()*(maximo+1)); //gera número inteiro aleatório entre [0-maximo]
            return x;
        }

        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            int maxNum = 100;
            int pontos = 100;
            int y = sorteiaNumeroInteiro(maxNum);
            boolean acertou = false;
            int tentativas = 0;
            while(!acertou) {
                System.out.println("Tente adivinhar y [0-10]:");
                int numLido = Integer.parseInt(leitor.nextLine());
                tentativas++;
                if (numLido ==y) {
                    System.out.println("Parabéns! Você acertou. Número de tentativas:"+tentativas);
                    System.out.println("Números de pontos: "+pontos);
                    acertou = true;
                } else if (y>numLido)
                {
                    System.out.println("Errou! Tente novamente");
                    System.out.println("é maior");
                    pontos = pontos - 2;
                }
                else {
                    System.out.println("Errou! Tente Novamente");
                    System.out.println("é menor");
                    pontos = pontos - 2;
                }
            }
            leitor.close();
        }

    }
