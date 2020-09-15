/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.event.PopupMenuListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author Harpreet Singh
 */
public class Questionpaper extends javax.swing.JFrame {
String hemail,hpassword;
    public Questionpaper() {
        initComponents();
//       JScrollPane scroll=new JScrollPane(questionpaper1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        questionpaper1.add(scroll);
//       add(scroll);
    }
public Questionpaper(String email,String password)
    {
        initComponents();
//        JScrollPane scroll=new JScrollPane(questionpaper1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//        questionpaper1.add(scroll);
        hemail=email;
        hpassword=password;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        questionpaper8 = new javax.swing.JComboBox<>();
        questionpaper1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        questionpaper2 = new javax.swing.JComboBox<>();
        questionpaper4 = new javax.swing.JComboBox<>();
        questionpaper6 = new javax.swing.JComboBox<>();
        questionpaper3 = new javax.swing.JComboBox<>();
        questionpaper5 = new javax.swing.JComboBox<>();
        questionpaper7 = new javax.swing.JComboBox<>();
        backbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(520, 570));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setText("QUESTION PAPER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 10, 340, 60);

        jButton2.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton2.setText("VIII");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(330, 400, 60, 30);

        jButton3.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton3.setText("II");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jPanel1.add(jButton3);
        jButton3.setBounds(330, 100, 60, 30);

        jButton5.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton5.setText("III");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(90, 200, 60, 30);

        jButton6.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton6.setText("IV");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(330, 200, 60, 30);

        jButton7.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton7.setText("V");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(90, 300, 60, 30);

        jButton8.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton8.setText("VI");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton8.setContentAreaFilled(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(330, 300, 60, 30);

        jButton9.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton9.setText("VII");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton9.setContentAreaFilled(false);
        jButton9.setFocusPainted(false);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(90, 400, 60, 32);

        questionpaper8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "entrepreneurship and project management", "network science structural analysis and visualization", "machine learning and computational intelligence", "information retrieval and management" }));
        questionpaper8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper8.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper8PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper8ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper8);
        questionpaper8.setBounds(270, 440, 180, 40);

        questionpaper1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "calculus ", "introduction to computer science and engineering", "programming fundamental", "quantum and statistical physics", "ethics and self awareness", "introduction to environment science" }));
        questionpaper1.setAutoscrolls(true);
        questionpaper1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper1.setOpaque(false);
        questionpaper1.setPreferredSize(new java.awt.Dimension(500, 26));
        questionpaper1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                questionpaper1MouseClicked(evt);
            }
        });
        questionpaper1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper1ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper1);
        questionpaper1.setBounds(30, 140, 180, 40);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 100, 0, 0);

        jButton10.setFont(new java.awt.Font("Verdana", 3, 20)); // NOI18N
        jButton10.setText("I");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.setFocusable(false);
        jPanel1.add(jButton10);
        jButton10.setBounds(90, 100, 60, 30);

        questionpaper2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "differential equation and transforms", "communication skills", "applied chemistry ", "workshop practice", "digital electronics and logic gates", "object oriented programming" }));
        questionpaper2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper2ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper2);
        questionpaper2.setBounds(270, 140, 180, 40);

        questionpaper4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "analysis and design of algorithms", "web technologies", "operating systems ", "software engineering", "computer architecture and organization" }));
        questionpaper4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper4.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper4PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper4ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper4);
        questionpaper4.setBounds(270, 240, 180, 40);

        questionpaper6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "computer networks and security", "linear algebra and probability theory", "modulation and simulation", "compiler design", "data mining and analysis" }));
        questionpaper6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper6.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper6PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper6ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper6);
        questionpaper6.setBounds(270, 340, 180, 40);

        questionpaper3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "data structures", "database systems", "discrete structures", "microprocessor", "economics" }));
        questionpaper3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper3ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper3);
        questionpaper3.setBounds(30, 240, 180, 40);

        questionpaper5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "data communication and networks", "technical communication and soft skills", "computer graphics", "artificial intelligence", "principle of programming languages", "theory of computation" }));
        questionpaper5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper5.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper5PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper5ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper5);
        questionpaper5.setBounds(30, 340, 180, 40);

        questionpaper7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionpaper7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SUBJECT", "digital image processing", "advance database systems", "cyber law and IPR", "software project management", "cloud computing" }));
        questionpaper7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        questionpaper7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        questionpaper7.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                questionpaper7PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        questionpaper7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionpaper7ActionPerformed(evt);
            }
        });
        jPanel1.add(questionpaper7);
        questionpaper7.setBounds(30, 440, 180, 40);

        backbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\returns--button-png-image-80043.png")); // NOI18N
        backbutton.setBorder(null);
        backbutton.setContentAreaFilled(false);
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.setFocusPainted(false);
        backbutton.setFocusTraversalPolicyProvider(true);
        backbutton.setFocusable(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton);
        backbutton.setBounds(10, 20, 40, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 480, 540);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(520, 580));
        jLabel3.setMinimumSize(new java.awt.Dimension(520, 580));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 520, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void questionpaper8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper8ActionPerformed
          PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper8.getSelectedItem();
        // JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper8ActionPerformed

    private void questionpaper7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper7ActionPerformed
          PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper7.getSelectedItem();
        // JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper7ActionPerformed

    private void questionpaper1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper1ActionPerformed
         PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper1.getSelectedItem();
        // JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     this.setVisible(false);
    new Questionpaper().setVisible(true);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper1ActionPerformed

    private void questionpaper2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper2ActionPerformed
         PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper2.getSelectedItem();
         //JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper2ActionPerformed

    private void questionpaper3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper3ActionPerformed
        PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper3.getSelectedItem();
        // JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper3ActionPerformed

    private void questionpaper1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper1PopupMenuWillBecomeInvisible
    
    }//GEN-LAST:event_questionpaper1PopupMenuWillBecomeInvisible

    private void questionpaper2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper2PopupMenuWillBecomeInvisible
        
    }//GEN-LAST:event_questionpaper2PopupMenuWillBecomeInvisible

    private void questionpaper3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper3PopupMenuWillBecomeInvisible
         
    }//GEN-LAST:event_questionpaper3PopupMenuWillBecomeInvisible

    private void questionpaper4PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper4PopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_questionpaper4PopupMenuWillBecomeInvisible

    private void questionpaper5PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper5PopupMenuWillBecomeInvisible
        
    }//GEN-LAST:event_questionpaper5PopupMenuWillBecomeInvisible

    private void questionpaper6PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper6PopupMenuWillBecomeInvisible
        
    }//GEN-LAST:event_questionpaper6PopupMenuWillBecomeInvisible

    private void questionpaper7PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper7PopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_questionpaper7PopupMenuWillBecomeInvisible

    private void questionpaper8PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_questionpaper8PopupMenuWillBecomeInvisible
      
    }//GEN-LAST:event_questionpaper8PopupMenuWillBecomeInvisible

    private void questionpaper4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper4ActionPerformed
         PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper4.getSelectedItem();
        // JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper4ActionPerformed

    private void questionpaper5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper5ActionPerformed
        PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper5.getSelectedItem();
        // JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper5ActionPerformed

    private void questionpaper6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionpaper6ActionPerformed
        PreparedStatement ps;
  ResultSet rs;
  String pname=null;
  String season=null;
        pname=(String) questionpaper6.getSelectedItem();
        // JOptionPane.showMessageDialog(null,pname);
     String query ="SELECT `p_url` FROM `admin_questionpaper` WHERE `p_name`=?";
     try {
        ps = myconnection.getConnection().prepareStatement(query);
        ps.setString(1,pname);
        rs = ps.executeQuery();
        if(rs.next())
        {
            season = rs.getString(1);
           //JOptionPane.showMessageDialog(null,season);
            season=season.replace("\\", "\\\\");
            try{
     Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+season);
     }
     catch(IOException ex)
     {
       Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);  
     }  
        }
}
      catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_questionpaper6ActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
         this.setVisible(false);
        new Home(hemail,hpassword).setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void questionpaper1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionpaper1MouseClicked

    }//GEN-LAST:event_questionpaper1MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> questionpaper1;
    private javax.swing.JComboBox<String> questionpaper2;
    private javax.swing.JComboBox<String> questionpaper3;
    private javax.swing.JComboBox<String> questionpaper4;
    private javax.swing.JComboBox<String> questionpaper5;
    private javax.swing.JComboBox<String> questionpaper6;
    private javax.swing.JComboBox<String> questionpaper7;
    private javax.swing.JComboBox<String> questionpaper8;
    // End of variables declaration//GEN-END:variables
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
            java.util.logging.Logger.getLogger(Questionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Questionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Questionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Questionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Questionpaper().setVisible(true);
            }
        });
    }
}
