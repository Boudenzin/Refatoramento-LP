class Filme {
    String titulo;
    int duracaomin;
    String genero;

    void tocarFilme() {
    System.out.println("O filme iniciou");
    }
}
public class Laconchadelalora {
    public static void main (String[] args) {
        Filme primeiro = new Filme();
        primeiro.titulo = "A volta dos que não foram";
        primeiro.duracaomin = 120;
        primeiro.genero = "Comédia e Aventura";
        Filme segundo = new Filme();
        segundo.titulo = "Se7en";
        segundo.duracaomin = 127;
        segundo.genero = "Policial";
        Filme terceiro = new Filme();
        terceiro.titulo = "A chuva molhada";
        terceiro.duracaomin = 187;
        terceiro.genero = "Ação";

    }
}