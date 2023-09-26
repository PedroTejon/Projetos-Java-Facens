package lista4;

public class AlunoPosGraduacao extends Aluno {
    private String anoConclusaoGraduacao;

    public String getAnoConclusaoGraduacao() {
        return anoConclusaoGraduacao;
    }

    public void setAnoConclusaoGraduacao(String anoConclusaoGraduacao) {
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }
    
    public AlunoPosGraduacao() {
    }

    public AlunoPosGraduacao(String ra, String nome, String curso, String anoConclusaoGraduacao) {
        super(ra, nome, curso);
        this.anoConclusaoGraduacao = anoConclusaoGraduacao;
    }

    @Override
    public String toString() {
        return "RA: %s\nNome: %s\nCurso: %s\nAno de Conclus�o Gradua��o: %s".format(this.getRa(), this.getNome(), this.getCurso(), anoConclusaoGraduacao);
    }
}
