 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CadastroController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class Cadastro extends javax.swing.JFrame {

    private final CadastroController controller;

    /**
     * Creates new form MainLogin
     */
    public Cadastro() {
        initComponents();
        controller = new CadastroController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VoltarButton = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        campoConfirmeSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setMaximumSize(new java.awt.Dimension(1100, 650));
        setMinimumSize(new java.awt.Dimension(1100, 650));
        setPreferredSize(new java.awt.Dimension(1100, 650));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 62, 21));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1116, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(45, 18, 75));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1116, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(617, 100));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 171, 0, 402);
        jPanel5.add(jLabel1, gridBagConstraints);

        VoltarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/arrow.png"))); // NOI18N
        VoltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarButtonMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 102, 9, 0);
        jPanel5.add(VoltarButton, gridBagConstraints);

        jPanel4.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Nome Completo:");

        campoUsuario.setBackground(new java.awt.Color(217, 217, 217));
        campoUsuario.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N

        campoNome.setBackground(new java.awt.Color(217, 217, 217));
        campoNome.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Usuário:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setText("Confirme sua senha:");

        campoSenha.setBackground(new java.awt.Color(217, 217, 217));
        campoSenha.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N

        campoConfirmeSenha.setBackground(new java.awt.Color(217, 217, 217));
        campoConfirmeSenha.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setText("E-mail:");

        campoEmail.setBackground(new java.awt.Color(217, 217, 217));
        campoEmail.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N

        cadastrarButton.setBackground(new java.awt.Color(252, 121, 0));
        cadastrarButton.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        cadastrarButton.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarButton.setText("CADASTRAR");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(392, 392, 392)
                        .addComponent(jLabel3))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(465, 465, 465)
                        .addComponent(jLabel5))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(campoConfirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333)
                        .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConfirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void VoltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarButtonMouseClicked
        this.controller.voltarLogin();
    }//GEN-LAST:event_VoltarButtonMouseClicked

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        try {
            this.controller.acessarConfirmacaoCadastro();
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadastrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VoltarButton;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JPasswordField campoConfirmeSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

    public JPasswordField getCampoConfirmeSenha() {
        return campoConfirmeSenha;
    }

    public void setCampoConfirmeSenha(JPasswordField campoConfirmeSenha) {
        this.campoConfirmeSenha = campoConfirmeSenha;
    }

    public JTextField getCampoEmail() {
        return campoEmail;
    }

    public void setCampoEmail(JTextField campoEmail) {
        this.campoEmail = campoEmail;
    }

    public JTextField getCampoNome() {
        return campoNome;
    }

    public void setCampoNome(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public JPasswordField getCampoSenha() {
        return campoSenha;
    }

    public void setCampoSenha(JPasswordField campoSenha) {
        this.campoSenha = campoSenha;
    }

    public JTextField getCampoUsuario() {
        return campoUsuario;
    }

    public void setCampoUsuario(JTextField campoUsuario) {
        this.campoUsuario = campoUsuario;
    }

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

