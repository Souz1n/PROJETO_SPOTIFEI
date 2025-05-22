package Model;

public class Historico {
    public String nome;
    public int id_usuario;
    public String tipo;

    public Historico() {
    }

    public Historico(String nome, int id_usuario, String tipo) {
        this.nome = nome;
        this.id_usuario = id_usuario;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
