package lista4;

public class AlunoGraduacao extends Aluno {
    private String anoConclusaoEnsinoMedio;

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String anoConclusaoEnsinoMedio, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
    @Override
    public String toString() {
        return "RA: %s\nNome: %s\nCurso: %s\nAno de Conclusão E.M.: %s".format(this.getRa(), this.getNome(), this.getCurso(), anoConclusaoEnsinoMedio);
    }
    
}
