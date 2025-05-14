
package Controller;

import View.telaCadExcMus;   
import View.telaMenuAdm;
import View.telaLogCad;
import View.telaGenArt;

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
    

    
}
