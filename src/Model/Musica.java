/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getCurtidas() { return curtidas; }

    @Override
    public String toString() {
        return nome + " - Curtidas: " + curtidas;
    }
}
