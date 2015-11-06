/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.telas;

import br.game.listerners.PrincipalListener;
import br.game.inout.SalvareLerLogin;

/**
 *
 * @author Lemon
 */
public class PrincipalFrame extends javax.swing.JFrame {

    public PrincipalFrame() {
        initComponents();
        PrincipalListener listener = new PrincipalListener(this);
        menuRegistrar.addActionListener(listener);
        menuRegistrar.setActionCommand("registrar");
        menuRegistrarJogo.addActionListener(listener);
        menuRegistrarJogo.setActionCommand("registrarJogo");
        menuItemExcluirJogos.addActionListener(listener);
        menuItemExcluirJogos.setActionCommand("excluirJogos");
        menuItemExcluirUsuario.addActionListener(listener);
        menuItemExcluirUsuario.setActionCommand("excluirUsuario");

    }
    static RegistrarFrame telaRegistrar = null;
    static RegistroJogosFrame telaRegistrarJogos = null;
    static ExcluirJogosFrame telaExcluirJogos = null;
    static ExcluirUsuariosFrame telaExcluirUsuarios = null;

    public void criarRegistro() {
        if (telaRegistrar == null) {
            telaRegistrar = new RegistrarFrame();
            jDesktopPane1.add(telaRegistrar);
        }
        telaRegistrar.setVisible(true);
    }

    public void criarRegistroJogos() {
        if (telaRegistrarJogos == null) {
            telaRegistrarJogos = new RegistroJogosFrame();
            jDesktopPane1.add(telaRegistrarJogos);
        }
        telaRegistrarJogos.setVisible(true);

    }

    public void criarExcluirJogos() {
        if (telaExcluirJogos == null) {
            telaExcluirJogos = new ExcluirJogosFrame();
            jDesktopPane1.add(telaExcluirJogos);
        }
        telaExcluirJogos.setVisible(true);
    }

    public void criarExcluirUsuarios() {
        if (telaExcluirUsuarios == null) {
            telaExcluirUsuarios = new ExcluirUsuariosFrame();
            jDesktopPane1.add(telaExcluirUsuarios);
        }
        telaExcluirUsuarios.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRegistrar = new javax.swing.JMenuItem();
        menuRegistrarJogo = new javax.swing.JMenuItem();
        menuItemExcluirUsuario = new javax.swing.JMenuItem();
        menuItemExcluirJogos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameLand");

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setText("Menus");

        menuRegistrar.setText("Registrar");
        jMenu1.add(menuRegistrar);

        menuRegistrarJogo.setText("Registrar Jogo");
        jMenu1.add(menuRegistrarJogo);

        menuItemExcluirUsuario.setText("ExcluirUsuario");
        jMenu1.add(menuItemExcluirUsuario);

        menuItemExcluirJogos.setText("Excluir Jogo");
        jMenu1.add(menuItemExcluirJogos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuItemExcluirJogos;
    private javax.swing.JMenuItem menuItemExcluirUsuario;
    private javax.swing.JMenuItem menuRegistrar;
    private javax.swing.JMenuItem menuRegistrarJogo;
    // End of variables declaration//GEN-END:variables
}
