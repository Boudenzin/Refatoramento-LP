import java.util.Scanner;

public class TestaArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos nomes?");
        int quantNomes = Integer.parseInt(sc.nextLine());
        String[] nomes = new String[quantNomes];
        int k = 0;
        do {
            System.out.println("Digite o próximo nome");
            nomes[k] = sc.nextLine();
            k++;
        } while(k<quantNomes);

        System.out.println("Nomes lidos:");
        for (int j = 0; j<nomes.length; j++) {
            System.out.println(nomes[j]);
        }
        System.out.println();
        System.out.println("Qual a letra");
        char letra = sc.nextLine().charAt(0);
        System.out.println(contaNomes(nomes,letra));
        sc.close();
    }
    public static int contaNomes(String[] nomes, char letra) {
        int quant = 0;
        for (int k = 0; k<nomes.length; k++) {
            if (nomes[k].charAt(0)==letra) {
                quant++;
            }
            }
        return quant;
        }
    }

