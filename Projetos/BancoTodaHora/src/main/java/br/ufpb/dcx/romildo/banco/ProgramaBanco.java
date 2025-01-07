package br.ufpb.dcx.romildo.banco;

import javax.swing.JOptionPane;

public class ProgramaBanco {

    public static void main (String [] args) {

        String cpf = JOptionPane.showInputDialog("Qual o cpf do titular?");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Com quanto patrimônio você quer abrir sua conta?"));
        String numero = JOptionPane.showInputDialog("Qual o número da conta?");
        Conta conta1 = new Conta(cpf,saldo,numero);
        System.out.println(conta1.toString());
        Conta conta2 = new Conta();
        System.out.println(conta2.toString());


    }
}
