package ADMIN;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class uform extends javax.swing.JFrame {


    public uform() {
        initComponents();
        displayData();
        
        
    }

        public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            Session ses = Session.getInstance();
            int current = ses.getUid();
            ResultSet rs = dbc.getData("SELECT userID, u_role, lname, u_name, u_email, u_status FROM tbl_user WHERE userID != '"+ current +"' ");
            u_tbl.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

    }
        
    Color exit = new Color(255,255,255);
    Color hover = new Color(146,80,80);
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Appname1 = new javax.swing.JLabel();
        Appname2 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        u_tbl = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        username = new javax.swing.JLabel();
        id2 = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sett = new javax.swing.JLabel();
        id3 = new javax.swing.JLabel();
        list = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Appname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        acts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(243, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(146, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(214, 223, 231));
        add.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(183, 206, 229));
        add.setText("ADD USER");
        add.setBorder(null);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel5.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 30));

        jButton2.setBackground(new java.awt.Color(214, 223, 231));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(183, 206, 229));
        jButton2.setText("DELETE USER");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 160, 30));

        edit.setBackground(new java.awt.Color(214, 223, 231));
        edit.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(183, 206, 229));
        edit.setText("EDIT USER");
        edit.setBorder(null);
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel5.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 580, 50));

        jPanel4.setBackground(new java.awt.Color(146, 80, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appname1.setBackground(new java.awt.Color(0, 0, 0));
        Appname1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        Appname1.setForeground(new java.awt.Color(183, 206, 229));
        Appname1.setText("USER LIST");
        jPanel4.add(Appname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 30));

        Appname2.setBackground(new java.awt.Color(0, 0, 0));
        Appname2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Appname2.setForeground(new java.awt.Color(183, 206, 229));
        Appname2.setText("iBook");
        jPanel4.add(Appname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("ADMIN ");
        id1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id1MouseEntered(evt);
            }
        });
        jPanel4.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 40, -1));

        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("      ");
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idMouseEntered(evt);
            }
        });
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 20, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        u_tbl.setBackground(new java.awt.Color(243, 234, 234));
        u_tbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        u_tbl.setGridColor(new java.awt.Color(146, 80, 80));
        u_tbl.setSelectionBackground(new java.awt.Color(183, 206, 229));
        u_tbl.setSelectionForeground(new java.awt.Color(243, 234, 234));
        u_tbl.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(u_tbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 480, 270));

        jPanel6.setBackground(new java.awt.Color(186, 133, 133));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        username.setText("user");
        jPanel6.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 20));

        id2.setForeground(new java.awt.Color(255, 255, 255));
        id2.setText("      ");
        id2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id2MouseEntered(evt);
            }
        });
        jPanel6.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, -1));

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
        jPanel6.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/avatar.png"))); // NOI18N
        avatar.setText("     ");
        jPanel6.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 20, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Properties");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

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
        jPanel6.add(sett, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        id3.setForeground(new java.awt.Color(255, 255, 255));
        id3.setText("ID:");
        id3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id3MouseEntered(evt);
            }
        });
        jPanel6.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 20, -1));

        list.setForeground(new java.awt.Color(146, 80, 80));
        list.setText("List of users");
        list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listMouseEntered(evt);
            }
        });
        jPanel6.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Bookings");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 330));

        Appname.setBackground(new java.awt.Color(0, 0, 0));
        Appname.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname.setForeground(new java.awt.Color(183, 206, 229));
        Appname.setText("Admin Dashboard");
        jPanel2.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel3.setText("______________________________________________________________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 470, -1));

        acts.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        acts.setForeground(new java.awt.Color(134, 163, 194));
        acts.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        acts.setText("> Home > User List");
        jPanel2.add(acts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
      useradd add = new useradd();
      add.setVisible(true);
      add.upd.setEnabled(false);
      this.dispose();
    }//GEN-LAST:event_addActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int rowIndex = u_tbl.getSelectedRow();  
        if(rowIndex<0){
           JOptionPane.showMessageDialog(null,"No selected row.");
        }else{
           try{
             dbConnector db = new dbConnector();
              TableModel tbl = u_tbl.getModel();
             ResultSet rs = db.getData("SELECT * FROM tbl_user WHERE userID = '"+tbl.getValueAt(rowIndex, 0)+"'");
             if(rs.next()){
             useradd user = new useradd();
             user.fn.setText(""+rs.getString("fname"));
             user.ln.setText(""+rs.getString("lname"));
             user.mn.setText(""+rs.getString("mname"));
             user.u_email.setText(""+rs.getString("u_email"));
             user.u_location.setText(""+rs.getString("u_address"));
             user.u_name.setText(""+rs.getString("u_name"));
             user.pass.setText(""+rs.getString("u_pass"));
             user.pass2.setText(""+rs.getString("u_pass"));
             user.phone.setText(""+rs.getString("u_phone"));
             user.u_role.setSelectedItem(""+rs.getString("u_role"));
             user.u_status.setSelectedItem(""+rs.getString("u_status"));
             user.idshet.setText(""+rs.getInt("userID"));
             user.add.setEnabled(false);
             user.setVisible(true);
             this.dispose();
             }
           }catch(SQLException ex){
               System.out.println(""+ex);
           }
        }
    }//GEN-LAST:event_editActionPerformed

    private void id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseClicked

    private void id1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseEntered

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        a_dash home = new a_dash();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_idMouseClicked

    private void idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_idMouseEntered

    private void id2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id2MouseClicked

    }//GEN-LAST:event_id2MouseClicked

    private void id2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id2MouseEntered

    }//GEN-LAST:event_id2MouseEntered

    private void settMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseClicked
        userset settings = new userset();
        settings.setVisible(true);
        if(acts.getText().contains("Settings")){
           settings.acts.setText("> Home > Settings");
        }else{
           settings.acts.setText(">Home > User List > Settings");
        }
        
        this.dispose();
    }//GEN-LAST:event_settMouseClicked

    private void settMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseEntered
        sett.setForeground(hover);
    }//GEN-LAST:event_settMouseEntered

    private void settMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseExited
        sett.setForeground(exit);
    }//GEN-LAST:event_settMouseExited

    private void id3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id3MouseClicked

    private void id3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id3MouseEntered

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked

    }//GEN-LAST:event_listMouseClicked

    private void listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseEntered

    }//GEN-LAST:event_listMouseEntered

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setForeground(hover);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setForeground(exit);
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
//        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(uform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname;
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Appname2;
    public javax.swing.JLabel acts;
    private javax.swing.JButton add;
    private javax.swing.JLabel avatar;
    private javax.swing.JButton edit;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel list;
    private javax.swing.JLabel sett;
    private javax.swing.JTable u_tbl;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
