/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

//import Controller.ControleHistoricoUser;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controller.*;
import View.*;
import Controller.ControlePlaylistUser;
import Controller.ControleHistoricoUser;

/**
 *
 * @author Win 10
 */
public class telaMenuUser extends javax.swing.JFrame {


    public telaMenuUser() {
        initComponents();
        cmu = new ControleMenuUser(this);
        pn_infoMus.setVisible(false);
}

    public JLabel getLbl_sourcNomeMusRes() {
        return lbl_sourcNomeMusRes;
    }

    public void setLbl_sourcNomeMusRes(JLabel lbl_sourcNomeMusRes) {
        this.lbl_sourcNomeMusRes = lbl_sourcNomeMusRes;
    }

    public JLabel getLbl_sourMusStatusBarra() {
        return lbl_sourMusStatusBarra;
    }

    public void setLbl_sourMusStatusBarra(JLabel lbl_sourMusStatusBarra) {
        this.lbl_sourMusStatusBarra = lbl_sourMusStatusBarra;
    }
    
    

    public JButton getBt_souceMus() {
        return bt_souceMus;
    }

    public void setBt_souceMus(JButton bt_souceMus) {
        this.bt_souceMus = bt_souceMus;
    }

    public JLabel getLbl_cadMusName() {
        return lbl_sourcNomeMusRes;
    }

    public void setLbl_cadMusName(JLabel lbl_cadMusName) {
        this.lbl_sourcNomeMusRes = lbl_cadMusName;
    }

    public JLabel getLbl_sourMusArt() {
        return lbl_sourMusArt;
    }

    public void setLbl_sourMusArt(JLabel lbl_sourMusArt) {
        this.lbl_sourMusArt = lbl_sourMusArt;
    }

    public JLabel getLbl_sourMusGener() {
        return lbl_sourMusGener;
    }

    public void setLbl_sourMusGener(JLabel lbl_sourMusGener) {
        this.lbl_sourMusGener = lbl_sourMusGener;
    }

    public JLabel getLbl_sourMusYear() {
        return lbl_sourMusYear;
    }

    public void setLbl_sourMusYear(JLabel lbl_sourMusYear) {
        this.lbl_sourMusYear = lbl_sourMusYear;
    }

    public JPanel getPn_infoMus() {
        return pn_infoMus;
    }

    public JLabel getLbl_sourMusStatus() {
        return lbl_sourMusStatus;
    }

    public void setLbl_sourMusStatus(JLabel lbl_sourMusStatus) {
        this.lbl_sourMusStatus = lbl_sourMusStatus;
    }

    public void setPn_infoMus(JPanel pn_infoMus) {
        this.pn_infoMus = pn_infoMus;
    }

    public JTextField getTxt_barraPesquisaMus() {
        return txt_barraPesquisaMus;
    }

    public void setTxt_barraPesquisaMus(JTextField txt_barraPesquisaMus) {
        this.txt_barraPesquisaMus = txt_barraPesquisaMus;
    }

    public JButton getBt_fechaSource() {
        return bt_fechaSource;
    }

    public void setBt_fechaSource(JButton bt_fechaSource) {
        this.bt_fechaSource = bt_fechaSource;
    }

    public JButton getBt_voltarLog() {
        return bt_voltarLog;
    }

    public void setBt_voltarLog(JButton bt_voltarLog) {
        this.bt_voltarLog = bt_voltarLog;
    }

    public JLabel getLbl_sourceMusAnoRes() {
        return lbl_sourceMusAnoRes;
    }

    public void setLbl_sourceMusAnoRes(JLabel lbl_sourceMusAno) {
        this.lbl_sourceMusAnoRes = lbl_sourceMusAno;
    }

    public JLabel getLbl_sourceMusArtRes() {
        return lbl_sourceMusArtRes;
    }

    public void setLbl_sourceMusArtRes(JLabel lbl_sourceMusArt) {
        this.lbl_sourceMusArtRes = lbl_sourceMusArt;
    }

    public JLabel getLbl_sourceMusGenRes() {
        return lbl_sourceMusGenRes;
    }

    public void setLbl_sourceMusGenRes(JLabel lbl_sourceMusGen) {
        this.lbl_sourceMusGenRes = lbl_sourceMusGen;
    }

    public JButton getBt_likeMus() {
        return bt_likeMus;
    }

    public void setBt_likeMus(JButton bt_likeMus) {
        this.bt_likeMus = bt_likeMus;
    }

    public JButton getBt_dislikeMus() {
        return bt_dislikeMus;
    }

