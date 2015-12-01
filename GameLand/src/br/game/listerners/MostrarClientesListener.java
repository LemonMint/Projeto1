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
                if (dadosPesquisa.matches("[0-9]+")&& !dadosPesquisa.isEmpty()) {
                    Integer codigoPesquisado = Integer.valueOf(dadosPesquisa);
                    //Pesquisar por codigo
                    System.out.println("pesquisar por codigo");
                    ClienteDao q = new ClienteDao();
                    Cliente f = q.getClientePorCodigo(codigoPesquisado); //do dao
                }else
                    
                break;
                
            case "editar":
                break;
            case "remover":
                break;
            case "voltar":
                frame.Sair();
                break;
        }

    }

}
