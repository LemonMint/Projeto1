/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.telas;

import javax.swing.JInternalFrame;
import br.game.listerners.RegistrarUserListener;
import br.game.modelo.Usuario;

/**
 *
 * @author comp1
 */
public class RegistrarFrame extends javax.swing.JInternalFrame {

    private RegistrarUserListener listener = new RegistrarUserListener(this);

    public RegistrarFrame() {
            initComponents();
        }
        //menuExit.addActionListener(listener);
        //menuExit.setActionCommand("Sair");

    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setCidade(cidadeUser.getText());
        usuario.setEmail(emailUser.getText());
        usuario.setEstado(estadoUser.getText());
        usuario.setIdade(Integer.valueOf(idadeUser.getText()));
        usuario.setLogin(usuarioUser.getText());
        usuario.setNome(nomeUser.getText());
        usuario.setRg(Integer.valueOf(rgUser.getText()));
        usuario.setSenha(String.valueOf(senhaUser.getPassword()));
        if (masculinoUser.isSelected()) {
            usuario.setSexo(Usuario.MASCULINO);
        } else {
            usuario.setSexo(Usuario.FEMININO);
        }
        return usuario;
    }
    
    public void Sair(){
        PrincipalFrame.telaRegistrar = null;
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nomeUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idadeUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        endereçoUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailUser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rgUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usuarioUser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        senhaUser = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        ButtonUserRegistrar = new javax.swing.JButton();
        ButtonCancelRegistrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        estadoUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cidadeUser = new javax.swing.JTextField();
        masculinoUser = new javax.swing.JRadioButton();
        femininoUser = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setResizable(true);
        setTitle("Registre-se Grátis");
        setMaximumSize(new java.awt.Dimension(0, 0));
        setVisible(true);

        jLabel1.setText("Nome");

        nomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUserActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade");

        idadeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeUserActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço");

        jLabel4.setText("Email");

        emailUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailUserActionPerformed(evt);
            }
        });

        jLabel5.setText("RG");

        rgUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgUserActionPerformed(evt);
            }
        });

        jLabel6.setText("Usuário");

        usuarioUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioUserActionPerformed(evt);
            }
        });

        jLabel7.setText("Senha");

        senhaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaUserActionPerformed(evt);
            }
        });

        jLabel8.setText("Sexo");

        ButtonUserRegistrar.addActionListener(listener);
        ButtonUserRegistrar.setActionCommand("Registrar");
        ButtonUserRegistrar.setText("Registrar");

        ButtonCancelRegistrar.addActionListener(listener);
        ButtonCancelRegistrar.setActionCommand("Cancel");
        ButtonCancelRegistrar.setText("Voltar");

        jLabel9.setText("Estado");

        jLabel10.setText("Cidade");

        buttonGroup1.add(masculinoUser);
        masculinoUser.setSelected(true);
        masculinoUser.setText("Masculino");

        buttonGroup1.add(femininoUser);
        femininoUser.setText("Feminino");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senhaUser)
                    .addComponent(nomeUser)
                    .addComponent(estadoUser)
                    .addComponent(cidadeUser)
                    .addComponent(endereçoUser)
                    .addComponent(emailUser)
                    .addComponent(rgUser)
                    .addComponent(usuarioUser)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idadeUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(masculinoUser)
                                .addGap(18, 18, 18)
                                .addComponent(femininoUser))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonUserRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCancelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idadeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masculinoUser)
                    .addComponent(femininoUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estadoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endereçoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rgUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonUserRegistrar)
                    .addComponent(ButtonCancelRegistrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUserActionPerformed

    private void idadeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeUserActionPerformed

    private void emailUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailUserActionPerformed

    private void rgUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgUserActionPerformed

    private void usuarioUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioUserActionPerformed

    private void senhaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelRegistrar;
    private javax.swing.JButton ButtonUserRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cidadeUser;
    private javax.swing.JTextField emailUser;
    private javax.swing.JTextField endereçoUser;
    private javax.swing.JTextField estadoUser;
    private javax.swing.JRadioButton femininoUser;
    private javax.swing.JTextField idadeUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton masculinoUser;
    private javax.swing.JTextField nomeUser;
    private javax.swing.JTextField rgUser;
    private javax.swing.JPasswordField senhaUser;
    private javax.swing.JTextField usuarioUser;
    // End of variables declaration//GEN-END:variables
}
