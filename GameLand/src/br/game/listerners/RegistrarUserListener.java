package br.game.listerners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.modelo.Usuario;
import br.game.telas.RegistrarFrame;

public class RegistrarUserListener implements ActionListener {

    private RegistrarFrame user;

    public RegistrarUserListener(RegistrarFrame user) {
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("Registrar".equals(ae.getActionCommand())) {
            Usuario u = user.getUsuario();
            JOptionPane.showMessageDialog(user, "Nome: " + u.getNome() + "Adicionado com Sucesso");
        } else if ("Cancel".equals(ae.getActionCommand())) {
            user.Sair();
        } else if ("Sair".equals(ae.getActionCommand())) {
             user.Sair();
        }

    }

}
