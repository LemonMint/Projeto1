package br.game.listerners;

import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.telas.ExcluirUsuariosFrame;
import java.io.IOException;

public class ExcluirUserListener implements ActionListener {

    public ExcluirUserListener(ExcluirUsuariosFrame frame) {
        this.frame = frame;
    }

    private ExcluirUsuariosFrame frame;

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("cancelar".equals(ae.getActionCommand())) {
            try {
                frame.Sair();
                SalvarLog.escreverLog("clicou em sair da tela de exclusão de usuário", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
        } else if ("pesquisar".equals(ae.getActionCommand())) {
            try {
                JOptionPane.showMessageDialog(frame, "Usuario encontrado");
                SalvarLog.escreverLog("Menu: pesquisar foi clicado", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
           
        } else if ("excluir".equals(ae.getActionCommand())) {
            try {
                JOptionPane.showMessageDialog(frame, "Usuario excluido com exito");
                SalvarLog.escreverLog("Usuário excluido com sucesso.", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }

        }
    }
}
