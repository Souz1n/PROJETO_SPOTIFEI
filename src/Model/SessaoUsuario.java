package Model;

public class SessaoUsuario {
    public static int id_usuario;
    public static int id_musica;
    public static String nome_user;

    public SessaoUsuario() {}

    public SessaoUsuario(int id_usuario, int id_musica, String nome_user) {
        SessaoUsuario.id_usuario = id_usuario;
        SessaoUsuario.id_musica = id_musica;
        SessaoUsuario.nome_user = nome_user;
    }

    public static int getId_usuario() {
        return id_usuario;
    }

    public static void setId_usuario(int id_usuario) {
        SessaoUsuario.id_usuario = id_usuario;
    }

    public static int getId_musica() {
        return id_musica;
    }

    public static void setId_musica(int id_musica) {
        SessaoUsuario.id_musica = id_musica;
    }

    public static String getNome_user() {
        return nome_user;
    }

    public static void setNome_user(String nome_user) {
        SessaoUsuario.nome_user = nome_user;
    }
}

