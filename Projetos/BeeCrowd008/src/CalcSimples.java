import java.util.Scanner;

public class CalcSimples {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] peca1 = sc.nextLine().split(" ");
        String[] peca2 = sc.nextLine().split(" ");
        double preco1 = Double.parseDouble(peca1[2]);
        double preco2 = Double.parseDouble(peca2[2]);
        Double valor = (Integer.parseInt(peca1[1])*preco1)+(Integer.parseInt(peca2[1])*preco2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valor);
        sc.close();


    }
}
