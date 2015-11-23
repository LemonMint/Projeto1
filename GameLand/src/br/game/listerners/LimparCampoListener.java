/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.listerners;

import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;

/**
 *
 * @author Lemon
 */
public class LimparCampoListener implements FocusListener {

    private JTextField campo;
    private String txtpadrao;

    public LimparCampoListener(JTextField campo, String txtpadrao) {
        this.campo = campo;
        this.txtpadrao = txtpadrao;
    }

    @Override
    public void focusGained(FocusEvent fe) {
        if (campo.getText().equals(txtpadrao)) {
            campo.setText("");
        }
    }

    @Override
    public void focusLost(FocusEvent fe) {
        if (campo.getText().isEmpty()) {
            campo.setText(txtpadrao);
        }
    }

}
