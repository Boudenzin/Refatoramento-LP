package br.ufpb.Samuel.Romildo.banco;
import java.util.ArrayList;
public class BancoList {

    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;
    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) { double saldo = 0;
        for (Conta c: this.contas) {
            if(c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)) {
                saldo = c.getSaldo();
                break;
            }
        }
        return saldo;
    }
    public ArrayList <Conta> pesquisarContasComSaldoNegativo(){
        ArrayList<Conta> listadeSaldosNegativos = new ArrayList<>();
        for (Conta c : this.contas){
            if(c.getSaldo()<0){
                listadeSaldosNegativos.add(c);

            }
        }
        return listadeSaldosNegativos;
    }
    public void abrirConta (String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        Conta c = new Conta(cpfTitular, numConta, numAgencia,saldoInicial);
        contas.add(c);
    }
    public void transferir (String numC, String numConta, String numAg, double dinheiro) {
        for (Conta c : this.contas) {
            if (c.getNumeroConta().equalsIgnoreCase(numC)) {
                c.creditar(dinheiro);
            }
        }
    }
}



