package Controller;

import DAO.CadUserDAO;
import DAO.Conexao;
import Model.CadUser;
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
     
        String nome = view.getTxt_cadUserNome().getText();
        String email = view.getTxt_cadUserEmail().getText();
        String senha = view.getTxt_cadUserSenha().getText();

        
        CadUser usuario = new CadUser();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);

        try {
            Connection conn = new Conexao().getConnection();
            CadUserDAO dao = new CadUserDAO(conn);
            dao.inserirPessoa(usuario);
            dao.inserirUsuario(usuario);
            conn.close();
            System.out.println("ID da pessoa inserida: " + usuario.getId_pessoa());
            view.getLbl_cadUserResult().setText("Usuário cadastrado com "
                    + "sucesso!");
        } catch (NumberFormatException e) {
            view.getLbl_cadUserResult().setText("Idade deve ser um número.");
        } catch (SQLException e) {
            view.getLbl_cadUserResult().setText("Erro ao cadastrar usuário: " + 
                    e.getMessage());
        }

    }
    
     public void voltaMenu(){
        telaMenuAdm tma = new telaMenuAdm();
        tma.setVisible(true);
        view.dispose();
    }
     

}


