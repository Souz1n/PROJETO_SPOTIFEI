/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Controller.ControlePlaylistUser;

/**
 *
 * @author unifgalvarenga
 */
public class telaPlaylistUser extends javax.swing.JFrame {

    /**
     * Creates new form telaPlayslistUser
     */
    public telaPlaylistUser() {
        initComponents();
        cpu = new ControlePlaylistUser(this);
    }

    public JButton getBt_adicionarMusica() {
        return bt_ediPlaylist;
    }

    public JLabel getLbl_genCriarPRes() {
        return lbl_genCriarPRes;
    }

    public void setLbl_genCriarPRes(JLabel lbl_genCriarPRes) {
        this.lbl_genCriarPRes = lbl_genCriarPRes;
    }
    
    

    public void setBt_adicionarMusica(JButton bt_adicionarMusica) {
        this.bt_ediPlaylist = bt_adicionarMusica;
    }

    public JButton getBt_criarPlaylist() {
        return bt_ediPlaylist;
    }

    public void setBt_criarPlaylist(JButton bt_criarPlaylist) {
        this.bt_ediPlaylist = bt_criarPlaylist;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbl_tituloPlaylist() {
        return lbl_tituloDelPlaylist;
    }

    public void setLbl_tituloPlaylist(JLabel lbl_tituloPlaylist) {
        this.lbl_tituloDelPlaylist = lbl_tituloPlaylist;
    }

    public JButton getBt_criarPlaylist1() {
        return bt_criarPlaylist1;
    }

    public void setBt_criarPlaylist1(JButton bt_criarPlaylist1) {
        this.bt_criarPlaylist1 = bt_criarPlaylist1;
    }

    public JButton getBt_delPlayl() {
        return bt_delPlayl;
    }

    public void setBt_delPlayl(JButton bt_delPlayl) {
        this.bt_delPlayl = bt_delPlayl;
    }

    public JButton getBt_ediPlaylist() {
        return bt_ediPlaylist;
    }

    public void setBt_ediPlaylist(JButton bt_ediPlaylist) {
        this.bt_ediPlaylist = bt_ediPlaylist;
    }

    public JButton getBt_voltarMenuUser1() {
        return bt_voltarMenuUser1;
    }

    public void setBt_voltarMenuUser1(JButton bt_voltarMenuUser1) {
        this.bt_voltarMenuUser1 = bt_voltarMenuUser1;
    }

    public JList<String> getJl_delPlaylist() {
        return jl_delPlaylist;
    }

    public void setJl_delPlaylist(JList<String> jl_delPlaylist) {
        this.jl_delPlaylist = jl_delPlaylist;
    }

    public JPanel getJp_criarPlaylist() {
        return jp_criarPlaylist;
    }

    public void setJp_criarPlaylist(JPanel jp_criarPlaylist) {
        this.jp_criarPlaylist = jp_criarPlaylist;
    }

    public JPanel getJp_criarPlaylist1() {
        return jp_criarPlaylist1;
    }

    public void setJp_criarPlaylist1(JPanel jp_criarPlaylist1) {
        this.jp_criarPlaylist1 = jp_criarPlaylist1;
    }

    public JPanel getJp_minhasPlaylist() {
        return jp_minhasPlaylist;
    }

    public void setJp_minhasPlaylist(JPanel jp_minhasPlaylist) {
        this.jp_minhasPlaylist = jp_minhasPlaylist;
    }

    public JLabel getLbl_delPListaPlay() {
        return lbl_delPListaPlay;
    }

    public void setLbl_delPListaPlay(JLabel lbl_delPListaPlay) {
        this.lbl_delPListaPlay = lbl_delPListaPlay;
    }

    public JLabel getLbl_ediCriarPRes() {
        return lbl_ediCriarPRes;
    }

    public void setLbl_ediCriarPRes(JLabel lbl_ediCriarPRes) {
        this.lbl_ediCriarPRes = lbl_ediCriarPRes;
    }

    public JLabel getLbl_editPlaylNam() {
        return lbl_editPlaylNam;
    }

    public void setLbl_editPlaylNam(JLabel lbl_editPlaylNam) {
        this.lbl_editPlaylNam = lbl_editPlaylNam;
    }

    public JLabel getLbl_genCriarPRes1() {
        return lbl_genCriarPRes;
    }

    public void setLbl_genCriarPRes1(JLabel lbl_genCriarPRes1) {
        this.lbl_genCriarPRes = lbl_genCriarPRes1;
    }

    public JLabel getLbl_genDelPRes() {
        return lbl_genDelPRes;
    }

    public void setLbl_genDelPRes(JLabel lbl_genDelPRes) {
        this.lbl_genDelPRes = lbl_genDelPRes;
    }

    public JLabel getLbl_genPlaylNam() {
        return lbl_genPlaylNam;
    }

    public void setLbl_genPlaylNam(JLabel lbl_genPlaylNam) {
        this.lbl_genPlaylNam = lbl_genPlaylNam;
    }

    public JLabel getLbl_tituloCriaPlaylist() {
        return lbl_tituloCriaPlaylist;
    }

    public void setLbl_tituloCriaPlaylist(JLabel lbl_tituloCriaPlaylist) {
        this.lbl_tituloCriaPlaylist = lbl_tituloCriaPlaylist;
    }

    public JLabel getLbl_tituloDelPlaylist() {
        return lbl_tituloDelPlaylist;
    }

    public void setLbl_tituloDelPlaylist(JLabel lbl_tituloDelPlaylist) {
        this.lbl_tituloDelPlaylist = lbl_tituloDelPlaylist;
    }

    public JLabel getLbl_tituloEditPlaylist() {
        return lbl_tituloEditPlaylist;
    }

    public void setLbl_tituloEditPlaylist(JLabel lbl_tituloEditPlaylist) {
        this.lbl_tituloEditPlaylist = lbl_tituloEditPlaylist;
    }

    public JTextField getTxt_criarPlayNam() {
        return txt_criarPlayNam;
    }

    public void setTxt_criarPlayNam(JTextField txt_criarPlayNam) {
        this.txt_criarPlayNam = txt_criarPlayNam;
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_criarPlaylist = new javax.swing.JPanel();
        lbl_tituloEditPlaylist = new javax.swing.JLabel();
        lbl_editPlaylNam = new javax.swing.JLabel();
        bt_ediPlaylist = new javax.swing.JButton();
        lbl_ediCriarPRes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_editPlaylist = new javax.swing.JList<>();
        jp_criarPlaylist1 = new javax.swing.JPanel();
        bt_voltarMenuUser1 = new javax.swing.JButton();
        lbl_tituloCriaPlaylist = new javax.swing.JLabel();
        lbl_genPlaylNam = new javax.swing.JLabel();
        txt_criarPlayNam = new javax.swing.JTextField();
        bt_criarPlaylist1 = new javax.swing.JButton();
        lbl_genCriarPRes = new javax.swing.JLabel();
        jp_minhasPlaylist = new javax.swing.JPanel();
        lbl_tituloDelPlaylist = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_delPlaylist = new javax.swing.JList<>();
        lbl_delPListaPlay = new javax.swing.JLabel();
        bt_delPlayl = new javax.swing.JButton();
        lbl_genDelPRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_criarPlaylist.setBackground(new java.awt.Color(42, 82, 201));

        lbl_tituloEditPlaylist.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_tituloEditPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloEditPlaylist.setText("EDITAR PLAYLIST");

        lbl_editPlaylNam.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_editPlaylNam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_editPlaylNam.setText("Nome da Playlist:");

        bt_ediPlaylist.setBackground(new java.awt.Color(0, 0, 0));
        bt_ediPlaylist.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_ediPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        bt_ediPlaylist.setText("Editar");
        bt_ediPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ediPlaylistActionPerformed(evt);
            }
        });

        lbl_ediCriarPRes.setForeground(new java.awt.Color(255, 255, 255));

        jl_editPlaylist.setBackground(new java.awt.Color(204, 204, 204));
        jl_editPlaylist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jl_editPlaylist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jl_editPlaylist);

        javax.swing.GroupLayout jp_criarPlaylistLayout = new javax.swing.GroupLayout(jp_criarPlaylist);
        jp_criarPlaylist.setLayout(jp_criarPlaylistLayout);
        jp_criarPlaylistLayout.setHorizontalGroup(
            jp_criarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_criarPlaylistLayout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(lbl_ediCriarPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jp_criarPlaylistLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(bt_ediPlaylist)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_criarPlaylistLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(lbl_editPlaylNam)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_criarPlaylistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_criarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tituloEditPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_criarPlaylistLayout.setVerticalGroup(
            jp_criarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_criarPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloEditPlaylist)
                .addGap(15, 15, 15)
                .addComponent(lbl_editPlaylNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_ediPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(lbl_ediCriarPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jp_criarPlaylist1.setBackground(new java.awt.Color(42, 82, 201));

        bt_voltarMenuUser1.setBackground(new java.awt.Color(0, 0, 0));
        bt_voltarMenuUser1.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_voltarMenuUser1.setForeground(new java.awt.Color(255, 255, 255));
        bt_voltarMenuUser1.setText("Voltar");
        bt_voltarMenuUser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarMenuUser1ActionPerformed(evt);
            }
        });

        lbl_tituloCriaPlaylist.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_tituloCriaPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloCriaPlaylist.setText("CRIAR PLAYLIST");

        lbl_genPlaylNam.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_genPlaylNam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_genPlaylNam.setText("Nome da Playlist:");

        txt_criarPlayNam.setBackground(new java.awt.Color(204, 204, 204));
        txt_criarPlayNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_criarPlayNamActionPerformed(evt);
            }
        });

        bt_criarPlaylist1.setBackground(new java.awt.Color(0, 0, 0));
        bt_criarPlaylist1.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_criarPlaylist1.setForeground(new java.awt.Color(255, 255, 255));
        bt_criarPlaylist1.setText("Criar");
        bt_criarPlaylist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_criarPlaylist1ActionPerformed(evt);
            }
        });

        lbl_genCriarPRes.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp_criarPlaylist1Layout = new javax.swing.GroupLayout(jp_criarPlaylist1);
        jp_criarPlaylist1.setLayout(jp_criarPlaylist1Layout);
        jp_criarPlaylist1Layout.setHorizontalGroup(
            jp_criarPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_criarPlaylist1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(lbl_tituloCriaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jp_criarPlaylist1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_criarPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_genPlaylNam)
                    .addGroup(jp_criarPlaylist1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_voltarMenuUser1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_criarPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_genCriarPRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_criarPlayNam))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_criarPlaylist1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_criarPlaylist1)
                .addGap(91, 91, 91))
        );
        jp_criarPlaylist1Layout.setVerticalGroup(
            jp_criarPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_criarPlaylist1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloCriaPlaylist)
                .addGap(54, 54, 54)
                .addGroup(jp_criarPlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_genPlaylNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_criarPlayNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_criarPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_genCriarPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_voltarMenuUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jp_minhasPlaylist.setBackground(new java.awt.Color(0, 0, 0));

        lbl_tituloDelPlaylist.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_tituloDelPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloDelPlaylist.setText("EXCLUIR Playlists");

        jl_delPlaylist.setBackground(new java.awt.Color(204, 204, 204));
        jl_delPlaylist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jl_delPlaylist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jl_delPlaylist);

        lbl_delPListaPlay.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_delPListaPlay.setForeground(new java.awt.Color(255, 255, 255));
        lbl_delPListaPlay.setText("Selecione sua Playlist");

        bt_delPlayl.setBackground(new java.awt.Color(42, 82, 201));
        bt_delPlayl.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_delPlayl.setForeground(new java.awt.Color(255, 255, 255));
        bt_delPlayl.setText("Deletar");
        bt_delPlayl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delPlaylActionPerformed(evt);
            }
        });

        lbl_genDelPRes.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp_minhasPlaylistLayout = new javax.swing.GroupLayout(jp_minhasPlaylist);
        jp_minhasPlaylist.setLayout(jp_minhasPlaylistLayout);
        jp_minhasPlaylistLayout.setHorizontalGroup(
            jp_minhasPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_minhasPlaylistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_minhasPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_minhasPlaylistLayout.createSequentialGroup()
                        .addComponent(lbl_tituloDelPlaylist)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_minhasPlaylistLayout.createSequentialGroup()
                        .addComponent(lbl_delPListaPlay)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_minhasPlaylistLayout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addGroup(jp_minhasPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_genDelPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_minhasPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_minhasPlaylistLayout.createSequentialGroup()
                            .addComponent(bt_delPlayl)
                            .addGap(71, 71, 71))))
                .addGap(70, 70, 70))
        );
        jp_minhasPlaylistLayout.setVerticalGroup(
            jp_minhasPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_minhasPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloDelPlaylist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_delPListaPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(bt_delPlayl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(lbl_genDelPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jp_criarPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_minhasPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_criarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_criarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_criarPlaylist1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jp_minhasPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ediPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ediPlaylistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ediPlaylistActionPerformed

    private void bt_delPlaylActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delPlaylActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_delPlaylActionPerformed

    private void bt_voltarMenuUser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarMenuUser1ActionPerformed
        cpu.voltarMenu();
    }//GEN-LAST:event_bt_voltarMenuUser1ActionPerformed

    private void txt_criarPlayNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_criarPlayNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_criarPlayNamActionPerformed

    public JList<String> getJl_editPlaylist() {
        return jl_editPlaylist;
    }

    public void setJl_editPlaylist(JList<String> jl_editPlaylist) {
        this.jl_editPlaylist = jl_editPlaylist;
    }

    private void bt_criarPlaylist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_criarPlaylist1ActionPerformed
        cpu.CriarPlaylist();
    }//GEN-LAST:event_bt_criarPlaylist1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
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
//            java.util.logging.Logger.getLogger(telaPlayslistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(telaPlayslistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(telaPlayslistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(telaPlayslistUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new telaPlayslistUser().setVisible(true);
//            }
//        });
//    }
    private final ControlePlaylistUser cpu;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_criarPlaylist1;
    private javax.swing.JButton bt_delPlayl;
    private javax.swing.JButton bt_ediPlaylist;
    private javax.swing.JButton bt_voltarMenuUser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jl_delPlaylist;
    private javax.swing.JList<String> jl_editPlaylist;
    private javax.swing.JPanel jp_criarPlaylist;
    private javax.swing.JPanel jp_criarPlaylist1;
    private javax.swing.JPanel jp_minhasPlaylist;
    private javax.swing.JLabel lbl_delPListaPlay;
    private javax.swing.JLabel lbl_ediCriarPRes;
    private javax.swing.JLabel lbl_editPlaylNam;
    private javax.swing.JLabel lbl_genCriarPRes;
    private javax.swing.JLabel lbl_genDelPRes;
    private javax.swing.JLabel lbl_genPlaylNam;
    private javax.swing.JLabel lbl_tituloCriaPlaylist;
    private javax.swing.JLabel lbl_tituloDelPlaylist;
    private javax.swing.JLabel lbl_tituloEditPlaylist;
    private javax.swing.JTextField txt_criarPlayNam;
    // End of variables declaration//GEN-END:variables
}
