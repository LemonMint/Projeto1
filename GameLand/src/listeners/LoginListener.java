
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Usuario;
import telas.LoginFrame;
import telas.PrincipalFrame;


public class LoginListener implements ActionListener{

    private LoginFrame frame;
    
    public LoginListener(LoginFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if("Entrar".equals(e.getActionCommand())){
            Usuario usuario = frame.getUsuario();
            //Aqui coloca-se o teste de usuario
            //JOptionPane.showMessageDialog(frame, "Usuario Encontrado: " + usuario.getLogin());
            PrincipalFrame p = new PrincipalFrame();
            p.setVisible(true);
            frame.setVisible(false);
        }else if("Sair".equals(e.getActionCommand())){
            System.exit(0);
        }
    }
    
}
