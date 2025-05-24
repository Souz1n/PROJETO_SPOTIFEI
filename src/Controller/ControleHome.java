package Controller;

import View.telaHome;
import View.telaLogCad;

/**
 * Controlador responsável por gerenciar as ações da tela inicial (home).
 */
public class ControleHome {
    
    private telaHome view;

    /**
     * Construtor da classe ControleHome.
     *
     * @param view Tela inicial (home) associada a este controlador.
     */
    public ControleHome(telaHome view) {
        this.view = view;
    }

    /**
     * Fecha a tela inicial e abre a tela de login/cadastro.
     */
    public void entrar() {
        view.dispose();
        new telaLogCad().setVisible(true);
    }
}
