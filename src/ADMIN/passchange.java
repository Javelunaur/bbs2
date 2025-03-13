package ADMIN;

import config.Session;
import config.dbConnector;
import config.hash;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class passchange extends javax.swing.JFrame {

    public passchange() {
        initComponents();
    }
    Color def = new Color(153,153,153);
    Color exit = new Color(255,255,255);
    Color hover = new Color(146,80,80);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        change = new javax.swing.JButton();
        search = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Appname2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sett = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        list = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Appname1 = new javax.swing.JLabel();
        acts = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Appname3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Appname4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        conf = new javax.swing.JTextField();
        oldpass = new javax.swing.JTextField();
        newpass = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 234, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        change.setBackground(new java.awt.Color(214, 223, 231));
        change.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        change.setForeground(new java.awt.Color(134, 163, 194));
        change.setText("CHANGE");
        change.setBorder(null);
        change.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeMouseClicked(evt);
            }
        });
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });
        jPanel1.add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 130, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/search.png"))); // NOI18N
        search.setText("     ");
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 20, 20));

        jPanel4.setBackground(new java.awt.Color(146, 80, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appname2.setBackground(new java.awt.Color(0, 0, 0));
        Appname2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Appname2.setForeground(new java.awt.Color(183, 206, 229));
        Appname2.setText("iBook");
        jPanel4.add(Appname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        jPanel5.setBackground(new java.awt.Color(186, 133, 133));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user.setText("user");
        jPanel5.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOG OUT");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, -1));

        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("      ");
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idMouseEntered(evt);
            }
        });
        jPanel5.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

        home.setBackground(new java.awt.Color(146, 80, 80));
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });
        jPanel5.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/avatar.png"))); // NOI18N
        avatar.setText("     ");
        jPanel5.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Properties");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        sett.setForeground(new java.awt.Color(146, 80, 80));
        sett.setText("User Settings");
        sett.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sett.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settMouseExited(evt);
            }
        });
        jPanel5.add(sett, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("ID:");
        id1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id1MouseEntered(evt);
            }
        });
        jPanel5.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, -1));

        list.setForeground(new java.awt.Color(255, 255, 255));
        list.setText("List of users");
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listMouseExited(evt);
            }
        });
        jPanel5.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bookings");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 330));

        jLabel1.setText("      ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));

        Appname1.setBackground(new java.awt.Color(0, 0, 0));
        Appname1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Appname1.setForeground(new java.awt.Color(183, 206, 229));
        Appname1.setText("iBook");
        jPanel1.add(Appname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        acts.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        acts.setForeground(new java.awt.Color(134, 163, 194));
        acts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(acts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 340, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel3.setText("______________________________________________________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 470, -1));

        Appname3.setBackground(new java.awt.Color(0, 0, 0));
        Appname3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname3.setForeground(new java.awt.Color(183, 206, 229));
        Appname3.setText("Admin Dashboard");
        jPanel1.add(Appname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 37, -1, 30));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Old Password: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 90, -1));

        Appname4.setBackground(new java.awt.Color(0, 0, 0));
        Appname4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname4.setForeground(new java.awt.Color(134, 163, 194));
        Appname4.setText("Change Password");
        jPanel1.add(Appname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("New Password:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 90, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Confirm Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        conf.setBackground(new java.awt.Color(243, 234, 234));
        conf.setText("              ");
        conf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        jPanel1.add(conf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 160, -1));

        oldpass.setBackground(new java.awt.Color(243, 234, 234));
        oldpass.setText("              ");
        oldpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        oldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpassActionPerformed(evt);
            }
        });
        jPanel1.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 160, -1));

        newpass.setBackground(new java.awt.Color(243, 234, 234));
        newpass.setText("              ");
        newpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseEntered

    }//GEN-LAST:event_idMouseEntered

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        a_dash admin = new a_dash();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        list.setForeground(hover);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        list.setForeground(exit);
    }//GEN-LAST:event_homeMouseExited

    private void settMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_settMouseClicked

    private void settMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseEntered
        sett.setForeground(hover);
    }//GEN-LAST:event_settMouseEntered

    private void settMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseExited
        sett.setForeground(exit);
    }//GEN-LAST:event_settMouseExited

    private void id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseClicked

    private void id1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseEntered

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        uform users = new uform();
        users.setVisible(true);
        if(acts.getText().contains("User List")){
            users.acts.setText("Home > User List");
        }else{
            users.acts.setText("Home > Settings > User List");
        }
        this.dispose();
    }//GEN-LAST:event_listMouseClicked

    private void listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseEntered
        list.setForeground(hover);
    }//GEN-LAST:event_listMouseEntered

    private void listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseExited
        list.setForeground(exit);
    }//GEN-LAST:event_listMouseExited

    private void changeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_changeMouseClicked

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
       try{
        dbConnector dbc = new dbConnector();
        Session ses = Session.getInstance();
        
        String query = "SELECT * FROM tbl_user WHERE userID = '"+ses.getUid()+"' ";
        ResultSet rs = dbc.getData(query);
        if(rs.next()){
           String oldbpass = rs.getString("u_pass");
           String oldhash = hash.hashPassword(oldpass.getText());
           
           if(oldbpass.equals(oldhash)){
             String npass = hash.hashPassword(newpass.getText());
             dbc.updateData("UPDATE tbl_user SET u_pass = '"+npass+"' ");
             JOptionPane.showMessageDialog(null,"Successfully Updated Password.");
               System.out.println("new pass: "+npass);
               userset settings = new userset();
               settings.setVisible(true);
               this.dispose();
           }else{
               JOptionPane.showMessageDialog(null,"[ERROR] Old password is Incorrect.");
               
               String npass = hash.hashPassword(newpass.getText());
               
               System.out.println(""+oldbpass);
               System.out.println(""+oldhash);
               System.out.println(""+npass);
           }
           
        }
        
       }catch(SQLException | NoSuchAlgorithmException ex){
           System.out.println(""+ex);
       }

    }//GEN-LAST:event_changeActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session ses = Session.getInstance();
//        if(ses.getUid()==0){
//           JOptionPane.showMessageDialog(null,"[ERROR] No account found, Login First.");
//           login log = new login();
//           log.setVisible(true);
//           this.dispose();
//        }else{
           user.setText(""+ses.getUsern());
           id.setText(""+ses.getUid());
//        }
    }//GEN-LAST:event_formWindowActivated

    private void oldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpassActionPerformed

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
            java.util.logging.Logger.getLogger(passchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passchange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passchange().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Appname2;
    private javax.swing.JLabel Appname3;
    private javax.swing.JLabel Appname4;
    public javax.swing.JLabel acts;
    private javax.swing.JLabel avatar;
    public javax.swing.JButton change;
    public javax.swing.JTextField conf;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel list;
    public javax.swing.JTextField newpass;
    public javax.swing.JTextField oldpass;
    private javax.swing.JLabel search;
    private javax.swing.JLabel sett;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
