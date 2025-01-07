package br.ufpb.Samuel.Romildo.Pessoa;
import java.util.Scanner;
import java.util.ArrayList;

public class TestaPessoa {

    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        int quantPessoas = 5;
        int k=0;
        while (quantPessoas>k){

            System.out.println("digite sua idade");
            int idade =Integer.parseInt(leitor.nextLine());
            System.out.println("digite seu nome ");
            String nome=leitor.nextLine();
            Pessoa p = new Pessoa(nome,idade);
            pessoas.add(p);

            k++;

        }
        for(Pessoa p : pessoas) {
            boolean resultado = p.ehDeMaior();
            if (resultado) {
                System.out.println(p.getNome() + "é de maior");
            } else {
                System.out.println(p.getNome() + "é de menor");
            }
        }
        leitor.close();
    }
}
