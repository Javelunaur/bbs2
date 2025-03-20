package ADMIN;

import config.Session;
import config.dbConnector;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class profile extends javax.swing.JFrame {

    public profile() {
        initComponents();
    }
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;

    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
        
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
       
    
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    
    
    
    

    
    Color exit = new Color(255,255,255);
    Color hover = new Color(146,80,80);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        search = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Appname2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        acts = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Appname3 = new javax.swing.JLabel();
        Appname4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        view = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        update = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(243, 234, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(243, 234, 234));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 196, -1, -1));

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
        avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avatarMouseClicked(evt);
            }
        });
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

        Appname4.setBackground(new java.awt.Color(0, 0, 0));
        Appname4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        Appname4.setForeground(new java.awt.Color(134, 163, 194));
        Appname4.setText("Profile");
        jPanel1.add(Appname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 30));

        jPanel2.setBackground(new java.awt.Color(248, 243, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80), 2));

        view.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        view.setForeground(new java.awt.Color(102, 102, 102));
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setText("ADD IMAGE");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 300, 230));

        remove.setBackground(new java.awt.Color(214, 223, 231));
        remove.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        remove.setForeground(new java.awt.Color(134, 163, 194));
        remove.setText("REMOVE");
        remove.setBorder(null);
        remove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
        });
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 130, 30));

        update.setBackground(new java.awt.Color(214, 223, 231));
        update.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(134, 163, 194));
        update.setText("UPDATE");
        update.setBorder(null);
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 130, 30));

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

    private void listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseExited
        list.setForeground(exit);
    }//GEN-LAST:event_listMouseExited

    private void listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseEntered
        list.setForeground(hover);
    }//GEN-LAST:event_listMouseEntered

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

    private void id1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseEntered

    private void id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseClicked

    private void settMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseExited
        sett.setForeground(exit);
    }//GEN-LAST:event_settMouseExited

    private void settMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseEntered
        sett.setForeground(hover);
    }//GEN-LAST:event_settMouseEntered

    private void settMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_settMouseClicked

    private void avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avatarMouseClicked

    }//GEN-LAST:event_avatarMouseClicked

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        home.setForeground(exit);
    }//GEN-LAST:event_homeMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        home.setForeground(hover);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        a_dash admin = new a_dash();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void idMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseEntered

    }//GEN-LAST:event_idMouseEntered

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked

    }//GEN-LAST:event_idMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

    }//GEN-LAST:event_jLabel5MouseClicked

    private void viewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewFocusGained

    }//GEN-LAST:event_viewFocusGained

    private void viewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewFocusLost

    }//GEN-LAST:event_viewFocusLost

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
        Color vieww = new Color(204,204,204);
        view.setForeground(vieww);
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
        Color viewww = new Color(102,102,102);
            view.setForeground(viewww);
    }//GEN-LAST:event_viewMouseExited

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        remove.setEnabled(false);
        update.setEnabled(false);
        view.setEnabled(true);
        view.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        userset settings = new userset();
        settings.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
     JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/images/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            view.setIcon(ResizeImage(path, null, view));
                            update.setEnabled(true);
                            remove.setEnabled(true);
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
    }//GEN-LAST:event_viewMouseClicked

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        dbConnector dbc = new dbConnector();
        dbc.insertData("INSERT INTO tbl_user (pfp) VALUES ('"+destination+"') WHERE userID ");
        System.out.println("success..?");
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
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
    private javax.swing.JLabel home;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel list;
    public javax.swing.JButton remove;
    private javax.swing.JLabel search;
    private javax.swing.JLabel sett;
    public javax.swing.JButton update;
    private javax.swing.JLabel username;
    private javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
