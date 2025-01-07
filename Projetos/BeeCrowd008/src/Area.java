import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] medidas = sc.nextLine().split(" ");
        double A = Double.parseDouble(medidas[0]);
        double B = Double.parseDouble(medidas[1]);
        double C = Double.parseDouble(medidas[2]);
        double triangle = A*C/2;
        double circle = 3.14159*(Math.pow(C,2));
        double trapezoid = (A+B)*C/2;
        double square = Math.pow(B,2);
        double rectangle = A*B;
        System.out.printf("TRIANGULO: %.3f\n",triangle);
        System.out.printf("CIRCULO: %.3f\n",circle);
        System.out.printf("TRAPEZIO: %.3f\n",trapezoid);
        System.out.printf("QUADRADO: %.3f\n",square);
        System.out.printf("RETANGULO: %.3f\n",rectangle);


        sc.close();
    }
}
