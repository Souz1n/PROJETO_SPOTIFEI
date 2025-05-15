package Controller;

import View.telaLogCad;
import View.telaMenuAdm;
import View.telaCadUser;
import Model.LogUserAdm;



public class ControleLogin{

    private telaLogCad view;

    public ControleLogin(telaLogCad view) {
        this.view = view;
    }

    public void fazerLoginAdm() {
        String usuario = view.getTxt_nomeLogin().getText();
        String senha = view.getTxt_senhaLogin().getText();
        
        LogUserAdm loginADM = new LogUserAdm();
        loginADM.setNome(usuario);
        loginADM.setSenha(senha);

            if(usuario.equals("adm") & senha.equals("123")){
                view.getTxt_textoAviso().setText("Login efetuado com sucesso!");            
            telaMenuAdm tma = new telaMenuAdm();
            tma.setVisible(true);
            view.dispose();//fecha o o painel login
                
            }else{
            view.getTxt_textoAviso().setText("Erro ao fazer login, tente "
            + "novamente ");
        }
    }
    public void telaCadUser(){
        telaCadUser tcu = new telaCadUser();
        tcu.setVisible(true);
        view.dispose();//fecha o menu
    }
}
