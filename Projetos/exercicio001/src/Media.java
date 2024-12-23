import javax.swing.*;

public class Media {

    public static void main (String[] args){

        String nota1Str = JOptionPane.showInputDialog("Digite a primeira nota:");
        String nota2Str = JOptionPane.showInputDialog("Digite  segunda nota:");
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        int quant = 2;
        double media = (nota1 + nota2) / quant;
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}
