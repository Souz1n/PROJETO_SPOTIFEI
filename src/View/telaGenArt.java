/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControleGenArt;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class telaGenArt extends javax.swing.JFrame {

    public telaGenArt() {
        initComponents();
        cga = new ControleGenArt(this);
    }

    public JLabel getLbl_emailArt() {
        return lbl_emailArt;
    }

    public void setLbl_emailArt(JLabel lbl_emailArt) {
        this.lbl_emailArt = lbl_emailArt;
    }

    public JTextField getTxt_cadEmailArtGenArt() {
        return txt_cadEmailArtGenArt;
    }

    public void setTxt_cadEmailArtGenArt(JTextField txt_cadEmailArtGenArt) {
        this.txt_cadEmailArtGenArt = txt_cadEmailArtGenArt;
    }

    
    
    public JButton getBt_cadArt() {
        return bt_cadArtGenArt;
    }

    public void setBt_cadArt(JButton bt_cadArt) {
        this.bt_cadArtGenArt = bt_cadArt;
    }

    public JPanel getJf_cadArt() {
        return jf_cadArt;
    }

    public void setJf_cadArt(JPanel jf_cadArt) {
        this.jf_cadArt = jf_cadArt;
    }

    public JLabel getLbl_bandaArt() {
        return lbl_bandaArt;
    }

    public void setLbl_bandaArt(JLabel lbl_bandaArt) {
        this.lbl_bandaArt = lbl_bandaArt;
    }

    public JLabel getLbl_cadArtResult() {
        return lbl_cadArtResult;
    }

    public void setLbl_cadArtResult(JLabel lbl_cadArtResult) {
        this.lbl_cadArtResult = lbl_cadArtResult;
    }

    public JLabel getLbl_casArtTitle() {
        return lbl_casArtTitleGenArt;
    }

    public void setLbl_casArtTitle(JLabel lbl_casArtTitle) {
        this.lbl_casArtTitleGenArt = lbl_casArtTitle;
    }

    public JLabel getLbl_nomeArt() {
        return lbl_nomeArt;
    }

    public void setLbl_nomeArt(JLabel lbl_nomeArt) {
        this.lbl_nomeArt = lbl_nomeArt;
    }

    public JLabel getLbl_tituloLogin() {
        return lbl_tituloLogin;
    }

    public void setLbl_tituloLogin(JLabel lbl_tituloLogin) {
        this.lbl_tituloLogin = lbl_tituloLogin;
    }

    public JTextField getTxt_cadBandaArt() {
        return txt_cadBandaArtGenArt;
    }

    public void setTxt_cadBandaArt(JTextField txt_cadBandaArt) {
        this.txt_cadBandaArtGenArt = txt_cadBandaArt;
    }

    public JTextField getTxt_cadNomeArt() {
        return txt_cadNomeArtGenArt;
    }

    public void setTxt_cadNomeArt(JTextField txt_cadNomeArt) {
        this.txt_cadNomeArtGenArt = txt_cadNomeArt;
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_tituloLogin = new javax.swing.JLabel();
        jf_cadArt = new javax.swing.JPanel();
        lbl_casArtTitleGenArt = new javax.swing.JLabel();
        lbl_nomeArt = new javax.swing.JLabel();
        lbl_bandaArt = new javax.swing.JLabel();
        txt_cadNomeArtGenArt = new javax.swing.JTextField();
        txt_cadBandaArtGenArt = new javax.swing.JTextField();
        bt_cadArtGenArt = new javax.swing.JButton();
        lbl_cadArtResult = new javax.swing.JLabel();
        lbl_emailArt = new javax.swing.JLabel();
        txt_cadEmailArtGenArt = new javax.swing.JTextField();
        bt_voltarGenArt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 82, 201));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        lbl_tituloLogin.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_tituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloLogin.setText("Gerenciamento de Artistas");

        jf_cadArt.setBackground(new java.awt.Color(0, 0, 0));
        jf_cadArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        lbl_casArtTitleGenArt.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_casArtTitleGenArt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_casArtTitleGenArt.setText("Cadastrar Artista");

        lbl_nomeArt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_nomeArt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nomeArt.setText("Nome");

        lbl_bandaArt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_bandaArt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bandaArt.setText("Banda");

        txt_cadNomeArtGenArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadNomeArtGenArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        txt_cadNomeArtGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadNomeArtGenArtActionPerformed(evt);
            }
        });

        txt_cadBandaArtGenArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadBandaArtGenArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        txt_cadBandaArtGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadBandaArtGenArtActionPerformed(evt);
            }
        });

        bt_cadArtGenArt.setBackground(new java.awt.Color(42, 82, 201));
        bt_cadArtGenArt.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_cadArtGenArt.setForeground(new java.awt.Color(255, 255, 255));
        bt_cadArtGenArt.setText("Cadastrar");
        bt_cadArtGenArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        bt_cadArtGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadArtGenArtActionPerformed(evt);
            }
        });

        lbl_cadArtResult.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N

        lbl_emailArt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_emailArt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emailArt.setText("Email");

        txt_cadEmailArtGenArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadEmailArtGenArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        txt_cadEmailArtGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadEmailArtGenArtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jf_cadArtLayout = new javax.swing.GroupLayout(jf_cadArt);
        jf_cadArt.setLayout(jf_cadArtLayout);
        jf_cadArtLayout.setHorizontalGroup(
            jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_cadArtLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_bandaArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_emailArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_nomeArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cadNomeArtGenArt, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(txt_cadBandaArtGenArt)
                    .addComponent(txt_cadEmailArtGenArt)
                    .addComponent(lbl_cadArtResult, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_cadArtLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_cadArtLayout.createSequentialGroup()
                        .addComponent(lbl_casArtTitleGenArt)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_cadArtLayout.createSequentialGroup()
                        .addComponent(bt_cadArtGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        jf_cadArtLayout.setVerticalGroup(
            jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_cadArtLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_casArtTitleGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nomeArt)
                    .addComponent(txt_cadNomeArtGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_bandaArt)
                    .addComponent(txt_cadBandaArtGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_emailArt)
                    .addComponent(txt_cadEmailArtGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_cadArtGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lbl_cadArtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bt_voltarGenArt.setBackground(new java.awt.Color(0, 0, 0));
        bt_voltarGenArt.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_voltarGenArt.setForeground(new java.awt.Color(255, 255, 255));
        bt_voltarGenArt.setText("Voltar");
        bt_voltarGenArt.setActionCommand("");
        bt_voltarGenArt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        bt_voltarGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarGenArtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lbl_tituloLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jf_cadArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_voltarGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_tituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jf_cadArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_voltarGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cadNomeArtGenArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadNomeArtGenArtActionPerformed
        
    }//GEN-LAST:event_txt_cadNomeArtGenArtActionPerformed

    private void txt_cadBandaArtGenArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadBandaArtGenArtActionPerformed
    
    }//GEN-LAST:event_txt_cadBandaArtGenArtActionPerformed

    private void bt_cadArtGenArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadArtGenArtActionPerformed
        cga.cadastrarArtista();
    }//GEN-LAST:event_bt_cadArtGenArtActionPerformed

    private void bt_voltarGenArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarGenArtActionPerformed
        cga.voltaMenu();
    }//GEN-LAST:event_bt_voltarGenArtActionPerformed

    private void txt_cadEmailArtGenArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadEmailArtGenArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cadEmailArtGenArtActionPerformed

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
//            java.util.logging.Logger.getLogger(telaGenArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(telaGenArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(telaGenArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(telaGenArt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new telaGenArt().setVisible(true);
//            }
//        });
//    }

    private final ControleGenArt cga;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadArtGenArt;
    private javax.swing.JButton bt_voltarGenArt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jf_cadArt;
    private javax.swing.JLabel lbl_bandaArt;
    private javax.swing.JLabel lbl_cadArtResult;
    private javax.swing.JLabel lbl_casArtTitleGenArt;
    private javax.swing.JLabel lbl_emailArt;
    private javax.swing.JLabel lbl_nomeArt;
    private javax.swing.JLabel lbl_tituloLogin;
    private javax.swing.JTextField txt_cadBandaArtGenArt;
    private javax.swing.JTextField txt_cadEmailArtGenArt;
    private javax.swing.JTextField txt_cadNomeArtGenArt;
    // End of variables declaration//GEN-END:variables
}
