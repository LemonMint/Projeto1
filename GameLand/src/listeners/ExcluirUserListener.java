
package listeners;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import telas.ExcluirUsuariosFrame;


public class ExcluirUserListener implements ActionListener{

    public ExcluirUserListener(ExcluirUsuariosFrame frame) {
        this.frame = frame;
    }
    
    private ExcluirUsuariosFrame frame;

    @Override
    public void actionPerformed(ActionEvent ae) {
           if("cancelar".equals(ae.getActionCommand())){
               frame.setVisible(false);
        }
        else if("excluir".equals(ae.getActionCommand())){
            JOptionPane.showMessageDialog(frame, "Usuario excluido com exito");
            
        }}
    }
