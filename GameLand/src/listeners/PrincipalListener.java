
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
    private JDesktopPane pane;

    public PrincipalListener(PrincipalFrame frame, JDesktopPane pane) {
        this.frame = frame;
        this.pane = pane;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if("registrar".equals(ae.getActionCommand())){
           frame.criaPane();
            System.out.println("weqweqeqw");
        }
        else
            System.out.println("lolol");
    }
    
}
