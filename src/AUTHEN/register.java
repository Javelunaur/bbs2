/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AUTHEN;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }
     
    public static String email, usname;
          public boolean dupCheck(){
              dbConnector dbc = new dbConnector();
              try{
                String query = "SELECT * FROM tbl_user WHERE u_name = '" + u_name.getText() + "' OR u_email = '" + u_email.getText() + "'";
          ResultSet resultSet = dbc.getData(query);
           
                   if (resultSet.next()){                      
                       email = resultSet.getString("u_email");                   
                       if(email.equals(u_email.getText())){
                           JOptionPane.showMessageDialog(null, "Email already used.");
                           u_email.setText("");
                       }
                       
                       usname =resultSet.getString("u_name");
                       if(usname.equals(u_name.getText())){
                           JOptionPane.showMessageDialog(null, "Username already used");
                           u_name.setText("");
                       }     
                       
     
                       return true;
                   }else {
                       return false;
                   }
              }catch (SQLException ex){
                  System.out.println(""+ex);
                  return false;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        forgotpass = new javax.swing.JLabel();
        forgotpass1 = new javax.swing.JLabel();
        forgotpass2 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        pass2 = new javax.swing.JTextField();
        forgotpass5 = new javax.swing.JLabel();
        u_name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        forgotpass6 = new javax.swing.JLabel();
        forgotpass7 = new javax.swing.JLabel();
        u_email = new javax.swing.JTextField();
        forgotpass8 = new javax.swing.JLabel();
        forgotpass9 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        u_location = new javax.swing.JTextField();
        u_role = new javax.swing.JComboBox<>();
        forgotpass4 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Signuplinker1 = new javax.swing.JLabel();
        Signuplinker2 = new javax.swing.JLabel();
        Appname = new javax.swing.JLabel();
        forgotpass3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(146, 80, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotpass.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass.setText("Confirm Password");
        jPanel2.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        forgotpass1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        forgotpass1.setText("Get Started");
        jPanel2.add(forgotpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        forgotpass2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass2.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass2.setText("Last Name");
        jPanel2.add(forgotpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        ln.setBackground(new java.awt.Color(243, 234, 234));
        ln.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel2.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 120, 30));

        pass2.setBackground(new java.awt.Color(243, 234, 234));
        pass2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        jPanel2.add(pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, 30));

        forgotpass5.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass5.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass5.setText("Username");
        jPanel2.add(forgotpass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        u_name.setBackground(new java.awt.Color(243, 234, 234));
        u_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        u_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_nameActionPerformed(evt);
            }
        });
        jPanel2.add(u_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 160, 30));

        phone.setBackground(new java.awt.Color(243, 234, 234));
        phone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 90, 30));

        forgotpass6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass6.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass6.setText("First Name");
        jPanel2.add(forgotpass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        forgotpass7.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass7.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass7.setText("Contact");
        jPanel2.add(forgotpass7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        u_email.setBackground(new java.awt.Color(243, 234, 234));
        u_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        u_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_emailActionPerformed(evt);
            }
        });
        jPanel2.add(u_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 30));

        forgotpass8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass8.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass8.setText("Email Address");
        jPanel2.add(forgotpass8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        forgotpass9.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass9.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass9.setText("Location");
        jPanel2.add(forgotpass9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        fn.setBackground(new java.awt.Color(243, 234, 234));
        fn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel2.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 30));

        u_location.setBackground(new java.awt.Color(243, 234, 234));
        u_location.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        u_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_locationActionPerformed(evt);
            }
        });
        jPanel2.add(u_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 30));

        u_role.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        u_role.setForeground(new java.awt.Color(183, 206, 229));
        u_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roles", "Host", "Guest", "Admin" }));
        u_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(183, 206, 229), 2, true));
        u_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_roleActionPerformed(evt);
            }
        });
        jPanel2.add(u_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 172, 90, 30));

        forgotpass4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass4.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass4.setText("Password");
        jPanel2.add(forgotpass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        pass.setBackground(new java.awt.Color(243, 234, 234));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

        jButton1.setBackground(new java.awt.Color(214, 223, 231));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(183, 206, 229));
        jButton1.setText("REGISTER");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 30));

        Signuplinker1.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        Signuplinker1.setForeground(new java.awt.Color(102, 102, 102));
        Signuplinker1.setText("Have an Account?");
        Signuplinker1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Signuplinker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));

        Signuplinker2.setFont(new java.awt.Font("Times New Roman", 2, 9)); // NOI18N
        Signuplinker2.setForeground(new java.awt.Color(146, 80, 80));
        Signuplinker2.setText("Login");
        Signuplinker2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Signuplinker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 30, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 300, 320));

        Appname.setBackground(new java.awt.Color(0, 0, 0));
        Appname.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        Appname.setForeground(new java.awt.Color(183, 206, 229));
        Appname.setText("iBook");
        jPanel1.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        forgotpass3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        forgotpass3.setForeground(new java.awt.Color(255, 255, 255));
        forgotpass3.setText("Join Us");
        jPanel1.add(forgotpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void u_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_nameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void u_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_emailActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void u_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_locationActionPerformed

    private void u_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_roleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dbConnector dbc = new dbConnector();
        String firstName = fn.getText(), lastName = ln.getText(), username = u_name.getText(), email = u_email.getText(), address = u_location.getText(), conf =  pass2.getText().trim(), password = pass.getText().trim(), contact = phone.getText(), role = u_role.getSelectedItem().toString();
        
        if (firstName.isEmpty() || lastName.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
            return;
        }if (password.length() < 8 || !password.equals(conf) || conf.length() < 8) {
            if(password.length()< 8 || conf.length()<8){
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters.");
                return;
            }else{
                JOptionPane.showMessageDialog(null, "Passwords do not match.");
                return;
            }   
        }if (!contact.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Contact number should only contain numbers.");
            return;
        }if (role == null || role.equals("Roles")) {
            JOptionPane.showMessageDialog(null, "Please select a valid role (Host, Admin, or Guest).");
            return;
        }else if(dupCheck()){
            System.out.println("[ERROR]Duplicate Found.");
        }else{
       if (dbc.insertData("INSERT INTO tbl_user (fname, lname, u_name, u_email, u_address, u_pass, u_role, u_phone) VALUES ('" 
    + fn.getText() + "', '" 
    + ln.getText() + "', '" 
    + u_name.getText() + "', '" 
    + u_email.getText() + "', '" 
    + u_location.getText() + "', '" 
    + pass2.getText() + "', '" 
    + u_role.getSelectedItem() + "', '"+phone.getText()+"')") > 0) { 
    JOptionPane.showMessageDialog(null,"Registered Successfully.");
    login log = new login();
    log.setVisible(true);
    this.dispose();
} else {
    JOptionPane.showMessageDialog(null,"Registration Failed..");
} 
 }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname;
    private javax.swing.JLabel Signuplinker1;
    private javax.swing.JLabel Signuplinker2;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel forgotpass1;
    private javax.swing.JLabel forgotpass2;
    private javax.swing.JLabel forgotpass3;
    private javax.swing.JLabel forgotpass4;
    private javax.swing.JLabel forgotpass5;
    private javax.swing.JLabel forgotpass6;
    private javax.swing.JLabel forgotpass7;
    private javax.swing.JLabel forgotpass8;
    private javax.swing.JLabel forgotpass9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField pass2;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField u_email;
    private javax.swing.JTextField u_location;
    private javax.swing.JTextField u_name;
    private javax.swing.JComboBox<String> u_role;
    // End of variables declaration//GEN-END:variables
}
