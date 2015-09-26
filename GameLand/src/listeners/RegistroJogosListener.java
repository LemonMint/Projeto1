
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Jogos;
import telas.RegistroJogosFrame;


public class RegistroJogosListener implements ActionListener {

    private RegistroJogosFrame frame;
    
    public RegistroJogosListener(RegistroJogosFrame frame)
    {
        this.frame = frame;   
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if("Adicionar".equals(e.getActionCommand()))
        {
            Jogos jogo = frame.getJogo();
            JOptionPane.showMessageDialog(frame,"Cadastro de um novo Jogo");
        
        }
        if("Cancelar".equals(e.getActionCommand()))
        {
            
            JOptionPane.showMessageDialog(frame,"Sair");
        
        }
     
    }
    
}
