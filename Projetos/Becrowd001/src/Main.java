import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double π = 3.14159;
        Scanner sc = new Scanner(System.in);
        double raio = Double.parseDouble(sc.nextLine());
        double area = π*(raio*raio);
        System.out.printf("A=%.4f\n",area);
    }
}
