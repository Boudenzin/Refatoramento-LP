import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int cont = 0;
        while(cont<N) {
            int X = Integer.parseInt(sc.nextLine());
            int cont2 = 1;
            int quantPrimo = 0;
            while (cont2<=X) {
                if (X%cont2==0) {
                    quantPrimo++;
                }
                cont2++;
            }
            if (quantPrimo==2) {
                System.out.println(X+" eh primo");
            } else {
                System.out.println(X+" nao eh primo");
            }
            cont++;
        }
        sc.close();
    }
}
