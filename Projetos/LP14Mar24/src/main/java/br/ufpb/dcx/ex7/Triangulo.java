package br.ufpb.dcx.ex7;

public class Triangulo implements Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public Triangulo() {
        this(0.0,0.0);
    }
    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2;
    }

    public double getBase() {
        return this.base;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

}
