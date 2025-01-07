package br.test.romildo;

import java.util.List;
import java.util.Scanner;
public class ProgramaProduto {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        SistemaDeProdutos sys = new SistemaDeProdutos();
        while(continuar) {
            System.out.println("""
            Digite um opção:
            1. Cadastrar produto
            2. Pesquisar o produto mais caro
            3. Procurar produtos mais baratos que um valor fornecido
            4. Sair
            """);
            String opcao = sc.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Nome do produto:");
                    String nome = sc.nextLine();
                    System.out.println("Preço do produto:");
                    double preco = Double.parseDouble(sc.nextLine());
                    sys.cadastraProduto(nome,preco);
                    break;
                case "2":
                    double valor = sys.calculaMaiorPreco();
                    System.out.printf("O produto mais caro custa %.2f\n",valor);
                    break;
                case "3":
                    System.out.println("Você quer achar se existe um produto menor que:");
                    double valorPesq = Double.parseDouble(sc.nextLine());
                    List<Produtos> produtosAchados = sys.pesquisProdutosMaisBaratosQue(valorPesq);
                    for (Produtos prod : produtosAchados) {
                        System.out.println("Produto:" + prod.getNome()+ "que custa R$"+ prod.getPreco());
                    }
                    break;
                case "4":
                    System.out.println("Até mais, bye bye!");
                    continuar = false;
                    break;
                default:
                    System.out.println("Você não digitou nada. Apenas uma das opções, por favor");


            }
        }
    }

}
