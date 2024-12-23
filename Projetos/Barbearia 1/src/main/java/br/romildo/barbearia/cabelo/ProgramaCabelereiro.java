package br.romildo.barbearia.cabelo;

import java.util.Scanner;

public class ProgramaCabelereiro {
    public static void main(String[] args) {
        CadastroList clientes = new CadastroList();
        String menu = """
                    Seja bem vindo ao Menu do Cabelereiro, o que desejas fazer?
                                        
                    1 - Cadastrar cliente à fila
                    2 - Retirar cliente da fila
                    3 - Terminar atendimento do cliente (1º da fila)
                    4 - Mudar a sequência da fila do cliente
                    5 - Verificar quanto de dinheiro foi arrecadado
                    6 - Verificar fila de clientes
                    7 - Remover o débito com a Barbearia
                    8 - Sair
                    """;
        Scanner sc = new Scanner(System.in);
        boolean debtErr = false;
        String debito = "";
        boolean continuar = true;
        while (continuar) {

            System.out.println(menu);

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Qual o nome do cliente?");
                    String nome = sc.nextLine();
                    System.out.println("Qual o tipo do corte?");
                    String tipo = sc.nextLine();
                    System.out.println("Qual o preço estabelecido?");
                    double preco = Double.parseDouble(sc.nextLine());
                    while (!debtErr) {
                        System.out.println("Está em débito com a barbearia?(S/N)");
                        debito = sc.nextLine();
                        if (debito.equalsIgnoreCase("S") || debito.equalsIgnoreCase("N")) {
                            break;
                        }
                        System.out.println("!!!!!!");
                        System.out.println("Digite apenas S ou N");
                    }
                    Dinheiro debt = new Dinheiro(preco, debito);
                    clientes.cadastrarCliente(new Cadastro(nome, tipo, debt));
                    break;
                case "2":
                    System.out.println("Qual cliente deseja apagar?");
                    clientes.imprimirFila();
                    boolean apagou = clientes.apagarCliente(sc.nextLine());
                    if (apagou) {
                        System.out.println("O cliente foi removido da fila");
                    }
                    else {
                        System.out.println("O cliente não foi removido da fila, pois não foi encontrado ou o nome foi digitado errado");
                    }
                    break;
                case "3":
                    boolean atendeu = clientes.fecharAtendimento();
                    if (atendeu) {
                        System.out.println("Cliente atendido e o valor já foi acrescido no caixa");
                    }
                    else {
                        System.out.println("Não há fila, cadastre primeiro o cliente");
                    }
                    break;
                case "4":
                    //TODO: FAZER UM SOUT PERGUNTANDO QUEM ELE QUER MUDAR DE POSIÇÃO E PRA QUAL POSIÇÃO ELE VAI
                    //TODO: FAZER O METODO


                    break;
                case "5":
                    //TODO: CRIAR O ATRIBUTO DINHEIRO E IMPLEMENTAR O METODO FECHARATENDIMENTO, ELE VAI PRINTAR O ATRIBUTO

                    break;
                case "6":
                    //TODO: CASO 6 VIRARÁ OUTRO MENU, TALVEZ SEJA MELHOR FAZER UM PUBLIC STATIC STRING, ESSE MENU OU OLHARÁ UMA POSICAO ESPECIFICA A LISTA, OU A LISTA INTEIRA
                    break;
                case "7":
                    //TODO: IF COMPARANDO S OU N, MUDAR PRECO PARA PRECOORIGINAL COM UM METODO, SETJUROS = 0, TEMDIVIDA = NÃO
                    break;
                case "8":
                    //TODO: CONTINUAR = FALSE;
                    break;
                default:
                    System.out.println("Apenas números!");
            }
        }
        sc.close();
    }
}

