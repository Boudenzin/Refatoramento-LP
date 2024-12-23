package br.ufpb.dcx.romildo.banco;

import java.util.ArrayList;
public class Banco {

    private String cnpj;
    private String nome;
    private ArrayList<Conta> contas;

    public Banco (String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public Banco () {
        this("","");
    }

    public String getNome() {
        return this.nome;
    }
    public void abrirConta(String cpf, double saldo, String numeroConta) {
        Conta c = new Conta(cpf, saldo, numeroConta);
        this.contas.add(c);
    }

    public ArrayList<Conta> pesquisaContaspeloCPF(String cpf) {
        ArrayList<Conta> contasPorCpf = new ArrayList<>();
        for (Conta c: this.contas) {
            if(c.getCpfTitular().equals(cpf)) {
                contasPorCpf.add(c);
            }
        }

        return contasPorCpf;
    }

//TODO: EXTRATO, SACAR, DEPOSITAR




}


