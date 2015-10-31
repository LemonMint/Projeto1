package br.game.listerners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.game.telas.PrincipalFrame;

public class PrincipalListener implements ActionListener {

    private PrincipalFrame frame;

    public PrincipalListener(PrincipalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae){
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
                case "excluirUsuario":
                    frame.criarExcluirUsuarios();
                    break;
                default:
                    System.out.println("Não Existe");
                    break;
            }
        }
    }

}
