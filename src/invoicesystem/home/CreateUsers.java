/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicesystem.home;

import invoiceProject.dbConinvoice;
import invoicesystem.home.Homepage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Al-RaZi
 */
public class CreateUsers extends javax.swing.JFrame {

            dbConinvoice dbConn = new dbConinvoice();
        PreparedStatement pst;
        

        
        
        private void clear(){
            
            txtEmid.setText("");
            txtEmname.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtCombo.setSelectedItem(0);
            txtEmail.setText("");
            txtContact.setText("");
        }
        

    /**
     * Creates new form Login
     */
    public CreateUsers() {
        initComponents();

        //Title of the window Assign
        this.setTitle("MiXed Invoice - Create User");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmname = new javax.swing.JTextField();
        txtEmid = new javax.swing.JTextField();
        btnInfo = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtCombo = new javax.swing.JComboBox<>();
        txtEmail = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        btnDiscard = new javax.swing.JButton();
        btnSignup = new javax.swing.JButton();
        passShow = new javax.swing.JCheckBox();
        jlabel8 = new javax.swing.JLabel();
        labelBGSignup = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1020, 665));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 70, 47));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setText("EMID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 44));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Contact");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 80, 47));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 110, 47));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Role");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 80, 47));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 70, 44));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel8.setText("Username");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, 44));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel9.setText("Create Access User Panel");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 450, -1));

        txtEmname.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getContentPane().add(txtEmname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 300, 40));

        txtEmid.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getContentPane().add(txtEmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, 40));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/tooltip- 32 X 32.png"))); // NOI18N
        btnInfo.setToolTipText("Click to See info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 40, 40));

        txtPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 190, 47));

        txtUsername.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, 44));

        txtContact.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getContentPane().add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 200, 40));

        txtCombo.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select User Role", "Manager", "Customer Support" }));
        getContentPane().add(txtCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 190, -1));

        txtEmail.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 300, 40));

        btnReset.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/reset-useroff.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 650, 160, -1));

        btnSignin.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSignin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/login.png"))); // NOI18N
        btnSignin.setText("SignIn");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 650, 163, -1));

        btnDiscard.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/logout.png"))); // NOI18N
        btnDiscard.setText("Discard");
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiscard, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 650, 170, -1));

        btnSignup.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/signup-useroff.png"))); // NOI18N
        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 650, 160, -1));

        passShow.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        passShow.setText("Show Password");
        passShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passShowActionPerformed(evt);
            }
        });
        getContentPane().add(passShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 160, 39));

        jlabel8.setBackground(new java.awt.Color(255, 255, 255));
        jlabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/create-user-biz.png"))); // NOI18N
        getContentPane().add(jlabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 760));
        getContentPane().add(labelBGSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1010, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        // TODO add your handling code here:
        int discard = JOptionPane.showConfirmDialog(null, "Do You Want to Discard Session!","Select",JOptionPane.YES_NO_OPTION);
        
       setVisible(false);
    }//GEN-LAST:event_btnDiscardActionPerformed

    private void passShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passShowActionPerformed
        // TODO add your handling code here:
        
        if(passShow.isSelected()){
        txtPassword.setEchoChar((char)0);
        }
        else{
        txtPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_passShowActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        new CreateUsers().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
            DateTimeFormatter dateCreate= DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDateTime now = LocalDateTime.now();
            String date = dateCreate.format(now); 
        
        String EMid =txtEmid.getText().trim();
            
        try {
            // TODO add your handling code here:
            
            String check = "select * from appusers where empid ='"+EMid+"'";
            pst=dbConn.getCon().prepareStatement(check);
            ResultSet rs;
            rs = pst.executeQuery();
            
             if(rs.next()){
                JOptionPane.showMessageDialog(this, "Username Already Exist");
                 dispose();
                 new CreateUsers().setVisible(true);
            }else if (txtEmail.equals("")){
             JOptionPane.showMessageDialog(this, "Fill the required field!");
             }
             else{
            String sql = "insert into appusers(empid, name, username, password, role, email, contact, date_created) values(?, ?, ?, ?,?, ?, ?, ?)";
            pst=dbConn.getCon().prepareStatement(sql);
            
            pst.setString(1, txtEmid.getText().trim());
            pst.setString(2, txtEmname.getText().trim());
            pst.setString(3, txtUsername.getText().trim());
            pst.setString(4, txtPassword.getText().trim());
            pst.setString(5, txtCombo.getSelectedItem().toString());
            pst.setString(6, txtEmail.getText().trim());
            pst.setString(7, txtContact.getText().trim());
            pst.setString(8, date);

            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Data Saved Successful!");
            pst.close();
            dbConn.getCon().close();
            clear();
            }
     
        }
        catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Failed! to Save Data!");
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Failed! to Save Data!");
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnSigninActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(this, "User Two Letter and Four Numeric Character. And Make Sure that It is Unique!");
    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabel8;
    private javax.swing.JLabel labelBGSignup;
    private javax.swing.JCheckBox passShow;
    private javax.swing.JComboBox<String> txtCombo;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmid;
    private javax.swing.JTextField txtEmname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
