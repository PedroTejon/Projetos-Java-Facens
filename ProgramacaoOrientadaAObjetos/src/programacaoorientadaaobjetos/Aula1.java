package programacaoorientadaaobjetos;

import javax.swing.JOptionPane;

public class Aula1 {
    public static void main(String[] args) {
        //Aluno aluno1 = new Aluno();
        
        //aluno1.setRa("235001");
        //aluno1.setNome("Pedro");
        //aluno1.setCurso("ADS");
        
        // JOptionPane.showMessageDialog(null, aluno1.imprimir());
        
        Aluno aluno = null;
        String ra, nome, curso;
        
        int opc = 0;
        while (opc != 3) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione uma opção:\n1 - Cadastrar aluno\n2 - Mostrar aluno\n3 - Sair"));
            switch (opc) {
                case 1: 
                    ra = JOptionPane.showInputDialog(null, "Digite o RA do aluno:");
                    nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno:");
                    curso = JOptionPane.showInputDialog(null, "Digite o curso do aluno:");
                    
                    aluno = new Aluno();
                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setCurso(curso);
                    break;
                case 2: 
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "Aluno não definido");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, aluno.imprimir());
                    }
                    break;
                case 3: 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }
}