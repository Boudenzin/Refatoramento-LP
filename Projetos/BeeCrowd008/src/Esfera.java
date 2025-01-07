import java.util.Scanner;
public class Esfera {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double R = Double.parseDouble(sc.nextLine());
        double pi = 3.14159;
        double VOLUME = (4.0/3)*pi*Math.pow(R,3);
        System.out.printf("VOLUME = %.3f\n",VOLUME);
        sc.close();
    }
}
