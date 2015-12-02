package br.game.listerners;

import br.game.controle.ClienteDao;
import br.game.inout.SalvarLog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import br.game.modelo.Cliente;
import br.game.telas.RegistrarClienteFrame;
import java.io.IOException;

public class RegistrarUserListener implements ActionListener {

    private RegistrarClienteFrame frame;
    ClienteDao dao = new ClienteDao();

    public RegistrarUserListener(RegistrarClienteFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "cadastrar":
                Cliente cliente = frame.getUsuario();
                try {
                    if (cliente != null) {
                        if (cliente.getCodigo() == null) {
                            dao.insert(cliente);
                            System.out.println("DAO ADICIONAR");
                        } else {
                            dao.update(cliente);
                            System.out.println("DAO ALTERAR");
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Nome: " + cliente.getNome() + "Adicionado com Sucesso");
                    SalvarLog.escreverLog("Usuário:" + cliente.getNome() + " salvo com sucesso", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                }
                break;

            case "voltar":
                frame.Sair();
                try {
                    SalvarLog.escreverLog("Saida da tela de Registro de Usuario", "log.txt");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Erro ao salvar log");
                }
                break;
            case "excluir":
                cliente = frame.getUsuario();
                if (cliente != null) {
                    if (cliente.getCodigo() != null) {
                        dao.delete(cliente);
                        System.out.println("DAO DELETAR");
                    }
                }
                break;
        }
    }

}
