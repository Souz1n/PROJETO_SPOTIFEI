package Model;

public class Playlist {
    public int id_usuario;
    public int id_playlist;
    public String nome;

    public Playlist() {}

    public Playlist(int idUsuario, int idPlaylist, String nomePlaylist) {
        this.id_usuario = idUsuario;
        this.id_playlist = idPlaylist;
        this.nome = nomePlaylist;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_playlist() {
        return id_playlist;
    }

    public void setId_playlist(int id_playlist) {
        this.id_playlist = id_playlist;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
