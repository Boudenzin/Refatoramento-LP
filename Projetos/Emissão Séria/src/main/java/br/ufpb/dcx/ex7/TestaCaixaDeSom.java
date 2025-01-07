package br.ufpb.dcx.ex7;

public class TestaCaixaDeSom {

    public static void main(String[] args) {
        CaixaDeSom caixa = new CaixaDeSom();
        caixa.adicionarEmissor(new Cachorro("Bob"));
        caixa.adicionarEmissor(new Tambor("P", "Giannini"));
        caixa.adicionarEmissor(new Cachorro("Rulph"));
        caixa.adicionarEmissor(new Tambor("M","Brazucapas"));
        caixa.adicionarEmissor(new Cachorro("Mel"));
        caixa.tocarTodosOsEmissores();
    }

}
