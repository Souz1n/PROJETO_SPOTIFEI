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
        cgm = new ControleGenMus(this);
    }

    public JLabel getLbl_cadMusGener() {
        return lbl_cadMusGener;
    }

    public void setLbl_cadMusGener(JLabel lbl_cadMusGener) {
        this.lbl_cadMusGener = lbl_cadMusGener;
    }

    public JTextField getTxt_cadMusGener() {
        return txt_cadMusGener;
    }

    public void setTxt_cadMusGener(JTextField txt_cadMusGener) {
        this.txt_cadMusGener = txt_cadMusGener;
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

    public JPanel getJf_ConsMus() {
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


    public JTextField getTxt_consMusArt() {
        return txt_consMusArt;
    }

    public void setTxt_consMusArt(JTextField txt_consMusArt) {
        this.txt_consMusArt = txt_consMusArt;
    }

    public JLabel getLbl_consMusResult() {
        return lbl_consMusResult;
    }

    public void setLbl_consMusResult(JLabel lbl_consMusResult) {
        this.lbl_consMusResult = lbl_consMusResult;
    }

    public JLabel getLbl_excMusResult() {
        return lbl_excMusResult;
    }

    public void setLbl_excMusResult(JLabel lbl_excMusResult) {
        this.lbl_excMusResult = lbl_excMusResult;
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

    public JLabel getLbl_cadMusResult() {
        return lbl_cadMusResult;
    }

    public void setLbl_cadMusResult(JLabel lbl_cadMusResult) {
        this.lbl_cadMusResult = lbl_cadMusResult;
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
        bt_voltarGerMus = new javax.swing.JButton();
        lbl_genMus = new javax.swing.JLabel();
        jf_CadMus = new javax.swing.JPanel();
        lbl_cadMusArt = new javax.swing.JLabel();
        lbl_cadMusTitle = new javax.swing.JLabel();
        lbl_cadMusName = new javax.swing.JLabel();
        lbl_cadMusYear = new javax.swing.JLabel();
        txt_cadMusArt = new javax.swing.JTextField();
        txt_cadMusNam = new javax.swing.JTextField();
        txt_cadMusAno = new javax.swing.JTextField();
        bt_cadMus = new javax.swing.JButton();
        lbl_cadMusResult = new javax.swing.JLabel();
        lbl_cadMusGener = new javax.swing.JLabel();
        txt_cadMusGener = new javax.swing.JTextField();
        jf_ConsMus = new javax.swing.JPanel();
        lbl_consMusNam = new javax.swing.JLabel();
        lbl_consMusTitle = new javax.swing.JLabel();
        lbl_consMusArt = new javax.swing.JLabel();
        txt_consMusArt = new javax.swing.JTextField();
        lbl_consMusIdMus = new javax.swing.JLabel();
        txt_consMusNam = new javax.swing.JTextField();
        bt_consMusIdMus = new javax.swing.JButton();
        lbl_consMusResult = new javax.swing.JLabel();
        jf_ExcMus = new javax.swing.JPanel();
        lbl_excMusTitle = new javax.swing.JLabel();
        lbl_excMusIdMus = new javax.swing.JLabel();
        txt_excMusIdMus = new javax.swing.JTextField();
        bt_excMus = new javax.swing.JButton();
        lbl_excMusResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 82, 201));

        bt_voltarGerMus.setBackground(new java.awt.Color(0, 0, 0));
        bt_voltarGerMus.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_voltarGerMus.setForeground(new java.awt.Color(255, 255, 255));
        bt_voltarGerMus.setText("Voltar");
        bt_voltarGerMus.setActionCommand("");
        bt_voltarGerMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarGerMusActionPerformed(evt);
            }
        });

        lbl_genMus.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        lbl_genMus.setForeground(new java.awt.Color(255, 255, 255));
        lbl_genMus.setText("Gerenciamento de Músicas");

        jf_CadMus.setBackground(new java.awt.Color(0, 0, 0));
        jf_CadMus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));
        jf_CadMus.setForeground(new java.awt.Color(255, 255, 255));

        lbl_cadMusArt.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cadMusArt.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusArt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cadMusArt.setText("Artista");

        lbl_cadMusTitle.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cadMusTitle.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_cadMusTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cadMusTitle.setText("Cadastrar Música");

        lbl_cadMusName.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cadMusName.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cadMusName.setText("Nome");

        lbl_cadMusYear.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cadMusYear.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusYear.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cadMusYear.setText("Ano");

        txt_cadMusArt.setBackground(new java.awt.Color(204, 204, 204));
        txt_cadMusArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusArtActionPerformed(evt);
            }
        });

        txt_cadMusNam.setBackground(new java.awt.Color(204, 204, 204));
        txt_cadMusNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusNamActionPerformed(evt);
            }
        });

        txt_cadMusAno.setBackground(new java.awt.Color(204, 204, 204));
        txt_cadMusAno.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusAnoActionPerformed(evt);
            }
        });

        bt_cadMus.setBackground(new java.awt.Color(42, 82, 201));
        bt_cadMus.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_cadMus.setForeground(new java.awt.Color(255, 255, 255));
        bt_cadMus.setText("Cadastrar");
        bt_cadMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cadMusActionPerformed(evt);
            }
        });

        lbl_cadMusResult.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N

        lbl_cadMusGener.setBackground(new java.awt.Color(0, 0, 0));
        lbl_cadMusGener.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_cadMusGener.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cadMusGener.setText("Gênero");

        txt_cadMusGener.setBackground(new java.awt.Color(204, 204, 204));
        txt_cadMusGener.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_cadMusGener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cadMusGenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jf_CadMusLayout = new javax.swing.GroupLayout(jf_CadMus);
        jf_CadMus.setLayout(jf_CadMusLayout);
        jf_CadMusLayout.setHorizontalGroup(
            jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_CadMusLayout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(lbl_cadMusResult, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jf_CadMusLayout.createSequentialGroup()
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_CadMusLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_cadMusName)
                            .addComponent(lbl_cadMusGener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_cadMusArt)
                            .addComponent(lbl_cadMusYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_cadMusAno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(txt_cadMusArt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cadMusNam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cadMusGener)))
                    .addGroup(jf_CadMusLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lbl_cadMusTitle))
                    .addGroup(jf_CadMusLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(bt_cadMus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jf_CadMusLayout.setVerticalGroup(
            jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_CadMusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cadMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cadMusName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cadMusNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cadMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cadMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cadMusAno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cadMusYear, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jf_CadMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cadMusGener, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cadMusGener, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_cadMus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_cadMusResult, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jf_ConsMus.setBackground(new java.awt.Color(0, 0, 0));
        jf_ConsMus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        lbl_consMusNam.setBackground(new java.awt.Color(0, 0, 0));
        lbl_consMusNam.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_consMusNam.setForeground(new java.awt.Color(255, 255, 255));
        lbl_consMusNam.setText("Nome");

        lbl_consMusTitle.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_consMusTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_consMusTitle.setText("Consulta ID Música");

        lbl_consMusArt.setBackground(new java.awt.Color(0, 0, 0));
        lbl_consMusArt.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_consMusArt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_consMusArt.setText("Artista");

        txt_consMusArt.setBackground(new java.awt.Color(204, 204, 204));
        txt_consMusArt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_consMusArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consMusArtActionPerformed(evt);
            }
        });

        lbl_consMusIdMus.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_consMusIdMus.setForeground(new java.awt.Color(255, 255, 255));
        lbl_consMusIdMus.setText("ID da Música");

        txt_consMusNam.setBackground(new java.awt.Color(204, 204, 204));
        txt_consMusNam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_consMusNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consMusNamActionPerformed(evt);
            }
        });

        bt_consMusIdMus.setBackground(new java.awt.Color(42, 82, 201));
        bt_consMusIdMus.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_consMusIdMus.setForeground(new java.awt.Color(255, 255, 255));
        bt_consMusIdMus.setText("Consultar");
        bt_consMusIdMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_consMusIdMusActionPerformed(evt);
            }
        });

        lbl_consMusResult.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_consMusResult.setForeground(new java.awt.Color(255, 255, 255));

        jf_ExcMus.setBackground(new java.awt.Color(42, 82, 201));
        jf_ExcMus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbl_excMusTitle.setBackground(new java.awt.Color(255, 255, 255));
        lbl_excMusTitle.setFont(new java.awt.Font("Swis721 Cn BT", 1, 18)); // NOI18N
        lbl_excMusTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_excMusTitle.setText("Excluir Música");

        lbl_excMusIdMus.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_excMusIdMus.setText("ID da Música");

        txt_excMusIdMus.setBackground(new java.awt.Color(204, 204, 204));
        txt_excMusIdMus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_excMusIdMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_excMusIdMusActionPerformed(evt);
            }
        });

        bt_excMus.setBackground(new java.awt.Color(0, 0, 0));
        bt_excMus.setFont(new java.awt.Font("Leelawadee", 3, 12)); // NOI18N
        bt_excMus.setForeground(new java.awt.Color(255, 255, 255));
        bt_excMus.setText("Excluir");
        bt_excMus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excMusActionPerformed(evt);
            }
        });

        lbl_excMusResult.setBackground(new java.awt.Color(0, 0, 0));
        lbl_excMusResult.setFont(new java.awt.Font("Swis721 Cn BT", 1, 14)); // NOI18N
        lbl_excMusResult.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jf_ExcMusLayout = new javax.swing.GroupLayout(jf_ExcMus);
        jf_ExcMus.setLayout(jf_ExcMusLayout);
        jf_ExcMusLayout.setHorizontalGroup(
            jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_ExcMusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_ExcMusLayout.createSequentialGroup()
                        .addGap(0, 90, Short.MAX_VALUE)
                        .addComponent(lbl_excMusResult, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(jf_ExcMusLayout.createSequentialGroup()
                        .addComponent(lbl_excMusIdMus)
                        .addGap(18, 18, 18)
                        .addGroup(jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_excMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_excMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jf_ExcMusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_excMus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jf_ExcMusLayout.setVerticalGroup(
            jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_ExcMusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_excMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jf_ExcMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_excMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_excMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_excMus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_excMusResult, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jf_ConsMusLayout = new javax.swing.GroupLayout(jf_ConsMus);
        jf_ConsMus.setLayout(jf_ConsMusLayout);
        jf_ConsMusLayout.setHorizontalGroup(
            jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_ConsMusLayout.createSequentialGroup()
                .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jf_ConsMusLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_consMusArt)
                            .addComponent(lbl_consMusIdMus)
                            .addComponent(lbl_consMusNam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_consMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consMusNam, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jf_ConsMusLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(bt_consMusIdMus))
                            .addComponent(lbl_consMusTitle)
                            .addComponent(lbl_consMusResult, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jf_ConsMusLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jf_ExcMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jf_ConsMusLayout.setVerticalGroup(
            jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_ConsMusLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_consMusTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_consMusNam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_consMusNam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_consMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_consMusArt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_consMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jf_ConsMusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_consMusResult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_consMusIdMus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jf_ExcMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_voltarGerMus, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jf_CadMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jf_ConsMus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_genMus)
                .addGap(322, 322, 322))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_genMus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jf_ConsMus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jf_CadMus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_voltarGerMus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void bt_cadMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cadMusActionPerformed
        cgm.cadastrarMusica();
    }//GEN-LAST:event_bt_cadMusActionPerformed

    private void bt_excMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excMusActionPerformed
        cgm.removerMusica();
    }//GEN-LAST:event_bt_excMusActionPerformed

    private void bt_consMusIdMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_consMusIdMusActionPerformed
        cgm.consultarIdMusica();
    }//GEN-LAST:event_bt_consMusIdMusActionPerformed

    private void txt_consMusArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consMusArtActionPerformed
   
    }//GEN-LAST:event_txt_consMusArtActionPerformed

    private void bt_voltarGerMusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarGerMusActionPerformed
        cgm.voltaMenu();
    }//GEN-LAST:event_bt_voltarGerMusActionPerformed

    private void txt_cadMusGenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cadMusGenerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cadMusGenerActionPerformed

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

    
    private final ControleGenMus cgm;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadMus;
    private javax.swing.JButton bt_consMusIdMus;
    private javax.swing.JButton bt_excMus;
    private javax.swing.JButton bt_voltarGerMus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jf_CadMus;
    private javax.swing.JPanel jf_ConsMus;
    private javax.swing.JPanel jf_ExcMus;
    private javax.swing.JLabel lbl_cadMusArt;
    private javax.swing.JLabel lbl_cadMusGener;
    private javax.swing.JLabel lbl_cadMusName;
    private javax.swing.JLabel lbl_cadMusResult;
    private javax.swing.JLabel lbl_cadMusTitle;
    private javax.swing.JLabel lbl_cadMusYear;
    private javax.swing.JLabel lbl_consMusArt;
    private javax.swing.JLabel lbl_consMusIdMus;
    private javax.swing.JLabel lbl_consMusNam;
    private javax.swing.JLabel lbl_consMusResult;
    private javax.swing.JLabel lbl_consMusTitle;
    private javax.swing.JLabel lbl_excMusIdMus;
    private javax.swing.JLabel lbl_excMusResult;
    private javax.swing.JLabel lbl_excMusTitle;
    private javax.swing.JLabel lbl_genMus;
    private javax.swing.JTextField txt_cadMusAno;
    private javax.swing.JTextField txt_cadMusArt;
    private javax.swing.JTextField txt_cadMusGener;
    private javax.swing.JTextField txt_cadMusNam;
    private javax.swing.JTextField txt_consMusArt;
    private javax.swing.JTextField txt_consMusNam;
    private javax.swing.JTextField txt_excMusIdMus;
    // End of variables declaration//GEN-END:variables
}
