package Controller;

import DAO.Conexao;
import View.telaMenuUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControleMenuUser {
    
    private final telaMenuUser view;

    public ControleMenuUser(telaMenuUser view) {
        this.view = view;
    }

    public void pesquisarMusica() {
        String nomeMusica = view.getTxt_barraPesquisaMus().getText();

        if (nomeMusica.isEmpty()) {
            view.getLbl_sourMusStatus().setText("Digite o nome da música.");
            return;
        }

        try (Connection conn = new Conexao().getConnection()) {
            String sql = "SELECT artista, ano, genero FROM musica WHERE nome_musica = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nomeMusica);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                view.getTxt_sourMusArt().setText(rs.getString("artista"));
                view.getTxt_sourMusAno().setText(String.valueOf(rs.getInt("ano")));
                view.getTxt_sourMusGener().setText(rs.getString("genero"));
                view.getLbl_sourMusStatus().setText("Música encontrada!");
                view.getPn_infoMus().setVisible(true);
            } else {
                view.getLbl_sourMusStatus().setText("Música não encontrada.");
                view.getPn_infoMus().setVisible(false);
            }

        } catch (SQLException e) {
            view.getLbl_sourMusStatus().setText("Erro ao buscar: " + e.getMessage());
        }
    }

    public void sairSource() {
        view.getPn_infoMus().setVisible(false);
    }

    public void voltarLog() {
        view.dispose();
        new View.telaLogCad().setVisible(true);
    }
}
