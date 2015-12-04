/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import br.game.controle.ClienteDao;
import br.game.modelo.Cliente;
import br.game.telas.MostrarClienteFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MostrarClientesListener implements ActionListener {

    private MostrarClienteFrame frame;

    public MostrarClientesListener(MostrarClienteFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "pesquisar":
                String dadosPesquisa = frame.getDadosPesquisa();
                if (dadosPesquisa.matches("[0-9]+") && !dadosPesquisa.isEmpty()) {
                    Integer codigoPesquisado = Integer.valueOf(dadosPesquisa);
                    System.out.println("pesquisar por codigo");
                    ClienteDao q = new ClienteDao();
                    Cliente f = q.getClientePorCodigo(codigoPesquisado); //do dao
                    frame.setListCliente(Arrays.asList(f));
                } else {
                    System.out.println("Pesquisar por nome");
                    ClienteDao q = new ClienteDao();
                    List<Cliente> clientePorNome = q.getClientePorNome(dadosPesquisa); //do dao
                    frame.setListCliente(clientePorNome);
                }
                break;
            case "editar":
                frame.mostrarClienteFrame();
                frame.setObjeto();
                break;
            case "remover":
                frame.removerCliente();
                break;
            case "voltar":
                frame.sair();
                break;
        }

    }

}
