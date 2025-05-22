package Controller;

import DAO.Conexao;
import DAO.PlaylistDAO;
import View.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import Model.*;
import javax.swing.DefaultListModel;

public class ControlePlaylistUser {

    telaPlaylistUser view;

    public ControlePlaylistUser(telaPlaylistUser view) {
        this.view = view;
    }
    
    public void CriarPlaylist(){
        String nome = view.getTxt_criarPlayNam().getText();
        int id_user = SessaoUsuario.getId_usuario();
        
        Playlist cadPlaylist = new Playlist();
        
        cadPlaylist.setNome(nome);

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);
            dao.criarPlaylist(nome, id_user);
            conn.close();
            view.getLbl_genCriarPRes().setText("Playlist Criada");
        } catch (SQLException e) {
            view.getLbl_genCriarPRes().setText("Erro ao cadastrar playlist: " + 
                    e.getMessage());
        }
    }
    
    public void carregarPlaylist() {
        int id_user = SessaoUsuario.getId_usuario();

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);
            List<Playlist> todasPlaylist = dao.listarTodasPlaylist(id_user);

            DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Playlist p : todasPlaylist) {
           String nome = p.getNome();    
           modelo.addElement(nome);
        }

            view.getJl_delPlaylist().setModel(modelo);
            view.getJl_editPlaylist().setModel(modelo);

            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao carregar playlists: " + e.getMessage());
        }
    }
    

    
    public void voltarLog() {
        view.dispose();
        new View.telaMenuUser().setVisible(true);
    }
    
}
