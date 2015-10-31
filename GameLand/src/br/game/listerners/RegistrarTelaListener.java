/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.game.telas.LoginFrame;

public class RegistrarTelaListener implements ActionListener {

    LoginFrame l;

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    public RegistrarTelaListener(LoginFrame l) {
        this.l = l;
    }

}
