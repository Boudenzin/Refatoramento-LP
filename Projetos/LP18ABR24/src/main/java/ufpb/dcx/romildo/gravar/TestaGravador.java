package ufpb.dcx.romildo.gravar;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestaGravador {
    public static void main(String[] args) {
        GravadorDeDados gravador = new GravadorDeDados();
        List<String> texto = new ArrayList<>();
        int linhas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas linhas tem o texto?", "TestaGravador", JOptionPane.INFORMATION_MESSAGE));
        for (int k = 0; k<linhas; k++) {
            texto.add(JOptionPane.showInputDialog(null, "Digite a próxima Linha", "TestaGravador", JOptionPane.INFORMATION_MESSAGE));
        }
        try {
            gravador.gravaTextoEmArquivo(texto, "Doc.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
