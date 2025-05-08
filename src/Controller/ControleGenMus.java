
package Controller;

import DAO.CadMuscDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.CadMus;
import View.telaCadExcMus;

public class ControleGenMus {
    
    private telaCadExcMus view;
    
    public ControleGenMus(telaCadExcMus view){
        this.view = view;
    }
    public void cadastrarMusica() {
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
        lbl_cadMusResult.setText("Música cadastrada com sucesso!");
    } catch (SQLException e) {
        lblMensagem.setText("Erro ao cadastrar música: " + e.getMessage());
    }
    }
}
