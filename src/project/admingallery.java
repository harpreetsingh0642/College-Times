package project;
import java.io.File;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
public class admingallery extends javax.swing.JFrame {
    Connection conn =null;
ResultSet rs=null;
PreparedStatement pst=null;
String hemail,hpassword;
    public admingallery() {
        initComponents();
        Update_table();
    }
    public admingallery(String email,String password) {
        initComponents();
        hemail=email;
        hpassword=password;
        Update_table();
    }
     private void Update_table(){
        try{
    String sql="select * from admin_gallery";
    pst =myconnection.getConnection().prepareStatement(sql);
    rs=pst.executeQuery();
    table_gallery.setModel(DbUtils.resultSetToTableModel(rs));
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
        table_gallery = new javax.swing.JTable();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        table_gallery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "image_id", "url"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_gallery);
        if (table_gallery.getColumnModel().getColumnCount() > 0) {
            table_gallery.getColumnModel().getColumn(0).setResizable(false);
            table_gallery.getColumnModel().getColumn(0).setPreferredWidth(0);
            table_gallery.getColumnModel().getColumn(0).setHeaderValue("image_id");
            table_gallery.getColumnModel().getColumn(1).setHeaderValue("url");
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 350, 155);

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
        getContentPane().add(add);
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
        getContentPane().add(delete);
        delete.setBounds(400, 210, 90, 40);

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 580);

        setSize(new java.awt.Dimension(520, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
  JFileChooser chooser = new JFileChooser();
  chooser.showOpenDialog(null);
  File f=chooser.getSelectedFile();
  String filename=f.getAbsolutePath();
  JOptionPane.showMessageDialog(null,filename);
  String id;
id = JOptionPane.showInputDialog("ENTER IMAGE ID");
  PreparedStatement ps;
String query ="INSERT INTO `admin_gallery`(`image_id`, `image_url`) VALUES (?,?)";
try{
ps = myconnection.getConnection().prepareStatement(query);
ps.setString(1,id);
ps.setString(2,filename);
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
   String id = null;
        
id = JOptionPane.showInputDialog("ENTER IMAGE ID");
        PreparedStatement ps;
        String sql="DELETE FROM `admin_gallery` WHERE `image_id`=?";
        try{
            ps = myconnection.getConnection().prepareStatement(sql);
            ps.setString(1,id);
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

    public static void main(String args[]) 
    {
        new admingallery().setVisible(true);
    }{
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
            java.util.logging.Logger.getLogger(admingallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admingallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admingallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admingallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_gallery;
    // End of variables declaration//GEN-END:variables
}
