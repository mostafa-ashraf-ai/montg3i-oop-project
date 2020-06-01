/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;

/**
 *
 * @author hp
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
         jPanel1.setBackground(new Color(0,0,0,90));
         btnBack.setBackground(new Color(0,0,0,0));
         btnLogout.setBackground(new Color(0,0,0,0));
         btnSaveUsername.setBackground(new Color(0,0,0,0));
         btnSavePassword.setBackground(new Color(0,0,0,0));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSavePassword = new javax.swing.JButton();
        btnSaveUsername = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Name = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        EmailLabel1 = new javax.swing.JLabel();
        EmailLabel2 = new javax.swing.JLabel();
        EmailLabel3 = new javax.swing.JLabel();
        EmailLabel4 = new javax.swing.JLabel();
        EmailLabel5 = new javax.swing.JLabel();
        EmailLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1520, 845));
        getContentPane().setLayout(null);

        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout);
        btnLogout.setBounds(230, 675, 110, 35);

        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("< Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(230, 730, 100, 35);

        btnSavePassword.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSavePassword.setForeground(new java.awt.Color(255, 255, 255));
        btnSavePassword.setText("<SAVE>");
        btnSavePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSavePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSavePasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSavePasswordMouseExited(evt);
            }
        });
        getContentPane().add(btnSavePassword);
        btnSavePassword.setBounds(470, 630, 110, 35);

        btnSaveUsername.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnSaveUsername.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveUsername.setText("<SAVE>");
        btnSaveUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveUsernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveUsernameMouseExited(evt);
            }
        });
        getContentPane().add(btnSaveUsername);
        btnSaveUsername.setBounds(470, 410, 110, 35);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Profile");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 30, 160, 31);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_contacts_64px_1.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 10, 70, 70);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(200, 80, 200, 30);

        Name.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name:");
        jPanel1.add(Name);
        Name.setBounds(140, 120, 110, 34);

        NameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("??");
        jPanel1.add(NameLabel);
        NameLabel.setBounds(290, 120, 80, 20);

        Username.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username:");
        jPanel1.add(Username);
        Username.setBounds(140, 160, 130, 34);

        UsernameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("??");
        jPanel1.add(UsernameLabel);
        UsernameLabel.setBounds(290, 160, 120, 40);

        EmailLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("????");
        jPanel1.add(EmailLabel);
        EmailLabel.setBounds(290, 210, 190, 30);

        Email.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("E-mail:");
        jPanel1.add(Email);
        Email.setBounds(140, 200, 120, 34);

        EmailLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        EmailLabel1.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel1.setText("New Password:");
        jPanel1.add(EmailLabel1);
        EmailLabel1.setBounds(190, 590, 160, 26);

        EmailLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        EmailLabel2.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel2.setText("Change Username");
        jPanel1.add(EmailLabel2);
        EmailLabel2.setBounds(60, 270, 210, 34);

        EmailLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        EmailLabel3.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel3.setText("Change Password");
        jPanel1.add(EmailLabel3);
        EmailLabel3.setBounds(60, 490, 210, 34);

        EmailLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        EmailLabel4.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel4.setText("Current Password:");
        jPanel1.add(EmailLabel4);
        EmailLabel4.setBounds(190, 540, 160, 26);

        EmailLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        EmailLabel5.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel5.setText("New Username:");
        jPanel1.add(EmailLabel5);
        EmailLabel5.setBounds(200, 370, 160, 26);

        EmailLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        EmailLabel6.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel6.setText("Current Uesrname:");
        jPanel1.add(EmailLabel6);
        EmailLabel6.setBounds(200, 320, 160, 26);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(360, 590, 170, 26);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(360, 540, 170, 26);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(370, 370, 170, 26);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(370, 320, 170, 26);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 0, 600, 800);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/OP1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(970, 210, 390, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/OP2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(970, 380, 390, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/3.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Receiption().setVisible(true);
        this.setVisible(false);
        //     OR
        //new Msnager().setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveUsernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveUsernameMouseEntered
        btnSaveUsername.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnSaveUsernameMouseEntered

    private void btnSaveUsernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveUsernameMouseExited
         btnSaveUsername.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSaveUsernameMouseExited

    private void btnSavePasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSavePasswordMouseEntered
         btnSavePassword.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnSavePasswordMouseEntered

    private void btnSavePasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSavePasswordMouseExited
        btnSavePassword.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSavePasswordMouseExited

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
       btnBack.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBackMouseExited

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel EmailLabel1;
    private javax.swing.JLabel EmailLabel2;
    private javax.swing.JLabel EmailLabel3;
    private javax.swing.JLabel EmailLabel4;
    private javax.swing.JLabel EmailLabel5;
    private javax.swing.JLabel EmailLabel6;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSavePassword;
    private javax.swing.JButton btnSaveUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
