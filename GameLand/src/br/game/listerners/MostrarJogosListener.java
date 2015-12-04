/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import br.game.controle.GameLandControle;
import br.game.modelo.Jogo;
import br.game.telas.MostrarJogosFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author comp1
 */
public class MostrarJogosListener implements ActionListener {

    private MostrarJogosFrame frame;

    public MostrarJogosListener(MostrarJogosFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "pesquisar":
                String pesquisa = frame.PesquisaCod();
                if (pesquisa.matches("[0-9]+") && !pesquisa.isEmpty()) {
                    Integer codigoPesquisado = Integer.valueOf(pesquisa);
                    GameLandControle gameLand = new GameLandControle();
                    Jogo jogo = gameLand.getJogoPorCodigo(codigoPesquisado);
                    frame.setListCliente(Arrays.asList(jogo));
                }
                else {
                    //Pesquisa por nome 
                    System.out.println("Pesquisar por nome");
                    GameLandControle jogoDao = new GameLandControle();
                    List<Jogo> jogosPorNome = jogoDao.getJogoPorNome(pesquisa);
                    frame.setListJogos(jogosPorNome);
                }
                break;
            case "voltar":
                frame.Sair();
                break;
            case "editar":
                frame.mostrarJogoFrame();
                break;
            case "remover":
                frame.DeletarRegistroJogos();                
                break;
        }
    }

}
