/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class SourMus {
    
    String nome_musica, genero, artista;
    int ano;

    public SourMus() {
    }

    public SourMus(String nome_musica, String genero, String artista, int ano) {
        this.nome_musica = nome_musica;
        this.genero = genero;
        this.artista = artista;
        this.ano = ano;
    }

    public String getNome_musica() {
        return nome_musica;
    }

    public void setNome_musica(String nome_musica) {
        this.nome_musica = nome_musica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
