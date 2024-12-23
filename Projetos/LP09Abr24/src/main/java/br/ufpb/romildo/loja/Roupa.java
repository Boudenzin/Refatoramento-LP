package br.ufpb.romildo.loja;

import java.util.Objects;

public class Roupa {
    private String descricao;
    private String cor;
    private String tamanho;
    public static final String COR_AZUL = "AZUL";

    public Roupa(String descricao, String cor, String tamanho) {
        this.descricao = descricao;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Roupa roupa)) return false;
        return Objects.equals(descricao, roupa.descricao) && Objects.equals(cor, roupa.cor) && Objects.equals(tamanho, roupa.tamanho);
    }

    @Override
    public int hashCode() {
        final int prime= 31;
        int result = 1;
        result = prime * result + descricao.hashCode();
        result = prime * result + cor.hashCode();
        result = prime * result + tamanho.hashCode();
        return result;

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamamnho() {
        return tamanho;
    }

    public void setTamamnho(String tamamnho) {
        this.tamanho = tamamnho;
    }
}
