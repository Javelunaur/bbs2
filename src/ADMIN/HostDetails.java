
package ADMIN;

import config.Session;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class HostDetails extends javax.swing.JFrame {

    public String oldpath;
    public String path;
    public String destination;
   private String currentHostId;
   
    public HostDetails(String hostId) {
        initComponents();
        
        this.currentHostId = hostId; // Store the ID received from HostConfig

        // You'll already have lines like these from HostConfig.
        // If you load HostDetails this way, you might not need to load data again in here
        // as the HostConfig frame already fetched it and set the fields.
        // user.fn.setText(""+rs.getString("fname")); etc. from Admin Dashboard side.
        // Make sure idshi.setText() is called correctly if you want it to show the ID.
        if (idshi != null) {
            idshi.setText(this.currentHostId); // Ensure the ID is displayed on HostDetails screen
        }

        // Add an action listener for your "View Properties" button (if you have one)
        // btnViewProperties.addActionListener(new java.awt.event.ActionListener() {
        //     public void actionPerformed(java.awt.event.ActionEvent evt) {
        //         btnViewPropertiesActionPerformed(evt);
        //     }
        // });
    }
    
    Color exit = new Color(255,255,255);
    Color hover = new Color(146,80,80);

    HostDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Appname1 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Appname2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        view = new javax.swing.JLabel();
        mn = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        usern = new javax.swing.JTextField();
        fn1 = new javax.swing.JLabel();
        idshi = new javax.swing.JLabel();
        id5 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        forgotpass6 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        forgotpass7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        forgotpass8 = new javax.swing.JLabel();
        details = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        Appname1.setBackground(new java.awt.Color(0, 0, 0));
        Appname1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        Appname1.setForeground(new java.awt.Color(183, 206, 229));
        Appname1.setText("USER LIST");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(243, 234, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(146, 80, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 580, 50));

        jPanel4.setBackground(new java.awt.Color(146, 80, 80));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appname2.setBackground(new java.awt.Color(0, 0, 0));
        Appname2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Appname2.setForeground(new java.awt.Color(183, 206, 229));
        Appname2.setText("iBook");
        jPanel4.add(Appname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BACK >>");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

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
        Appname.setText("Host Property");
        jPanel2.add(Appname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jLabel3.setText("______________________________________________________________________________________________");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 470, -1));

        acts.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        acts.setForeground(new java.awt.Color(134, 163, 194));
        acts.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        acts.setText("> Home > User List");
        jPanel2.add(acts, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, 30));

        view.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        view.setForeground(new java.awt.Color(102, 102, 102));
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(146, 80, 80)));
        view.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                viewFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                viewFocusLost(evt);
            }
        });
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
            }
        });
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, 70));

        mn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        mn.setForeground(new java.awt.Color(102, 102, 102));
        mn.setText("Middle Name");
        jPanel2.add(mn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        fn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        fn.setForeground(new java.awt.Color(102, 102, 102));
        fn.setText("First Name");
        jPanel2.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        ln.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        ln.setForeground(new java.awt.Color(102, 102, 102));
        ln.setText("Last Name");
        jPanel2.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        usern.setEditable(false);
        usern.setBackground(new java.awt.Color(243, 234, 234));
        usern.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        usern.setForeground(new java.awt.Color(102, 102, 102));
        usern.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usern.setText("jwy");
        usern.setToolTipText("");
        usern.setBorder(null);
        usern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernActionPerformed(evt);
            }
        });
        jPanel2.add(usern, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, 20));

        fn1.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        fn1.setForeground(new java.awt.Color(51, 51, 51));
        fn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fn1.setText("@");
        jPanel2.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 20, 20));

        idshi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        idshi.setForeground(new java.awt.Color(102, 102, 102));
        idshi.setText("ID");
        idshi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        idshi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idshiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                idshiMouseEntered(evt);
            }
        });
        jPanel2.add(idshi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 40, 20));

        id5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        id5.setForeground(new java.awt.Color(102, 102, 102));
        id5.setText("ID:");
        id5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id5MouseEntered(evt);
            }
        });
        jPanel2.add(id5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, 20));

        phone.setEditable(false);
        phone.setBackground(new java.awt.Color(249, 237, 237));
        phone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(146, 80, 80)));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 200, 30));

        forgotpass6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass6.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        forgotpass6.setText("Phone");
        jPanel2.add(forgotpass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, 20));

        location.setEditable(false);
        location.setBackground(new java.awt.Color(249, 237, 237));
        location.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        location.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        location.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(146, 80, 80)));
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });
        jPanel2.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 420, 30));

        forgotpass7.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass7.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        forgotpass7.setText("Address");
        jPanel2.add(forgotpass7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 20));

        email.setEditable(false);
        email.setBackground(new java.awt.Color(249, 237, 237));
        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(146, 80, 80)));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));

        forgotpass8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass8.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        forgotpass8.setText("Email");
        jPanel2.add(forgotpass8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, 20));

        details.setBackground(new java.awt.Color(214, 223, 231));
        details.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        details.setForeground(new java.awt.Color(183, 206, 229));
        details.setText("VIEW PROPERTIES");
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
        jPanel2.add(details, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 120, 30));

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

    private void viewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewFocusGained

    }//GEN-LAST:event_viewFocusGained

    private void viewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewFocusLost

    }//GEN-LAST:event_viewFocusLost

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked

    }//GEN-LAST:event_viewMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
        Color vieww = new Color(204,204,204);
        view.setForeground(vieww);
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
        Color viewww = new Color(102,102,102);
        view.setForeground(viewww);
    }//GEN-LAST:event_viewMouseExited

    private void usernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernActionPerformed

    private void idshiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idshiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_idshiMouseClicked

    private void idshiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idshiMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_idshiMouseEntered

    private void id5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id5MouseClicked

    private void id5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id5MouseEntered

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_detailsMouseClicked

    private void detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsActionPerformed
     if (currentHostId != null && !currentHostId.trim().isEmpty()) {
            // Create the tableprop instance, PASSING THE STORED ID from HostDetails
            tableprop tblp = new tableprop(this.currentHostId); // <--- Pass the ID from HostDetails
            tblp.setVisible(true);
            this.dispose(); // Close HostDetails if you want tableprop to replace it
        } else {
            JOptionPane.showMessageDialog(this, "Host ID is missing. Cannot view properties.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    String idOfChosenHost = idshi.getText();

    // CRUCIAL: Pass the ID to the tableprop constructor!
    tableprop pr = new tableprop(idOfChosenHost); // <-- THIS IS THE REQUIRED CHANGE

    // The line below (if you had it) is now redundant because the constructor handles setting 'idd'
    // pr.idd.setText(idOfChosenHost);

    pr.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_detailsActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        HostConfig back= new HostConfig();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session ses = Session.getInstance();
////        if(ses.getUid()==0){
////           JOptionPane.showMessageDialog(null,"[ERROR] No account found, Login First.");
////           login log = new login();
////           log.setVisible(true);
////           this.dispose();
////        }else{
           username.setText(""+ses.getUsern());
           id.setText(""+ses.getUid());
           
           
           
//           phone.setText(""+ses.getEmail());
//           phone.setText(""+ses.getPhone());
////           
////           String pfpUrl = destination;
////           view.setIcon(ResizeImage(pfpUrl, null, view));
//
//
//           fn.setText(""+ses.getFname());
//           ln.setText(""+ses.getLname());
//           mn.setText(""+ses.getMname());
//           
//           if(mn.getText().equals("null")){
//           mn.setText("");
//           }
//           
//           
//           
////        }    
//        
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
            java.util.logging.Logger.getLogger(HostDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HostDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HostDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HostDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new HostDetails().setVisible(true);
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
    public javax.swing.JTextField email;
    public javax.swing.JLabel fn;
    private javax.swing.JLabel fn1;
    private javax.swing.JLabel forgotpass6;
    private javax.swing.JLabel forgotpass7;
    private javax.swing.JLabel forgotpass8;
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel id2;
    private javax.swing.JLabel id3;
    private javax.swing.JLabel id5;
    public javax.swing.JLabel idshi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel list;
    public javax.swing.JLabel ln;
    public javax.swing.JTextField location;
    public javax.swing.JLabel mn;
    public javax.swing.JTextField phone;
    private javax.swing.JLabel sett;
    public javax.swing.JTextField usern;
    private javax.swing.JLabel username;
    public javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables

    public Icon ResizeImage(String string, Object object, JLabel view) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
