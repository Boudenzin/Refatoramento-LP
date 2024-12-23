import javax.swing.*;

public class Main {

    public static void main (String[] args) {
        System.out.println("Oi");
        System.out.println("Romildo");
        String nomeLido = JOptionPane.showInputDialog("Irei adivinhar o seu nome. Qual o seu nome?");
        System.out.println("Hi " + nomeLido);
        String age = "17";
        int idade = Integer.parseInt(age);
        System.out.println("我" + idade + "岁");
        if (idade > 18) {
            System.out.println("Você já pode ser preso");
        } else {
            System.out.println ("Você ainda não pode ser preso");
        } // Fim do else




    } // Fim do método main
} // Fim da Classe

