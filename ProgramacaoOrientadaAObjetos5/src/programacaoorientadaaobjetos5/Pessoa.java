package programacaoorientadaaobjetos5;

public class Pessoa {
    private String email;
    private String celular;
    
    public Pessoa() {
        
    }

    public Pessoa(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String toString() {
        return "Celular: " + celular + "\nE-mail: " + email; 
    }
    
    public String imprimir() {
        return "Celular: " + celular + "\nE-mail: " + email; 
    }
}
