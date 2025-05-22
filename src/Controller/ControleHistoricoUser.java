package Controller;

import DAO.HistoricoDAO;
import DAO.Conexao;
import Model.Historico;
import View.telaHistoricoUser;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ControleHistoricoUser {
    private final telaHistoricoUser view;
    private final String nomeUsuario;

    public ControleHistoricoUser(telaHistoricoUser view, String nomeUsuario) {
        this.view = view;
        this.nomeUsuario = nomeUsuario;
        carregarDados();
    }

    public void carregarDados() {
        limparTextAreas();

        try (Connection conn = new Conexao().getConnection()) {
            HistoricoDAO dao = new HistoricoDAO(conn);

            List<String> buscas = dao.ultimasBuscas(nomeUsuario);
            for (String musica : buscas) {
                view.getTxt_areaHistoricoBuscas().append(musica + "\n");
            }

            List<Historico> curtidas = dao.curtidasOuDescurtidas(nomeUsuario, true);
            for (Historico h : curtidas) {
                view.getTxt_areaHistoricoCurtidas().append(h.getNomeMusica() + " - " + h.getArtista() + "\n");
            }

            List<Historico> descurtidas = dao.curtidasOuDescurtidas(nomeUsuario, false);
            for (Historico h : descurtidas) {
                view.getTxt_areaHistoricoDescurtidas().append(h.getNomeMusica() + " - " + h.getArtista() + "\n");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao carregar histórico: " + e.getMessage());
        }
    }

    private void limparTextAreas() {
        view.getTxt_areaHistoricoBuscas().setText("");
        view.getTxt_areaHistoricoCurtidas().setText("");
        view.getTxt_areaHistoricoDescurtidas().setText("");
    }
}

