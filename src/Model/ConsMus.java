
package Model;

public class ConsMus{
    String nome_musica, artista;

    public ConsMus() {
    }

    public ConsMus(String nome_musica, String artista) {
        this.nome_musica = nome_musica;
        this.artista = artista;
    }

    public String getNome_musica() {
        return nome_musica;
    }

    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    
    
}