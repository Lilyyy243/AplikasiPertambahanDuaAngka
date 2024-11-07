/*
 * Untuk mengubah header lisensi ini, pilih Lisensi di Properti Proyek.
 * Untuk mengubah file template ini, pilih Alat | Template
 * dan buka template di editor.
 */

/**
 * Aplikasi Pertambahan Dua Angka
 * Penulis: ACER
 */
public class AplikasiPertambahan extends javax.swing.JFrame {

    /**
     * Membuat form AplikasiPertambahan
     */
    public AplikasiPertambahan() {
        initComponents();
    }

    /**
     * Metode ini dipanggil dari dalam konstruktor untuk menginisialisasi form.
     * PERINGATAN: Jangan mengubah kode ini. Konten dari metode ini selalu
     * dihasilkan ulang oleh Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        angka1 = new javax.swing.JLabel();
        angka2 = new javax.swing.JLabel();
        hasil = new javax.swing.JLabel();
        Hapus = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Tambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Mengatur tampilan panel
        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Pertambahan Dua Angka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 14), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        // Label untuk angka pertama
        angka1.setText("Masukkan Angka Pertama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 11);
        jPanel1.add(angka1, gridBagConstraints);

        // Label untuk angka kedua
        angka2.setText("Masukkan Angka Kedua");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 11);
        jPanel1.add(angka2, gridBagConstraints);

        // Label untuk hasil
        hasil.setText("Hasil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 11);
        jPanel1.add(hasil, gridBagConstraints);

        // Tombol untuk menghapus input
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(Hapus, gridBagConstraints);

        // TextField untuk angka pertama
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jTextField1, gridBagConstraints);

        // TextField untuk angka kedua
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jTextField2, gridBagConstraints);

        // TextField untuk hasil
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
        jPanel1.add(jTextField3, gridBagConstraints);

        // Tombol untuk menambahkan angka
        Tambah.setText("Tambah");
        Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(4, 39, 0, 15);
        jPanel1.add(Tambah, gridBagConstraints);

        // Mengatur layout konten
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO tambahkan kode penanganan di sini:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Metode untuk menangani aksi tombol Tambah
    private void TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahActionPerformed
        try {
            // Mengambil input dari jTextField1 dan jTextField2, lalu mengonversinya menjadi integer
            int angkaPertama = Integer.parseInt(jTextField1.getText());
            int angkaKedua = Integer.parseInt(jTextField2.getText());
            // Menjumlahkan angka pertama dan kedua
            int hasilPenjumlahan = angkaPertama + angkaKedua;
            // Menampilkan hasil penjumlahan di jTextField3
            jTextField3.setText(String.valueOf(hasilPenjumlahan));
        } catch (NumberFormatException e) {
            // Menampilkan pesan kesalahan jika input tidak valid
            jTextField3.setText("Input tidak valid");
        }
    }//GEN-LAST:event_TambahActionPerformed

    // Metode untuk menangani aksi tombol Hapus
    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // Mengosongkan semua text field
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_HapusActionPerformed

    /**
     * @param args argumen baris perintah
     */
    public static void main(String args[]) {
        /* Mengatur tampilan dan nuansa Nimbus */
        //<editor-fold defaultstate="collapsed" desc=" Kode pengaturan tampilan dan nuansa (opsional) ">
        /* Jika Nimbus (diperkenalkan di Java SE 6) tidak tersedia, tetap gunakan tampilan dan nuansa default.
         * Untuk detail lihat http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AplikasiPertambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPertambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPertambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPertambahan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Membuat dan menampilkan form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPertambahan().setVisible(true);
            }
        });
    }

    // Deklarasi variabel - jangan diubah
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Tambah;
    private javax.swing.JLabel angka1;
    private javax.swing.JLabel angka2;
    private javax.swing.JLabel hasil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // Akhir dari deklarasi variabel
}
