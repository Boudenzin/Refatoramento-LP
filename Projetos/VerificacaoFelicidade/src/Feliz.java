import java.util.Scanner;

public class Feliz {
    public static void main (String[] args) {
        boolean verif1;
        boolean verif2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Você pagou as contas?");
        String cond1 = sc.nextLine();
        System.out.println("Você passeou?");
        String cond2 = sc.nextLine();
        if ((cond1.equalsIgnoreCase("SIM"))) {
            verif1 = true;

        } else {
            verif1 = false;
        }
        if (cond2.toUpperCase() == "SIM") {
            verif2 = true;
        } else {
            verif2 = false;
        }
        if (verif1 && verif2) {
            System.out.println("VOCE TA FELIZ PRA KC7");
        } else {
            System.out.println("VOCE TA LASCADO MERMAO");
        }
        sc.close();
    }
}
