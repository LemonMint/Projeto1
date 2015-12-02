package br.game.listerners;

import br.game.controle.GameLandControle;
import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.modelo.Jogo;
import br.game.telas.RegistroJogosFrame;
import java.io.IOException;

public class RegistroJogosListener implements ActionListener {

    private RegistroJogosFrame frame;

    public RegistroJogosListener(RegistroJogosFrame frame) {
        this.frame = frame;
    }

    GameLandControle dao = new GameLandControle();

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "cadastrar":
                try {
                    Jogo jogo = frame.getJogo();
                    JOptionPane.showMessageDialog(frame, "Cadastro de um novo Jogo");

                    if (jogo != null) {
                        if (jogo.getCodigoJogo() == null) {
                            dao.insert(jogo);
                            System.out.println("DAO ADICIONAR");
                        } else {
                            dao.update(jogo);
                            System.out.println("DAO ALTERAR");
                        }
                    }

                    SalvarLog.escreverLog("Jogo:" + frame.getJogo() + " cadastrado com sucesso", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                }
                break;
            case "voltar":
                frame.Sair();
                try {
                    SalvarLog.escreverLog("Saida da tela de Registro de Jogos", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                }
                break;

            case "procurar":
                //definir
                break;
            case "excluir":
                Jogo jogo = frame.getJogo();
                if (jogo != null) {
                    dao.delete(jogo);
                }

                break;
        }
    }
}
