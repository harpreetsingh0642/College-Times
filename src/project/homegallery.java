
package project;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
public class homegallery extends javax.swing.JFrame {
     String[] list=new String[5];
     Timer tm;
    ArrayList<homegallery> galleryList = new ArrayList<>();
    int x = 0;
     String image_url;
     String hemail,hpassword;
    //Images Path In Array
      public homegallery(String image_url)
    {
        this.image_url=image_url;
    }

    
    public String getimage_url() {
    return image_url;
}
    public homegallery(String email,String password) {
        initComponents();
        hemail=email;
        hpassword=password;
         PreparedStatement ps;
    ResultSet rs;
   
    String query = "SELECT image_url FROM `admin_gallery`";
    try {
        ps = myconnection.getConnection().prepareStatement(query);
        rs =ps.executeQuery();
        //while loop for adding image_url from database to galleryList
        while(rs.next())
        {
       homegallery g =new homegallery(rs.getString("image_url"));
          galleryList.add(g);
            System.out.println("size"+galleryList.size());
        }
    }   
catch (SQLException ex) 
{   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
}
     
           //for loop to display galleryList
            for (int i = 0; i < galleryList.size(); i++) {
            System.out.println(" * "+galleryList.get(i).getimage_url());
            }
            //for loop to copy galleryList to array(named list)
            for (int i = 0; i <galleryList.size(); i++) {
            list[i]=galleryList.get(i).getimage_url();
              System.out.println("list:"+list[i]);
            }
            SetImageSize(0);
               //set a timer
        tm = new Timer(700, (ActionEvent e) -> {
            SetImageSize(x);
            x += 1;
            if(x >= galleryList.size())
                x = 0;
        });
        
        tm.start();
    }
    public homegallery() {
        initComponents();
         PreparedStatement ps;
    ResultSet rs;
   
    String query = "SELECT image_url FROM `admin_gallery`";
    try {
        ps = myconnection.getConnection().prepareStatement(query);
        rs =ps.executeQuery();
        //while loop for adding image_url from database to galleryList
        while(rs.next())
        {
       homegallery g =new homegallery(rs.getString("image_url"));
          galleryList.add(g);
            System.out.println("size"+galleryList.size());
        }
    }   
catch (SQLException ex) 
{   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
}
     
           //for loop to display galleryList
            for (int i = 0; i < galleryList.size(); i++) {
            System.out.println(" * "+galleryList.get(i).getimage_url());
            }
            //for loop to copy galleryList to array(named list)
            for (int i = 0; i <galleryList.size(); i++) {
            list[i]=galleryList.get(i).getimage_url();
            //  System.out.println("list:"+list[i]);
            }
            SetImageSize(0);
               //set a timer
        tm = new Timer(700, (ActionEvent e) -> {
            SetImageSize(x);
            x += 1;
            if(x >= galleryList.size())
                x = 0;
        });
        
        tm.start();
    }
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
        //add(pic);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backbutton = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

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
        backbutton.setBounds(0, 0, 40, 40);
        jPanel1.add(pic);
        pic.setBounds(0, 40, 520, 540);

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

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
       this.setVisible(false);
       new Home(hemail,hpassword).setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(homegallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homegallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homegallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homegallery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
                new homegallery().setVisible(true);
            }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
