package programacaoorientadaaobjetos2;

import java.util.UUID;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        
        curso.setNome("ADS");
        curso.setDuracao(5);
        curso.setCodigo(UUID.randomUUID());
        
        JOptionPane.showMessageDialog(null, curso.imprimir());
    }
}
