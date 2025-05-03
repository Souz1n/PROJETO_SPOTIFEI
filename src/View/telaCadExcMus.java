/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ControleGenMus;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author unifbcosta
 */
public class telaCadExcMus extends javax.swing.JFrame {

    /**
     * Creates new form telaCadExcMus
     */
    public telaCadExcMus() {
        initComponents();
        CGM = new ControleGenMus(this);
    }

    public JButton getBt_cadMus() {
        return bt_cadMus;
    }

    public void setBt_cadMus(JButton bt_cadMus) {
        this.bt_cadMus = bt_cadMus;
    }

    public JButton getBt_consMusIdMus() {
        return bt_consMusIdMus;
    }

    public void setBt_consMusIdMus(JButton bt_consMusIdMus) {
        this.bt_consMusIdMus = bt_consMusIdMus;
    }

    public JButton getBt_excMus() {
        return bt_excMus;
    }

    public void setBt_excMus(JButton bt_excMus) {
        this.bt_excMus = bt_excMus;
    }

    public JPanel getJf_CadMus() {
        return jf_CadMus;
    }

    public void setJf_CadMus(JPanel jf_CadMus) {
        this.jf_CadMus = jf_CadMus;
    }

    public JPanel getJf_CadMus1() {
        return jf_ConsMus;
    }

    public void setJf_ConsMus(JPanel jf_ConsMus) {
        this.jf_ConsMus = jf_ConsMus;
    }

    public JPanel getJf_ExcMus() {
        return jf_ExcMus;
    }

    public void setJf_ExcMus(JPanel jf_ExcMus) {
        this.jf_ExcMus = jf_ExcMus;
    }

    public JLabel getLbl_cadMusArt() {
        return lbl_cadMusArt;
    }

    public void setLbl_cadMusArt(JLabel lbl_cadMusArt) {
        this.lbl_cadMusArt = lbl_cadMusArt;
    }

    public JLabel getLbl_cadMusName() {
        return lbl_cadMusName;
    }

    public void setLbl_cadMusName(JLabel lbl_cadMusName) {
        this.lbl_cadMusName = lbl_cadMusName;
    }

    public JLabel getLbl_cadMusStatus() {
        return lbl_cadMusStatus;
    }

    public void setLbl_cadMusStatus(JLabel lbl_cadMusStatus) {
        this.lbl_cadMusStatus = lbl_cadMusStatus;
    }

    public JLabel getLbl_cadMusTitle() {
        return lbl_cadMusTitle;
    }

    public void setLbl_cadMusTitle(JLabel lbl_cadMusTitle) {
        this.lbl_cadMusTitle = lbl_cadMusTitle;
    }

    public JLabel getLbl_cadMusYear() {
        return lbl_cadMusYear;
    }

    public void setLbl_cadMusYear(JLabel lbl_cadMusYear) {
        this.lbl_cadMusYear = lbl_cadMusYear;
    }

    public JLabel getLbl_consMusArt() {
        return lbl_consMusArt;
    }

    public void setLbl_consMusArt(JLabel lbl_consMusArt) {
        this.lbl_consMusArt = lbl_consMusArt;
    }

    public JLabel getLbl_consMusIdMus() {
        return lbl_consMusIdMus;
    }

    public void setLbl_consMusIdMus(JLabel lbl_consMusIdMus) {
        this.lbl_consMusIdMus = lbl_consMusIdMus;
    }

    public JLabel getLbl_consMusNam() {
        return lbl_consMusNam;
    }

    public void setLbl_consMusNam(JLabel lbl_consMusNam) {
        this.lbl_consMusNam = lbl_consMusNam;
    }

    public JLabel getLbl_consMusTitle() {
        return lbl_consMusTitle;
    }

    public void setLbl_consMusTitle(JLabel lbl_consMusTitle) {
        this.lbl_consMusTitle = lbl_consMusTitle;
    }

    public JLabel getLbl_excMusIdMus() {
        return lbl_excMusIdMus;
    }

