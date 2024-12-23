package br.ufpb.dcx.ex7;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraDeAreas {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Quadrado(2));
        figuras.add(new Triangulo(2,3));
        figuras.add(new Quadrado(4));
        figuras.add(new Quadrado(10));
        figuras.add(new Triangulo(5,2));
        figuras.add(new Triangulo(10,4));
        double areaTotal = 0.0;
        for (Figura f : figuras) {
            System.out.println(f.calcularArea());
            areaTotal += f.calcularArea();
        }
        System.out.printf("Área total: %.1f\n", areaTotal);
    }
}
