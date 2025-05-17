
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
        String nome = view.getTxt_cadNomeArt().getText();
        String banda = view.getTxt_cadBandaArt().getText();
        String email = view.getTxt_cadEmailArtGenArt().getText();
        

        CadArt artista = new CadArt();
        artista.setNome(nome);
        artista.setBanda(banda);
        artista.setEmail(email);


        try {
            Connection conn = new Conexao().getConnection();
            CadArtDAO dao = new CadArtDAO(conn);
            dao.inserirPessoa(artista);
            dao.inserirArtista(artista);   
            conn.close();
            System.out.println("ID da pessoa inserida: " + artista.getId_pessoa());
            view.getLbl_cadArtResult().setText("Artista cadastrado com "
                    + "sucesso!");
        } catch (NumberFormatException e) {
            view.getLbl_cadArtResult().setText("Idade deve ser um número.");
        } catch (SQLException e) {
            view.getLbl_cadArtResult().setText("Erro ao cadastrar usuário: " + 
                    e.getMessage());
        }
    }
    
    public void voltaMenu(){
        telaMenuAdm tma = new telaMenuAdm();
        tma.setVisible(true);
        view.dispose();//fecha o menu
    }
    
    
}
