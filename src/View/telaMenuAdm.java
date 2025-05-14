
package View;

import Controller.ControleMenuAdm;

public class telaMenuAdm extends javax.swing.JFrame {

    public telaMenuAdm() {
        initComponents();
        cma = new ControleMenuAdm(this);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_genMus = new javax.swing.JLabel();
        bt_voltarMenuAdm = new javax.swing.JButton();
        bt_consUserMenuAdm = new javax.swing.JButton();
        bt_cadArtMenuAdm = new javax.swing.JButton();
        bt_verEstatMenuAdm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bt_genMusMenuAdm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_genMus.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_genMus.setText("Menu ADM");

        bt_voltarMenuAdm.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_voltarMenuAdm.setText("Voltar");
        bt_voltarMenuAdm.setActionCommand("");
        bt_voltarMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarMenuAdmActionPerformed(evt);
            }
        });

        bt_consUserMenuAdm.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_consUserMenuAdm.setText("Consultar Usuários");
        bt_consUserMenuAdm.setActionCommand("");

        bt_cadArtMenuAdm.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_cadArtMenuAdm.setText("Cadastar Artistas");
        bt_cadArtMenuAdm.setActionCommand("");
        bt_cadArtMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadArtMenuAdmActionPerformed(evt);
            }
        });

        bt_verEstatMenuAdm.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_verEstatMenuAdm.setText("Estatísticas");
        bt_verEstatMenuAdm.setActionCommand("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 102));
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img_adm.png"))); // NOI18N

        bt_genMusMenuAdm.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_genMusMenuAdm.setText("Gerenciador de Musicas");
        bt_genMusMenuAdm.setActionCommand("");
        bt_genMusMenuAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_genMusMenuAdmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(lbl_genMus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_consUserMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_cadArtMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_verEstatMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_genMusMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_voltarMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_genMus)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_genMusMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_cadArtMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_consUserMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_verEstatMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_voltarMenuAdm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_genMusMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_genMusMenuAdmActionPerformed
        cma.telaGenMus();
    }//GEN-LAST:event_bt_genMusMenuAdmActionPerformed

    private void bt_voltarMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarMenuAdmActionPerformed
        cma.voltarLogin();
    }//GEN-LAST:event_bt_voltarMenuAdmActionPerformed

    private void bt_cadArtMenuAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadArtMenuAdmActionPerformed
        cma.telaGenArt();
    }//GEN-LAST:event_bt_cadArtMenuAdmActionPerformed

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
//            java.util.logging.Logger.getLogger(telaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(telaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(telaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(telaMenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new telaMenuAdm().setVisible(true);
//            }
//        });
//    }

    private ControleMenuAdm cma;;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadArtMenuAdm;
    private javax.swing.JButton bt_consUserMenuAdm;
    private javax.swing.JButton bt_genMusMenuAdm;
    private javax.swing.JButton bt_verEstatMenuAdm;
    private javax.swing.JButton bt_voltarMenuAdm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_genMus;
    // End of variables declaration//GEN-END:variables
}
