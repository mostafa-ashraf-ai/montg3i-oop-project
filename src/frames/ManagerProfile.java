package frames;

import java.awt.BorderLayout;
import java.awt.Color;

import org.opencv.core.Core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class ManagerProfile extends javax.swing.JFrame {

    /**
     * Creates new form SearchOnReservation
     */
    public ManagerProfile() {
        initComponents();
        btnBalanceAndReservations.setBackground(new Color(0,0,0,0));
        btnCameras.setBackground(new Color(0,0,0,0));
        btnEmployee.setBackground(new Color(0,0,0,0));
        btnProfile.setBackground(new Color(0,0,0,0));
       
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
        btnEmployee = new javax.swing.JButton();
        btnCameras = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnBalanceAndReservations = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1520, 850));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        btnEmployee.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.setText("Employee");
        btnEmployee.setBorder(null);
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmployeeMouseExited(evt);
            }
        });
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmployee);
        btnEmployee.setBounds(170, 270, 190, 43);

        btnCameras.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnCameras.setForeground(new java.awt.Color(255, 255, 255));
        btnCameras.setText("Cameras");
        btnCameras.setBorder(null);
        btnCameras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCameras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCamerasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCamerasMouseExited(evt);
            }
        });
        btnCameras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamerasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCameras);
        btnCameras.setBounds(170, 420, 180, 40);

        btnProfile.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setText("Profile");
        btnProfile.setBorder(null);
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProfileMouseExited(evt);
            }
        });
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfile);
        btnProfile.setBounds(170, 600, 180, 40);

        btnBalanceAndReservations.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnBalanceAndReservations.setForeground(new java.awt.Color(255, 255, 255));
        btnBalanceAndReservations.setText("Balance and Reservations");
        btnBalanceAndReservations.setBorder(null);
        btnBalanceAndReservations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBalanceAndReservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBalanceAndReservationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBalanceAndReservationsMouseExited(evt);
            }
        });
        btnBalanceAndReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBalanceAndReservationsActionPerformed(evt);
            }
        });
        jPanel1.add(btnBalanceAndReservations);
        btnBalanceAndReservations.setBounds(40, 130, 430, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(250, 0, 520, 800);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/OP2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(910, 380, 390, 220);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/OP1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(910, 210, 390, 180);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/p10.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
         new Employee().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnBalanceAndReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBalanceAndReservationsActionPerformed
         new BalanceAndReservations().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnBalanceAndReservationsActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
             new Profile().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnCamerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamerasActionPerformed
         new CCTV().setVisible(true);
    }//GEN-LAST:event_btnCamerasActionPerformed

    private void btnBalanceAndReservationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBalanceAndReservationsMouseEntered
            btnBalanceAndReservations.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnBalanceAndReservationsMouseEntered

    private void btnBalanceAndReservationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBalanceAndReservationsMouseExited
            btnBalanceAndReservations.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBalanceAndReservationsMouseExited

    private void btnEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseEntered
           btnEmployee.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnEmployeeMouseEntered

    private void btnEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeeMouseExited
           btnEmployee.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnEmployeeMouseExited

    private void btnCamerasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCamerasMouseEntered
           btnCameras.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCamerasMouseEntered

    private void btnCamerasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCamerasMouseExited
           btnCameras.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCamerasMouseExited

    private void btnProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseEntered
           btnProfile.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnProfileMouseEntered

    private void btnProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseExited
           btnProfile.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnProfileMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        
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
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManagerProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBalanceAndReservations;
    private javax.swing.JButton btnCameras;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
