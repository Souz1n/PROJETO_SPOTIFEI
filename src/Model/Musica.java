package Model;

public class Musica {

    private int id;
    private String nome;
    private int curtidas;

    public Musica(int id, String nome, int curtidas) {
        this.id = id;
        this.nome = nome;
        this.curtidas = curtidas;
    }

    public Musica(String nome) {
        this.nome = nome;
    }
    
    

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getCurtidas() { return curtidas; }

    @Override
    public String toString() {
        return nome + " - Curtidas: " + curtidas;
    }
}