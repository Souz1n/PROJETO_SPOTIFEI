package Controller;

import DAO.CadMuscDAO;
import DAO.ExcMuscDAO;
import DAO.ConsMuscDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import Model.CadMus;
import Model.ExcMus;
import Model.ConsMus;
import View.telaCadExcMus;

public class ControleGenMus {
    
    private telaCadExcMus view;
    
    public ControleGenMus(telaCadExcMus view){
        this.view = view;
    }
    public void cadastrarMusica() {
        String nome = view.getTxt_cadMusNam().getText();
        String artista = view.getTxt_cadMusArt().getText();
        int ano = Integer.parseInt(view.getTxt_cadMusAno().getText());

        CadMus musica = new CadMus();
        musica.setNome(nome);
        musica.setArtista(artista);
        musica.setAno(ano);

        try {
            Connection conn = new Conexao().getConnection();
            CadMuscDAO dao = new CadMuscDAO(conn);
            dao.inserir(musica);
            view.getLbl_cadMusResult().setText("Música cadastrada com "
                    + "sucesso!");
        } 
        catch (SQLException e) {
            view.getLbl_cadMusResult().setText("Erro ao cadastrar música: " + 
                    e.getMessage());
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
}