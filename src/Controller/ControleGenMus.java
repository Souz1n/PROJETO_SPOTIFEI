package Controller;

import DAO.*;
import java.sql.Connection;
import java.sql.SQLException;
import Model.*;
import View.telaCadExcMus;
import View.telaMenuAdm;

public class ControleGenMus {
    
    private telaCadExcMus view;
    
    public ControleGenMus(telaCadExcMus view){
        this.view = view;
    }
    
    public void cadastrarMusica() {
        String nome = view.getTxt_cadMusNam().getText();
        String genero = view.getTxt_cadMusGener().getText();
        int ano = Integer.parseInt(view.getTxt_cadMusAno().getText());
        String nomeArtista = view.getTxt_cadMusArt().getText();

        try (Connection conn = new Conexao().getConnection()) {
            SourceArtPorIdDAO artistaDAO = new SourceArtPorIdDAO(conn);
            int idArtista = artistaDAO.buscarIdArtistaPorNome(nomeArtista);
            if (idArtista == -1) {
                view.getLbl_cadMusResult().setText("Artista não encontrado!");
                return;
            }

            CadMus musica = new CadMus(nome, genero, ano, idArtista);
            CadMuscDAO musicaDAO = new CadMuscDAO(conn);
            musicaDAO.inserir(musica);

            view.getLbl_cadMusResult().setText("Música cadastrada com sucesso!");
        } catch (SQLException e) {
            view.getLbl_cadMusResult().setText("Erro: " + e.getMessage());
        }
    }
    
    public void removerMusica(){
    int id_musica = Integer.parseInt(view.getTxt_excMusIdMus().
                    getText());

    ExcMus musica = new ExcMus();
    musica.setId_Musica(id_musica);
    

        try{
            Connection conn = new Conexao().getConnection();
            ExcMuscDAO dao = new ExcMuscDAO(conn);
            dao.remover(musica);
            view.getLbl_excMusResult().setText("Musica excluida com "
                    + "sucesso!");
        }
        catch(SQLException e){
            view.getLbl_excMusResult().setText("Erro ao excluir musica:" + 
                    e.getMessage());
            System.out.println("erro; " + e.getMessage());
        }
    }
    
    public void consultarIdMusica() {
        String nomeMusica = view.getTxt_consMusNam().getText();
        String artista = view.getTxt_consMusArt().getText();
        
        ConsMus musica = new ConsMus();
        musica.setNome_musica(nomeMusica);
        

        try {
            Connection conn = new Conexao().getConnection();
            ConsMuscDAO dao = new ConsMuscDAO(conn);
            int id = dao.consultarIdMusica(nomeMusica, artista);

            if (id != -1) {
                view.getLbl_consMusResult().setText(String.valueOf(id));
            } else {
                view.getLbl_consMusResult().setText("Música não encontrada.");
            }

        } catch (SQLException e) {
            view.getLbl_consMusResult().setText("Erro ao consultar: " + e.getMessage());
        }
    }
    
 
    
    public void voltaMenu(){
        telaMenuAdm tma = new telaMenuAdm();
        tma.setVisible(true);
        view.dispose();
    }
}