package br.ufpb.Samuel.Romildo.banco;

public class Conta {
    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta(String cpf, String numC, String numAg, double saldo) {
        this.cpfTitular = cpf;
        this.numeroConta = numC;
        this.numeroAgencia = numAg;
        this.saldo = saldo;
    }
    public Conta() {
        this("","","",0.0);
    }
    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String toString() {
        return "Conta número " + this.numeroConta + "do cliente de CPF " + this.cpfTitular;
    }
    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }
    public void setCpfTitular(String cpf) {
        this.cpfTitular = cpf;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public double creditar(double deposito) {
        this.saldo += deposito;
        return this.saldo;

    }

}
