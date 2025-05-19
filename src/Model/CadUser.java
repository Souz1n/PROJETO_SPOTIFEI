package Model;

public class CadUser {
    private String nome, email, senha;
    private int id_pessoa;

    public CadUser() {
    }

    public CadUser(String nome, String email, int id_pessoa, 
            String senha) {
        this.nome = nome;
        this.email = email;
        this.id_pessoa =  id_pessoa;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
}
