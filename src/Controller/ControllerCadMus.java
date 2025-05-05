package controller;

import DAO.CadMuscDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.CadMus;
import View.telaCadExcMus;

public class ControllerCadMus {
    private telaCadExcMus view;

    public ControllerCadMus(telaCadExcMus view) {
        this.view = view;
    }

    public void salvarMusica() {
        String nome = view.getTxt_cadMusNam().getText();
        String artista = view.getTxt_cadMusArt().getText();
        int ano = Integer.parseInt(view.getTxt_cadMusAno().getText());

        CadMus musica = new CadMus();
        musica.setNome(nome);
        musica.setArtista(artista);
        musica.setAno(ano);

        try {
            Connection conn = new Conexao().getConnection();
            CadMuscDAO dao = new CadMuscDAO(conn);
            dao.inserir(musica);
            JOptionPane.showMessageDialog(view, "Música cadastrada com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(view, "Erro ao cadastrar música: " + e.getMessage());
        }
    }
}

