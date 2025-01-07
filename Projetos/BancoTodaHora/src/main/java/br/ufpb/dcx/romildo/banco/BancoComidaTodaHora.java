package br.ufpb.dcx.romildo.banco;

import javax.swing.*;
import java.util.ArrayList;

public class BancoComidaTodaHora {
    public static void main (String[] args) {
        Banco bancodeRomildo = new Banco("79.289.700/0001-06", "Banco de Romildo");
        boolean continuar = true;
        while (continuar) {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite uma opção: \n1. Criar conta \n2.Pesquisar contas\n3.Sair"));
            switch (opcao) {
                case 1:
                    String cpf = JOptionPane.showInputDialog("Qual o cpf do titular da conta?");
                    double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo:"));
                    String numeroConta = JOptionPane.showInputDialog("Digite o número da conta: ");
                    bancodeRomildo.abrirConta(cpf,saldo,numeroConta);
                case 2:
                    String cpfPesq = JOptionPane.showInputDialog("Qual o cpf a pesquisar?");
                    ArrayList<Conta> contasAchadas = bancodeRomildo.pesquisaContaspeloCPF(cpfPesq);
                    for (Conta c: contasAchadas) {
                        System.out.println(c.toString());
                    }
                case 3:
                    continuar = false;
            }
        }
    }
}
