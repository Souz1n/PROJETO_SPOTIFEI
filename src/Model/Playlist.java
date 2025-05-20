package Model;

public class Playlist {
    private int id;
    private int idUsuario;
    private int idMusica;
    private String nomePlaylist;

    public Playlist() {}

    public Playlist(int idUsuario, int idMusica, String nomePlaylist) {
        this.idUsuario = idUsuario;
        this.idMusica = idMusica;
        this.nomePlaylist = nomePlaylist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(int idMusica) {
        this.idMusica = idMusica;
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }
    
}
