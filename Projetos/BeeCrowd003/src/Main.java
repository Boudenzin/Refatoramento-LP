import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = Double.parseDouble(sc.nextLine());
        double B = Double.parseDouble(sc.nextLine());
        double MEDIA = ((A*3.5)+(B*7.5))/11;
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        sc.close();
    }
}
