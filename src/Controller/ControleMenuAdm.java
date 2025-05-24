package Controller;

import View.*;

/**
 * Controlador responsável pela navegação na interface do menu do administrador.
 * Gerencia a abertura e fechamento das telas associadas às funcionalidades do admin.
 */
public class ControleMenuAdm {
    
    private telaMenuAdm view;

    /**
     * Construtor que associa a tela do menu do administrador a este controlador.
     * 
     * @param view Instância da tela do menu do administrador.
     */
    public ControleMenuAdm(telaMenuAdm view) {
        this.view = view;
    }
    
    /**
     * Abre a tela para cadastro e exclusão de músicas e fecha o menu atual.
     */
    public void telaGenMus() {
        telaCadExcMus tma = new telaCadExcMus();
        tma.setVisible(true);
        view.dispose(); // fecha o menu
    }
    
    /**
     * Volta para a tela de login e fecha o menu atual.
     */
    public void voltarLogin() {
        telaLogCad tma = new telaLogCad();
        tma.setVisible(true);
        view.dispose(); // fecha o menu
    }
    
    /**
     * Abre a tela para cadastro de artistas e fecha o menu atual.
     */
    public void telaGenArt() {
        telaGenArt tga = new telaGenArt();
        tga.setVisible(true);
        view.dispose(); // fecha o menu
    }

    /**
     * Abre a tela para consulta de usuários e fecha o menu atual.
     */
    public void telaGonsUser() {
        telaConsUser tcu = new telaConsUser();
        tcu.setVisible(true);
        view.dispose(); // fecha o menu
    }
    
    /**
     * Fecha a tela do menu do administrador.
     */
    public void fechar() {
        view.dispose();
    }
}
