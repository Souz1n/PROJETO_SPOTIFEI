package Controller;

import DAO.CadUserDAO;
import DAO.Conexao;
import Model.Caduser;
import View.telaCadUser;
import View.telaMenuAdm;
import java.sql.Connection;
import java.sql.SQLException;

public class ControleCadUser {

    private telaCadUser view;

    public ControleCadUser(telaCadUser view) {
        this.view = view;
    }

    public void cadastrarUsuario() {
     
        String nome = view.getTxt_cadNome().getText();
        String email = view.getTxt_cadEmail().getText();
        int idade = Integer.parseInt(view.getTxt_cadIdade().getText());

        
        Caduser usuario = new Caduser(nome, email, idade);

        try {
            
            Connection conn = new Conexao().getConnection();
            CadUserDAO dao = new CadUserDAO(conn);
            dao.inserir(usuario);

            System.out.println("Usuário cadastrado com sucesso!"); 
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }
     public void voltaMenu(){
        telaMenuAdm tma = new telaMenuAdm();
        tma.setVisible(true);
        view.dispose();
    }
}


