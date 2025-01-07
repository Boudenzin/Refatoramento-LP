package br.ufpb.Samuel.Romildo.banco;

import java.util.ArrayList;
public class TestaBanco {

    public static void main (String [] args) {
        BancoList Bancao = new BancoList("Ayla's Bank", "123/321", new ArrayList<>());
        BancoList meuBanco = new BancoList("Romildo & Samuel's Bank", "03.254.319/0001-31",new ArrayList<>());
        meuBanco.abrirConta("052.073.980-91","02067500-5","3572",100000);
        meuBanco.abrirConta("111.111.111-11","222-2","333-3",100);

        Bancao.transferir("02067500-5","222-2","333-3",100);
        System.out.println(meuBanco.consultarSaldoDeConta("02067500-5","3572"));
        ArrayList<Conta> contaNegativas = meuBanco.pesquisarContasComSaldoNegativo();
        for (Conta c : contaNegativas) {
            System.out.println(c);
        }
    }

}

