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
                case "excluirJogos":
                    frame.criarExcluirJogos();
                    break;
                default:
                    System.out.println("Não Existe");
                    break;
            }
        }
    }

}
