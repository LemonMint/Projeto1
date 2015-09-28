
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import telas.PrincipalFrame;
import telas.RegistrarFrame;


public class PrincipalListener implements ActionListener{

    private PrincipalFrame frame;


    public PrincipalListener(PrincipalFrame frame ) {
        this.frame = frame;
    }
    
    RegistrarFrame tela = new RegistrarFrame();
    @Override
    public void actionPerformed(ActionEvent ae) {
        if("registrar".equals(ae.getActionCommand())){
            System.out.println("salt");
            frame.criarRegistro();
        }
        else
            System.out.println("lolol");
    }
    
}
