package br.game.listerners;

import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.modelo.Jogos;
import br.game.telas.RegistroJogosFrame;
import java.io.IOException;

public class RegistroJogosListener implements ActionListener {

    private RegistroJogosFrame frame;

    public RegistroJogosListener(RegistroJogosFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ("Adicionar".equals(e.getActionCommand())) {
            Jogos jogo = frame.getJogo();
            JOptionPane.showMessageDialog(frame, "Cadastro de um novo Jogo");

        }
        if ("Cancelar".equals(e.getActionCommand())) {
            frame.Sair();
        } else if ("Add".equals(e.getActionCommand())) {
            try {
                Jogos jogo = frame.getJogo();
                JOptionPane.showMessageDialog(frame, "Cadastro de um novo Jogo");
                SalvarLog.escreverLog("Jogo:" + frame.getJogo() + " cadastrado com sucesso", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }

        } else if ("Exit".equals(e.getActionCommand())) {
            frame.Sair();
        }
    }
}
