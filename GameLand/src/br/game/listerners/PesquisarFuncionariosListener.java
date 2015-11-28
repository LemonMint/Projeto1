/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import br.game.modelo.Funcionario;
import br.game.telas.MostrarFuncionario;
import br.game.telas.RegistroFuncionarioFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lemon
 */
public class PesquisarFuncionariosListener implements ActionListener {

    private MostrarFuncionario mostrarFuncionario;

    public PesquisarFuncionariosListener(MostrarFuncionario mostrarFuncionario) {
        this.mostrarFuncionario = mostrarFuncionario;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        switch (ae.getActionCommand()) {
            case "pesquisar":
                String dadosPesquisa = mostrarFuncionario.getDadosPesquisa();
                if (dadosPesquisa.matches("[0-9]+")) {
                    Integer codigoPesquisado = Integer.valueOf(dadosPesquisa);
                    //Pesquisar por codigo
                    System.out.println("pesquisar por codigo");
                    Funcionario f = null; //do dao
                    RegistroFuncionarioFrame telaRegistroFuncionario = new RegistroFuncionarioFrame(f);
                    telaRegistroFuncionario.setVisible(true);
                } else {
                    //Pesquisa por nome 
                    System.out.println("Pesquisar por nome");
                }
                break;

        }

    }

}
