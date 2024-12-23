import javax.swing.*;

public class Discount {

    public static void main (String[] args) {

        String priceStr = JOptionPane.showInputDialog("Digite o preço:");
        String offStr = JOptionPane.showInputDialog("Digite o desconto:");
        double price = Double.parseDouble(priceStr);
        double off = Double.parseDouble(offStr);
        double percent = off / 100;
        double totaloff = 1 - percent;
        double finalprice = totaloff * price;
        JOptionPane.showMessageDialog(null,"O preço a ser pago é: " + finalprice);
    }
}
