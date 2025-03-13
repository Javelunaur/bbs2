/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import config.Session;
import java.awt.Color;

/**
 *
 * @author user
 */
public class userset extends javax.swing.JFrame {

    public userset() {
        initComponents();
    }

    Color exit = new Color(255,255,255);
    Color hover = new Color(146,80,80);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Appname2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
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
        Appname = new javax.swing.JLabel();
        acts = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Appname3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Appname4 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        birth = new javax.swing.JLabel();
        forgotpass6 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        forgotpass2 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        forgotpass3 = new javax.swing.JLabel();
        mn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        location = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 234, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("user");
        jPanel5.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 20));

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

        Appname.setBackground(new java.awt.Color(0, 0, 0));
        Appname.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname.setForeground(new java.awt.Color(134, 163, 194));
        Appname.setText("Personal");
        jPanel1.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 30));

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

        jLabel4.setText("Socials:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel6.setText("Display Name: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        jLabel7.setText("Email: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel8.setText("Birthdate: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        Appname4.setBackground(new java.awt.Color(0, 0, 0));
        Appname4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname4.setForeground(new java.awt.Color(134, 163, 194));
        Appname4.setText("Profile");
        jPanel1.add(Appname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 30));

        user.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user.setText("display");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 130, -1));

        email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        email.setText("display");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 130, -1));

        birth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        birth.setText("display");
        jPanel1.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 130, -1));

        forgotpass6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass6.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpass6.setText("First Name");
        jPanel1.add(forgotpass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        fn.setBackground(new java.awt.Color(243, 234, 234));
        fn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 130, 30));

        forgotpass2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass2.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpass2.setText("Last Name");
        jPanel1.add(forgotpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 70, -1));

        ln.setBackground(new java.awt.Color(243, 234, 234));
        ln.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 130, 30));

        forgotpass3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass3.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpass3.setText("Middle Name");
        jPanel1.add(forgotpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 80, -1));

        mn.setBackground(new java.awt.Color(243, 234, 234));
        mn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActionPerformed(evt);
            }
        });
        jPanel1.add(mn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 120, 30));

        jLabel10.setText("Phone Number: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        phone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phone.setText("display");
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 130, -1));

        jLabel11.setText("Password:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        pass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pass.setText("display");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 130, -1));

        jLabel12.setText("Location:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        location.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        location.setText("display");
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 130, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseEntered

    }//GEN-LAST:event_idMouseEntered

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

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        list.setForeground(hover);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        list.setForeground(exit);
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        a_dash admin = new a_dash();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         Session ses = Session.getInstance();
//        if(ses.getUid()==0){
//           JOptionPane.showMessageDialog(null,"[ERROR] No account found, Login First.");
//           login log = new login();
//           log.setVisible(true);
//           this.dispose();
//        }else{
           username.setText(""+ses.getUsern());
           id.setText(""+ses.getUid());
           user.setText(""+ses.getUsern());
           email.setText(""+ses.getEmail());
           phone.setText(""+ses.getPhone());
           pass.setText(""+ses.getPassword());
           fn.setText(""+ses.getFname());
           ln.setText(""+ses.getLname());
           mn.setText(""+ses.getMname());
           
           
           
//        }        
    }//GEN-LAST:event_formWindowActivated

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnActionPerformed

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
            java.util.logging.Logger.getLogger(userset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname;
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Appname2;
    private javax.swing.JLabel Appname3;
    private javax.swing.JLabel Appname4;
    public javax.swing.JLabel acts;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel birth;
    private javax.swing.JLabel email;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel forgotpass2;
    private javax.swing.JLabel forgotpass3;
    private javax.swing.JLabel forgotpass6;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel list;
    public javax.swing.JTextField ln;
    private javax.swing.JLabel location;
    public javax.swing.JTextField mn;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel search;
    private javax.swing.JLabel sett;
    private javax.swing.JLabel user;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
