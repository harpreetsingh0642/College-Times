
package project;

import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class adminsyllabus extends javax.swing.JFrame {
Connection conn =null;
ResultSet rs=null;
PreparedStatement pst=null;
String hemail,hpassword;
    public adminsyllabus() {
        initComponents();
        Update_table();
    }
    public adminsyllabus(String email,String password) {
        initComponents();
        hemail=email;
        hpassword=password;
        Update_table();
    }
    private void Update_table(){
        try{
    String sql="select * from admin_syllabus";
    pst =myconnection.getConnection().prepareStatement(sql);
    rs=pst.executeQuery();
    table_syllabus.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_syllabus = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Desktop\\bg-01.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        add.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        add.setContentAreaFilled(false);
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusPainted(false);
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(400, 130, 90, 40);

        delete.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        delete.setContentAreaFilled(false);
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        backbutton.setBorder(null);
        backbutton.setBorderPainted(false);
        backbutton.setContentAreaFilled(false);
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.setFocusPainted(false);
        backbutton.setFocusable(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton);
        backbutton.setBounds(10, 20, 40, 40);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 134, 244), 3));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setFocusable(false);

        table_syllabus.setAutoCreateRowSorter(true);
        table_syllabus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table_syllabus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S_NUMBER", "S_URL"
            }
        ));
        table_syllabus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane2.setViewportView(table_syllabus);
        if (table_syllabus.getColumnModel().getColumnCount() > 0) {
            table_syllabus.getColumnModel().getColumn(0).setPreferredWidth(200);
            table_syllabus.getColumnModel().getColumn(0).setMaxWidth(200);
            table_syllabus.getColumnModel().getColumn(1).setPreferredWidth(1000);
            table_syllabus.getColumnModel().getColumn(1).setMaxWidth(1000);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 110, 350, 155);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 580);

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
  PreparedStatement ps;
String query ="INSERT INTO `admin_syllabus`(`s_number`, `s_url`) VALUES (?,?)";
try{
ps = myconnection.getConnection().prepareStatement(query);
ps.setString(1,s_number);
ps.setString(2,filename);
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
        String s_number = null;
        
s_number = JOptionPane.showInputDialog("ENTER SEMESTER NUMBER");
        PreparedStatement ps;
        String sql="DELETE FROM `admin_syllabus` WHERE `s_number`=?";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,s_number);
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

    public static void main(String args[]) {
        new adminsyllabus().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_syllabus;
    // End of variables declaration//GEN-END:variables
}
