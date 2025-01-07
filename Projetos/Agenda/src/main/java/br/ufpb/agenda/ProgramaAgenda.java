package br.ufpb.agenda;

import javax.swing.JOptionPane;
public class ProgramaAgenda {
    public static void main(String [] args) {
        int maxContatos = 1000;
        AgendaEnderecos agenda = new AgendaEnderecos(maxContatos);
        boolean sair = false;
        String nomeContato;
        Endereco enderecoAchado;
        while (!sair) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    """
                            Digite uma opção:
                            1.Cadastrar contato
                            2.Pesquisa endereço
                            3.Pesquisa número de contatos do bairro
                            4.Apaga contato
                            5.Mudar Nome
                            6.Mudar Endereço
                            7.Sair
                            """));
            switch(opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Qual o nome?");
                    String logradouro = JOptionPane.showInputDialog("Qual o logradouro (Rua, Av...)?");
                    String numero = JOptionPane.showInputDialog("Qual o número?");
                    String bairro = JOptionPane.showInputDialog("Qual o bairro?");
                    Endereco end = new Endereco(logradouro,numero,bairro,"João Pessoa","Paraíba");
                    Contato c = new Contato(nome, end);
                    agenda.cadastraContato(c);
                    break;
                case 2:
                    nomeContato = JOptionPane.showInputDialog("Qual o nome do contato?");
                    enderecoAchado = agenda.pesquisaEndereco(nomeContato);
                    if (enderecoAchado!=null) {
                        JOptionPane.showMessageDialog(null, enderecoAchado.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "Contato não encontrado");
                    }
                    break;
                case 3:
                    String nomeBairro = JOptionPane.showInputDialog("Qual bairro?");
                    int numContatosBairro = agenda.pesquisarQuantidadeDeContatosDoBairro(nomeBairro);
                    JOptionPane.showMessageDialog(null, "Quantidade:"+numContatosBairro);
                    break;
                case 4:
                    String nomeContatoApagar = JOptionPane.showInputDialog("Qual o nome do contato?");
                    boolean apagou = agenda.apagaContato(nomeContatoApagar);
                    if (apagou) {
                        JOptionPane.showMessageDialog(null, "Contato removido com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha: Contato não encontrado.");
                    }
                    break;
                case 5:
                    String nomeProcura = JOptionPane.showInputDialog("Digite o nome que quer mudar");
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome");
                    Contato contatoNome = agenda.mudaNome(nomeProcura, novoNome);
                    if (contatoNome != null) {
                        JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Contato não encontrado");
                    }
                    break;
                case 6:
                    nomeContato = JOptionPane.showInputDialog("Qual o nome do contato?");
                    enderecoAchado = agenda.pesquisaEndereco(nomeContato);
                    if (enderecoAchado!=null) {
                        String logradouroNovo = JOptionPane.showInputDialog("Qual o logradouro (Rua, Av...)?");
                        String numeroNovo = JOptionPane.showInputDialog("Qual o número?");
                        String bairroNovo = JOptionPane.showInputDialog("Qual o bairro?");
                        Endereco novoEndereco = new Endereco(logradouroNovo,numeroNovo,bairroNovo,"João Pessoa", "Paraíba");
                        agenda.mudaEndereco(nomeContato,novoEndereco);
                        JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Contato não encontrado");
                    }
                    break;
                case 7:
                    sair = true;
                    break;
            }

        }
        JOptionPane.showMessageDialog(null, "Até mais!");
    }
}

