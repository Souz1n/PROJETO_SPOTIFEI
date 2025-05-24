package Controller;

import DAO.Conexao;
import DAO.PlaylistDAO;
import View.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import Model.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class ControlePlaylistUser {

    telaPlaylistUser view;
    private List<Playlist> playlists;
    private List<Musica> musicasPlaylists;

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
            
            this.playlists = dao.listarTodasPlaylist(id_user);  


            DefaultListModel<String> modelo = new DefaultListModel<>();
            for (Playlist p : playlists) {
                modelo.addElement(p.getNome());
            }

            view.getJl_delPlaylist().setModel(modelo);
            view.getJl_editPlaylist().setModel(modelo);

            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao carregar playlists: " + e.getMessage());
        }
    }
    
    public void removerPlaylistSelecionada() {
        String nomeSelecionado = view.getJl_delPlaylist().getSelectedValue();

        if (nomeSelecionado == null) {
            JOptionPane.showMessageDialog(view, "Selecione uma playlist para remover.");
            return;
        }

        Playlist selecionada = null;
        for (Playlist p : playlists) {
            if (p.getNome().equals(nomeSelecionado)) {
                selecionada = p;
                break;
            }
        }

        if (selecionada == null) {
            view.getLbl_genDelPRes().setText("Playlist não encontrada"              
            + selecionada);
            return;
        }

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);
            dao.removerPlaylist(selecionada);
            conn.close();

            view.getLbl_genDelPRes().setText("Playlist removida com sucesso");

            carregarPlaylist(); // atualiza a lista após remoção
        } catch (SQLException e) {
            System.out.println("Playlist nao encontrada: " + e.getMessage());
        }
    }
    
    public void voltarMenu(){
        telaMenuUser tmu = new telaMenuUser();
        tmu.setVisible(true);
        view.dispose();//fecha o menu
    }
    
    public void abrirEditarPlaylist() {  
        int id_user = SessaoUsuario.getId_usuario();
        String nomePlaylist  = view.getJl_editPlaylist().getSelectedValue();
                
        if (nomePlaylist == null) {
            JOptionPane.showMessageDialog(view, "Selecione uma "
                                               + "playlist para editar.");
            return;
        }
        
        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);
            Playlist play = dao.verificarPlaylist(nomePlaylist, id_user);

            if (play != null && play.getNome() != null) {
                view.getPn_editMusP().setVisible(true);            
                view.getLbl_editPlaylTit().setText(nomePlaylist);
            } else {
                view.getLbl_editPlayRes().setText("Playlist não encontrada.");
            }

        } catch (SQLException e) {
            view.getLbl_editPlayRes().setText("Erro ao buscar: " 
                                              + e.getMessage());
        }
    }
    
    public void carregarMusica() {
        int id_user = SessaoUsuario.getId_usuario();
        int id_playlist = Playlist.getId_playlist();

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);
            
            this.musicasPlaylists = dao.listAllMusPlay(id_user, id_playlist);  


            DefaultListModel<String> modelo = new DefaultListModel<>();
            for (Musica p : musicasPlaylists) {
                modelo.addElement(p.getNome());
            }

            view.getJl_musPlaylist().setModel(modelo);

            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao carregar playlists: " + e.getMessage());
        }
    }
    

    public void adicionarMusicaNaPlaylist() {
        String nome_musica = view.getTxt_nameMusPlaylistEdit().getText();
        int id_usuario = SessaoUsuario.getId_usuario();
        int id_playlist = Playlist.getId_playlist();

        try {
            Connection conn = new Conexao().getConnection(); 
            PlaylistDAO dao = new PlaylistDAO(conn);         

            boolean sucesso = dao.adicionarMusicaNaPlaylist(nome_musica, 
            id_playlist, id_usuario);
            if (sucesso) {
                view.getLbl_editPlayRes().setText("Musica adicionada");
            } else {
                view.getLbl_editPlayRes().setText("Musica ja adicionada");
            }
        } catch (SQLException e) {
             System.out.println("Música não encontrada: " + id_usuario);
            System.out.println("Música não encontrada: " + e.getMessage());
        }
    }
    
    public void removerMusicaNaPlaylist() {
        String nome_musica = view.getTxt_nameMusPlaylistEdit().getText();
        int id_usuario = SessaoUsuario.getId_usuario();
        int id_playlist = Playlist.getId_playlist();

        try {
            Connection conn = new Conexao().getConnection(); 
            PlaylistDAO dao = new PlaylistDAO(conn);         

            boolean sucesso = dao.removerMusicaNaPlaylist(nome_musica, 
            id_playlist, id_usuario);
            if (sucesso) {
                view.getLbl_editPlayRes().setText("Musica excluida");
            } else {
                view.getLbl_editPlayRes().setText("Escreva o nome no campo acima");
            }
        } catch (SQLException e) {
             System.out.println("Música não encontrada C: " + id_usuario);
            System.out.println("Música não encontrada C: " + e.getMessage());
        }
    }
    
    
}   
