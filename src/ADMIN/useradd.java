/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import AUTHEN.login;
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
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class useradd extends javax.swing.JFrame {

    public useradd() {
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
        
        
//public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
//    ImageIcon MyImage = null;
//        if(ImagePath !=null){
//            MyImage = new ImageIcon(ImagePath);
//        }else{
//            MyImage = new ImageIcon(pic);
//        }
//        
//    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());
//
//    Image img = MyImage.getImage();
//    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
//    ImageIcon image = new ImageIcon(newImg);
//    return image;
//}

public ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
    
    if (ImagePath != null && !ImagePath.isEmpty()) {
        MyImage = new ImageIcon(ImagePath);
    } else if (pic != null) {
        MyImage = new ImageIcon(pic);
    } else {
        // Handle the case where both ImagePath and pic are null
        System.out.println("No image path or byte array provided");
        return null;
    }

    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

    
    public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
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
              }catch (SQLException ex){                  System.out.println(""+ex);
                  return false;
              }
          }
        
         public boolean updCheck(){
              dbConnector dbc = new dbConnector();
              try{
                String query = "SELECT * FROM tbl_user WHERE (u_name = '" + u_name.getText() + "' OR u_email = '" + u_email.getText() + "') AND userID != '"+idshet.getText()+"'";
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
    Color def = new Color(153,153,153);
    Color exit = new Color(255,255,255);
    Color hover = new Color(146,80,80);
          uform userlist = new uform();
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        buttonPANE = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        upd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        headerPANE = new javax.swing.JPanel();
        Appname1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Appname2 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        Appname3 = new javax.swing.JLabel();
        aid = new javax.swing.JLabel();
        Appname5 = new javax.swing.JLabel();
        idshet = new javax.swing.JTextField();
        addPANE = new javax.swing.JPanel();
        forgotpass3 = new javax.swing.JLabel();
        forgotpass2 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
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
        u_status = new javax.swing.JComboBox<>();
        forgotpass4 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        mn = new javax.swing.JTextField();
        u_role = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        view = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(243, 234, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonPANE.setBackground(new java.awt.Color(146, 80, 80));
        buttonPANE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPANEMouseClicked(evt);
            }
        });
        buttonPANE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(214, 223, 231));
        add.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(134, 163, 194));
        add.setText("ADD");
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
        buttonPANE.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 240, 30));

        upd.setBackground(new java.awt.Color(214, 223, 231));
        upd.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        upd.setForeground(new java.awt.Color(134, 163, 194));
        upd.setText("UPDATE");
        upd.setBorder(null);
        upd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        upd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updMouseClicked(evt);
            }
        });
        upd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updActionPerformed(evt);
            }
        });
        buttonPANE.add(upd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 130, 30));

        jButton5.setBackground(new java.awt.Color(214, 223, 231));
        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(134, 163, 194));
        jButton5.setText("CLEAR");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        buttonPANE.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 30));

        jPanel2.add(buttonPANE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 580, 50));

        headerPANE.setBackground(new java.awt.Color(146, 80, 80));
        headerPANE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Appname1.setBackground(new java.awt.Color(0, 0, 0));
        Appname1.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        Appname1.setForeground(new java.awt.Color(183, 206, 229));
        Appname1.setText("USER FORM");
        headerPANE.add(Appname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BACK >>");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        headerPANE.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        Appname2.setBackground(new java.awt.Color(0, 0, 0));
        Appname2.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        Appname2.setForeground(new java.awt.Color(183, 206, 229));
        Appname2.setText("USING..");
        headerPANE.add(Appname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("USER");
        id1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        id1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                id1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                id1MouseEntered(evt);
            }
        });
        headerPANE.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 50, -1));

        Appname3.setBackground(new java.awt.Color(0, 0, 0));
        Appname3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Appname3.setForeground(new java.awt.Color(183, 206, 229));
        Appname3.setText("iBook");
        headerPANE.add(Appname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        aid.setBackground(new java.awt.Color(0, 0, 0));
        aid.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        aid.setForeground(new java.awt.Color(183, 206, 229));
        aid.setText("ID");
        headerPANE.add(aid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        Appname5.setBackground(new java.awt.Color(0, 0, 0));
        Appname5.setFont(new java.awt.Font("Verdana", 2, 8)); // NOI18N
        Appname5.setForeground(new java.awt.Color(183, 206, 229));
        Appname5.setText("ADMIN ");
        headerPANE.add(Appname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        idshet.setEditable(false);
        idshet.setBackground(new java.awt.Color(146, 80, 80));
        idshet.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        idshet.setForeground(new java.awt.Color(255, 255, 255));
        idshet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        headerPANE.add(idshet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 20, -1));

        jPanel2.add(headerPANE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        addPANE.setBackground(new java.awt.Color(243, 234, 234));
        addPANE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotpass3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass3.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass3.setText("Middle Name (Optional)");
        addPANE.add(forgotpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 120, -1));

        forgotpass2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass2.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass2.setText("Last Name");
        addPANE.add(forgotpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, -1));

        ln.setBackground(new java.awt.Color(243, 234, 234));
        ln.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        addPANE.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, 30));

        forgotpass5.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass5.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass5.setText("Username");
        addPANE.add(forgotpass5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        u_name.setBackground(new java.awt.Color(243, 234, 234));
        u_name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        u_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_nameActionPerformed(evt);
            }
        });
        addPANE.add(u_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 150, 30));

        phone.setBackground(new java.awt.Color(243, 234, 234));
        phone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        addPANE.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 130, 30));

        forgotpass6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass6.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass6.setText("First Name");
        addPANE.add(forgotpass6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        forgotpass7.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass7.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass7.setText("Contact");
        addPANE.add(forgotpass7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 60, -1));

        u_email.setBackground(new java.awt.Color(243, 234, 234));
        u_email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        u_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_emailActionPerformed(evt);
            }
        });
        addPANE.add(u_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 30));

        forgotpass8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass8.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass8.setText("Email Address");
        addPANE.add(forgotpass8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        forgotpass9.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass9.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass9.setText("Location");
        addPANE.add(forgotpass9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, -1));

        fn.setBackground(new java.awt.Color(243, 234, 234));
        fn.setAlignmentX(0.0F);
        fn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        addPANE.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 30));

        u_location.setBackground(new java.awt.Color(243, 234, 234));
        u_location.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        u_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_locationActionPerformed(evt);
            }
        });
        addPANE.add(u_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 320, 30));

        u_status.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        u_status.setForeground(new java.awt.Color(134, 163, 194));
        u_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Status", "Active", "Pending" }));
        u_status.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(183, 206, 229), 2, true));
        u_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_statusActionPerformed(evt);
            }
        });
        addPANE.add(u_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        forgotpass4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        forgotpass4.setForeground(new java.awt.Color(102, 102, 102));
        forgotpass4.setText("Password");
        addPANE.add(forgotpass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        pass.setBackground(new java.awt.Color(243, 234, 234));
        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        pass.setEnabled(false);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        addPANE.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 150, 30));

        mn.setBackground(new java.awt.Color(243, 234, 234));
        mn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(146, 80, 80)));
        mn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnActionPerformed(evt);
            }
        });
        addPANE.add(mn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 90, 30));

        u_role.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        u_role.setForeground(new java.awt.Color(134, 163, 194));
        u_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roles", "Host", "Guest", "Admin" }));
        u_role.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(183, 206, 229), 2, true));
        u_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_roleActionPerformed(evt);
            }
        });
        addPANE.add(u_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, 30));

        jPanel3.setBackground(new java.awt.Color(248, 243, 243));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(146, 80, 80), 2));

        view.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        view.setForeground(new java.awt.Color(102, 102, 102));
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
        );

        addPANE.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 190, 190));

        remove.setBackground(new java.awt.Color(214, 223, 231));
        remove.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 12)); // NOI18N
        remove.setForeground(new java.awt.Color(134, 163, 194));
        remove.setText("REMOVE IMAGE");
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
        addPANE.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 110, 30));

        jPanel2.add(addPANE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 540, 280));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(243, 234, 234));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

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
        dbConnector dbc = new dbConnector();
        String fname = fn.getText(), lname = ln.getText(), username = u_name.getText(),
                email = u_email.getText(), address = u_location.getText(),
                /*conf =  pass2.getText().trim(),*/ password = pass.getText().trim(), contact = phone.getText(),
                role = u_role.getSelectedItem().toString(), status = u_status.getSelectedItem().toString();
        
        if (fname.isEmpty() || lname.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
            return;
        }else if (password.length() < 8 ) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters.");               
        }else if (!contact.matches("[0-9]+")) {
            JOptionPane.showMessageDialog(null, "Contact number should only contain numbers.");         
        }else if (role == null || role.equals("Roles")) {
            JOptionPane.showMessageDialog(null, "Please select a valid role (Host, Admin, or Guest).");      
        }else if (status == null || status.equals("Status")) {
            JOptionPane.showMessageDialog(null, "Please select a valid Status (Active or Pending).");
        }else if(dupCheck()){
            System.out.println("[ERROR]Duplicate Found.");
        }else{
            
       
       if (dbc.insertData("INSERT INTO tbl_user (fname, lname, mname, u_name, u_email, u_address, u_pass, u_role, u_phone, u_status, pfp) VALUES ('" 
    + fn.getText() + "', '" 
    + ln.getText() + "', '"
    + mn.getText() + "', '"
    + u_name.getText() + "', '"
    + u_email.getText() + "', '" 
    + u_location.getText() + "', '"
    + pass.getText() + "', '"
    + u_role.getSelectedItem() + "', '"
    +phone.getText()+"', '" 
    +u_status.getSelectedItem() + "', '"
    +destination+
     "')") > 0) { 
           
           try{
           Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
           
    JOptionPane.showMessageDialog(null,"Registered Successfully.");
    uform users = new uform();
    users.setVisible(true);
    this.dispose();
      
       }catch(IOException ex){
               System.out.println("Insert Image Error: "+ex);
               }
       }else {
    JOptionPane.showMessageDialog(null,"Registration Failed..");
} 
 }
    }//GEN-LAST:event_addActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        userlist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void id1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseClicked

    private void id1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_id1MouseEntered

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
                Session ses = Session.getInstance();
