package Controller;

import DAO.*;
import Model.*;
import View.telaHistoricoUser;
import View.telaHistoricoUser;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultListModel;

public class ControleHistoricoUser {
        
    telaHistoricoUser view;

    public ControleHistoricoUser(telaHistoricoUser view) {
        this.view = view;
    }

    public void carregarPlaylistMusica() {
        int id_user = SessaoUsuario.getId_usuario();
        String tipo = "source";

        try {
            Connection conn = new Conexao().getConnection();
            HistoricoDAO dao = new HistoricoDAO(conn);
            List<Historico> todoHistorico = 
            dao.carregarHistorico(id_user, tipo);

            DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Historico p : todoHistorico) {
            String nome = p.getNome();    
            modelo.addElement(nome);
        }

            view.getJl_buscaMusHist().setModel(modelo);

            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro ao carregar playlists: " + e.getMessage());
        }
    }
    
    public void carregarPlaylistCurtida() {
        int id_user = SessaoUsuario.getId_usuario();
        String tipo = "curtida";

    try {
        Connection conn = new Conexao().getConnection();
        HistoricoDAO dao = new HistoricoDAO(conn);
        List<Historico> todoHistorico = dao.carregarHistorico(id_user, tipo);

        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Historico p : todoHistorico) {
            String nome = p.getNome();
            modelo.addElement(nome);
        }

        view.getJl_buscaCurtHist().setModel(modelo);

        conn.close();
    } catch (SQLException e) {
        System.out.println("Erro ao carregar playlists: " + e.getMessage());
    }
    }
    
    public void carregarPlaylistDescurtida() {
        int id_user = SessaoUsuario.getId_usuario();
        String tipo = "descurtida";

        try {
            Connection conn = new Conexao().getConnection();
            HistoricoDAO dao = new HistoricoDAO(conn);
            List<Historico> todoHistorico = 
            dao.carregarHistorico(id_user, tipo);

            DefaultListModel<String> modelo = new DefaultListModel<>();
        for (Historico p : todoHistorico) {
            String nome = p.getNome();    
            modelo.addElement(nome);
        }

            view.getJl_buscaDescHist().setModel(modelo);

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

