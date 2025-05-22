package Controller;

import DAO.*;
import Model.*;
import View.*;
import java.sql.Connection;
import java.sql.SQLException;

public class ControleMenuUser {
    
    private final telaMenuUser view;

    public ControleMenuUser(telaMenuUser view) {
        this.view = view;
    }
    
    public ControleMenuUser(telaMenuUser view, String nomeUsuario) {
    this.view = view;
}

    public void consultarMusica() {  
        String nomeMusica = view.getTxt_barraPesquisaMus().getText().trim();

        try {
            Connection conn = new Conexao().getConnection();
            SourceMusDAO dao = new SourceMusDAO(conn);
            SourMus musica = dao.consultarMus(nomeMusica);

            if (musica != null && musica.getNome_musica() != null) {
                view.getPn_infoMus().setVisible(true);            
                view.getLbl_sourcNomeMusRes().setText(nomeMusica);
                view.getLbl_sourceMusAnoRes().setText(String.valueOf(musica.getAno()));
                view.getLbl_sourceMusGenRes().setText(musica.getGenero());
                view.getLbl_sourceMusArtRes().setText(musica.getArtista());
                view.getLbl_sourMusStatusBarra().setText(""); 
                view.getLbl_sourMusStatus().setText("");
            } else {
                view.getLbl_sourMusStatusBarra().setText("Música não encontrada.");
            }

        } catch (SQLException e) {
            view.getLbl_sourMusStatusBarra().setText("Erro ao consultar: " + e.getMessage());
        }
    }
    public void curtirMusica(String nomeMusica) {
        try {
            try (Connection conn = new Conexao().getConnection()) {
                CurtidaDAO dao = new CurtidaDAO(conn);
                
                String nomeUsuario = SessaoUsuario.nome_user;
                int idUsuario = dao.buscarIdUsuarioPorNome(nomeUsuario);
                int idMusica = dao.buscarIdMusicaPorNome(nomeMusica.trim());
                
                if (idMusica == -1 || idUsuario == -1) {
                    System.out.println("Música ou usuário não encontrado.");
                    return;
                }
                
                // Verifica se o usuário já curtiu
                if (dao.usuarioJaCurtiu(idMusica, idUsuario)) {
                    view.getLbl_sourMusStatus().setText("Você já curtiu esta música!");
                } else {
                    dao.registrarCurtida(idMusica, idUsuario, true);
                    view.getLbl_sourMusStatus().setText("Música curtida com sucesso!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao curtir música: " + e.getMessage());
        }
    }


    public void descurtirMusica(String nomeMusica) {
        try {
            try (Connection conn = new Conexao().getConnection()) {
                CurtidaDAO dao = new CurtidaDAO(conn);
                
                String nomeUsuario = SessaoUsuario.nome_user;
                int idUsuario = dao.buscarIdUsuarioPorNome(nomeUsuario);
                int idMusica = dao.buscarIdMusicaPorNome(nomeMusica.trim());
                
                if (idMusica == -1 || idUsuario == -1) {
                    System.out.println("Música ou usuário não encontrado.");
                    return;
                }
                
                // Verifica se o usuário já curtiu
                if (dao.usuarioJaCurtiu(idMusica, idUsuario)) {
                    view.getLbl_sourMusStatus().setText("Você já descurtiu "
                            + "esta música!");
                } else {
                    dao.registrarCurtida(idMusica, idUsuario, true);
                    view.getLbl_sourMusStatus().setText("Música descurtida com "
                            + "sucesso!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao descurtir música: " + e.getMessage());
        }
    }
    
//    public void abrirHistorico() {
//    telaHistoricoUser thu = new telaHistoricoUser();
//    ControleHistoricoUser chu = new ControleHistoricoUser(thu, nomeUsuarioLogado);
//    thu.setVisible(true);
//    view.dispose();
//    }
    
    public void InserirHistoricoMusica() {
        String nome = view.getTxt_barraPesquisaMus().getText();
        int id_user = SessaoUsuario.getId_usuario();
        String tipo = "source";
        
        Historico insHistorico = new Historico();
        
        insHistorico.setNome(nome);

        try {
            Connection conn = new Conexao().getConnection();
            HistoricoDAO dao = new HistoricoDAO(conn);
            dao.inserirHistorico(nome, id_user, tipo);
            conn.close();
            
        } catch (SQLException e) {
            System.out.println("Erro ao enviar histórico: " + e.getMessage());
        }
    }   
    
    public void InserirHistoricoCurtida() {
        String nome = view.getTxt_barraPesquisaMus().getText();
        int id_user = SessaoUsuario.getId_usuario();
        String tipo = "curtida";
        
        Historico insHistorico = new Historico();
        
        insHistorico.setNome(nome);

        try {
            Connection conn = new Conexao().getConnection();
            HistoricoDAO dao = new HistoricoDAO(conn);
            dao.inserirHistorico(nome, id_user, tipo);
            conn.close();
            
        } catch (SQLException e) {
            System.out.println("Erro ao enviar histórico: " + e.getMessage());
        }
    }   
    
        public void InserirHistoricoDescurtida() {
        String nome = view.getTxt_barraPesquisaMus().getText();
        int id_user = SessaoUsuario.getId_usuario();
        String tipo = "descurtida";
        
        Historico insHistorico = new Historico();
        
        insHistorico.setNome(nome);

        try {
            Connection conn = new Conexao().getConnection();
            HistoricoDAO dao = new HistoricoDAO(conn);
            dao.inserirHistorico(nome, id_user, tipo);
            conn.close();
            
        } catch (SQLException e) {
            System.out.println("Erro ao enviar histórico: " + e.getMessage());
        }
    }   
        
        
    public boolean VerificarCurtirMusica(String nome_musica) {
        int id_usuario = SessaoUsuario.getId_usuario();
        try {
            Connection conn = new Conexao().getConnection();
            HistoricoDAO dao = new HistoricoDAO(conn);
            return !dao.existeCurtida(id_usuario, nome_musica);
        } catch (SQLException e) {
            System.out.println("Erro ao curtir música: " + e.getMessage());
        }
        return false;
    }
    
    public void sairSource() {
        view.getPn_infoMus().setVisible(false);
    }

    public void voltarLog() {
        view.dispose();
        new View.telaLogCad().setVisible(true);
    }
    
    public void fechar() {
        view.dispose();
    }
    
    public void Historico() {
        view.dispose();
        new View.telaHistoricoUser().setVisible(true);
    }
}
