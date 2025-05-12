package Controller;

import DAO.Conexao;
import View.telaLogCad;
import Model.LogUserAdm;
import java.sql.Connection;
import java.sql.SQLException;

public class ControleLogin{

    private telaLogCad view;

    public ControleLogin(telaLogCad view) {
        this.view = view;
    }

    public void fazerLoginAdm() {
        String usuario = view.getTxt_nomeLogin().getText();
        String senha = view.getTxt_senhaLogin().getText();
        
        LogUserAdm loginADM = new LogUserAdm();
        LogUserAdm.setNome(usuario);
        LogUserAdm.setSenha(usuario);

        try {
            Connection conn = new Conexao().getConnection();
            CadMuscDAO dao = new CadMuscDAO(conn);
            dao.inserir(LogUserAdm);
            view.getTxt_textoAviso().setText("Música cadastrada com "
                    + "sucesso!");
        } 
        catch (SQLException e) {
            view.getTxt_textoAviso().setText("Erro ao cadastrar música: " + 
                    e.getMessage());
        }
    }
}
