package Controller;

import DAO.CadMuscDAO;
import DAO.ExcMuscDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import Model.CadMus;
import Model.ExcMus;
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
}