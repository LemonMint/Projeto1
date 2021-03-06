/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import br.game.controle.FuncionarioDao;
import br.game.modelo.Funcionario;
import br.game.telas.MostrarFuncionarioFrame;
import br.game.telas.RegistroFuncionarioFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lemon
 */
public class MostrarFuncionarioListener implements ActionListener {

    private MostrarFuncionarioFrame frame;

    public MostrarFuncionarioListener(MostrarFuncionarioFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "pesquisar":
                String dadosPesquisa = frame.getDadosPesquisa();
                if (dadosPesquisa.matches("[0-9]+") && !dadosPesquisa.isEmpty()) {
                    Integer codigoPesquisado = Integer.valueOf(dadosPesquisa);
                    //Pesquisar por codigo
                    System.out.println("pesquisar por codigo");
                    FuncionarioDao q = new FuncionarioDao();
                    Funcionario funcionario = q.getFuncionarioPorCodigo(codigoPesquisado); //do dao
                    frame.setListFuncionario(Arrays.asList(funcionario));

                } else {
                    //Pesquisa por nome 
                    System.out.println("Pesquisar por nome");
                    FuncionarioDao q = new FuncionarioDao();
                    List<Funcionario> funcionarioPorNome = q.getFuncionarioPorNome(dadosPesquisa); //do dao
                    frame.setListFuncionario(funcionarioPorNome);
                }
                break;
            case "editar":
                frame.mostrarFuncionarioFrame();
                frame.setObjeto();
                break;

            case "voltar":
                frame.Sair();
                break;
                
            case "remover":
                frame.removerFuncionario();
                break;

        }

    }
}
