/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul1;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Registrasi extends javax.swing.JFrame {

    /**
     * Creates new form Registrasi
     */
    public Registrasi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jLabelAlamat = new javax.swing.JLabel();
        jLabelUmur = new javax.swing.JLabel();
        jLabelJeniskelamin = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelMainevent = new javax.swing.JLabel();
        jLabelNotlp = new javax.swing.JLabel();
        jLabelKategori = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jTextFieldAlamat = new javax.swing.JTextField();
        jTextFieldUmur = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldNotlp = new javax.swing.JTextField();
        jCheckBoxVolly = new javax.swing.JCheckBox();
        jComboBoxKategori = new javax.swing.JComboBox<>();
        jRadioButtonPerempuan = new javax.swing.JRadioButton();
        jRadioButtonPria = new javax.swing.JRadioButton();
        jCheckBoxBadminton = new javax.swing.JCheckBox();
        jCheckBoxSepakbola = new javax.swing.JCheckBox();
        jCheckBoxBasket = new javax.swing.JCheckBox();
        jCheckBoxLari = new javax.swing.JCheckBox();
        jCheckBoxRenang = new javax.swing.JCheckBox();
        jButtonKeluar = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonKirim = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sports");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Competition");

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tunjukan bakat mu");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pada bidang olahraga");

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\logo (1)_11zon.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153))
                            .addComponent(jLabel15))))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(192, 192, 192))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(108, 108, 108)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("REGISTRASI");

        jLabelNama.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNama.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNama.setText("Nama");

        jLabelAlamat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelAlamat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAlamat.setText("Alamat");

        jLabelUmur.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelUmur.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUmur.setText("Umur");

        jLabelJeniskelamin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelJeniskelamin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelJeniskelamin.setText("Jenis kelamin");

        jLabelEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");

        jLabelMainevent.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelMainevent.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMainevent.setText("Main event");

        jLabelNotlp.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelNotlp.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNotlp.setText("No Telp");

        jLabelKategori.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelKategori.setForeground(new java.awt.Color(255, 255, 255));
        jLabelKategori.setText("Kategori");

        jTextFieldNama.setToolTipText("Harus isi data");

        jTextFieldAlamat.setToolTipText("Harus isi data");

        jTextFieldUmur.setToolTipText("Harus isi data");

        jTextFieldEmail.setToolTipText("Harus isis data");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jTextFieldNotlp.setToolTipText("Harus isi data");

        jCheckBoxVolly.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxVolly.setText("Volly");
        jCheckBoxVolly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVollyActionPerformed(evt);
            }
        });

        jComboBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelajar", "Mahasiswa", "Umum" }));
        jComboBoxKategori.setSelectedIndex(-1);
        jComboBoxKategori.setToolTipText("");
        jComboBoxKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKategoriActionPerformed(evt);
            }
        });

        jRadioButtonPerempuan.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButtonPerempuan);
        jRadioButtonPerempuan.setText("Perempuan");
        jRadioButtonPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPerempuanActionPerformed(evt);
            }
        });

        jRadioButtonPria.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButtonPria);
        jRadioButtonPria.setText("Pria");
        jRadioButtonPria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPriaActionPerformed(evt);
            }
        });

        jCheckBoxBadminton.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxBadminton.setText("Badminton");
        jCheckBoxBadminton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBadmintonActionPerformed(evt);
            }
        });

        jCheckBoxSepakbola.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxSepakbola.setText("Sepak bola");
        jCheckBoxSepakbola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSepakbolaActionPerformed(evt);
            }
        });

        jCheckBoxBasket.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxBasket.setText("Basket");
        jCheckBoxBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBasketActionPerformed(evt);
            }
        });

        jCheckBoxLari.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxLari.setText("Lari");

        jCheckBoxRenang.setBackground(new java.awt.Color(102, 102, 102));
        jCheckBoxRenang.setText("Renang");
        jCheckBoxRenang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxRenangActionPerformed(evt);
            }
        });

        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonKirim.setText("Kirim");
        jButtonKirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKirimActionPerformed(evt);
            }
        });

        check.setBackground(new java.awt.Color(102, 102, 102));
        check.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Data sudah benar");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAlamat)
                            .addComponent(jLabelNama)
                            .addComponent(jLabelUmur)
                            .addComponent(jLabelJeniskelamin)
                            .addComponent(jLabelEmail)
                            .addComponent(jLabelNotlp)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMainevent)
                            .addComponent(jLabelKategori))))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jRadioButtonPerempuan)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButtonPria))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUmur)
                                    .addComponent(jTextFieldEmail)
                                    .addComponent(jTextFieldNotlp, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAlamat)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel5)))
                                .addComponent(jTextFieldNama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jCheckBoxSepakbola, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBoxBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jCheckBoxLari, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBoxRenang, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jCheckBoxVolly, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxBadminton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButtonKeluar)
                        .addGap(57, 57, 57)
                        .addComponent(jButtonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonKirim)
                        .addGap(24, 24, 24))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNama)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAlamat)
                            .addComponent(jTextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUmur)
                            .addComponent(jTextFieldUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelJeniskelamin)
                            .addComponent(jRadioButtonPerempuan)
                            .addComponent(jRadioButtonPria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelEmail))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNotlp)
                    .addComponent(jTextFieldNotlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMainevent)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBoxVolly)
                        .addComponent(jCheckBoxBadminton)))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSepakbola)
                    .addComponent(jCheckBoxBasket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLari)
                    .addComponent(jCheckBoxRenang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKategori))
                .addGap(19, 19, 19)
                .addComponent(check)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKeluar)
                    .addComponent(jButtonReset)
                    .addComponent(jButtonKirim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxBadmintonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBadmintonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBadmintonActionPerformed

    private void jCheckBoxSepakbolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSepakbolaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSepakbolaActionPerformed

    private void jRadioButtonPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPerempuanActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButtonPerempuanActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jTextFieldNama.setText(null);
        jTextFieldAlamat.setText(null);
        jTextFieldUmur.setText(null);
        buttonGroup1.clearSelection();
        jTextFieldEmail.setText(null);
        jTextFieldNotlp.setText(null);
        jCheckBoxVolly.setSelected(false);
        jCheckBoxSepakbola.setSelected(false);
        jCheckBoxRenang.setSelected(false);
        jCheckBoxLari.setSelected(false);
        jCheckBoxBasket.setSelected(false);
        jCheckBoxBadminton.setSelected(false);
        jComboBoxKategori.setSelectedIndex(-1);
        check.setSelected(false);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonKirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKirimActionPerformed
        // TODO add your handling code here:
        if (!check.isSelected()) {
        JOptionPane.showMessageDialog(this, "Anda harus mencentang checkbox 'Data sudah benar' sebelum mengirimkan data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Hentikan proses pengiriman data jika checkbox tidak dipilih
    }
        
        if (!jCheckBoxVolly.isSelected() && 
        !jCheckBoxSepakbola.isSelected() && 
        !jCheckBoxRenang.isSelected() && 
        !jCheckBoxLari.isSelected() && 
        !jCheckBoxBasket.isSelected() && 
        !jCheckBoxBadminton.isSelected()) {
        JOptionPane.showMessageDialog(this, "Anda harus memilih minimal satu Main Event!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        return; // Hentikan proses pengiriman data jika tidak ada main event yang dipilih
    }
        
        MainView kirim = new MainView();
        kirim.jLabelnama2.setText(jTextFieldNama.getText());
        
        kirim.jLabelalamat2.setText(jTextFieldAlamat.getText());
        
        kirim.jLabelumur2.setText(jTextFieldUmur.getText());
        
        if (jRadioButtonPerempuan.isSelected()) {
        kirim.jLabeljeniskelamin2.setText(jRadioButtonPerempuan.getText());
        } else if (jRadioButtonPria.isSelected()) {
        kirim.jLabeljeniskelamin2.setText(jRadioButtonPria.getText());
    }
     
        kirim.jLabelemail2.setText(jTextFieldEmail.getText());
        
        kirim.jLabelnotlpn2.setText(jTextFieldNotlp.getText());
        
     StringBuilder mainEvent = new StringBuilder();
    if (jCheckBoxVolly.isSelected()) {
        mainEvent.append(jCheckBoxVolly.getText()).append(", ");
    }
    if (jCheckBoxSepakbola.isSelected()) {
        mainEvent.append(jCheckBoxSepakbola.getText()).append(", ");
    }
    if (jCheckBoxRenang.isSelected()) {
        mainEvent.append(jCheckBoxRenang.getText()).append(", ");
    }
    if (jCheckBoxLari.isSelected()) {
        mainEvent.append(jCheckBoxLari.getText()).append(", ");
    }
    if (jCheckBoxBasket.isSelected()) {
        mainEvent.append(jCheckBoxBasket.getText()).append(", ");
    }
    if (jCheckBoxBadminton.isSelected()) {
        mainEvent.append(jCheckBoxBadminton.getText()).append(", ");
    }

    // Hapus koma dan spasi terakhir jika ada
    if (mainEvent.length() > 0) {
        mainEvent.setLength(mainEvent.length() - 2);
    }
    kirim.jLabemaineventl2.setText(mainEvent.toString()); //menetapkan
        
    kirim.jLabelkategori2.setText(jComboBoxKategori.getSelectedItem().toString());
        
    kirim.setVisible(true);                                            
        
        
        
    }//GEN-LAST:event_jButtonKirimActionPerformed

    private void jCheckBoxBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBasketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBasketActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
       if (!check.isSelected()) {
        // Menampilkan pesan peringatan jika checkbox tidak dipilih
        JOptionPane.showMessageDialog(this, "Anda harus mencentang checkbox 'Data sudah benar' sebelum mengirimkan data!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
        
    }//GEN-LAST:event_checkActionPerformed
    
    private void jCheckBoxVollyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVollyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxVollyActionPerformed

    private void jCheckBoxRenangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxRenangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxRenangActionPerformed

    private void jComboBoxKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKategoriActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBoxKategoriActionPerformed

    private void jRadioButtonPriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButtonPriaActionPerformed

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
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrasi().setVisible(true);
            } 
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonKirim;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JCheckBox jCheckBoxBadminton;
    private javax.swing.JCheckBox jCheckBoxBasket;
    private javax.swing.JCheckBox jCheckBoxLari;
    private javax.swing.JCheckBox jCheckBoxRenang;
    private javax.swing.JCheckBox jCheckBoxSepakbola;
    private javax.swing.JCheckBox jCheckBoxVolly;
    private javax.swing.JComboBox<String> jComboBoxKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAlamat;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelJeniskelamin;
    private javax.swing.JLabel jLabelKategori;
    private javax.swing.JLabel jLabelMainevent;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNotlp;
    private javax.swing.JLabel jLabelUmur;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonPerempuan;
    private javax.swing.JRadioButton jRadioButtonPria;
    private javax.swing.JTextField jTextFieldAlamat;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNotlp;
    private javax.swing.JTextField jTextFieldUmur;
    // End of variables declaration//GEN-END:variables
}