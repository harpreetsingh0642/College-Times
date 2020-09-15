/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
String hemail;
String hpassword;
String result_url;
    public Home() {
        
        initComponents();
    }
    public Home(String email,String password)
    {
        initComponents();
        hemail=email;
        hpassword=password;
    }
 public Home(String result_url)
    {
        this.result_url=result_url;
    }
    public String getHome() {
    return result_url;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        gallery = new javax.swing.JButton();
        syllabus = new javax.swing.JButton();
        questionpaper = new javax.swing.JButton();
        result = new javax.swing.JButton();
        faculty = new javax.swing.JButton();
        jButton6_notification = new javax.swing.JButton();
        jButton7_admin = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(520, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COLLEGE");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 10, 220, 80);

        gallery.setBackground(new java.awt.Color(255, 255, 255));
        gallery.setFont(new java.awt.Font("Tempus Sans ITC", 3, 18)); // NOI18N
        gallery.setText("GALLERY");
        gallery.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        gallery.setContentAreaFilled(false);
        gallery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gallery.setFocusPainted(false);
        gallery.setFocusable(false);
        gallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galleryActionPerformed(evt);
            }
        });
        jPanel2.add(gallery);
        gallery.setBounds(170, 450, 130, 50);

        syllabus.setBackground(new java.awt.Color(255, 255, 255));
        syllabus.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        syllabus.setText("SYLLABUS");
        syllabus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        syllabus.setContentAreaFilled(false);
        syllabus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        syllabus.setFocusable(false);
        syllabus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        syllabus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syllabusActionPerformed(evt);
            }
        });
        jPanel2.add(syllabus);
        syllabus.setBounds(50, 190, 130, 50);

        questionpaper.setBackground(new java.awt.Color(255, 255, 255));
        questionpaper.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        questionpaper.setText("<html>QUESTION<br />  PAPER</html>");
        questionpaper.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper.setContentAreaFilled(false);
        questionpaper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper.setDisplayedMnemonicIndex(0);
        questionpaper.setFocusPainted(false);
        questionpaper.setFocusable(false);
        questionpaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaperActionPerformed(evt);
            }
        });
        jPanel2.add(questionpaper);
        questionpaper.setBounds(280, 190, 130, 50);

        result.setBackground(new java.awt.Color(255, 255, 255));
        result.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        result.setText("RESULT");
        result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        result.setContentAreaFilled(false);
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        result.setFocusPainted(false);
        result.setFocusable(false);
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });
        jPanel2.add(result);
        result.setBounds(50, 320, 130, 50);

        faculty.setBackground(new java.awt.Color(255, 255, 255));
        faculty.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        faculty.setText("FACULTY");
        faculty.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        faculty.setContentAreaFilled(false);
        faculty.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faculty.setFocusPainted(false);
        faculty.setFocusable(false);
        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });
        jPanel2.add(faculty);
        faculty.setBounds(280, 320, 130, 50);

        jButton6_notification.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Desktop\\bell-1096279_960_720.png")); // NOI18N
        jButton6_notification.setBorder(null);
        jButton6_notification.setContentAreaFilled(false);
        jButton6_notification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6_notification.setFocusPainted(false);
        jButton6_notification.setFocusable(false);
        jButton6_notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6_notificationActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6_notification);
        jButton6_notification.setBounds(370, 20, 36, 50);

        jButton7_admin.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Desktop\\287473299e.png")); // NOI18N
        jButton7_admin.setBorder(null);
        jButton7_admin.setContentAreaFilled(false);
        jButton7_admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7_admin.setFocusPainted(false);
        jButton7_admin.setFocusable(false);
        jButton7_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7_adminActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7_admin);
        jButton7_admin.setBounds(310, 10, 50, 60);

        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\Power-512.png")); // NOI18N
        logout.setBorder(null);
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.setFocusPainted(false);
        logout.setFocusable(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout);
        logout.setBounds(410, 20, 60, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 480, 540);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 583);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void syllabusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syllabusActionPerformed
        this.setVisible(false);
        new Syllabus(hemail,hpassword).setVisible(true);        
    }//GEN-LAST:event_syllabusActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
       PreparedStatement ps;
    ResultSet rs;
    String query = "SELECT result_url FROM `admin_result`";
    ArrayList<Home> HomeList = new ArrayList<>();
    try {
        ps = myconnection.getConnection().prepareStatement(query);
        rs =ps.executeQuery();
        
        while(rs.next())
        {
          Home h =new Home(rs.getString("result_url"));
          HomeList.add(h);
           //System.out.println(HomeList);
        }
    }   catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
  
            String url=HomeList.get(0).getHome();
            System.out.println(url);
        try{
           java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"NOT FOUND ANY URL");
       }
    }//GEN-LAST:event_resultActionPerformed

    private void questionpaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaperActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Questionpaper(hemail,hpassword).setVisible(true); 
    }//GEN-LAST:event_questionpaperActionPerformed

    private void jButton7_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7_adminActionPerformed
try{     if(hemail.equals("admin@gmail.com")&&hpassword.equals("password"))
     {
         //JOptionPane.showMessageDialog(null,"WELCOME ADMIN");
         this.setVisible(false);
        new adminhome(hemail,hpassword).setVisible(true);
     }
}
catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,"FAILED TO IDENTIFY ADMIN");
     }
    }//GEN-LAST:event_jButton7_adminActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
      this.setVisible(false);
      new faculty(hemail,hpassword).setVisible(true);
    }//GEN-LAST:event_facultyActionPerformed

    private void jButton6_notificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6_notificationActionPerformed
        this.setVisible(false);
      new notification(hemail,hpassword).setVisible(true);
    }//GEN-LAST:event_jButton6_notificationActionPerformed

    private void galleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galleryActionPerformed
        this.setVisible(false);
      new homegallery(hemail,hpassword).setVisible(true);
    }//GEN-LAST:event_galleryActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
      this.setVisible(false);
      new signup().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton faculty;
    private javax.swing.JButton gallery;
    private javax.swing.JButton jButton6_notification;
    public static javax.swing.JButton jButton7_admin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout;
    private javax.swing.JButton questionpaper;
    private javax.swing.JButton result;
    private javax.swing.JButton syllabus;
    // End of variables declaration//GEN-END:variables
}
