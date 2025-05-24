package Controller;

import DAO.*;
import Model.*;
import View.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Controlador responsável por gerenciar as ações da tela do menu do usuário.
 * Inclui consultas, curtidas, descurtidas e histórico de músicas.
 */
public class ControleMenuUser {
    
    private final telaMenuUser view;

    /**
     * Construtor padrão que associa a tela do menu do usuário a este controlador.
     * @param view Instância da tela do menu do usuário
     */
    public ControleMenuUser(telaMenuUser view) {
        this.view = view;
    }
    
    /**
     * Construtor alternativo (não usa o parâmetro nomeUsuario, mas mantém assinatura).
     * @param view Instância da tela do menu do usuário
     * @param nomeUsuario Nome do usuário logado (não utilizado aqui)
     */
    public ControleMenuUser(telaMenuUser view, String nomeUsuario) {
        this.view = view;
    }

    /**
     * Consulta uma música pelo nome e exibe suas informações na interface.
     */
    public void consultarMusica() {  
        String nomeMusica = view.getTxt_barraPesquisaMus().getText().trim();

        try (Connection conn = new Conexao().getConnection()) {
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

    /**
     * Registra a curtida de uma música para o usuário logado.
     * @param nomeMusica Nome da música a ser curtida.
     */
    public void curtirMusica(String nomeMusica) {
        try (Connection conn = new Conexao().getConnection()) {
            CurtidaDAO dao = new CurtidaDAO(conn);
            String nomeUsuario = SessaoUsuario.nome_user;
            int idUsuario = dao.buscarIdUsuarioPorNome(nomeUsuario);
            int idMusica = dao.buscarIdMusicaPorNome(nomeMusica.trim());

            if (idMusica == -1 || idUsuario == -1) {
                System.out.println("Música ou usuário não encontrado.");
                return;
            }

            if (dao.usuarioJaCurtiu(idMusica, idUsuario)) {
                view.getLbl_sourMusStatus().setText("Você já curtiu esta música!");
            } else {
                dao.registrarCurtida(idMusica, idUsuario, true);
                view.getLbl_sourMusStatus().setText("Música curtida com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao curtir música: " + e.getMessage());
        }
    }

    /**
     * Registra a descurtida de uma música para o usuário logado.
     * @param nomeMusica Nome da música a ser descurtida.
     */
    public void descurtirMusica(String nomeMusica) {
        try (Connection conn = new Conexao().getConnection()) {
            CurtidaDAO dao = new CurtidaDAO(conn);
            String nomeUsuario = SessaoUsuario.nome_user;
            int idUsuario = dao.buscarIdUsuarioPorNome(nomeUsuario);
            int idMusica = dao.buscarIdMusicaPorNome(nomeMusica.trim());

            if (idMusica == -1 || idUsuario == -1) {
                System.out.println("Música ou usuário não encontrado.");
                return;
            }

            if (!dao.usuarioJaCurtiu(idMusica, idUsuario)) {
                view.getLbl_sourMusStatus().setText("Você já descurtiu esta música!");
            } else {
                dao.registrarCurtida(idMusica, idUsuario, false);
                view.getLbl_sourMusStatus().setText("Música descurtida com sucesso!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao descurtir música: " + e.getMessage());
        }
    }
    
    /**
     * Insere uma entrada no histórico do usuário referente a uma música pesquisada.
     * O tipo pode ser "source", "curtida" ou "descurtida" dependendo da ação.
     * @param tipo Tipo do histórico ("source", "curtida" ou "descurtida")
     */
    private void inserirHistorico(String tipo) {
        String nome = view.getTxt_barraPesquisaMus().getText();
        int id_user = SessaoUsuario.getId_usuario();

        try (Connection conn = new Conexao().getConnection()) {
            HistoricoDAO dao = new HistoricoDAO(conn);
            dao.inserirHistorico(nome, id_user, tipo);
        } catch (SQLException e) {
            System.out.println("Erro ao enviar histórico: " + e.getMessage());
        }
    }

    public void InserirHistoricoMusica() {
        inserirHistorico("source");
    }
    
    public void InserirHistoricoCurtida() {
        inserirHistorico("curtida");
    }
    
    public void InserirHistoricoDescurtida() {
        inserirHistorico("descurtida");
    }
    
    /**
     * Verifica se o usuário já curtiu a música.
     * @param nome_musica Nome da música para verificação.
     * @return true se o usuário ainda não curtiu; false caso contrário.
     */
    public boolean VerificarCurtirMusica(String nome_musica) {
        int id_usuario = SessaoUsuario.getId_usuario();
        try (Connection conn = new Conexao().getConnection()) {
            HistoricoDAO dao = new HistoricoDAO(conn);
            return !dao.existeCurtida(id_usuario, nome_musica);
        } catch (SQLException e) {
            System.out.println("Erro ao verificar curtida: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Esconde o painel de informações da música.
     */
    public void sairSource() {
        view.getPn_infoMus().setVisible(false);
    }

    /**
     * Fecha a tela atual e retorna para a tela de login.
     */
    public void voltarLog() {
        view.dispose();
        new View.telaLogCad().setVisible(true);
    }
    
    /**
     * Fecha a tela atual.
     */
    public void fechar() {
        view.dispose();
    }
    
    /**
     * Abre a tela de histórico do usuário.
     */
    public void Historico() {
        view.dispose();
        new View.telaHistoricoUser().setVisible(true);
    }
}
