package Controller;

import DAO.ConsultarMusc;
import DAO.Conexao;
import View.telaCadExcMus;
import java.sql.Connection;
import java.sql.SQLException;

public class ControleConsultMusc {

    private telaCadExcMus view;

    public ControleConsultMusc(telaCadExcMus view) {
        this.view = view;
    }

    public void consultarIdMusica() {
        String nome = view.getTxt_consMusNam().getText();
        String artista = view.getTxt_consMusArt().getText();

        try {
            Connection conn = new Conexao().getConnection();
            ConsultarMusc dao = new ConsultarMusc(conn);
            int id = dao.consultarIdMusica(nome, artista);

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
