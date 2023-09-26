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
                                
                        alunos.add(new AlunoGraduacao(ra, nome, curso, conclusao));
                    } else {
                        conclusao = JOptionPane.showInputDialog("Ano de Conclus�o da Gradua��o: ");
                                
                        alunos.add(new AlunoPosGraduacao(ra, nome, curso, conclusao));
                    }
                    break;
                case 2:
                    String msg = "";
                    for (Aluno aluno : alunos) {
                        if (aluno instanceof AlunoGraduacao) {
                            msg += ((AlunoGraduacao) aluno).toString() + "---\n";
                        } else {
                            msg += ((AlunoPosGraduacao) aluno).toString() + "---\n";
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Op��o Inv�lida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
