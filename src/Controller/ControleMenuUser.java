
package Controller;

import View.*;   
import java.sql.Connection;
import java.sql.SQLException;
import DAO.Conexao;
import DAO.MenuUserDAO;
import Model.SourMus;

public class ControleMenuUser {

    private telaMenuUser view;

    public ControleMenuUser(telaMenuUser view) {
        this.view = view;
    }

    public void pesquisarMusica() {
        String nomeMusica = view.getTxt_barraPesquisaMus().getText();

        try {
            Connection conn = new Conexao().getConnection();
            MenuUserDAO dao = new MenuUserDAO(conn);
            SourMus musica = dao.consultarMus(nomeMusica);

            if (musica != null) {
                view.getTxt_sourMusAno().setText(String.valueOf(musica.getAno()));
                view.getTxt_sourMusArt().setText(musica.getArtista());
                view.getTxt_sourMusGener().setText(musica.getGenero());
                view.getLbl_sourcNomeMusRes().setText(nomeMusica);
                view.getLbl_sourMusStatus().setText("");

                // Exibir o painel com os resultados
                view.getPn_infoMus().setVisible(true);
            } else {
                view.getTxt_sourMusAno().setText("");
                view.getTxt_sourMusArt().setText("");
                view.getTxt_sourMusGener().setText("");
                view.getLbl_sourcNomeMusRes().setText("");
                view.getLbl_sourMusStatus().setText("Música não encontrada.");

                // Ocultar o painel caso não encontre
                view.getPn_infoMus().setVisible(false);
            }

        } catch (SQLException e) {
            view.getLbl_sourMusStatus().setText("Erro ao consultar: " + e.getMessage());
        }
    }

    public void sairSource() {
        telaMenuUser tmu = new telaMenuUser();
        tmu.setVisible(true);
        view.dispose();
    }
    
    public void voltarLog() {
        telaLogCad tlc = new telaLogCad();
        tlc.setVisible(true);
        view.dispose();
    }
}