    public void setLbl_excMusIdMus(JLabel lbl_excMusIdMus) {
        this.lbl_excMusIdMus = lbl_excMusIdMus;
    }

    public JLabel getLbl_excMusStatus() {
        return lbl_excMusStatus;
    }

    public void setLbl_excMusStatus(JLabel lbl_excMusStatus) {
        this.lbl_excMusStatus = lbl_excMusStatus;
    }

    public JLabel getLbl_excMusTitle() {
        return lbl_excMusTitle;
    }

    public void setLbl_excMusTitle(JLabel lbl_excMusTitle) {
        this.lbl_excMusTitle = lbl_excMusTitle;
    }

    public JLabel getLbl_genMus() {
        return lbl_genMus;
    }

    public void setLbl_genMus(JLabel lbl_genMus) {
        this.lbl_genMus = lbl_genMus;
    }

    public JTextField getTxt_cadMusAno() {
        return txt_cadMusAno;
    }

    public void setTxt_cadMusAno(JTextField txt_cadMusAno) {
        this.txt_cadMusAno = txt_cadMusAno;
    }

    public JTextField getTxt_cadMusArt() {
        return txt_cadMusArt;
    }

    public void setTxt_cadMusArt(JTextField txt_cadMusArt) {
        this.txt_cadMusArt = txt_cadMusArt;
    }

    public JTextField getTxt_cadMusNam() {
        return txt_cadMusNam;
    }

    public void setTxt_cadMusNam(JTextField txt_cadMusNam) {
        this.txt_cadMusNam = txt_cadMusNam;
    }

    public JTextField getTxt_cadMusStatus() {
        return txt_cadMusStatus;
    }

    public void setTxt_cadMusStatus(JTextField txt_cadMusStatus) {
        this.txt_cadMusStatus = txt_cadMusStatus;
    }

    public JTextField getTxt_consMusArt() {
        return txt_consMusArt;
    }

    public void setTxt_consMusArt(JTextField txt_consMusArt) {
        this.txt_consMusArt = txt_consMusArt;
    }

    public JTextField getTxt_consMusIdMus() {
        return txt_consMusIdMus;
    }

    public void setTxt_consMusIdMus(JTextField txt_consMusIdMus) {
        this.txt_consMusIdMus = txt_consMusIdMus;
    }

    public JTextField getTxt_consMusNam() {
        return txt_consMusNam;
    }

    public void setTxt_consMusNam(JTextField txt_consMusNam) {
        this.txt_consMusNam = txt_consMusNam;
    }

    public JTextField getTxt_excMusIdMus() {
        return txt_excMusIdMus;
    }

    public void setTxt_excMusIdMus(JTextField txt_excMusIdMus) {
        this.txt_excMusIdMus = txt_excMusIdMus;
    }

    public JTextField getTxt_excMusStatus() {
        return txt_excMusStatus;
    }

