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
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Tipo:\n1 - Graduação\n2 - Pós Graduação"));
                    
                    ra = JOptionPane.showInputDialog("RA: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    curso = JOptionPane.showInputDialog("Curso: ");
                    if (opc == 1) {
                        conclusao = JOptionPane.showInputDialog("Ano de Conclusão do Ensino Médio: ");
                                
                        alunos.add(new AlunoGraduacao(ra, nome, curso, conclusao));
                    } else {
                        conclusao = JOptionPane.showInputDialog("Ano de Conclusão da Graduação: ");
                                
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
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
