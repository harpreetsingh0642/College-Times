
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
public class adminresult extends javax.swing.JFrame {
 Connection conn =null;
ResultSet rs=null;
PreparedStatement pst=null;
String hemail,hpassword;
    public adminresult() {
        initComponents();
      Update_table();
    }
     public adminresult(String email,String password) {
        initComponents();
        hemail=email;
        hpassword=password;
      Update_table();
    }
     private void Update_table(){
        try{
    String sql="select * from admin_result";
    pst =myconnection.getConnection().prepareStatement(sql);
    rs=pst.executeQuery();
    table_result.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
}
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_result = new javax.swing.JTable();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        table_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "RESULT URL"
            }
        ));
        jScrollPane1.setViewportView(table_result);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 350, 110);

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 580);

        setSize(new java.awt.Dimension(520, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
  String result_url;
result_url = JOptionPane.showInputDialog("ENTER RESULT SITE URL");
  PreparedStatement ps;
String query ="INSERT INTO `admin_result`(`result_url`) VALUES (?)";
try{
ps = myconnection.getConnection().prepareStatement(query);
ps.setString(1,result_url);
if(ps.executeUpdate() > 0)
{
     JOptionPane.showMessageDialog(null,"added successfully");
}
} catch (SQLException ex){
    Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
}
Update_table();
         
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String result_url = null;
        
result_url = JOptionPane.showInputDialog("ENTER RESULT SITE URL");
        PreparedStatement ps;
        String sql="DELETE FROM `admin_result` WHERE `result_url`=?";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,result_url);
            if(ps.execute())
            {   
                JOptionPane.showMessageDialog(null,"deleted successfully");
            }
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
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_result;
    // End of variables declaration//GEN-END:variables
}
