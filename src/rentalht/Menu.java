/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalht;

import koneksi.koneksi;

/**
 *
 * @author Pc
 */
public class Menu extends javax.swing.JFrame {
    koneksi conn = new koneksi();
    /**
     * Creates new form Index
     */
    public Menu() {
        initComponents();
        conn.ConnectToDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Pengembalian = new javax.swing.JButton();
        lihatdata = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 642));
        setSize(new java.awt.Dimension(960, 642));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton1.setText("Peminjaman");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 200, 210, 60);

        Pengembalian.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        Pengembalian.setText("Pengembalian");
        Pengembalian.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Pengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PengembalianActionPerformed(evt);
            }
        });
        getContentPane().add(Pengembalian);
        Pengembalian.setBounds(560, 300, 210, 60);

        lihatdata.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        lihatdata.setText("Lihat Data");
        lihatdata.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lihatdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatdataActionPerformed(evt);
            }
        });
        getContentPane().add(lihatdata);
        lihatdata.setBounds(560, 390, 210, 60);

        jButton4.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jButton4.setText("Log Out");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(560, 490, 210, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Index.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 640);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 430, 73, 23);

        setSize(new java.awt.Dimension(960, 642));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     new Peminjaman().show();
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PengembalianActionPerformed
      new Pengembalian().show();
     this.dispose();
    }//GEN-LAST:event_PengembalianActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new Index().show();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void lihatdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatdataActionPerformed
        new lihatdata().show();;
        this.dispose();
    }//GEN-LAST:event_lihatdataActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pengembalian;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lihatdata;
    // End of variables declaration//GEN-END:variables
}
