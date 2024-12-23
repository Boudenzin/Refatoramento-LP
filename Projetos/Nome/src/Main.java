import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome");
        JOptionPane.showMessageDialog(null,"Seu nome é "+ nome.toUpperCase() + " e tem " + nome.length() + " letras");
        System.out.println("Bom dia "+ nome.substring(2,7));
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá!");
        String nome2 = sc.nextLine();
        sc.close();
    }
}
