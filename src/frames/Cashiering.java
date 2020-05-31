package frames;


import java.awt.Color;
import java.awt.event.ActionEvent;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Cashiering extends javax.swing.JFrame {

    /**
     * Creates new form Cashiering
     */
    public Cashiering() {
        initComponents();
        btnBack.setBackground(new Color(0,0,0,0));
        btnCheckout.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Clinic = new javax.swing.JLabel();
        Restaurant = new javax.swing.JLabel();
        ClinicLabel = new javax.swing.JLabel();
        RestaurantLabel = new javax.swing.JLabel();
        Services = new javax.swing.JLabel();
        ServicesLabel = new javax.swing.JLabel();
        Cash = new javax.swing.JRadioButton();
        CreditCard = new javax.swing.JRadioButton();
        RestAmount = new javax.swing.JLabel();
        RestAmountLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCheckout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1520, 855));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        Clinic.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Clinic.setForeground(new java.awt.Color(255, 255, 255));
        Clinic.setText("Clinic:");
        jPanel1.add(Clinic);
        Clinic.setBounds(110, 80, 130, 34);

        Restaurant.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Restaurant.setForeground(new java.awt.Color(255, 255, 255));
        Restaurant.setText("Restaurant:");
        jPanel1.add(Restaurant);
        Restaurant.setBounds(110, 140, 170, 34);

        ClinicLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ClinicLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClinicLabel.setText("jLabel4");
        jPanel1.add(ClinicLabel);
        ClinicLabel.setBounds(310, 90, 100, 26);

        RestaurantLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        RestaurantLabel.setForeground(new java.awt.Color(255, 255, 255));
        RestaurantLabel.setText("jLabel5");
        jPanel1.add(RestaurantLabel);
        RestaurantLabel.setBounds(310, 150, 170, 26);

        Services.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        Services.setForeground(new java.awt.Color(255, 255, 255));
        Services.setText("Services:");
        jPanel1.add(Services);
        Services.setBounds(110, 200, 150, 34);

        ServicesLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        ServicesLabel.setForeground(new java.awt.Color(255, 255, 255));
        ServicesLabel.setText("jLabel7");
        jPanel1.add(ServicesLabel);
        ServicesLabel.setBounds(310, 210, 70, 26);

        Cash.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup.add(Cash);
        Cash.setForeground(new java.awt.Color(255, 255, 255));
        Cash.setText("Cash");
        jPanel1.add(Cash);
        Cash.setBounds(150, 400, 67, 29);

        CreditCard.setBackground(new java.awt.Color(0, 102, 153));
        buttonGroup.add(CreditCard);
        CreditCard.setForeground(new java.awt.Color(255, 255, 255));
        CreditCard.setText("Credit Card");
        jPanel1.add(CreditCard);
        CreditCard.setBounds(150, 450, 113, 29);

        RestAmount.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        RestAmount.setForeground(new java.awt.Color(255, 255, 255));
        RestAmount.setText("Rest Amount:");
        jPanel1.add(RestAmount);
        RestAmount.setBounds(110, 270, 180, 34);

        RestAmountLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        RestAmountLabel.setForeground(new java.awt.Color(255, 255, 255));
        RestAmountLabel.setText("jLabel9");
        jPanel1.add(RestAmountLabel);
        RestAmountLabel.setBounds(310, 280, 80, 26);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Checkout Method:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 350, 230, 34);

        btnBack.setBackground(new java.awt.Color(0, 102, 153));
        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
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
        btnBack.setBounds(50, 710, 120, 50);

        btnCheckout.setBackground(new java.awt.Color(0, 102, 153));
        btnCheckout.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("> Checkout");
        btnCheckout.setBorder(null);
        btnCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckoutMouseExited(evt);
            }
        });
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnCheckout);
        btnCheckout.setBounds(290, 560, 200, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(210, 0, 540, 800);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/OP1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(890, 210, 390, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/OP2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(890, 380, 390, 220);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/e.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Search().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void btnCheckoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseEntered
        btnCheckout.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnCheckoutMouseEntered

    private void btnCheckoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckoutMouseExited
        btnCheckout.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCheckoutMouseExited

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
            java.util.logging.Logger.getLogger(Cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashiering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashiering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Cash;
    private javax.swing.JLabel Clinic;
    private javax.swing.JLabel ClinicLabel;
    private javax.swing.JRadioButton CreditCard;
    private javax.swing.JLabel RestAmount;
    private javax.swing.JLabel RestAmountLabel;
    private javax.swing.JLabel Restaurant;
    private javax.swing.JLabel RestaurantLabel;
    private javax.swing.JLabel Services;
    private javax.swing.JLabel ServicesLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCheckout;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
       /* String username = signIn.Username.getText();
        String password = signIn.Password.getText();
        if (("a".equals(username)) && ("1".equals(password))) {
            new <error>.setVisible(true);
            signIn.setVisible(false);
        } else if (("b".equals(username)) && ("2".equals(password))) {
            new Receiption().setVisible(true);
            signIn.setVisible(false);
        } else if (("b".equals(username)) && ("2".equals(password))) {
            new Receiption().setVisible(true);
            signIn.setVisible(false);
        }*/
    }

