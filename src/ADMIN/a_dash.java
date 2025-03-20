//73l8gRjwLftklgfdXT+MdiMEjJwGPVMsyVxe16iYpk8=   12345678
package ADMIN;

import AUTHEN.login;
import config.Session;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class a_dash extends javax.swing.JFrame {


    public a_dash() {
        initComponents();
        
        Icon a = search.getIcon();
        ImageIcon icon = (ImageIcon)a;
        Image image = icon.getImage().getScaledInstance(search.getWidth(), search.getHeight(), Image.SCALE_SMOOTH);
        search.setIcon(new ImageIcon(image));
        
        Icon b = avatar.getIcon();
        ImageIcon icon1 = (ImageIcon)b;
        Image image1 = icon1.getImage().getScaledInstance(avatar.getWidth(), avatar.getHeight(), Image.SCALE_SMOOTH);
        avatar.setIcon(new ImageIcon(image1));
    }
    Color def = new Color(153,153,153);
    Color exit = new Color(255,255,255);
    Color hover = new Color(146,80,80);
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JLabel();
        srch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Appname2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        out = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sett = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        list = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Appname1 = new javax.swing.JLabel();
        Appname = new javax.swing.JLabel();
        acts = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 234, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/search.png"))); // NOI18N
        search.setText("     ");
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 20, 20));

        srch.setForeground(new java.awt.Color(153, 153, 153));
        srch.setText(" Browse");
        srch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80)));
        srch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                srchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                srchFocusLost(evt);
            }
        });
        srch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchActionPerformed(evt);
            }
        });
        jPanel1.add(srch, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 420, 20));

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

        out.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        out.setForeground(new java.awt.Color(255, 255, 255));
        out.setText("LOG OUT");
        out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        out.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                outMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                outMouseExited(evt);
            }
        });
        jPanel5.add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 305, -1, -1));

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
        home.setForeground(new java.awt.Color(146, 80, 80));
        home.setText("Home");
        jPanel5.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/avatar.png"))); // NOI18N
        avatar.setText("     ");
        jPanel5.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Properties");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        sett.setForeground(new java.awt.Color(255, 255, 255));
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

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80)), "TOTAL BOOKINGS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 130, 80));

        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80)), "Pending Bookings", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 480, 90));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80)), "TOTAL PROPERTIES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, 80));

        jLabel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80)), "ACTIVE USERS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, 80));

        Appname1.setBackground(new java.awt.Color(0, 0, 0));
        Appname1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Appname1.setForeground(new java.awt.Color(183, 206, 229));
        Appname1.setText("iBook");
        jPanel1.add(Appname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Appname.setBackground(new java.awt.Color(0, 0, 0));
        Appname.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname.setForeground(new java.awt.Color(183, 206, 229));
        Appname.setText("Admin Dashboard");
        jPanel1.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 37, -1, 30));

        acts.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        acts.setForeground(new java.awt.Color(134, 163, 194));
        acts.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        acts.setText("> Home");
        acts.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(acts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel3.setText("______________________________________________________________________________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 470, -1));

        jTextField1.setBackground(new java.awt.Color(243, 234, 234));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 0, 0));

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

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseEntered

    }//GEN-LAST:event_idMouseEntered

    private void outMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMouseClicked
       JOptionPane.showMessageDialog(null,"Logged out Successfully.");
       login log = new login();
       log.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_outMouseClicked

    private void srchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchActionPerformed

    }//GEN-LAST:event_srchActionPerformed

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
//        }
      
        
    }//GEN-LAST:event_formWindowActivated

    private void settMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseClicked
        userset settings = new userset();
        settings.setVisible(true);
        settings.acts.setText("> Home > Settings");
        this.dispose();
    }//GEN-LAST:event_settMouseClicked

    private void settMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseEntered
        sett.setForeground(hover);
    }//GEN-LAST:event_settMouseEntered

    private void id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseClicked

    private void id1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseEntered

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        uform users = new uform();
        users.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listMouseClicked

    private void listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseEntered
        list.setForeground(hover);
    }//GEN-LAST:event_listMouseEntered

    private void settMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseExited
        sett.setForeground(exit);
    }//GEN-LAST:event_settMouseExited

    private void listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseExited
        list.setForeground(exit);
    }//GEN-LAST:event_listMouseExited

    private void outMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMouseEntered
        out.setForeground(hover);
    }//GEN-LAST:event_outMouseEntered

    private void outMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outMouseExited
        out.setForeground(exit);
    }//GEN-LAST:event_outMouseExited

    private void srchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srchFocusLost
            if(srch.getText().equals(" ")){
            srch.setText(" Browse");
            srch.setForeground(def);
        }
    }//GEN-LAST:event_srchFocusLost

    private void srchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srchFocusGained
         if (srch.getText().equals(" Browse")){
        srch.setText(" ");
        srch.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_srchFocusGained

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
            java.util.logging.Logger.getLogger(a_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_dash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new a_dash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname;
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Appname2;
    public javax.swing.JLabel acts;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel list;
    private javax.swing.JLabel out;
    private javax.swing.JLabel search;
    public javax.swing.JLabel sett;
    private javax.swing.JTextField srch;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
