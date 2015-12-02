package br.game.listerners;

import br.game.controle.FuncionarioDao;
import br.game.inout.SalvarLog;
import br.game.modelo.Funcionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.telas.RegistroFuncionarioFrame;
import java.io.IOException;

public class RegistroFuncionarioListener implements ActionListener {

    private RegistroFuncionarioFrame frame;
    FuncionarioDao dao = new FuncionarioDao();

    public RegistroFuncionarioListener(RegistroFuncionarioFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("voltar".equals(ae.getActionCommand())) {
            try {
                frame.Sair();
                SalvarLog.escreverLog("clicou em sair da tela de exclusão de usuário", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }
        } else if ("registrar".equals(ae.getActionCommand())) {
            try {

                Funcionario funcionario = frame.getFuncionario();
                if (funcionario != null) {
                    if (funcionario.getCodigo() == null) {
                        dao.insert(funcionario);
                        System.out.println("DAO ADICIONAR");
                    } else {
                        dao.update(funcionario);
                        System.out.println("DAO ALTERAR");
                    }
                }
                SalvarLog.escreverLog("Menu: pesquisar foi clicado", "log.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
            }

        }
    }
}
