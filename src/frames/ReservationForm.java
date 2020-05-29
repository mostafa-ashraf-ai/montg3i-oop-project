package frames;


import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ReservationForm extends javax.swing.JFrame {

    /**
     * Creates new form ReservationForm
     */
    public ReservationForm() {
        initComponents();
        btnBook.setBackground(new Color(0,0,0,0));
        btnBack.setBackground(new Color(0,0,0,0));
        btnDeparture.setBackground(new Color(0,0,0,0));
        btnNights.setBackground(new Color(0,0,0,0));
      // jPanel2.setBackground(new Color(51,204,255,90));
            //SuiteRooms.setVisible(false);
            //DoubleRooms.setVisible(false);
            //SingleRooms.setVisible(false);
            //AvailableRooms.setVisible(false);
           // Results1.setVisible(false);
           // Results2.setVisible(false);
           // Results3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        Age = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        MiddleName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        Nationality = new javax.swing.JLabel();
        NationalID = new javax.swing.JLabel();
        MobileNumber = new javax.swing.JLabel();
        MobileNumberBox = new javax.swing.JTextField();
        AgeBox = new javax.swing.JTextField();
        NationalIDBox = new javax.swing.JTextField();
        NationalityBox = new javax.swing.JTextField();
        LastNameBox = new javax.swing.JTextField();
        MiddleNameBox = new javax.swing.JTextField();
        FirstNameBox = new javax.swing.JTextField();
        btnNights = new javax.swing.JButton();
        btnDeparture = new javax.swing.JButton();
        Arrivals = new javax.swing.JLabel();
        Nights = new javax.swing.JLabel();
        Departure = new javax.swing.JLabel();
        AvailableRooms = new javax.swing.JLabel();
        TotalPayments = new javax.swing.JLabel();
        Deposit = new javax.swing.JLabel();
        RestAmount = new javax.swing.JLabel();
        DepositBox = new javax.swing.JTextField();
        RestAmountLabel = new javax.swing.JLabel();
        TotalPaymentsLabel = new javax.swing.JLabel();
        RoomsNumbers = new javax.swing.JComboBox<>();
        DepartureBoxDate = new com.toedter.calendar.JDateChooser();
        NightsBox = new javax.swing.JTextField();
        ArrivalsBoxDate = new com.toedter.calendar.JDateChooser();
        btnBook = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservation Form");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1520, 845));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 204, 255));
        btnBack.setText("< Back");
        btnBack.setBorder(null);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(0, 730, 120, 45);

        Age.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Age.setForeground(new java.awt.Color(51, 204, 255));
        Age.setText("Age:");
        jPanel1.add(Age);
        Age.setBounds(70, 380, 34, 20);

        FirstName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        FirstName.setForeground(new java.awt.Color(51, 204, 255));
        FirstName.setText("First Name:");
        jPanel1.add(FirstName);
        FirstName.setBounds(70, 110, 82, 20);

        MiddleName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        MiddleName.setForeground(new java.awt.Color(51, 204, 255));
        MiddleName.setText("Middle Name:");
        jPanel1.add(MiddleName);
        MiddleName.setBounds(70, 160, 98, 20);

        LastName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        LastName.setForeground(new java.awt.Color(51, 204, 255));
        LastName.setText("Last Name:");
        jPanel1.add(LastName);
        LastName.setBounds(70, 200, 80, 20);

        Nationality.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Nationality.setForeground(new java.awt.Color(51, 204, 255));
        Nationality.setText("Nationality:");
        jPanel1.add(Nationality);
        Nationality.setBounds(70, 240, 81, 20);

        NationalID.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        NationalID.setForeground(new java.awt.Color(51, 204, 255));
        NationalID.setText("National ID:");
        jPanel1.add(NationalID);
        NationalID.setBounds(70, 280, 86, 20);

        MobileNumber.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        MobileNumber.setForeground(new java.awt.Color(51, 204, 255));
        MobileNumber.setText("Mobile Number:");
        jPanel1.add(MobileNumber);
        MobileNumber.setBounds(70, 330, 114, 20);
        jPanel1.add(MobileNumberBox);
        MobileNumberBox.setBounds(210, 320, 195, 26);
        jPanel1.add(AgeBox);
        AgeBox.setBounds(210, 370, 195, 26);
        jPanel1.add(NationalIDBox);
        NationalIDBox.setBounds(210, 280, 195, 26);
        jPanel1.add(NationalityBox);
        NationalityBox.setBounds(210, 240, 129, 26);
        jPanel1.add(LastNameBox);
        LastNameBox.setBounds(210, 200, 129, 26);
        jPanel1.add(MiddleNameBox);
        MiddleNameBox.setBounds(210, 150, 129, 26);

        FirstNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameBoxActionPerformed(evt);
            }
        });
        jPanel1.add(FirstNameBox);
        FirstNameBox.setBounds(210, 100, 129, 26);

        btnNights.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNights.setForeground(new java.awt.Color(51, 204, 255));
        btnNights.setText("> Get Nights");
        btnNights.setBorder(null);
        btnNights.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNightsActionPerformed(evt);
            }
        });
        jPanel1.add(btnNights);
        btnNights.setBounds(400, 470, 130, 23);

        btnDeparture.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDeparture.setForeground(new java.awt.Color(51, 204, 255));
        btnDeparture.setText("> Get Departure");
        btnDeparture.setBorder(null);
        btnDeparture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeparture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartureActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeparture);
        btnDeparture.setBounds(390, 520, 160, 23);

        Arrivals.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Arrivals.setForeground(new java.awt.Color(51, 204, 255));
        Arrivals.setText("Arrivals:");
        jPanel1.add(Arrivals);
        Arrivals.setBounds(70, 420, 76, 20);

        Nights.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Nights.setForeground(new java.awt.Color(51, 204, 255));
        Nights.setText("Nights:");
        jPanel1.add(Nights);
        Nights.setBounds(70, 470, 76, 20);

        Departure.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Departure.setForeground(new java.awt.Color(51, 204, 255));
        Departure.setText("Departure:");
        jPanel1.add(Departure);
        Departure.setBounds(70, 510, 76, 20);

        AvailableRooms.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        AvailableRooms.setForeground(new java.awt.Color(51, 204, 255));
        AvailableRooms.setText("Available Rooms:");
        jPanel1.add(AvailableRooms);
        AvailableRooms.setBounds(70, 560, 124, 20);

        TotalPayments.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        TotalPayments.setForeground(new java.awt.Color(51, 204, 255));
        TotalPayments.setText("Total Payments:");
        jPanel1.add(TotalPayments);
        TotalPayments.setBounds(70, 590, 115, 20);

        Deposit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Deposit.setForeground(new java.awt.Color(51, 204, 255));
        Deposit.setText("Deposit:");
        jPanel1.add(Deposit);
        Deposit.setBounds(70, 630, 115, 20);

        RestAmount.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        RestAmount.setForeground(new java.awt.Color(51, 204, 255));
        RestAmount.setText("Rest Amount:");
        jPanel1.add(RestAmount);
        RestAmount.setBounds(70, 660, 115, 20);
        jPanel1.add(DepositBox);
        DepositBox.setBounds(210, 620, 123, 26);

        RestAmountLabel.setForeground(new java.awt.Color(51, 204, 255));
        RestAmountLabel.setText("jLabel21");
        jPanel1.add(RestAmountLabel);
        RestAmountLabel.setBounds(220, 660, 110, 20);

        TotalPaymentsLabel.setForeground(new java.awt.Color(51, 204, 255));
        TotalPaymentsLabel.setText("jLabel19");
        jPanel1.add(TotalPaymentsLabel);
        TotalPaymentsLabel.setBounds(220, 590, 110, 20);

        RoomsNumbers.setForeground(new java.awt.Color(51, 204, 255));
        RoomsNumbers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101", "102", "103" }));
        RoomsNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomsNumbersActionPerformed(evt);
            }
        });
        jPanel1.add(RoomsNumbers);
        RoomsNumbers.setBounds(210, 550, 123, 26);
        jPanel1.add(DepartureBoxDate);
        DepartureBoxDate.setBounds(210, 510, 141, 28);

        NightsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NightsBoxActionPerformed(evt);
            }
        });
        jPanel1.add(NightsBox);
        NightsBox.setBounds(210, 470, 102, 26);
        jPanel1.add(ArrivalsBoxDate);
        ArrivalsBoxDate.setBounds(210, 420, 141, 24);

        btnBook.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        btnBook.setForeground(new java.awt.Color(51, 204, 255));
        btnBook.setText(">BOOK");
        btnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnBook);
        btnBook.setBounds(350, 650, 240, 50);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/icons8_new_file_32px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("New Reservation");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(199, 199, 199))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 660, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(190, 0, 610, 790);

        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        new Receiption().setVisible(true);
        this.setVisible(false);
       String name="GuestName";
       int room=405;
       int passcode=34483;
       String service1="dinner";
       String service2="garage";
       double taxes=22.094;
       double total=22435.87;
       double payed=4887.5;
       double rest=154.44;
       showMessageDialog(null,"Name: "+name+"\n"+"Room No. : "+room+"\n"+"Passcode: "+passcode+"\n"+"Services: "+"\n"+service1+"\n"+service2+"\n"+"Taxes:"+taxes+"Total Cost: "+total+"\n"+"Payed: "+payed+"\n"+"Rest Amount: "+rest);
        
    }//GEN-LAST:event_btnBookActionPerformed

    private void FirstNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameBoxActionPerformed

    private void RoomsNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomsNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomsNumbersActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new Receiption().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void NightsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NightsBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NightsBoxActionPerformed

    private void btnDepartureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartureActionPerformed
        try
        {
            SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
            String Arrivals_str = dformat.format(ArrivalsBoxDate.getDate());
            String Arrivals[] = Arrivals_str.split("-");
            int nights = Integer.parseInt(NightsBox.getText());
            String Departure_str = Arrivals[0] + "-" + 
                    (Integer.parseInt(Arrivals[1])+(Integer.parseInt(Arrivals[2])+nights)/(31+Integer.parseInt(Arrivals[1])%2)) + "-" + 
                    ((Integer.parseInt(Arrivals[2])+nights)%(31+Integer.parseInt(Arrivals[1])%2));
            Date departure = new SimpleDateFormat("yyyy-MM-dd").parse(Departure_str);
            DepartureBoxDate.setDate(departure);
        } 
        catch (ParseException ex) {
            Logger.getLogger(ReservationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDepartureActionPerformed

    private void btnNightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNightsActionPerformed
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
        String Arrivals_str = dformat.format(ArrivalsBoxDate.getDate());
        String Departure_str = dformat.format(DepartureBoxDate.getDate());
        String Arrivals[] = Arrivals_str.split("-");
        String Departures[] = Departure_str.split("-");
        int nights = Integer.parseInt(Departures[2])-Integer.parseInt(Arrivals[2])
                +(Integer.parseInt(Departures[1])-Integer.parseInt(Arrivals[1]))
                *(31+Integer.parseInt(Departures[1])%2+Integer.parseInt(Arrivals[1])%2);
        NightsBox.setText(nights + "");
    }//GEN-LAST:event_btnNightsActionPerformed

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
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JTextField AgeBox;
    private javax.swing.JLabel Arrivals;
    private com.toedter.calendar.JDateChooser ArrivalsBoxDate;
    private javax.swing.JLabel AvailableRooms;
    private javax.swing.JLabel Departure;
    private com.toedter.calendar.JDateChooser DepartureBoxDate;
    private javax.swing.JLabel Deposit;
    private javax.swing.JTextField DepositBox;
    private javax.swing.JLabel FirstName;
    private javax.swing.JTextField FirstNameBox;
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField LastNameBox;
    private javax.swing.JLabel MiddleName;
    private javax.swing.JTextField MiddleNameBox;
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JTextField MobileNumberBox;
    private javax.swing.JLabel NationalID;
    private javax.swing.JTextField NationalIDBox;
    private javax.swing.JLabel Nationality;
    private javax.swing.JTextField NationalityBox;
    private javax.swing.JLabel Nights;
    private javax.swing.JTextField NightsBox;
    private javax.swing.JLabel RestAmount;
    private javax.swing.JLabel RestAmountLabel;
    private javax.swing.JComboBox<String> RoomsNumbers;
    private javax.swing.JLabel TotalPayments;
    private javax.swing.JLabel TotalPaymentsLabel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnDeparture;
    private javax.swing.JButton btnNights;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
