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

        lbl_tituloLogin = new javax.swing.JLabel();
        jf_cadArt = new javax.swing.JPanel();
        lbl_casArtTitleGenArt = new javax.swing.JLabel();
        lbl_nomeArt = new javax.swing.JLabel();
        lbl_bandaArt = new javax.swing.JLabel();
        txt_cadNomeArtGenArt = new javax.swing.JTextField();
        txt_cadBandaArtGenArt = new javax.swing.JTextField();
        bt_cadArtGenArt = new javax.swing.JButton();
        lbl_cadArtResult = new javax.swing.JLabel();
        bt_voltarGenArt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_tituloLogin.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_tituloLogin.setText("Gerenciamento de Artistas");

        jf_cadArt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_casArtTitleGenArt.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_casArtTitleGenArt.setText("Cadastrar Artista");

        lbl_nomeArt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_nomeArt.setText("Nome");

        lbl_bandaArt.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_bandaArt.setText("Banda");

        txt_cadNomeArtGenArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadNomeArtGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadNomeArtGenArtActionPerformed(evt);
            }
        });

        txt_cadBandaArtGenArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadBandaArtGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadBandaArtGenArtActionPerformed(evt);
            }
        });

        bt_cadArtGenArt.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_cadArtGenArt.setText("Cadastrar");
        bt_cadArtGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadArtGenArtActionPerformed(evt);
            }
        });

        lbl_cadArtResult.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N

        javax.swing.GroupLayout jf_cadArtLayout = new javax.swing.GroupLayout(jf_cadArt);
        jf_cadArt.setLayout(jf_cadArtLayout);
        jf_cadArtLayout.setHorizontalGroup(
            jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_cadArtLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_cadArtLayout.createSequentialGroup()
                        .addComponent(lbl_casArtTitleGenArt)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_cadArtLayout.createSequentialGroup()
                        .addComponent(bt_cadArtGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))))
            .addGroup(jf_cadArtLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_bandaArt)
                    .addComponent(lbl_nomeArt))
                .addGap(18, 18, 18)
                .addGroup(jf_cadArtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cadNomeArtGenArt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(txt_cadBandaArtGenArt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(lbl_cadArtResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(36, 36, 36)
                .addComponent(bt_cadArtGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lbl_cadArtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        bt_voltarGenArt.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_voltarGenArt.setText("Voltar");
        bt_voltarGenArt.setActionCommand("");
        bt_voltarGenArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarGenArtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jf_cadArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_tituloLogin)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(bt_voltarGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_tituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jf_cadArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(bt_voltarGenArt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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
    private javax.swing.JPanel jf_cadArt;
    private javax.swing.JLabel lbl_bandaArt;
    private javax.swing.JLabel lbl_cadArtResult;
    private javax.swing.JLabel lbl_casArtTitleGenArt;
    private javax.swing.JLabel lbl_nomeArt;
    private javax.swing.JLabel lbl_tituloLogin;
    private javax.swing.JTextField txt_cadBandaArtGenArt;
    private javax.swing.JTextField txt_cadNomeArtGenArt;
    // End of variables declaration//GEN-END:variables
}
