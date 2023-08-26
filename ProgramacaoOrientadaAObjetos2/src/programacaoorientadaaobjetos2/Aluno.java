package programacaoorientadaaobjetos2;

public class Aluno {
    private int ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }
    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }
    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }
    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }
    public void setAf(float af) {
        this.af = af;
    }
    
    public float calcularMedia() {
        return (float)((ac1 * 0.15) + (ac2 * 0.3) + (ag * 0.1) + (af * 0.45));
    }
    
    public String verificarAprovacao(){
        if (calcularMedia() >= 5) 
            return "Aprovado";
        else
            return "Reprovado";
    }
        
    public String imprimir(){
        return "RA: %d\nNome: %s\nAC1: %.2f\nAC2: %.2f\nAG: %.2f\nAF: %.2f\nMédia: %.2f\nSituação: %s".formatted(this.ra, this.nome, this.ac1, this.ac2, this.ag, this.af, calcularMedia(), verificarAprovacao());
    }
}
