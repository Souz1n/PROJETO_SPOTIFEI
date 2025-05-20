package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import View.*;
import DAO.LoginUserDAO;
import DAO.Conexao;
import Model.Login;
import Model.SessaoUsuario;



public class ControleLogin{

    private telaLogCad view;

    public ControleLogin(telaLogCad view) {
        this.view = view;
    }

    public void fazerLoginAdm() {
        String usuario = view.getTxt_nomeLogin().getText();
        String senha = view.getTxt_senhaLogin().getText();
        
        Login loginADM = new Login();
        loginADM.setNome(usuario);
        loginADM.setSenha(senha);

            if(usuario.equals("adm") & senha.equals("123")){
                view.getTxt_textoAviso().setText("Login efetuado com sucesso!");            
            telaMenuAdm tma = new telaMenuAdm();
            tma.setVisible(true);
            view.dispose();
                
            }else{
            view.getTxt_textoAviso().setText("Erro ao fazer login, tente "
            + "novamente ");
        }
    }
    public void telaCadUser(){
        telaCadUser tcu = new telaCadUser();
        tcu.setVisible(true);
        view.dispose();
    }
    
    public void fazerLoginUser() {
        String usuario = view.getTxt_nomeLogin().getText();
        String senha = view.getTxt_senhaLogin().getText();
        
        Login loginADM = new Login();
        loginADM.setNome(usuario);
        loginADM.setSenha(senha);

        try {
            Connection conn = new Conexao().getConnection();
            LoginUserDAO dao = new LoginUserDAO(conn);

            boolean autenticado = dao.verificarUsuario(usuario, senha);

            if (autenticado) {
                SessaoUsuario.nome_user = usuario;
                view.getTxt_textoAviso().setText("Login realizado com sucesso!");           
                telaMenuUser tmu = new telaMenuUser();
                tmu.setVisible(true);
                view.dispose();
            }
             else {
                view.getTxt_textoAviso().setText("Usuário ou senha inválidos.");
            }

            conn.close();
        } catch (SQLException e) {
            view.getTxt_textoAviso().setText("Erro no banco de dados: " + e.getMessage());
        }
    } 
}
