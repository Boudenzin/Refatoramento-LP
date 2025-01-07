import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipoCombustivel = 0;
        int quantGasolina = 0;
        int quantAlcool = 0;
        int quantDiesel= 0;
        while (tipoCombustivel != 4) {
            tipoCombustivel = Integer.parseInt(sc.nextLine());
            switch (tipoCombustivel) {
                case 1:
                    quantAlcool++;
                    break;
                case 2:
                    quantGasolina++;
                    break;
                case 3:
                    quantDiesel++;
                    break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+quantAlcool);
        System.out.println("Gasolina: "+quantGasolina);
        System.out.println("Diesel: "+quantDiesel);
        sc.close();
    }
}
