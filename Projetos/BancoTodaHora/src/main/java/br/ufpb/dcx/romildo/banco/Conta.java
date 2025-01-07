package br.ufpb.dcx.romildo.banco;

public class Conta {

    private String cpfTitular;
    private double saldo;
    private String numeroConta;

    public Conta(String cpf, double saldo, String numero) {
        this.cpfTitular = cpf;
        this.saldo = saldo;
        this.numeroConta = numero;

    }

    public Conta() {
       this("",0.0,"");

    }

    public double getSaldo() {
        return saldo;
    }

    public String getCpfTitular() {
        return this.cpfTitular;
    }

    public double creditar(double value) {
        this.saldo += value;
        return this.saldo;
    }

    public double debitar(double value) {
        this.saldo -= value;
        return this.saldo;
    }

    public String toString() {
        return String.format("""
        Número da conta: %s
        Cpf do Titular: %s
        Saldo da Conta: R$%.2f
                               
        """,this.numeroConta,this.cpfTitular,this.saldo);
    }
}

