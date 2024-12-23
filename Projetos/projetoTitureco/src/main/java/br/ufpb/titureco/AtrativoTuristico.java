package br.ufpb.titureco;

import java.util.Objects;

public class AtrativoTuristico {

    private String nome;
    private double latitude;
    private double longitude;
    private String comoChegar;
    private String cidade;
    private String estado;

    public AtrativoTuristico(String nome, double latitude, double longitude, String comoChegar, String cidade, String estado) {
         this.nome = nome;
         this.latitude = latitude;
         this.longitude = longitude;
         this.comoChegar = comoChegar;
         this.cidade = cidade;
         this.estado = estado;
    }
    public AtrativoTuristico() {
        this("",0.0, 0.0, "","","");

    }

    @Override
    public int hashCode() {
        int primo = 31;
        int resultado = 1;
        resultado = primo * resultado + ((nome == null) ? 0 : nome.hashCode());
        resultado = primo * resultado + cidade.hashCode();
        resultado = primo * resultado + estado.hashCode();
        return resultado;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AtrativoTuristico that = (AtrativoTuristico) obj;
        return Double.compare(latitude, that.latitude) == 0 && Double.compare(longitude, that.longitude) == 0 && Objects.equals(nome, that.nome) && Objects.equals(comoChegar, that.comoChegar) && Objects.equals(cidade, that.cidade) && Objects.equals(estado, that.estado);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getLatitude() {
        return this.latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public String getComoChegar() {
        return this.comoChegar;
    }
    public void setComoChegar(String comoChegar) {
        this.comoChegar = comoChegar;
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
