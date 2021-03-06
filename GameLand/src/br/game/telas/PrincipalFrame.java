/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.game.telas;

import br.game.listerners.PrincipalListener;
import br.game.modelo.Cliente;
import br.game.modelo.Funcionario;
import br.game.modelo.Jogo;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalFrame extends javax.swing.JFrame {

    public PrincipalFrame() {
        initComponents();
        jDesktopPane1.setLayout(null);
        PrincipalListener listener = new PrincipalListener(this);
        btRegistrar.addActionListener(listener);
        btRegistrar.setActionCommand("registrar");
        btRegistrarJogo.addActionListener(listener);
        btRegistrarJogo.setActionCommand("registrarJogo");
        btJogos.addActionListener(listener);
        btJogos.setActionCommand("mostrarJogos");
        btCreditos.addActionListener(listener);
        btCreditos.setActionCommand("creditos");
        btCadastrarFuncionario.addActionListener(listener);
        btCadastrarFuncionario.setActionCommand("cadastrarFuncionario");
        btMostrarFuncionarios.addActionListener(listener);
        btMostrarFuncionarios.setActionCommand("mostrarFuncionario");
        btClientes.addActionListener(listener);
        btClientes.setActionCommand("mostrarCliente");
        btSair.addActionListener(listener);
        btSair.setActionCommand("sair");

    }
    PrincipalFrame frame;
    static RegistrarClienteFrame telaRegistrarCliente = null;
    static RegistroJogosFrame telaRegistrarJogos = null;
    static RegistroFuncionarioFrame telaRegistroFuncionario = null;
    static MostrarJogosFrame telaMostrarJogos = null;
    static MostrarFuncionarioFrame telaMostraFuncionario = null;
    static MostrarClienteFrame telaMostrarCliente = null;

    public void criarRegistro() {

        if (telaRegistrarCliente == null) {
            telaRegistrarCliente = new RegistrarClienteFrame();
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaRegistrarCliente.getSize();
            telaRegistrarCliente.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);

            jDesktopPane1.add(telaRegistrarCliente);

        }
        telaRegistrarCliente.setVisible(true);
    }

    public void criarRegistroCliente(Cliente cliente) {
        if (telaRegistrarCliente == null) {
            telaRegistrarCliente = new RegistrarClienteFrame(cliente);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaRegistrarCliente.getSize();
            telaRegistrarCliente.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            jDesktopPane1.add(telaRegistrarCliente);
        }
        try {
            telaRegistrarCliente.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaRegistrarCliente.setVisible(true);
    }

    public void criarRegistroJogos(Jogo jogo) {
        if (telaRegistrarJogos == null) {
            telaRegistrarJogos = new RegistroJogosFrame(jogo);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaRegistrarJogos.getSize();
            telaRegistrarJogos.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            jDesktopPane1.add(telaRegistrarJogos);
        }
        try {
            telaRegistrarJogos.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaRegistrarJogos.setVisible(true);

    }

    public void criarRegistroJogos() {
        if (telaRegistrarJogos == null) {
            telaRegistrarJogos = new RegistroJogosFrame();
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaRegistrarJogos.getSize();
            telaRegistrarJogos.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            jDesktopPane1.add(telaRegistrarJogos);
        }
        telaRegistrarJogos.setVisible(true);

    }

    public void criarMostrarJogos() {
        if (telaMostrarJogos == null) {
            telaMostrarJogos = new MostrarJogosFrame();
            telaMostrarJogos.setPrincipal(this);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaMostrarJogos.getSize();
            telaMostrarJogos.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            jDesktopPane1.add(telaMostrarJogos);
        }
        telaMostrarJogos.setVisible(true);
    }

    public void criarRegistroFunconario() {
        if (telaRegistroFuncionario == null) {
            telaRegistroFuncionario = new RegistroFuncionarioFrame();
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaRegistroFuncionario.getSize();
            telaRegistroFuncionario.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            jDesktopPane1.add(telaRegistroFuncionario);
        }
        telaRegistroFuncionario.setVisible(true);
    }

    public void criarMostrarFuncionario() {
        if (telaMostraFuncionario == null) {
            telaMostraFuncionario = new MostrarFuncionarioFrame();
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaMostraFuncionario.getSize();
            telaMostraFuncionario.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            telaMostraFuncionario.setPrincipal(this);
            jDesktopPane1.add(telaMostraFuncionario);
        }
        telaMostraFuncionario.setVisible(true);
    }

    public void criarRegistroFunconario(Funcionario funcionario) {
        if (telaRegistroFuncionario == null) {
            telaRegistroFuncionario = new RegistroFuncionarioFrame(funcionario);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaRegistroFuncionario.getSize();
            telaRegistroFuncionario.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            jDesktopPane1.add(telaRegistroFuncionario);
        }
        try {
            telaRegistroFuncionario.setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        telaRegistroFuncionario.setVisible(true);
    }

    public void criarMostrarCliente() {
        if (telaMostrarCliente == null) {
            telaMostrarCliente = new MostrarClienteFrame();
            telaMostrarCliente.setPrincipal(this);
            Dimension desktopSize = jDesktopPane1.getSize();
            Dimension jInternalFrameSize = telaMostrarCliente.getSize();
            telaMostrarCliente.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                    (desktopSize.height - jInternalFrameSize.height) / 2);
            jDesktopPane1.add(telaMostrarCliente);
        }
        telaMostrarCliente.setVisible(true);
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
        jPanel1 = new javax.swing.JPanel();
        btClientes = new javax.swing.JButton();
        btJogos = new javax.swing.JButton();
        btRegistrarJogo = new javax.swing.JButton();
        btRegistrar = new javax.swing.JButton();
        btCadastrarFuncionario = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btMostrarFuncionarios = new javax.swing.JButton();
        btCreditos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btClientes.setText("Clientes");

        btJogos.setText("Jogos");

        btRegistrarJogo.setText("Cadastrar Jogos");

        btRegistrar.setText("Cadastrar Clientes");

        btCadastrarFuncionario.setText("Cadastrar Funcionários");

        btSair.setText("Sair");

        btMostrarFuncionarios.setText(" Funcionários");

        btCreditos.setText("Créditos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btJogos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastrarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(btRegistrarJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btMostrarFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRegistrarJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btMostrarFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(774, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton btCadastrarFuncionario;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btCreditos;
    private javax.swing.JButton btJogos;
    private javax.swing.JButton btMostrarFuncionarios;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btRegistrarJogo;
    private javax.swing.JButton btSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
