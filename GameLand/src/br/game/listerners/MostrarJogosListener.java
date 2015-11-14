/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import br.game.telas.MostrarJogosFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author comp1
 */
public class MostrarJogosListener implements ActionListener{
    
    private MostrarJogosFrame frame;
    

    public MostrarJogosListener(MostrarJogosFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if("codigo".equals(e.getActionCommand())){
            
        }
    }


}
