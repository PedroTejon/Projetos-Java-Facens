package programaçãoorientadaaobjetos4;

import javax.swing.JOptionPane;


public class ProgramaçãoOrientadaAObjetos4 {
    public static void main(String[] args) {
        Curso c1 = new Curso(1, "ADS", 2400);
        Curso c2 = new Curso(2, "Engenharia", 5800);
        
        Aluno a1 = new Aluno("0001", "Rafael");
        c1.inserirAluno(a1);
        a1 = new Aluno("0002", "José");
        c1.inserirAluno(a1);
        a1 = new Aluno("0003", "Maria");
        c2.inserirAluno(a1);
        
        JOptionPane.showMessageDialog(null, c1.imprimirCompleto());
        JOptionPane.showMessageDialog(null, c2.imprimirCompleto()); 
        
    }
}
