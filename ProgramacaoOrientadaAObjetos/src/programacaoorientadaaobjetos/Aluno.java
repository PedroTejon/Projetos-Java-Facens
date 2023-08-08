package programacaoorientadaaobjetos;

public class Aluno {
    private String ra;
    private String nome;
    private String curso;
    
    public void setRa(String ra) {
        this.ra = ra;
    }
    
    public String getRa() {
        return this.ra;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getCurso() {
        return this.curso;
    }
  
    public String imprimir() {
        return "RA: %s\nNome: %s\nCurso: %s".formatted(this.ra, this.nome, this.curso);
    }
}
