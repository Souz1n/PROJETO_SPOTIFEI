package Controller;

import DAO.Conexao;
import DAO.PlaylistDAO;
import Model.CadUser;
import View.telaPlayslistUser;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import Model.Playlist;

public class ControlePlaylistUser {

    telaPlayslistUser view;

    public ControlePlaylistUser(telaPlayslistUser view) {
        this.view = view;
    }
    
    public void CriarPlaylist(){
        String nome = view.getTxt_criarPlayNam().getText();

        
        Playlist cadPlaylist = new Playlist();
        
        cadPlaylist.setNome(nome);

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);
            dao.criarPlaylist(nome);
            conn.close();
            view.getLbl_genCriarPRes().setText("Playlist Criada");
        } catch (SQLException e) {
            view.getLbl_genCriarPRes().setText("Erro ao cadastrar playlist: " + 
                    e.getMessage());
        }
    }
}
