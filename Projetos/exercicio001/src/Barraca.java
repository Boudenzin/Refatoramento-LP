import javax.swing.*;

public class Barraca {

    public static void main (String[] args) {
        double precoMaca = 1;
        double precoMamao = 3.5;
        int quantMaca = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de maças: "));
        int quantMamao = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de mamões: "));
        double precototal = (precoMaca * quantMaca) + (precoMamao * quantMamao);
        JOptionPane.showMessageDialog(null,"Preço Total: " + precototal);

    }
}
