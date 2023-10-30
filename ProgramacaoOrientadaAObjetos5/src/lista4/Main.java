package lista4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        int opc = 0;
        String ra, nome, curso, conclusao;
        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir aluno\n2 - Exibir Alunos\n3 - Sair"));
            
            switch (opc) {
                case 1:
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Tipo:\n1 - Gradua��o\n2 - P�s Gradua��o"));
                    
                    ra = JOptionPane.showInputDialog("RA: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    curso = JOptionPane.showInputDialog("Curso: ");
                    if (opc == 1) {
                        conclusao = JOptionPane.showInputDialog("Ano de Conclus�o do Ensino M�dio: ");
                                
                        alunos.add(new AlunoGraduacao(conclusao, nome, curso, ra));
                    } else {
                        conclusao = JOptionPane.showInputDialog("Ano de Conclus�o da Gradua��o: ");
                                
                        alunos.add(new AlunoPosGraduacao(conclusao, ra, nome, curso));
                    }
                    break;
                case 2:
                    String msg = "";
                    for (Aluno aluno : alunos) {                        
                        msg += aluno.toString() + "\n---\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Op��o Inv�lida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
