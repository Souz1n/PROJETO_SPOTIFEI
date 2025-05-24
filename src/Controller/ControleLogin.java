package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import View.*;
import DAO.LoginUserDAO;
import DAO.Conexao;
import Model.*;

/**
 * Controlador responsável pelo gerenciamento da tela de login,
 * incluindo autenticação de administradores e usuários comuns.
 */
public class ControleLogin {

    private telaLogCad view;

    /**
     * Construtor da classe ControleLogin.
     * 
     * @param view Tela de login associada a este controlador.
     */
    public ControleLogin(telaLogCad view) {
        this.view = view;
    }

    /**
     * Realiza o login do administrador. Se as credenciais forem "adm" e "123",
     * o administrador é autenticado com sucesso.
     */
    public void fazerLoginAdm() {
        String usuario = view.getTxt_nomeLogin().getText();
        String senha = view.getTxt_senhaLogin().getText();

        Login loginADM = new Login();
        loginADM.setNome(usuario);
        loginADM.setSenha(senha);

        if (usuario.equals("adm") & senha.equals("123")) {
            view.getTxt_textoAviso().setText("Login efetuado com sucesso!");
            telaMenuAdm tma = new telaMenuAdm();
            tma.setVisible(true);
            view.dispose();
        } else {
            view.getTxt_textoAviso().setText("Erro ao fazer login, tente novamente.");
        }
    }

    /**
     * Abre a tela de cadastro de usuário.
     */
    public void telaCadUser() {
        telaCadUser tcu = new telaCadUser();
        tcu.setVisible(true);
        view.dispose();
    }

    /**
     * Realiza o login de um usuário comum.
     * Verifica as credenciais no banco de dados através da DAO LoginUserDAO.
     * Se válidas, armazena o usuário na sessão e redireciona para o menu do usuário.
     */
    public void fazerLoginUser() {
        String usuario = view.getTxt_nomeLogin().getText();
        String senha = view.getTxt_senhaLogin().getText();

        try {
            Connection conn = new Conexao().getConnection();
            LoginUserDAO dao = new LoginUserDAO(conn);

            SessaoUsuario sessao = dao.verificarUsuario(usuario, senha);

            if (sessao != null) {
                // Armazenar na sessão (atributos estáticos)
                SessaoUsuario.id_usuario = sessao.getId_usuario();
                SessaoUsuario.setNome_user(usuario);

                view.getTxt_textoAviso().setText("Login realizado com sucesso!");
                telaMenuUser tmu = new telaMenuUser();
                tmu.setVisible(true);
                view.dispose();
            } else {
                view.getTxt_textoAviso().setText("Usuário ou senha inválidos.");
            }

            conn.close();
        } catch (SQLException e) {
            view.getTxt_textoAviso().setText("Erro no banco de dados: " + e.getMessage());
        }
    }
}