    public void setTxt_excMusStatus(JTextField txt_excMusStatus) {
        this.txt_excMusStatus = txt_excMusStatus;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_CadMus = new javax.swing.JPanel();
        lbl_cadMusArt = new javax.swing.JLabel();
        lbl_cadMusTitle = new javax.swing.JLabel();
        lbl_cadMusName = new javax.swing.JLabel();
        lbl_cadMusYear = new javax.swing.JLabel();
        txt_cadMusArt = new javax.swing.JTextField();
        txt_cadMusNam = new javax.swing.JTextField();
        txt_cadMusAno = new javax.swing.JTextField();
        bt_cadMus = new javax.swing.JButton();
        lbl_cadMusStatus = new javax.swing.JLabel();
        txt_cadMusStatus = new javax.swing.JTextField();
        lbl_genMus = new javax.swing.JLabel();
        jf_ExcMus = new javax.swing.JPanel();
        lbl_excMusTitle = new javax.swing.JLabel();
        lbl_excMusIdMus = new javax.swing.JLabel();
        txt_excMusIdMus = new javax.swing.JTextField();
        bt_excMus = new javax.swing.JButton();
        lbl_excMusStatus = new javax.swing.JLabel();
        txt_excMusStatus = new javax.swing.JTextField();
        jf_ConsMus = new javax.swing.JPanel();
        lbl_consMusNam = new javax.swing.JLabel();
        lbl_consMusTitle = new javax.swing.JLabel();
        lbl_consMusArt = new javax.swing.JLabel();
        txt_consMusIdMus = new javax.swing.JTextField();
        txt_consMusArt = new javax.swing.JTextField();
        lbl_consMusIdMus = new javax.swing.JLabel();
        txt_consMusNam = new javax.swing.JTextField();
        bt_consMusIdMus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jf_CadMus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbl_cadMusArt.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusArt.setText("Artista");

        lbl_cadMusTitle.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_cadMusTitle.setText("Cadastrar Música");

        lbl_cadMusName.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusName.setText("Nome");

        lbl_cadMusYear.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusYear.setText("Ano");

        txt_cadMusArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusArtActionPerformed(evt);
            }
        });

        txt_cadMusNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusNamActionPerformed(evt);
            }
        });

        txt_cadMusAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusAnoActionPerformed(evt);
            }
        });

        bt_cadMus.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_cadMus.setText("Cadastrar");

        lbl_cadMusStatus.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusStatus.setText("Status");

        txt_cadMusStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jf_CadMusLayout = new javax.swing.GroupLayout(jf_CadMus);
        jf_CadMus.setLayout(jf_CadMusLayout);
        jf_CadMusLayout.setHorizontalGroup(
            jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_CadMusLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cadMusYear)
                    .addComponent(lbl_cadMusName)
                    .addComponent(lbl_cadMusArt)
                    .addComponent(lbl_cadMusStatus))
                .addGap(18, 18, 18)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_cadMusArt)
                    .addComponent(txt_cadMusNam)
                    .addComponent(txt_cadMusAno, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadMusStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_CadMusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bt_cadMus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_CadMusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_cadMusTitle)
                .addGap(130, 130, 130))
        );
        jf_CadMusLayout.setVerticalGroup(
            jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_CadMusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cadMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadMusName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadMusNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadMusYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadMusAno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_cadMus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadMusStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadMusStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        lbl_genMus.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_genMus.setText("Gerenciamento de Músicas");

        jf_ExcMus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbl_excMusTitle.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_excMusTitle.setText("Excluir Música");

        lbl_excMusIdMus.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_excMusIdMus.setText("ID da Música");

        txt_excMusIdMus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_excMusIdMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_excMusIdMusActionPerformed(evt);
            }
        });

        bt_excMus.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_excMus.setText("Excluir");

        lbl_excMusStatus.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_excMusStatus.setText("Status");

        txt_excMusStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_excMusStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_excMusStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jf_ExcMusLayout = new javax.swing.GroupLayout(jf_ExcMus);
        jf_ExcMus.setLayout(jf_ExcMusLayout);
        jf_ExcMusLayout.setHorizontalGroup(
            jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_ExcMusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_excMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(jf_ExcMusLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jf_ExcMusLayout.createSequentialGroup()
                            .addComponent(lbl_excMusStatus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_excMusStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_ExcMusLayout.createSequentialGroup()
                            .addComponent(lbl_excMusIdMus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_excMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_ExcMusLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_excMus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jf_ExcMusLayout.setVerticalGroup(
            jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_ExcMusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_excMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addGroup(jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_excMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_excMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bt_excMus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_excMusStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_excMusStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jf_ConsMus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbl_consMusNam.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_consMusNam.setText("Nome");

        lbl_consMusTitle.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_consMusTitle.setText("Consulta ID Música");

        lbl_consMusArt.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_consMusArt.setText("Artista");

        txt_consMusIdMus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_consMusIdMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consMusIdMusActionPerformed(evt);
            }
        });

        txt_consMusArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbl_consMusIdMus.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_consMusIdMus.setText("ID da Música");

        txt_consMusNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_consMusNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consMusNamActionPerformed(evt);
            }
        });

        bt_consMusIdMus.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_consMusIdMus.setText("Consultar");

        javax.swing.GroupLayout jf_ConsMusLayout = new javax.swing.GroupLayout(jf_ConsMus);
        jf_ConsMus.setLayout(jf_ConsMusLayout);
        jf_ConsMusLayout.setHorizontalGroup(
            jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_ConsMusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_consMusTitle)
                .addGap(377, 377, 377))
            .addGroup(jf_ConsMusLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_consMusArt)
                    .addComponent(lbl_consMusNam))
                .addGap(23, 23, 23)
                .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_consMusNam, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_consMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_consMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(lbl_consMusIdMus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_consMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jf_ConsMusLayout.setVerticalGroup(
            jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_ConsMusLayout.createSequentialGroup()
                .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_ConsMusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_consMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_consMusNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consMusNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_consMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jf_ConsMusLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_consMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_consMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_genMus)
                .addGap(312, 312, 312))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jf_ExcMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jf_CadMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jf_ConsMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_genMus)
                .addGap(65, 65, 65)
                .addComponent(jf_ConsMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jf_ExcMus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jf_CadMus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_consMusIdMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consMusIdMusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consMusIdMusActionPerformed

    private void txt_consMusNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consMusNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consMusNamActionPerformed

    private void txt_excMusIdMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_excMusIdMusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_excMusIdMusActionPerformed

    private void txt_cadMusArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadMusArtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cadMusArtActionPerformed

    private void txt_cadMusNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadMusNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cadMusNamActionPerformed

    private void txt_cadMusAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadMusAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cadMusAnoActionPerformed

    private void txt_excMusStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_excMusStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_excMusStatusActionPerformed

    private void txt_cadMusStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadMusStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cadMusStatusActionPerformed

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
//            java.util.logging.Logger.getLogger(telaCadExcMus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(telaCadExcMus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(telaCadExcMus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(telaCadExcMus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new telaCadExcMus().setVisible(true);
//            }
//        });
//    }

    
    private ControleGenMus CGM;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadMus;
    private javax.swing.JButton bt_consMusIdMus;
    private javax.swing.JButton bt_excMus;
    private javax.swing.JPanel jf_CadMus;
    private javax.swing.JPanel jf_ConsMus;
    private javax.swing.JPanel jf_ExcMus;
    private javax.swing.JLabel lbl_cadMusArt;
    private javax.swing.JLabel lbl_cadMusName;
    private javax.swing.JLabel lbl_cadMusStatus;
    private javax.swing.JLabel lbl_cadMusTitle;
    private javax.swing.JLabel lbl_cadMusYear;
    private javax.swing.JLabel lbl_consMusArt;
    private javax.swing.JLabel lbl_consMusIdMus;
    private javax.swing.JLabel lbl_consMusNam;
    private javax.swing.JLabel lbl_consMusTitle;
    private javax.swing.JLabel lbl_excMusIdMus;
    private javax.swing.JLabel lbl_excMusStatus;
    private javax.swing.JLabel lbl_excMusTitle;
    private javax.swing.JLabel lbl_genMus;
    private javax.swing.JTextField txt_cadMusAno;
    private javax.swing.JTextField txt_cadMusArt;
    private javax.swing.JTextField txt_cadMusNam;
    private javax.swing.JTextField txt_cadMusStatus;
    private javax.swing.JTextField txt_consMusArt;
    private javax.swing.JTextField txt_consMusIdMus;
    private javax.swing.JTextField txt_consMusNam;
    private javax.swing.JTextField txt_excMusIdMus;
    private javax.swing.JTextField txt_excMusStatus;
    // End of variables declaration//GEN-END:variables
}