//        if(ses.getUid()==0){
//           JOptionPane.showMessageDialog(null,"[ERROR] No account found, Login First.");
//           login log = new login();
//           log.setVisible(true);
//           this.dispose();
//        }else{
             aid.setText(""+ses.getUid());
//        }
    }//GEN-LAST:event_formWindowActivated

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

    private void u_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_statusActionPerformed

    private void updMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updMouseClicked

    private void updActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updActionPerformed
       String fname = fn.getText(), lname = ln.getText(), username = u_name.getText(),
                email = u_email.getText(), address = u_location.getText(),
                password = pass.getText().trim(), contact = phone.getText(),
                role = u_role.getSelectedItem().toString(), status = u_status.getSelectedItem().toString();
        
        if (fname.isEmpty() || lname.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all required fields.");
        }else if (password.length() < 8 ) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 characters.");           
        }else if(updCheck()){
            System.out.println("[ERROR]Duplicate Found.");
        }else{    
          dbConnector dbc = new dbConnector();
          dbc.updateData("UPDATE tbl_user SET fname = '"+fn.getText()+"', lname = '"+ln.getText()+"', mname = '"+mn.getText()+"',               "
        +    "u_email = '"+u_email.getText()+"', u_phone = '"+phone.getText()+"', u_address = '"+u_location.getText()+"',             "
        +    "u_name = '"+u_name.getText()+"', u_role = '"+u_role.getSelectedItem()+"', u_status = '"+u_status.getSelectedItem()+"',  "
        +    "u_pass = '"+pass.getText()+"', pfp = '"+destination+"' WHERE userID = '"+idshet.getText()+"' ");
               
          if(destination.isEmpty()){
              File existingFile = new File(oldpath);
              if(existingFile.exists()){
                  existingFile.delete();
              }
          }else{
              if(!(oldpath.equals(path))){
                 imageUpdater(oldpath, path);
              }
          }
          
          JOptionPane.showMessageDialog(null, "Updated Successfully.");
          
          userlist.setVisible(true);
          this.dispose();
        }
    }//GEN-LAST:event_updActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        fn.setText(""); ln.setText(""); u_name.setText(""); u_email.setText(""); u_location.setText("");
        pass.setText(""); phone.setText(""); mn.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void mnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnActionPerformed
        
    }//GEN-LAST:event_mnActionPerformed

    private void u_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_roleActionPerformed

    private void buttonPANEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPANEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPANEMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void viewFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewFocusGained

    }//GEN-LAST:event_viewFocusGained

    private void viewFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_viewFocusLost

    }//GEN-LAST:event_viewFocusLost

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
                    remove.setEnabled(true);
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_viewMouseClicked

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
        view.setEnabled(true);
        view.setIcon(null);
        destination = "";
        path = "";
    }//GEN-LAST:event_removeActionPerformed

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
            java.util.logging.Logger.getLogger(useradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(useradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(useradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(useradd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new useradd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appname1;
    private javax.swing.JLabel Appname2;
    private javax.swing.JLabel Appname3;
    private javax.swing.JLabel Appname5;
    public javax.swing.JButton add;
    private javax.swing.JPanel addPANE;
    private javax.swing.JLabel aid;
    private javax.swing.JPanel buttonPANE;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel forgotpass2;
    private javax.swing.JLabel forgotpass3;
    private javax.swing.JLabel forgotpass4;
    private javax.swing.JLabel forgotpass5;
    private javax.swing.JLabel forgotpass6;
    private javax.swing.JLabel forgotpass7;
    private javax.swing.JLabel forgotpass8;
    private javax.swing.JLabel forgotpass9;
    private javax.swing.JPanel headerPANE;
    private javax.swing.JLabel id1;
    public javax.swing.JTextField idshet;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField mn;
    public javax.swing.JTextField pass;
    public javax.swing.JTextField phone;
    public javax.swing.JButton remove;
    public javax.swing.JTextField u_email;
    public javax.swing.JTextField u_location;
    public javax.swing.JTextField u_name;
    public javax.swing.JComboBox<String> u_role;
    public javax.swing.JComboBox<String> u_status;
    public javax.swing.JButton upd;
    public javax.swing.JLabel view;
    // End of variables declaration//GEN-END:variables
}
