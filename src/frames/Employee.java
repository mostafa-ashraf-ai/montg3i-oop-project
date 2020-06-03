/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import montg3i.Hotel;
import montg3i.Staff;
import montg3i.ReceptionEmployee;

/**
 *
 * @author hp
 */
public class Employee extends javax.swing.JFrame {
    
        ArrayList<Staff> r = Hotel.getReceptionEmployeeList();
        int i = 0;
        

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
       jPanel1.setBackground(new Color(255,255,255,40));
       // jPanel1.setBackground(new Color(0,0,0,80));
        btnAdd.setBackground(new Color(0,0,0,0));
        btnBack.setBackground(new Color(0,0,0,0));
        
        FirstNameTxt.setText("");
        LastNameTxt.setText("");
        EmailTxt.setText("");
        SalaryTxt.setText("");
        LanguageTxt.setText("");
        
        FirstNameTxt.requestFocus();
        
        DefaultTableModel model = (DefaultTableModel)TableOfEmp.getModel();
        for(i=0; i<r.size(); i++)
        {
            model.insertRow(model.getRowCount(), new Object[]{r.get(i).getId(), r.get(i).getFirstName(), r.get(i).getEmail(), r.get(i).getSalary()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableOfEmp = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FirstNameTxt = new javax.swing.JTextField();
        LastNameTxt = new javax.swing.JTextField();
        EmailTxt = new javax.swing.JTextField();
        LanguageTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        SalaryTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("All about Employees");
        setMinimumSize(new java.awt.Dimension(1520, 853));
        getContentPane().setLayout(null);

        TableOfEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "E-mail", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableOfEmp.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        TableOfEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableOfEmpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableOfEmp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(720, 240, 770, 370);

        btnBack.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
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
        getContentPane().add(btnBack);
        btnBack.setBounds(200, 660, 140, 50);

        btnAdd.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+ Add");
        btnAdd.setBorder(null);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(350, 530, 110, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adding New Employee");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 30, 260, 40);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 110, 20);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 210, 110, 20);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("E-mail:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 290, 80, 20);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Language:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 450, 90, 20);

        FirstNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FirstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(FirstNameTxt);
        FirstNameTxt.setBounds(180, 140, 190, 30);

        LastNameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTxtActionPerformed(evt);
            }
        });
        jPanel1.add(LastNameTxt);
        LastNameTxt.setBounds(180, 210, 190, 30);

        EmailTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTxtActionPerformed(evt);
            }
        });
        jPanel1.add(EmailTxt);
        EmailTxt.setBounds(180, 290, 190, 30);

        LanguageTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LanguageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanguageTxtActionPerformed(evt);
            }
        });
        jPanel1.add(LanguageTxt);
        LanguageTxt.setBounds(180, 447, 190, 30);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(90, 70, 250, 10);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salary:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 370, 80, 20);

        SalaryTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SalaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryTxtActionPerformed(evt);
            }
        });
        jPanel1.add(SalaryTxt);
        SalaryTxt.setBounds(180, 370, 190, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 0, 420, 800);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frames/7.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1500, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new ManagerProfile().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAddMouseExited

    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        btnBack.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnBackMouseEntered

    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        btnBack.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBackMouseExited

    private void FirstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTxtActionPerformed
        LastNameTxt.requestFocus();
    }//GEN-LAST:event_FirstNameTxtActionPerformed

    private void LastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTxtActionPerformed
        EmailTxt.requestFocus();
    }//GEN-LAST:event_LastNameTxtActionPerformed

    private void EmailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTxtActionPerformed
       SalaryTxt.requestFocus();
    }//GEN-LAST:event_EmailTxtActionPerformed

    private void LanguageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanguageTxtActionPerformed
        btnAddActionPerformed(evt);
    }//GEN-LAST:event_LanguageTxtActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel model = (DefaultTableModel)TableOfEmp.getModel();
        String FirstName = FirstNameTxt.getText();
        String LastName = LastNameTxt.getText();
        int Id = ReceptionEmployee.getNextID();
        String UserName = "admin";
        String Password = "0000";
        double Salary = Double.parseDouble(SalaryTxt.getText());
        String Email = EmailTxt.getText();
        String Language = LanguageTxt.getText();
        Hotel.AddReceptionEmployeeList(FirstName, LastName, Id, UserName, Password, Salary, Email, Language);
        r = Hotel.getReceptionEmployeeList();
        model.insertRow(model.getRowCount(), new Object[]{r.get(i).getId(), r.get(i).getFirstName(), r.get(i).getEmail(), r.get(i).getSalary()});
        
        FirstNameTxt.setText("");
        LastNameTxt.setText("");
        EmailTxt.setText("");
        SalaryTxt.setText("");
        LanguageTxt.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void SalaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryTxtActionPerformed
        LanguageTxt.requestFocus();
    }//GEN-LAST:event_SalaryTxtActionPerformed

    private void TableOfEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableOfEmpMouseClicked
        SalaryTxt.setText(TableOfEmp.getValueAt(TableOfEmp.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_TableOfEmpMouseClicked

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailTxt;
    private javax.swing.JTextField FirstNameTxt;
    private javax.swing.JTextField LanguageTxt;
    private javax.swing.JTextField LastNameTxt;
    private javax.swing.JTextField SalaryTxt;
    private javax.swing.JTable TableOfEmp;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
