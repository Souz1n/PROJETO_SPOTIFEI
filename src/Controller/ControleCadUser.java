package Controller;

import DAO.CadUserDAO;
import DAO.Conexao;
import Model.CadUser;
import View.*;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Controlador responsável por lidar com as ações da tela de cadastro de usuário.
 */
public class ControleCadUser {

    private telaCadUser view;

    /**
     * Construtor da classe ControleCadUser.
     *
     * @param view Tela de cadastro de usuário.
     */
    public ControleCadUser(telaCadUser view) {
        this.view = view;
    }

    /**
     * Realiza o cadastro de um novo usuário com base nas informações inseridas na tela.
     * Cria um objeto CadUser, estabelece conexão com o banco e realiza a inserção.
     */
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
            view.getLbl_cadUserResult().setText("Usuário cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            view.getLbl_cadUserResult().setText("Idade deve ser um número.");
        } catch (SQLException e) {
            view.getLbl_cadUserResult().setText("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    /**
     * Fecha a tela atual de cadastro e volta para a tela de login/cadastro principal.
     */
    public void voltaMenu() {
        telaLogCad tlc = new telaLogCad();
        tlc.setVisible(true);
        view.dispose();
    }
}