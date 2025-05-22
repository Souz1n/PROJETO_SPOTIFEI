package Model;

public class Historico {
    private String nomeMusica;
    private String artista;
    private String status;

    public Historico() {
    }

    public Historico(String nomeMusica, String artista, String status) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
        this.status = status;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
