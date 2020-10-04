/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author PICHAU
 */
public class TelaMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenuPrincipal
     */
    public TelaMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        BarrademenuCliente = new javax.swing.JMenu();
        ItemdemenuADDCliente = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        BarrademenuServicos = new javax.swing.JMenu();
        ItemdemenuNServico = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        BarrademenuSair = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BarrademenuCliente.setBackground(new java.awt.Color(153, 153, 153));
        BarrademenuCliente.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BarrademenuCliente.setText("Clientes");

        ItemdemenuADDCliente.setText("Clientes");
        ItemdemenuADDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemdemenuADDClienteActionPerformed(evt);
            }
        });
        BarrademenuCliente.add(ItemdemenuADDCliente);

        jMenuBar1.add(BarrademenuCliente);

        jMenu1.setText("|");
        jMenuBar1.add(jMenu1);

        BarrademenuServicos.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BarrademenuServicos.setText("Serviços");

        ItemdemenuNServico.setText("Serviços");
        ItemdemenuNServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemdemenuNServicoActionPerformed(evt);
            }
        });
        BarrademenuServicos.add(ItemdemenuNServico);

        jMenuBar1.add(BarrademenuServicos);

        jMenu2.setText("|");
        jMenuBar1.add(jMenu2);

        BarrademenuSair.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BarrademenuSair.setText("Sair");

        jMenuItem1.setText("Sair para Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        BarrademenuSair.add(jMenuItem1);

        jMenuItem2.setText("Fechar programa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        BarrademenuSair.add(jMenuItem2);

        jMenuBar1.add(BarrademenuSair);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemdemenuADDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemdemenuADDClienteActionPerformed
        new TelaAddCliente().setVisible(true);
        dispose();
    }//GEN-LAST:event_ItemdemenuADDClienteActionPerformed

    private void ItemdemenuNServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemdemenuNServicoActionPerformed
        new TelaNovoServico().setVisible(true);
        dispose();
    }//GEN-LAST:event_ItemdemenuNServicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu BarrademenuCliente;
    private javax.swing.JMenu BarrademenuSair;
    private javax.swing.JMenu BarrademenuServicos;
    private javax.swing.JMenuItem ItemdemenuADDCliente;
    private javax.swing.JMenuItem ItemdemenuNServico;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
