package br.ufpb.titureco;

public class Praia extends AtrativoTuristico{
    private boolean propriaParaBanho;
    private boolean perigoTurabao;
    private String tipoOrla;
    public String TIPO_PISCINAS_NATURAIS = "Piscinas Naturais";
    public String TIPO_ONDAS_FORTES = "Ondas Fortes";
    public String TIPO_ONDAS_MEDIAS = "Ondas Médias";

    public Praia(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado, boolean propriaParaBanho, boolean perigoTubarao, String tipoOrla) {
        super(nome, latitude, longitude, comoChegar, cidade, estado);
        this.propriaParaBanho = propriaParaBanho;
        this.perigoTurabao = perigoTubarao;
        this.tipoOrla = tipoOrla;
    }
    public Praia() {
        super();
        this.propriaParaBanho = false;
        this.perigoTurabao = false;
        this.tipoOrla = "";
    }
    public boolean ehPropriaParaBanho() {
        return this.propriaParaBanho;
    }
    public void setPropriaParaBanho(boolean ehPropria) {
        this.propriaParaBanho = ehPropria;
    }
    public boolean temPerigoTubarao() {
        return this.perigoTurabao;
    }
    public void setPerigoTubarao(boolean temPerigo) {
        this.perigoTurabao = temPerigo;
    }
    public void setTipoOrla(String tipo) {
        this.tipoOrla = tipo;
    }
    public String getTipoOrla() {
        return this.tipoOrla;
    }
}
