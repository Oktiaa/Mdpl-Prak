
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class FormBuku extends javax.swing.JFrame {

    DefaultTableModel modelTabel;
    
    public FormBuku() {
        initComponents();
        
        modelTabel = (DefaultTableModel) Tabel_Peminjaman.getModel();
        Tabel_Peminjaman.setModel(modelTabel);
        
        loadData();
        
    }
    private void cari(String keyword) {
        modelTabel.setRowCount(0);
        
        String sql = "SELECT * FROM peminjaman " + "WHERE nama LIKE '%" + keyword + "%'";
        
        try {
            Statement st = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet result = st.executeQuery(sql);
            
              while (result.next()) {
                String[] data = new String[5];
                data[0] = result.getString("id");
                data[1] = result.getString("nama");
                data[2] = result.getString("kode_buku");
                data[3] = result.getString("tgl_pinjam");
                data[4] = result.getString("tgl_kembali");
                
                modelTabel.addRow(data); 
            }
        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode() + " : " + ex.getMessage());
            
        }
    }
    private void kosong() {
        jTextField_ID.setText(null);
        jTextField_nama.setText(null);
        jTextField_kodebuku.setText(null);
        jTextField_tglpinjam.setText(null);
        jTextField_tglkembali.setText(null);
    }
    
    private void loadData() {
        
        modelTabel.setRowCount (0);
        
        String sql = "SELECT * FROM peminjaman";
        
        try {
            Statement st = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet result = st.executeQuery(sql);
            
            while (result.next()) {
                String[] data = new String[5];
                data[0] = result.getString("id");
                data[1] = result.getString("nama");
                data[2] = result.getString("kode_buku");
                data[3] = result.getString("tgl_pinjam");
                data[4] = result.getString("tgl_kembali");
                
                modelTabel.addRow(data); 
            }
        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode() + " : " + ex.getMessage());
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_tglpinjam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_kodebuku = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField_tglkembali = new javax.swing.JTextField();
        jButton_Tambah = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Peminjaman = new javax.swing.JTable();
        txt_cari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 194, 145));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FORM PEMINJAMAN BUKU PERPUSTAKAAN");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMn.setText("-");
        jLabelMn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMn)
                .addGap(27, 27, 27)
                .addComponent(jLabelClose)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose)
                    .addComponent(jLabelMn)
                    .addComponent(jLabel2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(248, 239, 186));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 144, 102));
        jLabel1.setText("Nama               :  ");

        jTextField_nama.setBackground(new java.awt.Color(248, 194, 145));
        jTextField_nama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_nama.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_namaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 144, 102));
        jLabel3.setText("Kode Buku        :");

        jTextField_tglpinjam.setBackground(new java.awt.Color(248, 194, 145));
        jTextField_tglpinjam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_tglpinjam.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_tglpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tglpinjamActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 144, 102));
        jLabel4.setText("Tanggal Pinjam  :");

        jTextField_kodebuku.setBackground(new java.awt.Color(248, 194, 145));
        jTextField_kodebuku.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_kodebuku.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_kodebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_kodebukuActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 144, 102));
        jLabel5.setText("Tanggal Kembali :");

        jTextField_tglkembali.setBackground(new java.awt.Color(248, 194, 145));
        jTextField_tglkembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_tglkembali.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_tglkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tglkembaliActionPerformed(evt);
            }
        });

        jButton_Tambah.setText("Tambah");
        jButton_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TambahActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Batal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(248, 194, 145));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        Tabel_Peminjaman.setBackground(new java.awt.Color(248, 194, 145));
        Tabel_Peminjaman.setForeground(new java.awt.Color(255, 255, 255));
        Tabel_Peminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nama ", "Kode Buku", "Tanggal Pinjam", "Tanggal Kembali"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel_Peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_PeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Peminjaman);

        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 144, 102));
        jLabel6.setText("ID                   :");

        jTextField_ID.setBackground(new java.awt.Color(248, 194, 145));
        jTextField_ID.setForeground(new java.awt.Color(228, 241, 254));
        jTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_tglkembali, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(jTextField_tglpinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(jTextField_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(jTextField_kodebuku, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton_Tambah)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3))
                                .addGap(27, 27, 27))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_kodebuku, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_tglpinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_tglkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_namaActionPerformed

    private void jTextField_tglpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tglpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tglpinjamActionPerformed

    private void jTextField_kodebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_kodebukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_kodebukuActionPerformed

    private void jTextField_tglkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tglkembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tglkembaliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        int ok = JOptionPane.showConfirmDialog(null, "Yakin untuk update data?" , "Confirmation", JOptionPane.YES_NO_OPTION);
       
                try {
                    String sql = "UPDATE peminjaman SET id = ?, nama= ?, kode_buku = ?, tgl_pinjam = ?, tgl_kembali = ? WHERE id='"+jTextField_ID.getText()+"'";
                    PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);
                    if (ok == 0) {
                        try {
                            ps.setString(1, jTextField_ID.getText());
                            ps.setString(2, jTextField_nama.getText());
                            ps.setString(3, jTextField_kodebuku.getText());
                            ps.setString(4, jTextField_tglpinjam.getText());
                            ps.setString(5, jTextField_tglkembali.getText());
                
                            ps.executeUpdate();
                            
                            JOptionPane.showMessageDialog(null, "UPDATE DATA BERHASIL !");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "UPDATE DATA GAGAL !");
                        }
                    }
                } catch (SQLException ex) {
                    System.err.println(ex.getErrorCode() + " : " + ex.getMessage());
                }
                
       loadData();
       kosong();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        kosong();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMnMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMnMouseClicked

    private void jButton_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TambahActionPerformed
        
        String id = jTextField_ID.getText();
        String nama = jTextField_nama.getText();
        String kode = jTextField_kodebuku.getText();
        String pinjam = jTextField_tglpinjam.getText();
        String kembali = jTextField_tglkembali.getText();
        
        if (nama.equals("") || kode.equals("") || pinjam.equals("") || kembali.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Form Tidak Boleh Kosong!!!");
        } else {
            String sql = "INSERT INTO peminjaman(id, nama, kode_buku, tgl_pinjam, tgl_kembali) " + 
                    "VALUES(?, ?, ?, ?, ?)";
            
            try {
                PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);
                
                ps.setString(1, id);
                ps.setString(2, nama);
                ps.setString(3, kode);
                ps.setString(4, pinjam);
                ps.setString(5, kembali);
                
                ps.executeUpdate();
        
            } catch (SQLException ex) {
                System.err.println(ex.getErrorCode() + " : " + ex.getMessage());
            }
        }
       loadData();
       kosong();
    }//GEN-LAST:event_jButton_TambahActionPerformed

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String key = txt_cari.getText();
       cari(key);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tabel_PeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_PeminjamanMouseClicked

        int baris = Tabel_Peminjaman.rowAtPoint(evt.getPoint());
        String id = Tabel_Peminjaman.getValueAt(baris, 0).toString();
        jTextField_ID.setText(id);
        String nama = Tabel_Peminjaman.getValueAt(baris, 1).toString();
        jTextField_nama.setText(nama);
        String kode = Tabel_Peminjaman.getValueAt(baris, 2).toString();
        jTextField_kodebuku.setText(kode);
        String pinjam = Tabel_Peminjaman.getValueAt(baris, 3).toString();
        jTextField_tglpinjam.setText(pinjam);
        String kembali = Tabel_Peminjaman.getValueAt(baris, 4).toString();
         jTextField_tglkembali.setText(kembali);
    }//GEN-LAST:event_Tabel_PeminjamanMouseClicked

    private void jTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String sql = "DELETE FROM peminjaman WHERE id='"+jTextField_ID.getText()+"'";
        try {
            PreparedStatement ps = ConnectionDB.getConnection().prepareStatement(sql);
 
            ps.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode() + " : " + ex.getMessage());
        }
        loadData();
        kosong();
    
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Peminjaman;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton_Tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_kodebuku;
    private javax.swing.JTextField jTextField_nama;
    private javax.swing.JTextField jTextField_tglkembali;
    private javax.swing.JTextField jTextField_tglpinjam;
    private javax.swing.JTextField txt_cari;
    // End of variables declaration//GEN-END:variables
}
