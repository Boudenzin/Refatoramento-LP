package br.test.romildo;

import java.util.*;
public class SistemaDeProdutos {

    private List<Produtos> produtos;

    public SistemaDeProdutos() {
        this.produtos = new ArrayList<>();
    }

    public double calculaMaiorPreco () {
        if (!this.produtos.isEmpty()) {
            double precoMaisCaro = this.produtos.get(0).getPreco();
            for (Produtos p : produtos) {
                if (p.getPreco()>precoMaisCaro) {
                    precoMaisCaro = p.getPreco();
                }
            }
            return precoMaisCaro;
        } else {
            throw new ArrayIndexOutOfBoundsException(" A lista está vazia");
        }
    }

    public void cadastraProduto(String nome, double preco) {
        Produtos prod = new Produtos(nome,preco);
        this.produtos.add(prod);
    }
    public List<Produtos> pesquisProdutosMaisBaratosQue(double valor) {
        List <Produtos> produtosBaratos = new ArrayList<>();
        for (Produtos p : this.produtos) {
            if (p.getPreco()<valor) {
                produtosBaratos.add(p);
            }
        }
        return produtosBaratos;
    }
}
