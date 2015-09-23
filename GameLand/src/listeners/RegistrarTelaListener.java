/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.Login;


public class RegistrarTelaListener implements ActionListener{
    Login l;
    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    public RegistrarTelaListener(Login l) {
        this.l = l;
    }
    
}
