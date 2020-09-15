/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Harpreet Singh
 */
public class adminquestionpaper extends javax.swing.JFrame {
Connection conn =null;
ResultSet rs=null;
PreparedStatement pst=null;
String hemail,hpassword;
    public adminquestionpaper() {
        initComponents();
       // conn=javaconnect.ConnecrDb();
        Update_table();
    }
        public adminquestionpaper(String email,String password) {
        initComponents();
      hemail=email;
      hpassword=password;
        Update_table();
    }
    private void Update_table(){
        try{
    String sql="select * from admin_questionpaper";
    pst =myconnection.getConnection().prepareStatement(sql);
    rs=pst.executeQuery();
    table_questionpaper.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_questionpaper = new javax.swing.JTable();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(null);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 134, 244), 3));

        table_questionpaper.setAutoCreateRowSorter(true);
        table_questionpaper.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_questionpaper.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S_NUMBER", "P_NAME", "P_URL"
            }
        ));
        jScrollPane1.setViewportView(table_questionpaper);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 370, 260);

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add.setContentAreaFilled(false);
        add.setFocusPainted(false);
        add.setFocusable(false);
        add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(400, 130, 90, 40);

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        delete.setContentAreaFilled(false);
        delete.setFocusPainted(false);
        delete.setFocusable(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(400, 210, 90, 40);

        backbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\returns--button-png-image-80043.png")); // NOI18N
        backbutton.setBorderPainted(false);
        backbutton.setContentAreaFilled(false);
        backbutton.setFocusPainted(false);
        backbutton.setFocusable(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton);
        backbutton.setBounds(10, 20, 40, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(520, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
           JFileChooser chooser = new JFileChooser();
  chooser.showOpenDialog(null);
  File f=chooser.getSelectedFile();
  String filename=f.getAbsolutePath();
  JOptionPane.showMessageDialog(null,filename);
  String s_number;
s_number = JOptionPane.showInputDialog("ENTER SEMESTER NUMBER");
String p_name;
p_name = JOptionPane.showInputDialog("ENTER PAPER NAME");
  PreparedStatement ps;
String query ="INSERT INTO `admin_questionpaper`(`s_number`, `p_name`, `p_url`) VALUES (?,?,?)";
try{
ps = myconnection.getConnection().prepareStatement(query);
ps.setString(1,s_number);
ps.setString(2,p_name);
ps.setString(3,filename);
if(ps.executeUpdate() > 0)
{
     JOptionPane.showMessageDialog(null,"added successfully");
//          this.setVisible(false);
//      new signup().setVisible(true);
}else{ JOptionPane.showMessageDialog(null," not added successfully");}
} catch (SQLException ex){
    Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
}
Update_table();
         
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
String p_name = null;
        
p_name = JOptionPane.showInputDialog("ENTER PAPER NAME");
        PreparedStatement ps;
        String sql="DELETE FROM `admin_questionpaper` WHERE `p_name`=?";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,p_name);
            ps.execute();
            JOptionPane.showMessageDialog(null,"deleted successfully");
            Update_table();
            
        }catch(SQLException ex)
        {
Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
       this.setVisible(false);
      new adminhome(hemail,hpassword).setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(adminquestionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminquestionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminquestionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminquestionpaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 new adminquestionpaper().setVisible(true);
        /* Create and display the form */
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_questionpaper;
    // End of variables declaration//GEN-END:variables
}
