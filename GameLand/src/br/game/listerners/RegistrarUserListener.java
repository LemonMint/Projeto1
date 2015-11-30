package br.game.listerners;

import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.modelo.Cliente;
import br.game.telas.RegistrarClienteFrame;
import java.io.IOException;

public class RegistrarUserListener implements ActionListener {

    private RegistrarClienteFrame user;

    public RegistrarUserListener(RegistrarClienteFrame user) {
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "cadastrar":
                try {
                    Cliente u = user.getUsuario();
                    JOptionPane.showMessageDialog(user, "Nome: " + u.getNome() + "Adicionado com Sucesso");
                    SalvarLog.escreverLog("Usuário:" + u.getNome() + " salvo com sucesso", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(user, "Erro ao salvar log");
                }
                break;

            case "voltar":
                user.Sair();
                try {
                    SalvarLog.escreverLog("Saida da tela de Registro de Usuario", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(user, "Erro ao salvar log");
                }
                break;
            case "excluir":
            //excluir;
                break;
        }
    }
}
