/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicesystem.home;

import invoiceProject.dbConinvoice;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Al-RaZi
 */
public class AddProducts extends javax.swing.JFrame {

    /**
     * Creates new form AddProducts
     */
    
    dbConinvoice dbConn = new dbConinvoice();
    PreparedStatement pst;
    
    public void clear(){
        txtProid.setText("");
        txtProname.setText("");
        txtProdetails.setText("");
        txtProprice.setText("");
        txtProstat.setSelectedItem("");
        
    }
    


    
    public AddProducts() {
        initComponents();
        
        //Title of the window Assign
        this.setTitle("MiXed Invoice - Add Products");

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnProductSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProid = new javax.swing.JTextField();
        txtProname = new javax.swing.JTextField();
        txtProdetails = new javax.swing.JTextField();
        txtProprice = new javax.swing.JTextField();
        txtProstat = new javax.swing.JComboBox<>();
        btnTooltip = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 650));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/add-product.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel2.setText("Add Products");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 110));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 117, 980, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 523, 980, 10));

        btnReset.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnProductSave.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnProductSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/save.png"))); // NOI18N
        btnProductSave.setText("Save");
        btnProductSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductSaveActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/close-exit.png"))); // NOI18N
        btnClose.setText("Exit");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setText("Product ID");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setText("Product Name");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setText("Product Details");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setText("Unit Price");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setText("Stock Status");

        txtProid.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtProid.setText("Enter Product ID");
        txtProid.setToolTipText("Enter Product ID");
        txtProid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProidFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProidFocusLost(evt);
            }
        });

        txtProname.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtProname.setText("Type Product Name");
        txtProname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPronameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPronameFocusLost(evt);
            }
        });

        txtProdetails.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtProdetails.setText("Describe Product Details");
        txtProdetails.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtProdetailsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProdetailsFocusLost(evt);
            }
        });

        txtProprice.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtProprice.setText("Add Product Price (Per Unit)");
        txtProprice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPropriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPropriceFocusLost(evt);
            }
        });

        txtProstat.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtProstat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Availability", "In-Stock", "Stock-Out" }));

        btnTooltip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/tooltip- 32 X 32.png"))); // NOI18N
        btnTooltip.setToolTipText("Click to See!");
        btnTooltip.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnTooltip.setOpaque(true);
        btnTooltip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTooltipMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtProdetails))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtProname))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtProid))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addGap(62, 62, 62)
                        .addComponent(btnProductSave)
                        .addGap(54, 54, 54)
                        .addComponent(btnClose))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProprice)
                            .addComponent(txtProstat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(btnTooltip, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTooltip, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtProid, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProdetails, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProprice, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtProstat, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnProductSave)
                    .addComponent(btnClose))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 980, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        
        setVisible(false);
        new AddProducts().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnProductSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductSaveActionPerformed
        DateTimeFormatter dateCreate= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dateCreate.format(now);
        
        DateTimeFormatter timeCreate= DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime tm = LocalDateTime.now();
        String time = timeCreate.format(tm);
        
            String proid =txtProid.getText().trim();
        
        try {
            // TODO add your handling code here:
            
            String check = "select * from newproduct where productid ='"+proid+"'";
            pst=dbConn.getCon().prepareStatement(check);
            ResultSet rs;
            rs = pst.executeQuery();
            
             if(rs.next()){
                JOptionPane.showMessageDialog(this, "Productid Already Available");
                 dispose();
                 new AddProducts().setVisible(true);
            }else{
            String sql = "insert into newproduct(productid, product_name, product_details, product_price, stock_status, date_created, time_created) values(?, ?, ?, ?, ?, ?, ?)";
            pst=dbConn.getCon().prepareStatement(sql);
            
            pst.setString(1, txtProid.getText().trim());
            pst.setString(2, txtProname.getText().trim());
            pst.setString(3, txtProdetails.getText().trim());
            pst.setString(4, txtProprice.getText().trim());
            pst.setString(5, txtProstat.getSelectedItem().toString());
            pst.setString(6, date);
            pst.setString(7, time);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Data Saved Successful!");
            pst.close();
            dbConn.getCon().close();
            clear();
            }
     
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Failed! to Save Data!");
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Failed! to Save Data!");
            Logger.getLogger(AddProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_btnProductSaveActionPerformed

    private void txtPronameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPronameFocusGained
        // TODO add your handling code here:
        if (txtProname.getText().equals("Type Product Name")){
        txtProname.setText("");
        txtProname.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtPronameFocusGained

    private void txtPronameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPronameFocusLost
        // TODO add your handling code here:
        if (txtProname.getText().equals("")){
        txtProname.setText("Type Product Name");
        txtProname.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPronameFocusLost

    private void txtProdetailsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdetailsFocusGained
        // TODO add your handling code here:
        if (txtProdetails.getText().equals("Describe Product Details")){
        txtProdetails.setText("");
        txtProdetails.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_txtProdetailsFocusGained

    private void txtProdetailsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdetailsFocusLost
        // TODO add your handling code here:
        if (txtProdetails.getText().equals("")){
        txtProdetails.setText("Describe Product Details");
        txtProdetails.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtProdetailsFocusLost

    private void txtPropriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPropriceFocusGained
        // TODO add your handling code here:
        if (txtProprice.getText().equals("Add Product Price (Per Unit)")){
        txtProprice.setText("");
        txtProprice.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_txtPropriceFocusGained

    private void txtPropriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPropriceFocusLost
        // TODO add your handling code here:
        if (txtProprice.getText().equals("")){
        txtProprice.setText("Add Product Price (Per Unit)");
        txtProprice.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtPropriceFocusLost

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_formComponentShown

    private void txtProidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProidFocusGained
        // TODO add your handling code here:
        if (txtProid.getText().equals("Enter Product ID")){
        txtProid.setText("");
        txtProid.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtProidFocusGained

    private void txtProidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProidFocusLost
        // TODO add your handling code here:

        if (txtProid.getText().equals("")){
        txtProid.setText("Enter Product ID");
        txtProid.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtProidFocusLost

    private void btnTooltipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTooltipMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "ID must be unique and consists Alphanumeric");
    }//GEN-LAST:event_btnTooltipMouseClicked

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
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnProductSave;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTooltip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtProdetails;
    private javax.swing.JTextField txtProid;
    private javax.swing.JTextField txtProname;
    private javax.swing.JTextField txtProprice;
    private javax.swing.JComboBox<String> txtProstat;
    // End of variables declaration//GEN-END:variables
}
