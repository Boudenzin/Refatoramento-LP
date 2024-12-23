import javax.swing.*;

public class Imc {

    public static void main (String[] args) {

        String weightString = JOptionPane.showInputDialog("Digite o seu peso: ");
        String highString = JOptionPane.showInputDialog("Digite a sua altura: ");
        double weight = Double.parseDouble(weightString);
        double high = Double.parseDouble(highString);
        double truehigh = high/100;
        double imc = weight / (truehigh * truehigh);
        System.out.println("O seu imc é: " + imc);
        JOptionPane.showMessageDialog(null, "O seu imc é: " + imc);


    }
}
