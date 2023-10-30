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
                                
                        alunos.add(new AlunoGraduacao(conclusao, nome, curso, ra));
                    } else {
                        conclusao = JOptionPane.showInputDialog("Ano de Conclusão da Graduação: ");
                                
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
                    JOptionPane.showMessageDialog(null, "Opção Inválida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
