package br.romildo.barbearia.cabelo;

import java.util.Scanner;

public class ProgramaCabelereiro {
    public static void main (String [] args) {
        Fila queue = new Fila();
        Scanner sc = new Scanner(System.in);
        String debito = null;
        int capacidadeMax = 20;
        boolean debtErr = false;
        System.out.println("Quantas pessoas tem na fila?");
        int quantPessoas = Integer.parseInt(sc.nextLine());
        Fila [] pessoas = new Fila[quantPessoas];
        for (int k = 0; k < quantPessoas; k++) {
            System.out.println("Qual o nome do " + (k+1) + "º ?");
            String nome = sc.nextLine();
            System.out.println("Qual o tipo do corte?");
            String tipo = sc.nextLine();
            System.out.println("Qual o preço estabelecido?");
            double preco = Double.parseDouble(sc.nextLine());
            while(!debtErr) {
                System.out.println("Está em débito com a barbearia?(S?N)");
                debito = sc.nextLine();
                if (debito.equalsIgnoreCase("S") || debito.equalsIgnoreCase("N")) {
                    break;
                }
                System.out.println("!!!!!!");
                System.out.println("Digite apenas S ou N");
            }
            Divida debt = new Divida(nome,debito);
            debt.temDivida();
            //TODO: TRAZER ESSE CÓDIGO PARA DENTRO DE DIVIDA
            if (debtConfirm) {
                preco = debt.Juros(preco);
            }
            //TODO:END
            Fila f = new Fila(nome,tipo,preco,debtConfirm);
            pessoas[k] = f;



        }

        for (int k = 0; k < quantPessoas; k++) {
            System.out.println(pessoas[k].toString());
        }
        sc.close();

        //TODO: Imprimir se está em débito ou não
        //TODO: EXTERNO TODO: Fazer uma espécie de Menu com "Cardápio" oferecido na Barbearia


    }
}
