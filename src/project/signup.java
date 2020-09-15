
package project;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class signup extends javax.swing.JFrame {
String email,password;
    public signup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_email = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();
        jbutton_login_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 580));
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 10, 140, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Email");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-10, 60, 100, 40);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setMinimumSize(new java.awt.Dimension(0, 17));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(240, 85));

        jTextArea_email.setColumns(20);
        jTextArea_email.setRows(5);
        jScrollPane1.setViewportView(jTextArea_email);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 130, 100, 50);
        jPanel2.add(jPasswordField_password);
        jPasswordField_password.setBounds(20, 170, 220, 30);

        jbutton_login_.setBackground(new java.awt.Color(103, 167, 248));
        jbutton_login_.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jbutton_login_.setForeground(new java.awt.Color(255, 255, 255));
        jbutton_login_.setText("LOGIN");
        jbutton_login_.setBorderPainted(false);
        jbutton_login_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbutton_login_.setFocusPainted(false);
        jbutton_login_.setFocusable(false);
        jbutton_login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_login_ActionPerformed(evt);
            }
        });
        jPanel2.add(jbutton_login_);
        jbutton_login_.setBounds(79, 220, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Have not account yet?");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 370, 150, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 153));
        jButton2.setText("Sign Up");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(80, 400, 100, 17);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(120, 70, 280, 440);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 520, 580);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 520, 580);

        setSize(new java.awt.Dimension(520, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_login_ActionPerformed
 
        PreparedStatement ps;
        ResultSet rs;
email = jTextArea_email.getText();
password = String.valueOf(jPasswordField_password.getPassword());
if(email.equals("")||password.equals(""))
{
    JOptionPane.showMessageDialog(null,"Any field is Empty");
}
else{
String query = "SELECT * FROM `app_users` WHERE `u_email`=? AND `u_password`=?";
try{
    ps=myconnection.getConnection().prepareStatement(query);
     System.out.println(ps);
    ps.setString(1,email);
    ps.setString(2,password);
    rs = ps.executeQuery();
    
   if(rs.next())
    {
        
        //Home obj =new Home(email,password);
        new Home(email,password).setVisible(true);
        this.setVisible(false);
       // new Home.setVisible(true);
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Invalid Email or Password");
    }
        
    
} catch (SQLException ex){
    Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
}
//        this.setVisible(false);
//        new Home().setVisible(true);

    }//GEN-LAST:event_jbutton_login_ActionPerformed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
new signup().setVisible(true);
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea_email;
    private javax.swing.JButton jbutton_login_;
    // End of variables declaration//GEN-END:variables
}
