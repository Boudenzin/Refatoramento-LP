package br.ufpb.dcx.ex7;

public class Quadrado implements Figura {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    public Quadrado() {
        this(0.0);
    }
    public double calcularArea() {
        return Math.pow(lado,2);
    }
    public double getLado()  {
        return this.lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

}
