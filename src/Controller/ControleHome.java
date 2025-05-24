

package Controller;

import View.telaHome;
import View.telaLogCad;

public class ControleHome {
    
    private telaHome view;

    public ControleHome(telaHome view) {
        this.view = view;
    }
    
    
    
    public void entrar(){
        view.dispose();
        new View.telaLogCad().setVisible(true);
    }
    
}
