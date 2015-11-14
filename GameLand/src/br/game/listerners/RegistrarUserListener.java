package br.game.listerners;

import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.modelo.Clientes;
import br.game.telas.RegistrarFrame;
import java.io.IOException;

public class RegistrarUserListener implements ActionListener {

    private RegistrarFrame user;

    public RegistrarUserListener(RegistrarFrame user) {
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("Registrar".equals(ae.getActionCommand())) {

            try {
                Clientes u = user.getUsuario();
                JOptionPane.showMessageDialog(user, "Nome: " + u.getNome() + "Adicionado com Sucesso");
                SalvarLog.escreverLog("Usuário:" + u.getNome() + " salvo com sucesso", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(user, "Erro ao salvar log");
            }

        } else if ("Cancel".equals(ae.getActionCommand())) {
            user.Sair();
            try {
                SalvarLog.escreverLog("Saida da tela de Registro de Usuario", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(user, "Erro ao salvar log");
            }

        }
    }
}
