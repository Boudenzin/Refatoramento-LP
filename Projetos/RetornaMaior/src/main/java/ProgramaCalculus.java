import java.util.Scanner;

public class ProgramaCalculus {

    public static void main (String[] args) {
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        while(continuar) {
            System.out.println("Digite uma opção:" + "" +
                    "\n1.Maior de 2" +
                    "\n2.Maior de 3" +
                    "\n3.Maior de 4" +
                    "\n4.Sair");
            int opcao = Integer.parseInt(sc.nextLine());
            int num1;
            int num2;
            int num3;
            int quantNumeros;
            int maior;

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o segundo número:");
                    num2 = Integer.parseInt(sc.nextLine());
                    maior = Calculus.max(num1,num2);
                    break;
                case 2:
                    System.out.println("Digite o primeiro número:");
                    num1 = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o segundo número:");
                    num2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o terceiro número:");
                    num3 = Integer.parseInt(sc.nextLine());
                    maior = Calculus.max(num1,num2,num3);
                    break;
                case 3:
                    System.out.println("Quantos números você quer analisar?");
                    quantNumeros = Integer.parseInt(sc.nextLine());
                    for (int k = 0; k<quantNumeros; k++) {
                        System.out.println("Digite o [" + (k + 1) +"] número");
                    }
                    break;
                    }

            }

        }
    }


