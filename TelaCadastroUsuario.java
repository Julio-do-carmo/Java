/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;
import com.sun.istack.internal.logging.Logger;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author PICHAU
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    
    public TelaCadastroUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextNomeUsuario = new javax.swing.JTextField();
        TextIdadeUsuario = new javax.swing.JTextField();
        TextSexoUsuario = new javax.swing.JTextField();
        TextSenhaUsuario = new javax.swing.JPasswordField();
        BotaoCadUsuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TextIDUsuario = new javax.swing.JTextField();
        BotaoPesquisar = new javax.swing.JButton();
        BotaoDeletar = new javax.swing.JButton();
        BotaoAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Gerenciador de Usuarios");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Idade");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Sexo");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Senha");

        TextIdadeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdadeUsuarioActionPerformed(evt);
            }
        });

        TextSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSenhaUsuarioActionPerformed(evt);
            }
        });

        BotaoCadUsuario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoCadUsuario.setText("Salvar");
        BotaoCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadUsuarioActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("ID");

        BotaoPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoPesquisar.setText("Pesquisar");
        BotaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoPesquisarActionPerformed(evt);
            }
        });

        BotaoDeletar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoDeletar.setText("Deletar");
        BotaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarActionPerformed(evt);
            }
        });

        BotaoAtualizar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BotaoAtualizar.setText("Atualizar");
        BotaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TextNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextSenhaUsuario)
                                        .addComponent(TextSexoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextIdadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(BotaoCadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BotaoDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextIdadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(TextSexoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(TextSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadUsuario)
                    .addComponent(BotaoPesquisar)
                    .addComponent(BotaoAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoDeletar)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextIdadeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdadeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdadeUsuarioActionPerformed

    private void TextSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSenhaUsuarioActionPerformed

    private void BotaoCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadUsuarioActionPerformed
        
        Usuario u = new Usuario();
        
        if(TextIDUsuario.getText().equals("")
        || TextNomeUsuario.getText().equals("")
        || TextIdadeUsuario.getText().equals("")
        || TextSexoUsuario.getText().equals("")
        || String.valueOf(TextSenhaUsuario.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos!");
        } else {
            u.setIDUsuario(Integer.parseInt(TextIDUsuario.getText()));
            u.setNomeUsuario(TextNomeUsuario.getText());
            u.setIdadeUsuario(Integer.parseInt(TextIdadeUsuario.getText()));
            u.setSexoUsuario(TextSexoUsuario.getText());
            u.setSenhaUsuario(String.valueOf(TextSenhaUsuario.getPassword()));
            u.Cadastrar();
            
        TextIDUsuario.setText("");
        TextNomeUsuario.setText("");
        TextIdadeUsuario.setText("");
        TextSexoUsuario.setText("");
        TextSenhaUsuario.setText("");
        
        TextIDUsuario.requestFocus();
        }
    }//GEN-LAST:event_BotaoCadUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new TelaLogin() .setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoPesquisarActionPerformed
        try{
        String nome = JOptionPane.showInputDialog("Digite o nome da conta: ");
        BufferedReader bf = new BufferedReader(new FileReader("../CRUD_PRONTO/Usuarios/usuario"+nome+".txt"));
        TextIDUsuario.setText(bf.readLine());
        TextNomeUsuario.setText(bf.readLine());
        TextIdadeUsuario.setText(bf.readLine());
        TextSexoUsuario.setText(bf.readLine());
        TextSenhaUsuario.setText(bf.readLine());
    } catch (FileNotFoundException ex){
        Logger.getLogger(TelaCadastroUsuario.class).log(Level.SEVERE, null, ex);
    } catch (IOException ex){
        Logger.getLogger(TelaCadastroUsuario.class).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_BotaoPesquisarActionPerformed

    private void BotaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarActionPerformed
        Usuario usu = new Usuario();
        
        String nome = JOptionPane.showInputDialog("Digite o nome da conta:");
        
        usu.Deletar(nome);
    }//GEN-LAST:event_BotaoDeletarActionPerformed

    private void BotaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizarActionPerformed
       Usuario u = new Usuario();
        
        if(TextIDUsuario.getText().equals("") 
        || TextNomeUsuario.getText().equals("")
        || TextIdadeUsuario.getText().equals("")
        || TextSexoUsuario.getText().equals("")
        || String.valueOf(TextSenhaUsuario.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Preencher todos os campos!");
        } else {
            u.setIDUsuario(Integer.parseInt(TextIDUsuario.getText()));
            u.setNomeUsuario(TextNomeUsuario.getText());
            u.setIdadeUsuario(Integer.parseInt(TextIdadeUsuario.getText()));
            u.setSexoUsuario(TextSexoUsuario.getText());
            u.setSenhaUsuario(String.valueOf(TextSenhaUsuario.getPassword()));
            u.Atualizar();
        }
    }//GEN-LAST:event_BotaoAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAtualizar;
    private javax.swing.JButton BotaoCadUsuario;
    private javax.swing.JButton BotaoDeletar;
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JTextField TextIDUsuario;
    private javax.swing.JTextField TextIdadeUsuario;
    private javax.swing.JTextField TextNomeUsuario;
    private javax.swing.JPasswordField TextSenhaUsuario;
    private javax.swing.JTextField TextSexoUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