    public void setBt_dislikeMus(JButton bt_dislikeMus) {
        this.bt_dislikeMus = bt_dislikeMus;
    }

    public JButton getBt_genHistoricoUser() {
        return bt_genHistoricoUser;
    }

    public void setBt_genHistoricoUser(JButton bt_genHistoricoUser) {
        this.bt_genHistoricoUser = bt_genHistoricoUser;
    }

    public JButton getBt_genPlaylist() {
        return bt_genPlaylist;
    }

    public void setBt_genPlaylist(JButton bt_genPlaylist) {
        this.bt_genPlaylist = bt_genPlaylist;
    }

    public JButton getBt_sourcCurtir() {
        return bt_sourcCurtir;
    }

    public void setBt_sourcCurtir(JButton bt_sourcCurtir) {
        this.bt_sourcCurtir = bt_sourcCurtir;
    }

    public JButton getBt_sourcDescurtir() {
        return bt_sourcDescurtir;
    }

    public void setBt_sourcDescurtir(JButton bt_sourcDescurtir) {
        this.bt_sourcDescurtir = bt_sourcDescurtir;
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
        txt_barraPesquisaMus = new javax.swing.JTextField();
        bt_souceMus = new javax.swing.JButton();
        pn_infoMus = new javax.swing.JPanel();
        lbl_sourMusArt = new javax.swing.JLabel();
        lbl_sourcNomeMusRes = new javax.swing.JLabel();
        lbl_sourMusYear = new javax.swing.JLabel();
        lbl_sourMusGener = new javax.swing.JLabel();
        lbl_sourMusStatus = new javax.swing.JLabel();
        bt_fechaSource = new javax.swing.JButton();
        lbl_sourceMusArtRes = new javax.swing.JLabel();
        lbl_sourceMusAnoRes = new javax.swing.JLabel();
        lbl_sourceMusGenRes = new javax.swing.JLabel();
        bt_sourcCurtir = new javax.swing.JButton();
        bt_sourcDescurtir = new javax.swing.JButton();
        bt_voltarLog = new javax.swing.JButton();
        lbl_sourMusStatusBarra = new javax.swing.JLabel();
        bt_genPlaylist = new javax.swing.JButton();
        bt_genHistoricoUser = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_barraPesquisaMus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_barraPesquisaMus.setText(" ");
        txt_barraPesquisaMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_barraPesquisaMusActionPerformed(evt);
            }
        });

        bt_souceMus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/img_source.png"))); // NOI18N
        bt_souceMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_souceMusActionPerformed(evt);
            }
        });

        pn_infoMus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_sourMusArt.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_sourMusArt.setText("Artista:");

        lbl_sourcNomeMusRes.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N

        lbl_sourMusYear.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_sourMusYear.setText("Ano:");

        lbl_sourMusGener.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_sourMusGener.setText("Genero:");

        lbl_sourMusStatus.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N

        bt_fechaSource.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_fechaSource.setText("X");
        bt_fechaSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fechaSourceActionPerformed(evt);
            }
        });

        lbl_sourceMusArtRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_sourceMusAnoRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_sourceMusGenRes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        bt_sourcCurtir.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_sourcCurtir.setText("Like");
        bt_sourcCurtir.setActionCommand("");
        bt_sourcCurtir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sourcCurtirActionPerformed(evt);
            }
        });

        bt_sourcDescurtir.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_sourcDescurtir.setText("Deslike");
        bt_sourcDescurtir.setActionCommand("");
        bt_sourcDescurtir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sourcDescurtirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_infoMusLayout = new javax.swing.GroupLayout(pn_infoMus);
        pn_infoMus.setLayout(pn_infoMusLayout);
        pn_infoMusLayout.setHorizontalGroup(
            pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_infoMusLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(lbl_sourMusStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_infoMusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_sourcNomeMusRes, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_fechaSource, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pn_infoMusLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_infoMusLayout.createSequentialGroup()
                        .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sourMusArt)
                            .addComponent(lbl_sourMusYear))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_infoMusLayout.createSequentialGroup()
                        .addComponent(lbl_sourMusGener)
                        .addGap(46, 46, 46)))
                .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sourceMusGenRes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_sourceMusArtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_sourceMusAnoRes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_sourcCurtir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sourcDescurtir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pn_infoMusLayout.setVerticalGroup(
            pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_infoMusLayout.createSequentialGroup()
                .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_infoMusLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_sourcNomeMusRes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_infoMusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_fechaSource, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_sourceMusArtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sourMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_sourcCurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_infoMusLayout.createSequentialGroup()
                        .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sourceMusAnoRes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sourMusYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pn_infoMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_sourMusGener, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sourceMusGenRes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_sourcDescurtir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_sourMusStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_voltarLog.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_voltarLog.setText("Voltar");
        bt_voltarLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarLogActionPerformed(evt);
            }
        });

        lbl_sourMusStatusBarra.setFont(new java.awt.Font("Swis721 Cn BT", 0, 12)); // NOI18N

        bt_genPlaylist.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_genPlaylist.setText("Gerenciar Playlists");
        bt_genPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_genPlaylistActionPerformed(evt);
            }
        });

        bt_genHistoricoUser.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_genHistoricoUser.setText("Histórico");
        bt_genHistoricoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_genHistoricoUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_barraPesquisaMus, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_souceMus))
                    .addComponent(pn_infoMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_genPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_genHistoricoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bt_voltarLog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_sourMusStatusBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_souceMus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_barraPesquisaMus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_infoMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(bt_genPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_genHistoricoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_voltarLog, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sourMusStatusBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_barraPesquisaMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_barraPesquisaMusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_barraPesquisaMusActionPerformed

    private void bt_souceMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_souceMusActionPerformed
        cmu.consultarMusica();
        cmu.InserirHistoricoMusica();
        
    }//GEN-LAST:event_bt_souceMusActionPerformed

    private void bt_fechaSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fechaSourceActionPerformed
        cmu.sairSource();
    }//GEN-LAST:event_bt_fechaSourceActionPerformed

    private void bt_voltarLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarLogActionPerformed
        cmu.voltarLog();
    }//GEN-LAST:event_bt_voltarLogActionPerformed

    private void bt_sourcDescurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sourcDescurtirActionPerformed
        cmu.descurtirMusica(txt_barraPesquisaMus.getText());
        cmu.InserirHistoricoDescurtida();
    }//GEN-LAST:event_bt_sourcDescurtirActionPerformed

    private void bt_sourcCurtirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sourcCurtirActionPerformed
        String nomeMusica = txt_barraPesquisaMus.getText();
        cmu.curtirMusica(nomeMusica);
        if (cmu.VerificarCurtirMusica(nomeMusica)) {
            cmu.InserirHistoricoCurtida();
        }
    }//GEN-LAST:event_bt_sourcCurtirActionPerformed

    private void bt_genPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_genPlaylistActionPerformed
        cmu.fechar();
        telaPlaylistUser telaPlU = new telaPlaylistUser(); 
        ControlePlaylistUser cpu = new ControlePlaylistUser(telaPlU); 
        
        cpu.carregarPlaylist();
        telaPlU.setVisible(true); 
    }//GEN-LAST:event_bt_genPlaylistActionPerformed

    private void bt_genHistoricoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_genHistoricoUserActionPerformed
        cmu.fechar();
        telaHistoricoUser telaHisU = new telaHistoricoUser(); 
        ControleHistoricoUser chu = new ControleHistoricoUser(telaHisU); 
        
        chu.carregarPlaylistMusica();
        chu.carregarPlaylistDescurtida();
        chu.carregarPlaylistCurtida(); 
        telaHisU.setVisible(true);
    }//GEN-LAST:event_bt_genHistoricoUserActionPerformed

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
//            java.util.logging.Logger.getLogger(telaMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(telaMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(telaMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(telaMenuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new telaMenuUser().setVisible(true);
//            }
//        });
//    }
    private final ControleMenuUser cmu;
    private javax.swing.JButton bt_likeMus;
    private javax.swing.JButton bt_dislikeMus;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_fechaSource;
    private javax.swing.JButton bt_genHistoricoUser;
    private javax.swing.JButton bt_genPlaylist;
    private javax.swing.JButton bt_souceMus;
    private javax.swing.JButton bt_sourcCurtir;
    private javax.swing.JButton bt_sourcDescurtir;
    private javax.swing.JButton bt_voltarLog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_sourMusArt;
    private javax.swing.JLabel lbl_sourMusGener;
    private javax.swing.JLabel lbl_sourMusStatus;
    private javax.swing.JLabel lbl_sourMusStatusBarra;
    private javax.swing.JLabel lbl_sourMusYear;
    private javax.swing.JLabel lbl_sourcNomeMusRes;
    private javax.swing.JLabel lbl_sourceMusAnoRes;
    private javax.swing.JLabel lbl_sourceMusArtRes;
    private javax.swing.JLabel lbl_sourceMusGenRes;
    private javax.swing.JPanel pn_infoMus;
    private javax.swing.JTextField txt_barraPesquisaMus;
    // End of variables declaration//GEN-END:variables
}
