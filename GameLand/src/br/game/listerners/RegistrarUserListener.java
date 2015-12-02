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

    private RegistrarClienteFrame user;

    public RegistrarUserListener(RegistrarClienteFrame user) {
        this.user = user;
    }

    ClienteDao dao = new ClienteDao();

    @Override
    public void actionPerformed(ActionEvent ae) {
        Cliente u = user.getUsuario();
        switch (ae.getActionCommand()) {
            case "cadastrar":
                try {
                    if (u != null) {
                        if (u.getCodigo() == null) {
                            dao.insert(u);
                            System.out.println("DAO ADICIONAR");
                        } else {
                            dao.update(u);
                            System.out.println("DAO ALTERAR");
                        }
                    }
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
                if (u != null) {
                    if (u.getCodigo() != null) {
                        dao.delete(u);
                        System.out.println("DAO DELETAR");
                    }
                }
                break;
        }
    }
    
}
