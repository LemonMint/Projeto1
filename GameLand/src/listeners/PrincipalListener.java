package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import telas.PrincipalFrame;
import telas.RegistrarFrame;
import telas.RegistroJogosFrame;

public class PrincipalListener implements ActionListener {

    private PrincipalFrame frame;

    public PrincipalListener(PrincipalFrame frame) {
        this.frame = frame;
    }

    RegistrarFrame tela = new RegistrarFrame();
    RegistroJogosFrame telaJogo = new RegistroJogosFrame();

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (null != ae.getActionCommand()) {
            switch (ae.getActionCommand()) {
                case "registrar":
                    frame.criarRegistro();
                    break;
                case "registrarJogo":
                    frame.criarRegistroJogos();
                    break;
                default:
                    System.out.println("lolol");
                    break;
            }
        }
    }

}
