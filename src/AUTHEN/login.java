package AUTHEN;

import ADMIN.a_dash;
import USER.g_dash;
import USER.h_dash;
import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        
        Icon i = logo2.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(logo2.getWidth(), logo2.getHeight(), Image.SCALE_SMOOTH);
        logo2.setIcon(new ImageIcon(image));
        
    }
    
    static String status;
    static String role;
    
       public static boolean loginAcc(String username, String password){
       
       dbConnector connector = new dbConnector();
       
       
       try{
          String query = "SELECT * FROM tbl_user WHERE u_name = '" + username + "' AND u_pass = '" + password + "'";
          ResultSet resultSet = connector.getData(query);
          if (resultSet.next()){
              status = resultSet.getString("u_status");
              role = resultSet.getString("u_role");
              Session ses =Session.getInstance();
              ses.setUid(resultSet.getInt("userID"));
              ses.setRole(resultSet.getString("u_role"));
              ses.setFname(resultSet.getString("fname"));
              ses.setLname(resultSet.getString("lname"));
              ses.setMname(resultSet.getString("mname"));
              ses.setEmail(resultSet.getString("u_email"));
              ses.setPhone(resultSet.getString("u_phone"));
              ses.setAddress(resultSet.getString("u_address"));
              ses.setPassword(resultSet.getString("u_pass"));
              ses.setUsern(resultSet.getString("u_name"));
              ses.setStatus(resultSet.getString("u_status"));
              System.out.println(""+ses.getUid());
              return true;
       }else {
               return false;
            }
       
       }catch (SQLException ex){
           return false;
       }
       }
       
       
       

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Signuplinker = new javax.swing.JLabel();
        forgotpass = new javax.swing.JLabel();
        forgotpass1 = new javax.swing.JLabel();
        forgotpass2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Signuplinker1 = new javax.swing.JLabel();
        Appname1 = new javax.swing.JLabel();
        Appname = new javax.swing.JLabel();
        tagline2 = new javax.swing.JLabel();
        tagline1 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(146, 80, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Signuplinker.setFont(new java.awt.Font("Times New Roman", 2, 9)); // NOI18N
        Signuplinker.setForeground(new java.awt.Color(146, 80, 80));
        Signuplinker.setText("Sign up!");
        Signuplinker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Signuplinker.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SignuplinkerAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Signuplinker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignuplinkerMouseClicked(evt);
            }
        });
        jPanel2.add(Signuplinker, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        forgotpass.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass.setText("Password");
        jPanel2.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        forgotpass1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        forgotpass1.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass1.setText("Forgot password?");
        forgotpass1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(forgotpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        forgotpass2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass2.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass2.setText("Username/Email");
        jPanel2.add(forgotpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        user.setBackground(new java.awt.Color(243, 234, 234));
        user.setAlignmentX(0.0F);
        user.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 30));

        pass.setBackground(new java.awt.Color(243, 234, 234));
        pass.setAlignmentX(0.0F);
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        jPanel2.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 30));

        jButton1.setBackground(new java.awt.Color(214, 223, 231));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(183, 206, 229));
        jButton1.setText("LOGIN");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, 30));

        Signuplinker1.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        Signuplinker1.setForeground(new java.awt.Color(102, 102, 102));
        Signuplinker1.setText("No Account yet?");
        Signuplinker1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(Signuplinker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        Appname1.setBackground(new java.awt.Color(0, 0, 0));
        Appname1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Appname1.setForeground(new java.awt.Color(162, 194, 226));
        Appname1.setText("LOGIN");
        jPanel2.add(Appname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 280, 240));

        Appname.setBackground(new java.awt.Color(0, 0, 0));
        Appname.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        Appname.setForeground(new java.awt.Color(183, 206, 229));
        Appname.setText("iBook");
        jPanel1.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        tagline2.setForeground(new java.awt.Color(255, 255, 255));
        tagline2.setText("seamless experiences..");
        jPanel1.add(tagline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 150, -1));

        tagline1.setForeground(new java.awt.Color(255, 255, 255));
        tagline1.setText("Where your plans meet");
        jPanel1.add(tagline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 180, -1));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/logo2.png"))); // NOI18N
        logo2.setText("jLabel2");
        jPanel1.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 200, 210));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 300, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (loginAcc(user.getText(),pass.getText())){
             if(status.equals("Active")){
            JOptionPane.showMessageDialog(null,"Login Success! Redirecting..");
              if(role.equals("Admin")){
                a_dash admin = new a_dash();
                admin.setVisible(true);
                this.dispose();    
              }else if(role.equals("Host")){
              h_dash host = new h_dash();
              host.setVisible(true);
              this.dispose();
              }else if(role.equals("Guest")){
              g_dash guest = new g_dash();
              guest.setVisible(true);
              this.dispose();
              }
             }else{
            JOptionPane.showMessageDialog(null,"[ERROR] Inactive Account Detected. Please contact an admin.");
            } 
        }else {
             JOptionPane.showMessageDialog(null,"[ERROR] Account may not exist.!"); }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SignuplinkerAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SignuplinkerAncestorAdded

    }//GEN-LAST:event_SignuplinkerAncestorAdded

    private void SignuplinkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignuplinkerMouseClicked
       register reg = new register();
       reg.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_SignuplinkerMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname;
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Signuplinker;
    private javax.swing.JLabel Signuplinker1;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel forgotpass1;
    private javax.swing.JLabel forgotpass2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel tagline1;
    private javax.swing.JLabel tagline2;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
