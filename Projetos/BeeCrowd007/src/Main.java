import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int penultimo = 0;
        int ultimo = 1;
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        if (N>=2) {
            System.out.print(penultimo+" "+ultimo);
        } else if (N==1) {
            System.out.print(penultimo);
        }
        for (int k=3;k<=N;k++) {
            int temp = ultimo;
            ultimo = penultimo+ultimo;
            penultimo = temp;
            System.out.print(" "+ultimo);
        }
    }
}
