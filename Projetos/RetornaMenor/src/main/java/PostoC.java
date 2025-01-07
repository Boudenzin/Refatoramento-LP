import java.util.Scanner;
public class PostoC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double somaValor = 0;
        double menorValor = 0;
        Double[] valores = new Double[5];
        for (int k = 0; k < 5; k++) {
            System.out.println("Quantos litros ?");
            double qtdeLitros = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro de gasolina?");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            valores[k] = qtdeLitros * precoGasolina;
        }

        for (int k = 0; k < valores.length; k++) {
            if (valores[k] < menorValor || menorValor == 0) {
                menorValor = valores[k];
            }
            somaValor += valores[k];
        }

        System.out.printf("Menor valor: %.2f\n", menorValor);
        System.out.printf("Média abastecimentos: %.2f\n", somaValor / 5);
        leitor.close();
    }
}