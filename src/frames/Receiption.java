package frames;

import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Receiption extends javax.swing.JFrame {

    /**
     * Creates new form Receiption
     */
    public Receiption() {
        initComponents();
        jPanel8.setBackground(new Color(255,255,255,50));
        btnReservation.setBackground(new Color(0,0,0,0));
        btnSearch.setBackground(new Color(0,0,0,0));
        btnCashiering.setBackground(new Color(0,0,0,0));
        btnEditReservation.setBackground(new Color(0,0,0,0));
        btnCurrentGuests.setBackground(new Color(0,0,0,0));
        btnLogout.setBackground(new Color(0,0,0,0));
        jPanel2.setBackground(new Color(0,0,0,60));
        jPanel3.setBackground(new Color(0,0,0,60));
        jPanel4.setBackground(new Color(0,0,0,60));
        jPanel5.setBackground(new Color(0,0,0,60));
        jPanel6.setBackground(new Color(0,0,0,60));
        jPanel7.setBackground(new Color(0,0,0,60));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnEditReservation = new javax.swing.JButton();
        btnCurrentGuests = new javax.swing.JButton();
        btnCashiering = new javax.swing.JButton();
        btnReservation = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receiption");
        setLocation(new java.awt.Point(700, 300));
        getContentPane().setLayout(null);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_beach_96px.png"))); // NOI18N
        jLabel8.setText("   Montg3i");
        jPanel8.add(jLabel8);
        jLabel8.setBounds(40, 20, 450, 90);

        getContentPane().add(jPanel8);
        jPanel8.setBounds(880, 330, 620, 120);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        btnEditReservation.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnEditReservation.setForeground(new java.awt.Color(255, 255, 255));
        btnEditReservation.setText("Edit Reservation");
        btnEditReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditReservationActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditReservation);
        btnEditReservation.setBounds(70, 230, 175, 30);

        btnCurrentGuests.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCurrentGuests.setForeground(new java.awt.Color(255, 255, 255));
        btnCurrentGuests.setText("Current Guests");
        btnCurrentGuests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCurrentGuests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentGuestsActionPerformed(evt);
            }
        });
        jPanel1.add(btnCurrentGuests);
        btnCurrentGuests.setBounds(70, 300, 160, 30);

        btnCashiering.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnCashiering.setForeground(new java.awt.Color(255, 255, 255));
        btnCashiering.setText("Cashiering");
        btnCashiering.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCashiering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashieringActionPerformed(evt);
            }
        });
        jPanel1.add(btnCashiering);
        btnCashiering.setBounds(70, 370, 120, 30);

        btnReservation.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnReservation.setForeground(new java.awt.Color(255, 255, 255));
        btnReservation.setText("Reservations ");
        btnReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservation.setName(""); // NOI18N
        btnReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservationActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservation);
        btnReservation.setBounds(70, 90, 150, 30);
        btnReservation.getAccessibleContext().setAccessibleName("");

        btnSearch.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(70, 160, 100, 30);

        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText(" Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(70, 440, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_search_32px.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 160, 40, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_new_file_32px.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 40, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_settings_32px.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 220, 32, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_activity_history_32px.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 290, 51, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_cash_register_32px.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 370, 32, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_logout_rounded_left_32px.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 430, 51, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 80, 250, 50);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 150, 250, 50);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(null);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(20, 220, 250, 50);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(null);
        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 290, 250, 50);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(null);
        jPanel1.add(jPanel6);
        jPanel6.setBounds(20, 360, 250, 50);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(null);
        jPanel1.add(jPanel7);
        jPanel7.setBounds(20, 430, 250, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 310, 550);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/p7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 800);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservationActionPerformed
        new ReservationForm().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReservationActionPerformed

    private void btnCurrentGuestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentGuestsActionPerformed
        new ListOfCurrentGuests().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCurrentGuestsActionPerformed

    private void btnCashieringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashieringActionPerformed
        new Cashiering().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCashieringActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new Login().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        new Search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEditReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditReservationActionPerformed
        new EditReservation().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditReservationActionPerformed

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
            java.util.logging.Logger.getLogger(Receiption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receiption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receiption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receiption.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receiption().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCashiering;
    private javax.swing.JButton btnCurrentGuests;
    private javax.swing.JButton btnEditReservation;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReservation;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
