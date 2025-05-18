package Model;

public class CadMus {
    private String nome, artista, genero;
    private int id, ano, id_artista;


    public CadMus() {
    }

    public CadMus(String nome, String genero, int ano, int id_artista) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.id_artista = id_artista;
    }

    
    
    public CadMus(int id, String nome, String artista, int ano, String genero, 
                  int id_artista) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.ano = ano;
        this.id_artista = id_artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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
        return artista;
    }

    public void setArtista(String Artista) {
        this.artista = Artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }  

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }
    
}
