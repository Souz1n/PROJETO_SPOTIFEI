package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import Model.ConsUser;
import View.telaConsUser;
import View.telaMenuAdm;
import DAO.ConsUserDAO;
import DAO.Conexao;

/**
 * Controlador responsável pelas ações da tela de consulta de usuário.
 */
public class ControleConsUser {
    
    private telaConsUser view;

    /**
     * Construtor da classe ControleConsUser.
     *
     * @param view Tela de consulta de usuário.
     */
    public ControleConsUser(telaConsUser view) {
        this.view = view;
    }
    
    /**
     * Realiza a consulta de um usuário no banco de dados com base no nome informado.
     * Atualiza a tela com os dados encontrados ou exibe uma mensagem de erro.
     */
    public void consultarUsuario() {
        String nomeUsuario = view.getTxt_ConsNomeUser().getText().trim();
        
        ConsUser consulta = new ConsUser();
        consulta.setNome(nomeUsuario);

        try {
            Connection conn = new Conexao().getConnection();
            ConsUserDAO dao = new ConsUserDAO(conn);
            ConsUser usuario = dao.consultarUsuario(nomeUsuario);

            if (usuario != null && usuario.getSenha() != null && !usuario.getSenha().isEmpty()) {
                view.getLbl_consUserEmailResult().setText(usuario.getEmail());
                view.getLbl_consUserSenhaResult().setText(usuario.getSenha());
                view.getLbl_consUserResult().setText(""); // Limpa mensagem de erro, se houver
            } else {
                view.getLbl_consUserResult().setText("Usuário não encontrado.");
                view.getLbl_consUserEmailResult().setText("");
                view.getLbl_consUserSenhaResult().setText("");
            }

        } catch (SQLException e) {
            view.getLbl_consUserResult().setText("Erro ao consultar: " + e.getMessage());
        }
    }

    /**
     * Fecha a tela de consulta e retorna para o menu do administrador.
     */
    public void voltaMenu() {
        telaMenuAdm tma = new telaMenuAdm();
        tma.setVisible(true);
        view.dispose();
    }
}
