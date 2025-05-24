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
        jp_editMusP.setVisible(false);
        cpu = new ControlePlaylistUser(this);
        cpu.carregarPlaylist();
    }

    public JList<String> getJl_musPlaylist() {
        return jl_musPlaylist;
    }

    public void setJl_musPlaylist(JList<String> jl_musPlaylist) {
        this.jl_musPlaylist = jl_musPlaylist;
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
        return jp_editarPlaylist;
    }

    public void setJp_criarPlaylist(JPanel jp_criarPlaylist) {
        this.jp_editarPlaylist = jp_criarPlaylist;
    }

    public JPanel getJp_criarPlaylist1() {
        return jp_criarPlaylist;
    }

    public void setJp_criarPlaylist1(JPanel jp_criarPlaylist1) {
        this.jp_criarPlaylist = jp_criarPlaylist1;
    }

    public JPanel getJp_minhasPlaylist() {
        return jp_editPlaylist;
    }

    public void setJp_minhasPlaylist(JPanel jp_minhasPlaylist) {
        this.jp_editPlaylist = jp_minhasPlaylist;
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

    public JButton getBt_delMusPlay() {
        return bt_delMusPlay;
    }

    public void setBt_delMusPlay(JButton bt_delMusPlay) {
        this.bt_delMusPlay = bt_delMusPlay;
    }

    public JButton getBt_insMusPlay() {
        return bt_insMusPlay;
    }

    public void setBt_insMusPlay(JButton bt_insMusPlay) {
        this.bt_insMusPlay = bt_insMusPlay;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JPanel getJp_editMusP() {
        return jp_editMusP;
    }

    public void setJp_editMusP(JPanel jp_editMusP) {
        this.jp_editMusP = jp_editMusP;
    }

    public JPanel getJp_editPlaylist() {
        return jp_editPlaylist;
    }

    public void setJp_editPlaylist(JPanel jp_editPlaylist) {
        this.jp_editPlaylist = jp_editPlaylist;
    }

    public JPanel getJp_editarPlaylist() {
        return jp_editarPlaylist;
    }

    public void setJp_editarPlaylist(JPanel jp_editarPlaylist) {
        this.jp_editarPlaylist = jp_editarPlaylist;
    }

    public JLabel getLbl_editPlayRes() {
        return lbl_editPlayRes;
    }

    public void setLbl_editPlayRes(JLabel lbl_editPlayRes) {
        this.lbl_editPlayRes = lbl_editPlayRes;
    }

    public JLabel getLbl_editPlaylNameMus() {
        return lbl_editPlaylNameMus;
    }

    public void setLbl_editPlaylNameMus(JLabel lbl_editPlaylNameMus) {
        this.lbl_editPlaylNameMus = lbl_editPlaylNameMus;
    }

    public JLabel getLbl_editPlaylTit() {
        return lbl_editPlaylTit;
    }

    public void setLbl_editPlaylTit(JLabel lbl_editPlaylTit) {
        this.lbl_editPlaylTit = lbl_editPlaylTit;
    }

    public JTextField getTxt_nameMusPlaylistEdit() {
        return txt_nameMusPlaylistEdit;
    }

    public void setTxt_nameMusPlaylistEdit(JTextField txt_nameMusPlaylistEdit) {
        this.txt_nameMusPlaylistEdit = txt_nameMusPlaylistEdit;
    }

    public JPanel getPn_editMusP() {
        return jp_editMusP;
    }

    public void setPn_editMusP(JPanel pn_editMusP) {
        this.jp_editMusP = pn_editMusP;
    }
    

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_editarPlaylist = new javax.swing.JPanel();
        lbl_tituloEditPlaylist = new javax.swing.JLabel();
        lbl_editPlaylNam = new javax.swing.JLabel();
        bt_ediPlaylist = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_editPlaylist = new javax.swing.JList<>();
        jp_editMusP = new javax.swing.JPanel();
        lbl_editPlaylTit = new javax.swing.JLabel();
        lbl_editPlaylNameMus = new javax.swing.JLabel();
        txt_nameMusPlaylistEdit = new javax.swing.JTextField();
        bt_insMusPlay = new javax.swing.JButton();
        bt_delMusPlay = new javax.swing.JButton();
        lbl_editPlayRes = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_musPlaylist = new javax.swing.JList<>();
        lbl_ediCriarPRes = new javax.swing.JLabel();
        jp_criarPlaylist = new javax.swing.JPanel();
        bt_voltarMenuUser1 = new javax.swing.JButton();
        lbl_tituloCriaPlaylist = new javax.swing.JLabel();
        lbl_genPlaylNam = new javax.swing.JLabel();
        txt_criarPlayNam = new javax.swing.JTextField();
        bt_criarPlaylist1 = new javax.swing.JButton();
        lbl_genCriarPRes = new javax.swing.JLabel();
        jp_editPlaylist = new javax.swing.JPanel();
        lbl_tituloDelPlaylist = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_delPlaylist = new javax.swing.JList<>();
        lbl_delPListaPlay = new javax.swing.JLabel();
        bt_delPlayl = new javax.swing.JButton();
        lbl_genDelPRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_editarPlaylist.setBackground(new java.awt.Color(42, 82, 201));

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

        jl_editPlaylist.setBackground(new java.awt.Color(204, 204, 204));
        jl_editPlaylist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jl_editPlaylist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jl_editPlaylist);

        jp_editMusP.setBackground(new java.awt.Color(0, 0, 0));

        lbl_editPlaylTit.setFont(new java.awt.Font("Stencil", 1, 14)); // NOI18N
        lbl_editPlaylTit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_editPlaylTit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbl_editPlaylNameMus.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_editPlaylNameMus.setForeground(new java.awt.Color(255, 255, 255));
        lbl_editPlaylNameMus.setText("Nome da Musica");

        txt_nameMusPlaylistEdit.setBackground(new java.awt.Color(204, 204, 204));
        txt_nameMusPlaylistEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameMusPlaylistEditActionPerformed(evt);
            }
        });

        bt_insMusPlay.setBackground(new java.awt.Color(42, 82, 201));
        bt_insMusPlay.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_insMusPlay.setForeground(new java.awt.Color(255, 255, 255));
        bt_insMusPlay.setText("Inserir");
        bt_insMusPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_insMusPlayActionPerformed(evt);
            }
        });

        bt_delMusPlay.setBackground(new java.awt.Color(42, 82, 201));
        bt_delMusPlay.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_delMusPlay.setForeground(new java.awt.Color(255, 255, 255));
        bt_delMusPlay.setText("Excluir");
        bt_delMusPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_delMusPlayActionPerformed(evt);
            }
        });

        lbl_editPlayRes.setForeground(new java.awt.Color(255, 255, 255));

        jl_musPlaylist.setBackground(new java.awt.Color(204, 204, 204));
        jl_musPlaylist.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jl_musPlaylist.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jl_musPlaylist);

        javax.swing.GroupLayout jp_editMusPLayout = new javax.swing.GroupLayout(jp_editMusP);
        jp_editMusP.setLayout(jp_editMusPLayout);
        jp_editMusPLayout.setHorizontalGroup(
            jp_editMusPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_editMusPLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jp_editMusPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_editPlayRes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_editMusPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_editPlaylTit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_delMusPlay)
                        .addGroup(jp_editMusPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_editPlaylNameMus, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nameMusPlaylistEdit)
                            .addComponent(bt_insMusPlay)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63))
        );
        jp_editMusPLayout.setVerticalGroup(
            jp_editMusPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_editMusPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_editPlaylTit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_editPlaylNameMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nameMusPlaylistEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_editMusPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_insMusPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_delMusPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_editPlayRes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbl_ediCriarPRes.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jp_editarPlaylistLayout = new javax.swing.GroupLayout(jp_editarPlaylist);
        jp_editarPlaylist.setLayout(jp_editarPlaylistLayout);
        jp_editarPlaylistLayout.setHorizontalGroup(
            jp_editarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_editarPlaylistLayout.createSequentialGroup()
                .addGroup(jp_editarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_editarPlaylistLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jp_editarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_editarPlaylistLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(bt_ediPlaylist))
                            .addComponent(lbl_tituloEditPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp_editMusP, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_editarPlaylistLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_ediCriarPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_editarPlaylistLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lbl_editPlaylNam)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jp_editarPlaylistLayout.setVerticalGroup(
            jp_editarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_editarPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloEditPlaylist)
                .addGap(15, 15, 15)
                .addComponent(lbl_editPlaylNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_ediPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jp_editMusP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ediCriarPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jp_criarPlaylist.setBackground(new java.awt.Color(42, 82, 201));

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

        javax.swing.GroupLayout jp_criarPlaylistLayout = new javax.swing.GroupLayout(jp_criarPlaylist);
        jp_criarPlaylist.setLayout(jp_criarPlaylistLayout);
        jp_criarPlaylistLayout.setHorizontalGroup(
            jp_criarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_criarPlaylistLayout.createSequentialGroup()
                .addGroup(jp_criarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_criarPlaylistLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(bt_voltarMenuUser1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_criarPlaylistLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbl_tituloCriaPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jp_criarPlaylistLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jp_criarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_criarPlayNam, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_genPlaylNam)
                            .addComponent(bt_criarPlaylist1)
                            .addComponent(lbl_genCriarPRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(46, 72, Short.MAX_VALUE))
        );
        jp_criarPlaylistLayout.setVerticalGroup(
            jp_criarPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_criarPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloCriaPlaylist)
                .addGap(18, 18, 18)
                .addComponent(lbl_genPlaylNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_criarPlayNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_criarPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lbl_genCriarPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_voltarMenuUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jp_editPlaylist.setBackground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout jp_editPlaylistLayout = new javax.swing.GroupLayout(jp_editPlaylist);
        jp_editPlaylist.setLayout(jp_editPlaylistLayout);
        jp_editPlaylistLayout.setHorizontalGroup(
            jp_editPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_editPlaylistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_editPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_editPlaylistLayout.createSequentialGroup()
                        .addComponent(lbl_tituloDelPlaylist)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_editPlaylistLayout.createSequentialGroup()
                        .addComponent(lbl_delPListaPlay)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_editPlaylistLayout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addGroup(jp_editPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_genDelPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_editPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bt_delPlayl)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );
        jp_editPlaylistLayout.setVerticalGroup(
            jp_editPlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_editPlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tituloDelPlaylist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_delPListaPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_delPlayl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(lbl_genDelPRes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jp_criarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_editPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_editarPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_editarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_criarPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jp_editPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_ediPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ediPlaylistActionPerformed
        cpu.abrirEditarPlaylist();
        cpu.carregarMusica();
        cpu.carregarPlaylist();
    }//GEN-LAST:event_bt_ediPlaylistActionPerformed

    private void bt_delPlaylActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delPlaylActionPerformed
       cpu.removerPlaylistSelecionada();
       cpu.carregarPlaylist();
       cpu.carregarMusica();
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
        cpu.carregarPlaylist();
    }//GEN-LAST:event_bt_criarPlaylist1ActionPerformed

    private void txt_nameMusPlaylistEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameMusPlaylistEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameMusPlaylistEditActionPerformed

    private void bt_insMusPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_insMusPlayActionPerformed
        cpu.adicionarMusicaNaPlaylist();
        cpu.carregarMusica();
    }//GEN-LAST:event_bt_insMusPlayActionPerformed

    private void bt_delMusPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_delMusPlayActionPerformed
        cpu.removerMusicaNaPlaylist();
        cpu.carregarMusica();
    }//GEN-LAST:event_bt_delMusPlayActionPerformed

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
    private javax.swing.JButton bt_delMusPlay;
    private javax.swing.JButton bt_delPlayl;
    private javax.swing.JButton bt_ediPlaylist;
    private javax.swing.JButton bt_insMusPlay;
    private javax.swing.JButton bt_voltarMenuUser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> jl_delPlaylist;
    private javax.swing.JList<String> jl_editPlaylist;
    private javax.swing.JList<String> jl_musPlaylist;
    private javax.swing.JPanel jp_criarPlaylist;
    private javax.swing.JPanel jp_editMusP;
    private javax.swing.JPanel jp_editPlaylist;
    private javax.swing.JPanel jp_editarPlaylist;
    private javax.swing.JLabel lbl_delPListaPlay;
    private javax.swing.JLabel lbl_ediCriarPRes;
    private javax.swing.JLabel lbl_editPlayRes;
    private javax.swing.JLabel lbl_editPlaylNam;
    private javax.swing.JLabel lbl_editPlaylNameMus;
    private javax.swing.JLabel lbl_editPlaylTit;
    private javax.swing.JLabel lbl_genCriarPRes;
    private javax.swing.JLabel lbl_genDelPRes;
    private javax.swing.JLabel lbl_genPlaylNam;
    private javax.swing.JLabel lbl_tituloCriaPlaylist;
    private javax.swing.JLabel lbl_tituloDelPlaylist;
    private javax.swing.JLabel lbl_tituloEditPlaylist;
    private javax.swing.JTextField txt_criarPlayNam;
    private javax.swing.JTextField txt_nameMusPlaylistEdit;
    // End of variables declaration//GEN-END:variables
}
