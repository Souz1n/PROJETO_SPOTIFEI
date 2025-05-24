
package Controller;

import View.*;   


public class ControleMenuAdm {
    
    private telaMenuAdm view;

    public ControleMenuAdm(telaMenuAdm view) {
        this.view = view;
    }
    
    public void telaGenMus(){
        telaCadExcMus tma = new telaCadExcMus();
        tma.setVisible(true);
        view.dispose();//fecha o menu
    }
    
    public void voltarLogin(){
        telaLogCad tma = new telaLogCad();
        tma.setVisible(true);
        view.dispose();//fecha o menu
    }    
    
    public void telaGenArt(){
        telaGenArt tga = new telaGenArt();
        tga.setVisible(true);
        view.dispose();//fecha o menu
    }

    public void telaGonsUser(){
        telaConsUser tcu = new telaConsUser();
        tcu.setVisible(true);
        view.dispose();//fecha o menu
    }
    
    public void fechar() {
        view.dispose();
    }
}
