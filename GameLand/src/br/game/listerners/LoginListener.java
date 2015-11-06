package br.game.listerners;

import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import br.game.modelo.Usuario;
import br.game.telas.LoginFrame;
import br.game.telas.PrincipalFrame;
import br.game.inout.SalvareLerLogin;
import br.game.validacoes.ValUsuario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginListener implements ActionListener {

    public String aux;
    private LoginFrame frame;

    public LoginListener(LoginFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Usuario usuario = frame.getUsuario();
        if ("Entrar".equals(e.getActionCommand())) {
            try {
                SalvarLog.escreverLog("Entrada login e senha.", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
            if (ValUsuario.ValLogin(usuario.getLogin(), usuario.getSenha())) {
                try {
                    SalvarLog.escreverLog("Entrada com sucesso.", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                }
                try {
                    SalvareLerLogin.escreverLogin(usuario.getLogin(), "loginFile.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar Login");
                }
                PrincipalFrame p = new PrincipalFrame();
                p.setVisible(true);
                frame.setVisible(false);
            } else {
                try {
                    SalvarLog.escreverLog("Erro de senha ou login", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                }
                JOptionPane.showMessageDialog(frame, "Login ou Senha incorretos.");
            }
        }
        if ("Sair".equals(e.getActionCommand())) {
            
            try {
                SalvarLog.escreverLog("Fim do aplicativo", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
            
            System.exit(0);
        }
    }

}
