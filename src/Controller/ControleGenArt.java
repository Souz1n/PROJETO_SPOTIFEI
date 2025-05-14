
package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import DAO.Conexao;
import DAO.CadArtDAO;
import Model.CadArt;
import View.telaGenArt;
import View.telaMenuAdm;

public class ControleGenArt {
    
    private telaGenArt view;

    public ControleGenArt(telaGenArt view) {
        this.view = view;
    }
    
    public void cadastrarArtista() {
        String nome_artista = view.getTxt_cadNomeArt().getText();
        String banda = view.getTxt_cadBandaArt().getText();

        CadArt artista = new CadArt();
        artista.setNome(nome_artista);
        artista.setBanda(banda);


        try {
            Connection conn = new Conexao().getConnection();
            CadArtDAO dao = new CadArtDAO(conn);
            dao.inserir(artista);
            view.getLbl_cadArtResult().setText("Artista cadastrado com "
                    + "sucesso!");
        } 
        catch (SQLException e) {
            view.getLbl_cadArtResult().setText("Erro ao cadastrar artista: " + 
                    e.getMessage());
        }
    }
    
    public void voltaMenu(){
        telaMenuAdm tma = new telaMenuAdm();
        tma.setVisible(true);
        view.dispose();//fecha o menu
    }
    
    
}
