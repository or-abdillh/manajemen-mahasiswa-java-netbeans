package Form;

import Konfigurasi.Koneksi;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class form_barang extends javax.swing.JFrame {
    
private DefaultTableModel DftTblModel_barang;
private String SQL;

public void TampilData() {
        DftTblModel_barang = new DefaultTableModel();
        DftTblModel_barang.addColumn("NIM");
        DftTblModel_barang.addColumn("NAMA");
        DftTblModel_barang.addColumn("ALAMAT");
        DftTblModel_barang.addColumn("WHATSAPP");
        DftTblModel_barang.addColumn("EMAIL");
        jTable_barang.setModel(DftTblModel_barang);
        Connection conn = Koneksi.getConnection();
        try {
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from mhs";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            while (res.next()) {
                DftTblModel_barang.addRow(new Object[]{
                    res.getString("nim"),
                    res.getString("nama"),
                    res.getString("alamat"),
                    res.getString("whatsapp"),
                    res.getString("email")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates new form form_barang
     */
    public form_barang() {
        initComponents();
        this.TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_kode_barang = new javax.swing.JTextField();
        jTextField_nama_barang = new javax.swing.JTextField();
        jTextField_harga = new javax.swing.JTextField();
        jTextField_satuan = new javax.swing.JTextField();
        jTextField_stok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_barang = new javax.swing.JTable();
        jButton_baru = new javax.swing.JButton();
        jButton_simpan = new javax.swing.JButton();
        jButton_edit = new javax.swing.JButton();
        jButton_hapus = new javax.swing.JButton();
        cbb_kategori = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txt_nilai = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manajemen Data Mahasiswa Prodi TI - Polihasnur 2022 ");
        setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel1.setText("Data Mahasiswa Prodi TI - Polihasnur 2022");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("NIM");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setText("Whatsapp");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setText("Email");

        jTextField_kode_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_kode_barangActionPerformed(evt);
            }
        });

        jTextField_nama_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nama_barangActionPerformed(evt);
            }
        });

        jTextField_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_hargaActionPerformed(evt);
            }
        });

        jTextField_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_satuanActionPerformed(evt);
            }
        });

        jTextField_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_stokActionPerformed(evt);
            }
        });

        jTable_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_barang);

        jButton_baru.setBackground(new java.awt.Color(51, 153, 255));
        jButton_baru.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton_baru.setText("BARU");
        jButton_baru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_baruActionPerformed(evt);
            }
        });

        jButton_simpan.setBackground(new java.awt.Color(51, 204, 0));
        jButton_simpan.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton_simpan.setText("SIMPAN");
        jButton_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_simpanActionPerformed(evt);
            }
        });

        jButton_edit.setBackground(new java.awt.Color(255, 255, 0));
        jButton_edit.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton_edit.setText("EDIT");
        jButton_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_editActionPerformed(evt);
            }
        });

        jButton_hapus.setBackground(new java.awt.Color(255, 51, 51));
        jButton_hapus.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton_hapus.setText("HAPUS");
        jButton_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hapusActionPerformed(evt);
            }
        });

        cbb_kategori.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nim", "Nama", "Alamat" }));
        cbb_kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbb_kategoriActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Pencarian Berdasarkan:");

        txt_nilai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_nilai.setText("Kata Kunci");
        txt_nilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nilaiActionPerformed(evt);
            }
        });

        btn_cari.setBackground(new java.awt.Color(153, 153, 153));
        btn_cari.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_cari.setText("CARI");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(153, 153, 153));
        btn_reset.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_reset.setText("RESET");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTextField_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_baru, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jButton_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jButton_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_nilai)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(9, 9, 9)
                        .addComponent(cbb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cari)
                            .addComponent(btn_reset)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField_kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_simpan)
                        .addComponent(jButton_edit)
                        .addComponent(jButton_hapus))
                    .addComponent(jButton_baru))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_kode_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_kode_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_kode_barangActionPerformed

    private void jTextField_nama_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nama_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nama_barangActionPerformed

    private void jTextField_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_hargaActionPerformed

    private void jTextField_satuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_satuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_satuanActionPerformed

    private void jTextField_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_stokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_stokActionPerformed

    private void jButton_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_simpanActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("insert into mhs(nim, nama, alamat, whatsapp, email) values(?,?,?,?,?)");
            stmt.setString(1, jTextField_kode_barang.getText());
            stmt.setString(2, jTextField_nama_barang.getText());
            stmt.setString(3, jTextField_harga.getText());
            stmt.setString(4, jTextField_satuan.getText());
            stmt.setString(5, jTextField_stok.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_simpanActionPerformed

    private void jTable_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_barangMouseClicked
        int baris = jTable_barang.getSelectedRow();
        jTextField_kode_barang.setText(DftTblModel_barang.getValueAt(baris, 0).toString());
        jTextField_nama_barang.setText(DftTblModel_barang.getValueAt(baris, 1).toString());
        jTextField_harga.setText(DftTblModel_barang.getValueAt(baris, 2).toString());
        jTextField_satuan.setText(DftTblModel_barang.getValueAt(baris, 3).toString());
        jTextField_stok.setText(DftTblModel_barang.getValueAt(baris, 4).toString());
    }//GEN-LAST:event_jTable_barangMouseClicked

    private void jButton_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_editActionPerformed
        try {
            Connection conn = Koneksi.getConnection();
            PreparedStatement stmt = conn.prepareStatement("update mhs set nama=?, alamat=?, whatsapp=?, email=? where nim=?");
            stmt.setString(1, jTextField_nama_barang.getText());
            stmt.setString(2, jTextField_harga.getText());
            stmt.setString(3, jTextField_satuan.getText());
            stmt.setString(4, jTextField_stok.getText());
            stmt.setString(5, jTextField_kode_barang.getText());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton_editActionPerformed

    private void jButton_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hapusActionPerformed
        Connection conn = Koneksi.getConnection();
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from mhs where nim ='" + jTextField_kode_barang.getText() + "'");
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                TampilData();
                jTextField_kode_barang.setText("");
                jTextField_nama_barang.setText("");
                jTextField_harga.setText("");
                jTextField_satuan.setText("");
                jTextField_stok.setText("");
                jTextField_kode_barang.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_hapusActionPerformed

    private void jButton_baruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_baruActionPerformed
        jTextField_kode_barang.setText("");
        jTextField_nama_barang.setText("");
        jTextField_harga.setText("");
        jTextField_satuan.setText("");
        jTextField_stok.setText("");
        jTextField_kode_barang.requestFocus();
    }//GEN-LAST:event_jButton_baruActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        DftTblModel_barang = new DefaultTableModel();
            DftTblModel_barang.addColumn("NIM");
            DftTblModel_barang.addColumn("NAMA");
            DftTblModel_barang.addColumn("ALAMAT");
            DftTblModel_barang.addColumn("WHATSAPP");
            DftTblModel_barang.addColumn("EMAIL");
            jTable_barang.setModel(DftTblModel_barang);
            Connection conn;
            conn = Koneksi.getConnection();
            try {
                java.sql.Statement stmt = conn.createStatement();
                if(cbb_kategori.getSelectedItem().equals("Nim")){
                    SQL = "select * from mhs where nim like '%"+txt_nilai.getText()+"%'";
                    System.out.println(SQL);
                } else if(cbb_kategori.getSelectedItem().equals("Alamat")){
                    SQL = "select * from mhs where alamat like '%"+txt_nilai.getText()+"%'";
                    System.out.println(SQL);
                }
                else {
                    SQL = "select * from mhs where nama like '%"+txt_nilai.getText()+"%'";
                    System.out.println(SQL);
                }
                java.sql.ResultSet res = stmt.executeQuery(SQL);
                while (res.next()){
                    DftTblModel_barang.addRow(new Object[]{
                    res.getString("nim"),
                    res.getString("nama"),
                    res.getString("alamat"),
                    res.getString("whatsapp"),
                    res.getString("email"),
                });
                }
            } catch(SQLException e){
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_nilai.setText("");
        this.TampilData();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_nilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nilaiActionPerformed

    private void cbb_kategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbb_kategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbb_kategoriActionPerformed

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
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox<String> cbb_kategori;
    private javax.swing.JButton jButton_baru;
    private javax.swing.JButton jButton_edit;
    private javax.swing.JButton jButton_hapus;
    private javax.swing.JButton jButton_simpan;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_barang;
    private javax.swing.JTextField jTextField_harga;
    private javax.swing.JTextField jTextField_kode_barang;
    private javax.swing.JTextField jTextField_nama_barang;
    private javax.swing.JTextField jTextField_satuan;
    private javax.swing.JTextField jTextField_stok;
    private javax.swing.JTextField txt_nilai;
    // End of variables declaration//GEN-END:variables
}