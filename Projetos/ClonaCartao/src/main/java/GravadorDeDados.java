import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class GravadorDeDados {

    public List<String> recuperaDoc(String nomeArquivo) throws IOException {
        BufferedReader leitor = null;
        List<String> textoLido = new ArrayList<>();
        try {
            leitor = new BufferedReader(new FileReader(nomeArquivo));
            String texto = null;
            do {
                texto = leitor.readLine();
                if (texto != null) {
                    textoLido.add(texto);
                }
            } while (texto != null);
        } finally {
            if (leitor != null) {
                leitor.close();
            }
        }
        return textoLido;
    }

    public void gravaDoc(List<String> texto, String nomeArquivo) throws IOException {
        BufferedWriter gravador = null;
        try  {
            gravador = new BufferedWriter(new FileWriter(nomeArquivo, true));
            for (String s : texto) {
                gravador.write(s+"\n");
            }
        } finally {
            if (gravador != null) {
                gravador.close();
            }
        }
    }
}

