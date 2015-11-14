package br.game.listerners;

import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.game.telas.PrincipalFrame;
import java.io.IOException;
import javax.swing.JOptionPane;

public class PrincipalListener implements ActionListener {

    private PrincipalFrame frame;

    public PrincipalListener(PrincipalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (null != ae.getActionCommand()) {
            switch (ae.getActionCommand()) {
                case "registrar":
                    try {
                        frame.criarRegistro();
                        SalvarLog.escreverLog("Menu: registrar foi Acessado", "log.txt");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                    }
                    break;
                case "registrarJogo":
                    try {
                        frame.criarRegistroJogos();
                        SalvarLog.escreverLog("Menu: registrarJogo foi Acessado", "log.txt");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                    }
                    break;
                case "excluirJogos":
                    try {
                        frame.criarExcluirJogos();
                        SalvarLog.escreverLog("Menu: excluirJogos foi Acessado", "log.txt");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                    }
                    break;
                case "excluirUsuario":
                    try {
                        frame.criarExcluirUsuarios();
                        SalvarLog.escreverLog("Menu: excluirUsuario foi Acessado", "log.txt");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                    }
                    break;
                case "mostrarJogos":
                     try {
                        frame.criarMostrarJogos();
                        SalvarLog.escreverLog("Menu: Jogos foi acessado", "log.txt");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                    }
                    break;
                default:
                    System.out.println("Menu não encontrado!");
                    break;
            }
        }
    }

}
