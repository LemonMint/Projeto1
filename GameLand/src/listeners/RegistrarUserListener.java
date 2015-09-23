
package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Usuario;
import telas.Registrar;

public class RegistrarUserListener implements ActionListener{
    Usuario user = null;
    
    public RegistrarUserListener(Registrar r) {
        this.user = r.getUsuario();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
