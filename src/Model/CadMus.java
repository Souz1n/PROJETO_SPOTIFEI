package Model;
import java.util.Date;

public class CadMus {
    private int id;
    private String nome, Artista;
    private int ano;

    public CadMus() {
    }

    public CadMus(int id, String nome, String Artista, int ano) {
        this.id = id;
        this.nome = nome;
        this.Artista = Artista;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }  
}
