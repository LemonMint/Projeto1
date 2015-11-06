/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.telas.ExcluirJogosFrame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExcluirJogosListener implements ActionListener {

    private ExcluirJogosFrame frame;

    public ExcluirJogosListener(ExcluirJogosFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("cancelar".equals(ae.getActionCommand())) {
            
            try {
                frame.Sair();
                SalvarLog.escreverLog("clicou em sair da tela de exclusão de jogos", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
        } else if ("pesquisar".equals(ae.getActionCommand())) {
            try {
                JOptionPane.showMessageDialog(frame, "Pesquisar Concluida");
                SalvarLog.escreverLog("Pesquisa concluida", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
        } else if ("excluir".equals(ae.getActionCommand())) {
            try {
                JOptionPane.showMessageDialog(frame, "Jogo Exluido com Sucesso");
                SalvarLog.escreverLog("Jogo Exluido com Sucesso", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
        } else if ("Sair".equals(ae.getActionCommand())) {
            try {
                frame.Sair();
                SalvarLog.escreverLog("clicou em sair da tela de exclusão de jogos", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
        }

    }

}
