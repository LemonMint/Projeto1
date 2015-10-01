/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import telas.ExcluirJogosFrame;

public class ExcluirJogosListener implements ActionListener {
    
    private ExcluirJogosFrame frame;
    
    public ExcluirJogosListener(ExcluirJogosFrame frame){
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if("cancelar".equals(ae.getActionCommand())){
            frame.setVisible(false);
        }
        else if("excluir".equals(ae.getActionCommand())){
            JOptionPane.showMessageDialog(frame,"Jogo Exluido com Sucesso");
        }}
    
}
