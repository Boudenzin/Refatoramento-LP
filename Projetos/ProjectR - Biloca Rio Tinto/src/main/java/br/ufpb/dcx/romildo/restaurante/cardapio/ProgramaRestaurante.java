package br.ufpb.dcx.romildo.restaurante.cardapio;

import java.util.Scanner;
public class ProgramaRestaurante {

    public static void main (String[] args) {
        System.out.println("Sistema de Menu");
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos itens:");
        int quantItens = Integer.parseInt(sc.nextLine());
        ItemDePedido [] itensDoMenu = new ItemDePedido[quantItens];
        for (int k=0; k<quantItens; k++) {
            ItemDePedido item = new ItemDePedido();
            System.out.println("Qual o nome?");
            item.setNome(sc.nextLine());
            System.out.println("Qual o tipo? (BEBIDA, LANCHE, REFEIÇÃO)");
            item.setTipo(sc.nextLine());
            System.out.println("Qual o preço?");
            item.setPreco(Double.parseDouble(sc.nextLine()));
            itensDoMenu[k] = item;

        }
        imprimirCardapio(itensDoMenu);
        sc.close();
    }

    public static void imprimirCardapio(ItemDePedido [] itensdoMenu) {
        System.out.println("Cardápio:");
        for (int k = 0; k < itensdoMenu.length; k++) {
            System.out.println(itensdoMenu[k].toString());
        }
    }
}
