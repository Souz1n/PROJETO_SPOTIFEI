package Controller;

import DAO.Conexao;
import DAO.CurtidaDAO;
import DAO.SourceMusDAO;
import Model.SessaoUsuario;
import Model.SourMus;
import View.telaMenuUser;
import java.sql.Connection;
import java.sql.SQLException;

public class ControleMenuUser {
    
    private final telaMenuUser view;

    public ControleMenuUser(telaMenuUser view) {
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
        Connection conn = new Conexao().getConnection();
        CurtidaDAO dao = new CurtidaDAO(conn);
        dao.registrarCurtida(SessaoUsuario.nomeUsuario, nomeMusica, true);
        conn.close();
    } catch (SQLException e) {
        System.out.println("Erro ao curtir música: " + e.getMessage());
    }
}

public void descurtirMusica(String nomeMusica) {
    try {
        Connection conn = new Conexao().getConnection();
        CurtidaDAO dao = new CurtidaDAO(conn);
        dao.registrarCurtida(SessaoUsuario.nomeUsuario, nomeMusica, false);
        conn.close();
    } catch (SQLException e) {
        System.out.println("Erro ao descurtir música: " + e.getMessage());
    }
}



    public void sairSource() {
        view.getPn_infoMus().setVisible(false);
    }

    public void voltarLog() {
        view.dispose();
        new View.telaMenuUser().setVisible(true);
    }
}
