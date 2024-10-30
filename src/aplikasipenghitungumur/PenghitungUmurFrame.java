/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipenghitungumur;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class PenghitungUmurFrame extends javax.swing.JFrame {
    private volatile boolean stopFetching = false;
    private Thread peristiwaThread;
    private final PenghitungUmurHelper helper;

    /**
     * Creates new form PenghitungUmurFrame
     */
    public PenghitungUmurFrame() {
        initComponents();
        helper = new PenghitungUmurHelper();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtUmur = new javax.swing.JTextField();
        txtHariUlangTahunBerikutnya = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dateChooserTanggalLahir = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPeristiwa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Aplikasi Perhitungan Umur", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Pilih Tanggal Lahir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 16, 15);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Umur Anda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 16, 15);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Hari Ulang Tahun Berikutnya");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 16, 15);
        jPanel1.add(jLabel3, gridBagConstraints);

        btnHitung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHitung.setText("Hitung Umur");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 16, 15);
        jPanel1.add(btnHitung, gridBagConstraints);

        btnKeluar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 16, 15);
        jPanel1.add(btnKeluar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 16, 15);
        jPanel1.add(txtUmur, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 16, 15);
        jPanel1.add(txtHariUlangTahunBerikutnya, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        dateChooserTanggalLahir.setPreferredSize(new java.awt.Dimension(200, 26));
        dateChooserTanggalLahir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateChooserTanggalLahirMouseClicked(evt);
            }
        });
        dateChooserTanggalLahir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dateChooserTanggalLahirPropertyChange(evt);
            }
        });
        dateChooserTanggalLahir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateChooserTanggalLahirKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        jPanel2.add(dateChooserTanggalLahir, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 13, 12);
        jPanel1.add(jPanel2, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.GridLayout());

        txtAreaPeristiwa.setColumns(20);
        txtAreaPeristiwa.setRows(20);
        jScrollPane2.setViewportView(txtAreaPeristiwa);

        jPanel4.add(jScrollPane2);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        Date tanggalLahir = dateChooserTanggalLahir.getDate();
        if (tanggalLahir != null) {
            // Menghitung umur dan hari ulang tahun berikutnya
            LocalDate lahir
                    = tanggalLahir.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate sekarang = LocalDate.now();
            String umur = helper.hitungUmurDetail(lahir, sekarang);
            txtUmur.setText(umur);
            // Menghitung tanggal ulang tahun berikutnya
            LocalDate ulangTahunBerikutnya
                    = helper.hariUlangTahunBerikutnya(lahir, sekarang);
            String hariUlangTahunBerikutnya
                    = helper.getDayOfWeekInIndonesian(ulangTahunBerikutnya);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            String tanggalUlangTahunBerikutnya
                    = ulangTahunBerikutnya.format(formatter);
            txtHariUlangTahunBerikutnya.setText("(" + hariUlangTahunBerikutnya + " " + tanggalUlangTahunBerikutnya + ")");
            // Set stop flag untuk thread sebelumnya
            stopFetching = true;
            if (peristiwaThread != null && peristiwaThread.isAlive()) {
            peristiwaThread.interrupt(); // Beri sinyal ke thread untuk berhenti
            }
            // Reset flag untuk thread baru
            stopFetching = false;
            // Mendapatkan peristiwa penting secara asinkron
            peristiwaThread = new Thread(() -> {
            try {
            txtAreaPeristiwa.setText("Tunggu, sedang mengambil data...\n");
            helper.getPeristiwaBarisPerBaris(ulangTahunBerikutnya,
            txtAreaPeristiwa, () -> stopFetching);
            if (!stopFetching) {
            javax.swing.SwingUtilities.invokeLater(() ->
            txtAreaPeristiwa.append("Selesai mengambil data peristiwa"));
            }
            } catch (Exception e) {
            if (Thread.currentThread().isInterrupted()) {
            javax.swing.SwingUtilities.invokeLater(() ->
            txtAreaPeristiwa.setText("Pengambilan data dibatalkan.\n"));
            }
            }
        });
            peristiwaThread.start();
}else {
            JOptionPane.showMessageDialog(null, "Format tanggal tidak valid!", "Kesalahan Format", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnHitungActionPerformed
    
    }

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void dateChooserTanggalLahirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dateChooserTanggalLahirPropertyChange
        // TODO add your handling code here:
        stopFetching = true;
        if (peristiwaThread != null && peristiwaThread.isAlive()) {
        peristiwaThread.interrupt();
        }
        txtAreaPeristiwa.setText("");
        txtUmur.setText("");
        txtHariUlangTahunBerikutnya.setText("");
    }//GEN-LAST:event_dateChooserTanggalLahirPropertyChange

    private void dateChooserTanggalLahirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateChooserTanggalLahirKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_dateChooserTanggalLahirKeyTyped

    private void dateChooserTanggalLahirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooserTanggalLahirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateChooserTanggalLahirMouseClicked

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
            java.util.logging.Logger.getLogger(PenghitungUmurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmurFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungUmurFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private com.toedter.calendar.JDateChooser dateChooserTanggalLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaPeristiwa;
    private javax.swing.JTextField txtHariUlangTahunBerikutnya;
    private javax.swing.JTextField txtUmur;
    // End of variables declaration//GEN-END:variables
}
