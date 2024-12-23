import javax.swing.*;

public class Bday {

    public static void main (String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade:"));
        JOptionPane.showMessageDialog(null, "Parabéns " + nome + " pelos seus " + idade + " anos");

    }
}
