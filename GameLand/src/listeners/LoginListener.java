package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import modelo.Usuario;
import telas.LoginFrame;
import telas.PrincipalFrame;
import validacoes.SalvarLogin;
import validacoes.ValUsuario;

public class LoginListener implements ActionListener {

    public String aux;
    private LoginFrame frame;

    public LoginListener(LoginFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Usuario usuario = frame.getUsuario();
        /*if ("ver".equals(e.getWhen())) {
         try {
         aux = SalvarLogin.lerLogin();
         System.out.println(aux);
         } catch (IOException ex) {
         JOptionPane.showMessageDialog(frame, "Erro ao ler arquivo");
         }
         }*/
        if ("Entrar".equals(e.getActionCommand())) {
            if (ValUsuario.ValLogin(usuario.getLogin(), usuario.getSenha())) {
                try {
                    SalvarLogin.escreverLogin(usuario.getLogin());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar Login");
                }
                PrincipalFrame p = new PrincipalFrame();
                p.setVisible(true);
                frame.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(frame, "Login ou Senha incorretos.");
            }
            if ("Sair".equals(e.getActionCommand())) {
                System.exit(0);
            }
        }
    }

}
