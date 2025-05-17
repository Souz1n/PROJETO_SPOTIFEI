package Model;

public class CadArt {
    
    String nome, banda, email;
    int id_pessoa;

    public CadArt() {
    }

    public CadArt(String nome, String banda, String email, int id_pessoa) {
        this.nome = nome;
        this.banda = banda;
        this.email = email;
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }
    
    
    
}
