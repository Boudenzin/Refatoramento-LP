import javax.swing.*;

public class TesteSplit {
    public static void main (String[] args) {
        String[] nomesLidos = JOptionPane.showInputDialog("Digite uma lista separada por espaço").split(" ");
        int k = 0;
        System.out.println("Nomes Lidos:");
        do {
            System.out.println(nomesLidos[k]);
            k++;
        } while (k<nomesLidos.length);
    }
}
