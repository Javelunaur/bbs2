package bbs_jframes;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
        
        Icon i = logo2.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(logo2.getWidth(), logo2.getHeight(), Image.SCALE_SMOOTH);
        logo2.setIcon(new ImageIcon(image));
        
    }
       public static boolean loginAcc(String username, String password){
       dbConnector connector = new dbConnector();
       try{
          String query = "SELECT * FROM tbl_user WHERE u_name = '" + username + "' AND u_pass = '" + password + "'";
          ResultSet resultSet = connector.getData(query);
          return resultSet.next();
       }catch (SQLException ex){
           return false;
       }
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Signuplinker = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        forgotpass = new javax.swing.JLabel();
        forgotpass1 = new javax.swing.JLabel();
        forgotpass2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        Appname = new javax.swing.JLabel();
        tagline2 = new javax.swing.JLabel();
        tagline1 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(146, 80, 80));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(243, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Signuplinker.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        Signuplinker.setText("No Account yet? Sign Up!");
        Signuplinker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(Signuplinker, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jPanel3.setBackground(new java.awt.Color(183, 206, 229));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "LOGIN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(53, 76, 112))); // NOI18N
        jPanel3.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 120, 20));

        forgotpass.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass.setText("Password");
        jPanel2.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        forgotpass1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        forgotpass1.setText("Forgot password?");
        jPanel2.add(forgotpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        forgotpass2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass2.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass2.setText("Username");
        jPanel2.add(forgotpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jTextField2.setBackground(new java.awt.Color(243, 234, 234));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, 30));

        jTextField1.setBackground(new java.awt.Color(243, 234, 234));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 30));

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
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
    private javax.swing.JLabel Signuplinker;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel forgotpass1;
    private javax.swing.JLabel forgotpass2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel tagline1;
    private javax.swing.JLabel tagline2;
    // End of variables declaration//GEN-END:variables
}
