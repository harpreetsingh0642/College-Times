package project;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class adminnotification extends javax.swing.JFrame {
Connection conn =null;
ResultSet rs=null;
PreparedStatement pst=null;
String hemail,hpassword;
    public adminnotification() {
        initComponents();
       
        Update_table();
    }
     public adminnotification(String email,String password) {
        initComponents();
        hemail=email;
        hpassword=password;
        Update_table();
    }
    private void Update_table(){
        try{
    String sql="select * from admin_notification";
    pst =myconnection.getConnection().prepareStatement(sql);
    rs=pst.executeQuery();
    table_notification.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_notification = new javax.swing.JTable();
        ADD = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        table_notification.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "n_id", "notification"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_notification);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 350, 155);

        ADD.setBackground(new java.awt.Color(255, 255, 255));
        ADD.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setText("ADD");
        ADD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        ADD.setContentAreaFilled(false);
        ADD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADD.setHideActionText(true);
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        getContentPane().add(ADD);
        ADD.setBounds(400, 130, 90, 40);

        backbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\returns--button-png-image-80043.png")); // NOI18N
        backbutton.setContentAreaFilled(false);
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.setFocusPainted(false);
        backbutton.setFocusable(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton);
        backbutton.setBounds(10, 20, 40, 40);

        DELETE.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE");
        DELETE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        DELETE.setContentAreaFilled(false);
        DELETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        getContentPane().add(DELETE);
        DELETE.setBounds(400, 210, 90, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 580);

        setSize(new java.awt.Dimension(520, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed

  String notification;
notification = JOptionPane.showInputDialog("ENTER NOTIFICATION");
  PreparedStatement ps;
String query ="INSERT INTO `admin_notification`(`notification`) VALUES (?)";
try{
ps = myconnection.getConnection().prepareStatement(query);
ps.setString(1,notification);
if(ps.executeUpdate() > 0)
{
     JOptionPane.showMessageDialog(null,"added successfully");

}
} catch (SQLException ex){
    Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
}
Update_table();
    }//GEN-LAST:event_ADDActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
     String n_id= null;
        
n_id= JOptionPane.showInputDialog("ENTER NOTIFICATION ID");
        PreparedStatement ps;
        String sql="DELETE FROM `admin_notification` WHERE `n_id`=?";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,n_id);
            ps.execute();
            JOptionPane.showMessageDialog(null,"deleted successfully");
            Update_table();
            
        }catch(SQLException ex)
        {
Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }//GEN-LAST:event_DELETEActionPerformed

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
            java.util.logging.Logger.getLogger(adminnotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminnotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminnotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminnotification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminnotification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_notification;
    // End of variables declaration//GEN-END:variables
}
