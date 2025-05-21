package Model;

public class Playlist {
    private int id_usuario;
    private int id_musica;
    private String nome;

    public Playlist() {}

    public Playlist(int idUsuario, int idMusica, String nomePlaylist) {
        this.id_usuario = id_usuario;
        this.id_musica = id_musica;
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
