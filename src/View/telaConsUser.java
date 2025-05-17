
package View;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controller.ControleConsUser;

public class telaConsUser extends javax.swing.JFrame {


    public telaConsUser() {
        initComponents();
        ccu = new ControleConsUser(this);
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLbl_consNomeUser() {
        return lbl_consNomeUser;
    }

    public void setLbl_consNomeUser(JLabel lbl_consNomeUser) {
        this.lbl_consNomeUser = lbl_consNomeUser;
    }

    public JLabel getLbl_consUserEmailResult() {
        return lbl_consUserEmailResult;
    }

    public void setLbl_consUserEmailResult(JLabel lbl_consUserEmailResult) {
        this.lbl_consUserEmailResult = lbl_consUserEmailResult;
    }

    public JLabel getLbl_consUserResult() {
        return lbl_consUserResult;
    }

    public void setLbl_consUserResult(JLabel lbl_consUserResult) {
        this.lbl_consUserResult = lbl_consUserResult;
    }

    public JLabel getLbl_consUserSenhaResult() {
        return lbl_consUserSenhaResult;
    }

    public void setLbl_consUserSenhaResult(JLabel lbl_consUserSenhaResult) {
        this.lbl_consUserSenhaResult = lbl_consUserSenhaResult;
    }

    public JLabel getLbl_emailConsUserResult() {
        return lbl_emailConsUser;
    }

    public void setLbl_emailConsUserResult(JLabel lbl_emailConsUserResult) {
        this.lbl_emailConsUser = lbl_emailConsUserResult;
    }

    public JLabel getLbl_senhaConsUserResult() {
        return lbl_senhaConsUser;
    }

    public void setLbl_senhaConsUserResult(JLabel lbl_senhaConsUserResult) {
        this.lbl_senhaConsUser = lbl_senhaConsUserResult;
    }

    public JTextField getTxt_ConsNomeUser() {
        return txt_ConsNomeUser;
    }

    public void setTxt_ConsNomeUser(JTextField txt_ConsNomeUser) {
        this.txt_ConsNomeUser = txt_ConsNomeUser;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel lbl_tituloCadUser = new javax.swing.JLabel();
        lbl_consNomeUser = new javax.swing.JLabel();
        txt_ConsNomeUser = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_emailConsUser = new javax.swing.JLabel();
        lbl_senhaConsUser = new javax.swing.JLabel();
        lbl_consUserSenhaResult = new javax.swing.JLabel();
        lbl_consUserEmailResult = new javax.swing.JLabel();
        lbl_consUserResult = new javax.swing.JLabel();
        bt_voltarConsUser = new javax.swing.JButton();
        bt_consUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_tituloCadUser.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_tituloCadUser.setText("CONSULTAR USUÁRIOS");

        lbl_consNomeUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_consNomeUser.setText("Nome");

        txt_ConsNomeUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_ConsNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ConsNomeUserActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_emailConsUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_emailConsUser.setText("Email:");

        lbl_senhaConsUser.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_senhaConsUser.setText("Senha:");

        lbl_consUserSenhaResult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_consUserEmailResult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_emailConsUser)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_senhaConsUser)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_consUserEmailResult, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_consUserSenhaResult, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_emailConsUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_consUserEmailResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_senhaConsUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_consUserSenhaResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );

        lbl_consUserResult.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N

        bt_voltarConsUser.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_voltarConsUser.setText("VOLTAR");
        bt_voltarConsUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarConsUserActionPerformed(evt);
            }
        });

        bt_consUser.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_consUser.setText("Consultar");
        bt_consUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(lbl_tituloCadUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(bt_voltarConsUser)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_consUserResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_consNomeUser)
                                .addGap(18, 18, 18)
                                .addComponent(txt_ConsNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_consUser)
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_tituloCadUser)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_consNomeUser)
                    .addComponent(txt_ConsNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_consUser)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_voltarConsUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_consUserResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ConsNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ConsNomeUserActionPerformed

    }//GEN-LAST:event_txt_ConsNomeUserActionPerformed

    private void bt_voltarConsUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarConsUserActionPerformed
        ccu.voltaMenu();
    }//GEN-LAST:event_bt_voltarConsUserActionPerformed

    private void bt_consUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consUserActionPerformed
        ccu.consultarUsuario();
    }//GEN-LAST:event_bt_consUserActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {;
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(telaConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(telaConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(telaConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(telaConsUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new telaConsUser().setVisible(true);
//            }
//        });
//    }

    private final ControleConsUser ccu;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_consUser;
    private javax.swing.JButton bt_voltarConsUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_consNomeUser;
    private javax.swing.JLabel lbl_consUserEmailResult;
    private javax.swing.JLabel lbl_consUserResult;
    private javax.swing.JLabel lbl_consUserSenhaResult;
    private javax.swing.JLabel lbl_emailConsUser;
    private javax.swing.JLabel lbl_senhaConsUser;
    private javax.swing.JTextField txt_ConsNomeUser;
    // End of variables declaration//GEN-END:variables
}
