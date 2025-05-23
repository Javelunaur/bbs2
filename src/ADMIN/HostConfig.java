package ADMIN;

import ADMIN.HostDetails;
import ADMIN.a_dash;
import ADMIN.userset;
import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class HostConfig extends javax.swing.JFrame {

    /**
     * Creates new form HostConfig
     */
    public HostConfig() {
        initComponents();
        
        displayData();
    }
    
        public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            String current = "Host";
            ResultSet rs = dbc.getData("SELECT userID, lname, u_name, u_email, u_status FROM tbl_user WHERE u_role = '"+ current +"' ");
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

        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        details = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Appname1 = new javax.swing.JLabel();
        Appname2 = new javax.swing.JLabel();
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

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BACK >>");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(243, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(146, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        details.setBackground(new java.awt.Color(214, 223, 231));
        details.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        details.setForeground(new java.awt.Color(183, 206, 229));
        details.setText("USER DETAILS");
        details.setBorder(null);
        details.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsMouseClicked(evt);
            }
        });
        details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsActionPerformed(evt);
            }
        });
        jPanel5.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 580, 50));

        jPanel4.setBackground(new java.awt.Color(146, 80, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appname1.setBackground(new java.awt.Color(0, 0, 0));
        Appname1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        Appname1.setForeground(new java.awt.Color(183, 206, 229));
        Appname1.setText("HOST LIST");
        jPanel4.add(Appname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 30));

        Appname2.setBackground(new java.awt.Color(0, 0, 0));
        Appname2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Appname2.setForeground(new java.awt.Color(183, 206, 229));
        Appname2.setText("iBook");
        jPanel4.add(Appname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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

        jLabel2.setForeground(new java.awt.Color(146, 80, 80));
        jLabel2.setText("Host Config");
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
        });
        jPanel6.add(list, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Guest Config");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 330));

        Appname.setBackground(new java.awt.Color(0, 0, 0));
        Appname.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname.setForeground(new java.awt.Color(183, 206, 229));
        Appname.setText("Host Configuration");
        jPanel2.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel3.setText("______________________________________________________________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 470, -1));

        acts.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        acts.setForeground(new java.awt.Color(134, 163, 194));
        acts.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        acts.setText("> Home > User List");
        jPanel2.add(acts, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 30));

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
    }// </editor-fold>//GEN-END:initComponents

    private void detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsMouseClicked

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
//        int rowIndex = u_tbl.getSelectedRow();
//        if(rowIndex<0){
//            JOptionPane.showMessageDialog(null,"Select a Host.");
//        }else{
//            try{
//                dbConnector db = new dbConnector();
//                TableModel tbl = u_tbl.getModel();
//                ResultSet rs = db.getData("SELECT * FROM tbl_user WHERE userID = '"+tbl.getValueAt(rowIndex, 0)+"'");
//                if(rs.next()){
//                    HostDetails user = new HostDetails();
//                    tableprop tblp = new tableprop();
//                    user.fn.setText(""+rs.getString("fname"));
//                    user.ln.setText(""+rs.getString("lname"));
//                    user.mn.setText(""+rs.getString("mname"));
//                    user.email.setText(""+rs.getString("u_email"));
//                    user.location.setText(""+rs.getString("u_address"));
//                    user.usern.setText(""+rs.getString("u_name"));
//                    user.phone.setText(""+rs.getString("u_phone"));
//                    user.idshi.setText(""+rs.getInt("userID"));
//                    
//                    tblp.idd.setText(""+rs.getString("userID"));
//
////                    user.view.setIcon(user.ResizeImage(rs.getString("pfp"), null, user.view));
////                    user.oldpath = rs.getString("pfp");
////                    user.path = rs.getString("pfp");
////                    user.destination = rs.getString("pfp");
//                    user.setVisible(true);
//                    this.dispose();
//                }
//            }catch(SQLException ex){
//                System.out.println(""+ex);
//            }
//        }

    int rowIndex = u_tbl.getSelectedRow(); // u_tbl here is the table in THIS frame (Admin Dashboard)
    if(rowIndex < 0){
        JOptionPane.showMessageDialog(null,"Select a Host.");
    } else {
        try{
            dbConnector db = new dbConnector();
            TableModel tbl = u_tbl.getModel();
            String userIdFromTable = tbl.getValueAt(rowIndex, 0).toString();

            ResultSet rs = db.getData("SELECT * FROM tbl_user WHERE userID = '"+ userIdFromTable +"'");
            if(rs.next()){
                // 1. Get the actual userID from the ResultSet
                String userIdToPassToHostDetails = String.valueOf(rs.getInt("userID"));

                // 2. Create the HostDetails instance, PASSING THE USER ID TO ITS CONSTRUCTOR
                HostDetails user = new HostDetails(userIdToPassToHostDetails); // <--- CHANGE HERE

                // Set HostDetails fields from the ResultSet (this part is good)
                user.fn.setText(""+rs.getString("fname"));
                user.ln.setText(""+rs.getString("lname"));
                user.mn.setText(""+rs.getString("mname"));
                user.email.setText(""+rs.getString("u_email"));
                user.location.setText(""+rs.getString("u_address"));
                user.usern.setText(""+rs.getString("u_name"));
                user.phone.setText(""+rs.getString("u_phone"));
                user.idshi.setText(""+rs.getInt("userID")); // Set ID in HostDetails frame's display field

                // 3. DO NOT create or show 'tableprop' here. HostDetails will do that.
                // tableprop tblp = new tableprop(userIdToPass); // REMOVE THIS LINE
                // tblp.setVisible(true); // REMOVE THIS LINE

                user.setVisible(true); // Show the HostDetails frame
                this.dispose();        // Close the current Admin Dashboard frame
            } else {
                JOptionPane.showMessageDialog(null, "User not found in database.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException ex){
            System.out.println("SQL Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            System.out.println("General Error: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    //ohyeah
    }//GEN-LAST:event_detailsActionPerformed

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

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        a_dash admin = new a_dash();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setForeground(hover);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setForeground(exit);
    }//GEN-LAST:event_homeMouseExited

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

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        userset settings = new userset();
        settings.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(HostConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HostConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HostConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HostConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HostConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname;
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Appname2;
    public javax.swing.JLabel acts;
    private javax.swing.JLabel avatar;
    private javax.swing.JButton details;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
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
