package frames;



import java.awt.Color;
import montg3i.ReceptionEmployee;
import montg3i.Manager;
//import montg3i.Reception_employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public Login() {
        
        initComponents();
        btnLogin.setBackground(new Color(0,0,0,0));
        btnBack.setBackground(new Color(0,0,0,0));
        UsernamBox.setBackground(new Color(0,0,0,0));
        PasswordBox.setBackground(new Color(0,0,0,0));
        
       // jPanel1.setBackground(new Color(255,255,255,10));
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
        btnBack = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        PasswordBox = new javax.swing.JPasswordField();
        Password = new javax.swing.JLabel();
        UsernamBox = new javax.swing.JTextField();
        Username = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        MessageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1520, 850));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 204, 255));
        btnBack.setText("< Back");
        btnBack.setBorder(null);
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
        jPanel1.add(btnBack);
        btnBack.setBounds(50, 700, 120, 38);

        btnLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(51, 204, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
        btnLogin.setBounds(120, 430, 126, 45);

        PasswordBox.setForeground(new java.awt.Color(255, 255, 255));
        PasswordBox.setBorder(null);
        PasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordBoxActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordBox);
        PasswordBox.setBounds(160, 360, 173, 20);

        Password.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Password.setForeground(new java.awt.Color(51, 204, 255));
        Password.setText("Password:");
        jPanel1.add(Password);
        Password.setBounds(20, 350, 130, 34);

        UsernamBox.setForeground(new java.awt.Color(255, 255, 255));
        UsernamBox.setBorder(null);
        jPanel1.add(UsernamBox);
        UsernamBox.setBounds(160, 300, 173, 20);

        Username.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Username.setForeground(new java.awt.Color(51, 204, 255));
        Username.setText("Username:");
        jPanel1.add(Username);
        Username.setBounds(20, 290, 130, 34);

        jSeparator1.setBackground(new java.awt.Color(51, 204, 255));
        jSeparator1.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(160, 320, 170, 20);

        jSeparator2.setBackground(new java.awt.Color(0, 204, 255));
        jSeparator2.setForeground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(160, 380, 170, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_login_128px.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 50, 140, 130);

        MessageLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        MessageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(MessageLabel);
        MessageLabel.setBounds(60, 590, 300, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 380, 800);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/A.JPG"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1900, 1000));
        jLabel1.setMinimumSize(new java.awt.Dimension(1900, 1000));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 0, 1190, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
     
        String username=UsernamBox.getText();
        String password=PasswordBox.getText();
        
        if( ReceptionEmployee.login(username, password) )
        {
            new Receiption().setVisible(true);
            this.setVisible(false);

        }
        else if( Manager.login(username, password) )
        {
            new ManagerProfile().setVisible(true);
            this.setVisible(false);

        }
        else
        {
            MessageLabel.setText("* username or password is incorrect ! !");
            UsernamBox.setText("");
            PasswordBox.setText("");
            UsernamBox.requestFocus();
        }
   
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void PasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ResortHomePage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
       btnLogin.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
       btnLogin.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLoginMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordBox;
    private javax.swing.JTextField UsernamBox;
    private javax.swing.JLabel Username;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
