package Model;

public class SessaoUsuario {
    int id_usuario, id_musica;
    public static String nome_user;

    public SessaoUsuario() {
    }

    public SessaoUsuario(int id_usuario, int id_musica, String nome_user) {
        this.id_usuario = id_usuario;
        this.id_musica = id_musica;
        this.nome_user = nome_user;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_musica() {
        return id_musica;
    }

    public void setId_musica(int id_musica) {
        this.id_musica = id_musica;
    }

    public static String getNome_user() {
        return nome_user;
    }

    public static void setNome_user(String nome_user) {
        SessaoUsuario.nome_user = nome_user;
    }

    
    
    
}

