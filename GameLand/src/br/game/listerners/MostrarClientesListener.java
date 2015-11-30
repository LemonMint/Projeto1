/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

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
