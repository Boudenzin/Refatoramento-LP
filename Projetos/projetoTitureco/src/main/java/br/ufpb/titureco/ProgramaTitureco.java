package br.ufpb.titureco;

import javax.swing.*;
import java.util.List;

public class ProgramaTitureco {

    public static void main(String[] args) {
        TiturecoList listaDeTiturecos = new TiturecoList();
        boolean continuar = true;
        while (continuar) {

            String mensagem = """
                    Olá, seja bem vindo ao Programa Titureco! O que deseja fazer?
                                    
                    1 - Cadastrar Atrativo
                    2 - Pesquisar Atrativos da Cidade
                    3 - Listar Todos os Atrativos
                    4 - Apagar Atrativo
                    5 - Sair
                    """;
            String opcao = (JOptionPane.showInputDialog(null, mensagem, "Menu Titureco", JOptionPane.INFORMATION_MESSAGE));

            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Qual o nome do atrativo?");
                    double latitude = Double.parseDouble(JOptionPane.showInputDialog("Qual a latitude?"));
                    double longitude = Double.parseDouble(JOptionPane.showInputDialog("Qual a longitude?"));
                    String comoChegar = JOptionPane.showInputDialog("Como chegar lá?");
                    String cidade = JOptionPane.showInputDialog("Qual a cidade?");
                    String estado = JOptionPane.showInputDialog("Qual o estado?");
                    String tipoCadastro = JOptionPane.showInputDialog("""
                            O que está cadastrando?
                            1 - Praia
                            2 - Atrativo Genérico
                            """);

                    switch (tipoCadastro) {
                        case "1" :
                            boolean ehPropriaBoolean;
                            boolean temPerigoBoolean;
                            boolean ehPropriaErr = false;
                            boolean temPerigoErr = false;
                            String ehPropria = "";
                            String perigoTubarao = "";

                            while(!ehPropriaErr) {
                                ehPropria = JOptionPane.showInputDialog("A praia é propria para banho?(S/N)");
                                if(ehPropria.equalsIgnoreCase("S") || (ehPropria.equalsIgnoreCase("N"))) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Apenas S ou N", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            while(!temPerigoErr) {
                                perigoTubarao = JOptionPane.showInputDialog("Existe algum perigo de tubarão?(S/N)");
                                if(perigoTubarao.equalsIgnoreCase("S") || (perigoTubarao.equalsIgnoreCase("N"))) {
                                    break;
                                } else {
                                    JOptionPane.showMessageDialog(null, "Apenas S ou N", "ERRO", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }

                            String tipoOrla = JOptionPane.showInputDialog("Qual o tipo da Orla?");

                            ehPropriaBoolean = ehPropria.equalsIgnoreCase("S");

                            temPerigoBoolean = perigoTubarao.equalsIgnoreCase("S");

                            listaDeTiturecos.cadastrarAtrativo(new Praia(nome, latitude, longitude, comoChegar, cidade, estado, ehPropriaBoolean, temPerigoBoolean, tipoOrla));
                            break;

                        case "2":
                            boolean cadastroOK = listaDeTiturecos.cadastrarAtrativo(new AtrativoTuristico(nome, latitude, longitude, comoChegar, cidade, estado));
                            if (cadastroOK) {
                                JOptionPane.showMessageDialog(null,"Atrativo cadastrado com sucesso", "Cadastrar Atrativo", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null,"Atrativo já cadastrado!", "Cadastrar Atrativo", JOptionPane.INFORMATION_MESSAGE);
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Digite 1 ou 2 por favor", "Cadastrar Atrativo", JOptionPane.INFORMATION_MESSAGE);

                    }
                    break;

                case "2":
                    String cidadePesquisa = JOptionPane.showInputDialog("Qual o nome da cidade que você quer pesquisar os atrativos?");
                    String estadoPesquisa = JOptionPane.showInputDialog("Para confirmar a cidade, digite o estado, por favor");
                    List<AtrativoTuristico> atrativosdaCidadeX = listaDeTiturecos.pesquisaAtrativosDaCidade(cidadePesquisa, estadoPesquisa);
                    StringBuilder mensagemPesquisaAtrativos = new StringBuilder();
                    for (AtrativoTuristico a : atrativosdaCidadeX) {
                        mensagemPesquisaAtrativos.append(a.getNome()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, "Nomes dos Atrativos da cidade "+ cidadePesquisa + ": " + mensagemPesquisaAtrativos, "Pesquisar Atrativos da Cidade", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "3":
                    List<AtrativoTuristico> listaFinalAtrativos = listaDeTiturecos.getAtrativos();
                    StringBuilder mensagemFinalAtrativos = new StringBuilder();
                    for (AtrativoTuristico a : listaFinalAtrativos) {
                        mensagemFinalAtrativos.append(a.getNome()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, "Nomes de Todos os Atrativos: \n" + mensagemFinalAtrativos, "Listar Todos os Atrativos", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case "4":
                    String nomeApagar = JOptionPane.showInputDialog("Qual o nome do atrativo que você quer apagar?");
                    String cidadeApagar = JOptionPane.showInputDialog("Para confirmar, qual o nome da cidade do atrativo?");
                    String estadoApagar = JOptionPane.showInputDialog("Terminando, qual o nome do estado do atrativo?");
                    boolean resultadoApagar = listaDeTiturecos.apagarAtrativo(nomeApagar, cidadeApagar, estadoApagar);
                    if (resultadoApagar) {
                        JOptionPane.showMessageDialog(null,"Atrativo apagado com sucesso","Apagar Atrativo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,"Atrativo não encontrado","Apagar Atrativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case "5":
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida ou Inexistente! Favor escolher uma das opções apresentadas", "OPÇÃO NÃO ENCONTRADA", JOptionPane.INFORMATION_MESSAGE);
                    break;





            }
        }
    }
}
