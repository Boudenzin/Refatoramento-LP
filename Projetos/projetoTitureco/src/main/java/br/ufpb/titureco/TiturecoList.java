package br.ufpb.titureco;
import java.util.ArrayList;
import java.util.List;
public class TiturecoList implements TiturecoInterface{
    private List<AtrativoTuristico> atrativos;

    public TiturecoList() {
        this.atrativos = new ArrayList<>();
    }
    public boolean cadastrarAtrativo(AtrativoTuristico atrativo) {
        if (atrativos.contains(atrativo)) {
            return false;
        }
        atrativos.add(atrativo);
        return true;

    }
    public boolean apagarAtrativo(String nomeAtrativo, String cidade, String estado) {
        for (AtrativoTuristico atrativo : atrativos) {
            if (atrativo.getNome().equals(nomeAtrativo) &&
                atrativo.getCidade().equals(cidade) &&
                atrativo.getEstado().equals(estado)) {

                atrativos.remove(atrativo);
                return true;
            }
        }

        return false;
    }
    public List <AtrativoTuristico> getAtrativos() {
        return this.atrativos;
    }
    public List<AtrativoTuristico> pesquisaAtrativosDaCidade(String cidade, String estado) {
        List<AtrativoTuristico> atrativosCidadePesquisada = new ArrayList<>();
        for (AtrativoTuristico atrativo : atrativos) {
            if (atrativo.getCidade().equals(cidade) &&
                atrativo.getEstado().equals(estado)) {

                atrativosCidadePesquisada.add(atrativo);
            }
        }

        return atrativosCidadePesquisada;
    }
}
