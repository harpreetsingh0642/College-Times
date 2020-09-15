
package project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class faculty extends javax.swing.JFrame {
        private String name;
        private long contactno;
        private String designation;
        String hemail,hpassword;
        private faculty(String name,String designation,long contactno) {
       this.name = name;
       this.designation = designation;
       this.contactno = contactno;
    }
        public faculty(String email,String password)
    {
        initComponents();
                        PreparedStatement ps;
    ResultSet rs;
    String query = "SELECT * FROM admin_faculty";
    ArrayList<faculty> facultyList = new ArrayList<>();
    try {
        ps = myconnection.getConnection().prepareStatement(query);
        rs =ps.executeQuery();
        
        while(rs.next())
        {
          faculty fac =new faculty(rs.getString("name"),rs.getString("designation"),rs.getLong("contact no"));
          facultyList.add(fac);
           //System.out.println(facultyList);
        }
    }   catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
      for (int i = 0; i < facultyList.size(); i++) {
            jTextArea1_faculty.append("* Name-"+facultyList.get(i).getname()+"\n");
            jTextArea1_faculty.append("Designation-"+facultyList.get(i).getdesignation()+"\n");
            jTextArea1_faculty.append("Contact Number-"+facultyList.get(i).getcontactno()+"\n\n");
    }
        hemail=email;
        hpassword=password;
    }
    public long getcontactno() {
        return contactno;
    }
 
    public void setcontactno(long contactno) {
        this.contactno = contactno;
    }
 
    public String getname() {
        return name;
    }
 
    public void setname(String name) {
        this.name = name;
    }
 
    public String getdesignation() {
        return designation;
    }
 
    public void setdesignation(String designation) {
        this.designation = designation;
    }
    public faculty() {
        initComponents();
                   PreparedStatement ps;
    ResultSet rs;
    String query = "SELECT * FROM admin_faculty";
    ArrayList<faculty> facultyList = new ArrayList<>();
    try {
        ps = myconnection.getConnection().prepareStatement(query);
        rs =ps.executeQuery();
        
        while(rs.next())
        {
          faculty fac =new faculty(rs.getString("name"),rs.getString("designation"),rs.getLong("contact no"));
          facultyList.add(fac);
           //System.out.println(facultyList);
        }
    }   catch (SQLException ex) {   
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
      for (int i = 0; i < facultyList.size(); i++) {
            jTextArea1_faculty.append("* Name-"+facultyList.get(i).getname()+"\n");
            jTextArea1_faculty.append("Designation-"+facultyList.get(i).getdesignation()+"\n");
            jTextArea1_faculty.append("Contact Number-"+facultyList.get(i).getcontactno()+"\n\n");
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_faculty = new javax.swing.JTextArea();
        backbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 134, 244), 3, true));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faculty Details");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(90, 10, 300, 47);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setFocusable(false);

        jTextArea1_faculty.setColumns(20);
        jTextArea1_faculty.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jTextArea1_faculty.setLineWrap(true);
        jTextArea1_faculty.setRows(5);
        jTextArea1_faculty.setBorder(null);
        jTextArea1_faculty.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1_faculty.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1_faculty);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 460, 460);

        backbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\returns--button-png-image-80043.png")); // NOI18N
        backbutton.setBorder(null);
        backbutton.setContentAreaFilled(false);
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.setFocusPainted(false);
        backbutton.setFocusable(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(backbutton);
        backbutton.setBounds(10, 10, 40, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 480, 540);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Harpreet Singh\\Documents\\NetBeansProjects\\project\\bg-01.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 520, 580);

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
            java.util.logging.Logger.getLogger(faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(faculty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new faculty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1_faculty;
    // End of variables declaration//GEN-END:variables
}
