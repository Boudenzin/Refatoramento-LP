package br.romildo.barbearia.cabelo;
import java.util.ArrayList;
import java.util.List;
public class CadastroList {

    private List<Cadastro> clientes;
    private double dinheiroTotal;

    public CadastroList() {
        this.clientes = new ArrayList<>();
    }

    public boolean cadastrarCliente (Cadastro f) {
        if (this.clientes.contains(f)) {
            return false;
        }
        this.clientes.add(f);
        return true;
    }

    public void imprimirFila() {
        for (Cadastro c : clientes) {
            System.out.println(c);
        }
    }

    public boolean apagarCliente(String nome) {
        for (Cadastro c : clientes) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                clientes.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean fecharAtendimento() {
        if (clientes.isEmpty()) {
            return false;
        }
        clientes.remove(0);
        return true;
    }



}
