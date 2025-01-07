import java.util.Scanner;

public class RetornaMenor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores você vai querer inserir?");
        int quant = Integer.parseInt(sc.nextLine());
        Double[] lista = new Double[quant];
        for (int k = 0; k < quant; k++) {
            System.out.println((k+1)+"º Valor");
            lista[k] = Double.parseDouble(sc.nextLine());
        }
        int j = 0;
        double menorValor = 0;
        do {
            if (lista[j] < menorValor || menorValor == 0) {
                menorValor = lista[j];
            }
            j++;
        } while (j < lista.length);
        System.out.println("Menor Valor: "+ menorValor);
        sc.close();
    }
}
