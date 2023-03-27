import  java.awt.event.ActionListener;
import  java.awt.event.ActionEvent;
import  java.sql.Connection;
import  java.sql.ResultSet;    
import  java.sql.SQLException;     
import  java.sql.Statement;    
import  java.util.logging.Level;     
import  java.util.logging.Logger;    
import  javax.swing.JOptionPane;      
        
        
public class AdminLogin extends javax.swing.JFrame implements ActionListener{

    
    public AdminLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backAdmin = new javax.swing.JButton();
        logAdmin = new javax.swing.JButton();
        adminuser = new javax.swing.JTextField();
        adminPinCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        backAdmin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        backAdmin.setText("BACK");
        backAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backAdminActionPerformed(evt);
            }
        });
        jPanel1.add(backAdmin);
        backAdmin.setBounds(400, 210, 90, 30);

        logAdmin.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        logAdmin.setText("LOG IN");
        logAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logAdminActionPerformed(evt);
            }
        });
        jPanel1.add(logAdmin);
        logAdmin.setBounds(400, 260, 90, 30);

        adminuser.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        adminuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(adminuser);
        adminuser.setBounds(160, 210, 210, 30);

        adminPinCode.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        adminPinCode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(adminPinCode);
        adminPinCode.setBounds(160, 260, 210, 30);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("USERNAME :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 206, 90, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("PINCODE :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 260, 80, 30);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 530, 120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backAdminActionPerformed
         pickFrame pf = new pickFrame();
        pf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backAdminActionPerformed

    private void logAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logAdminActionPerformed
      MainClass main = new MainClass();
        
       String Uname = adminuser.getText(); 
       String Pword = adminPinCode.getText();
       
       try
       {
       int log = 1;
       Connection Conn = main.getConnection();
       Statement stmt = Conn.createStatement();
       String sql = "Select * from admin_account";
       ResultSet rs = stmt.executeQuery(sql);
       while (rs.next()){
       if (rs.getString(1).equals(Uname) && rs.getString(2).equals(Pword)){
       log = 0;
       break;
             }
       }
       if (log == 0)
       {
       dispose();
       new aLoginSuccessfully().setVisible(true);
       }
       else{
       JOptionPane.showMessageDialog(null,"Log in Failed","COnnection Failed",JOptionPane.ERROR_MESSAGE);
       adminuser .setText("");
       adminPinCode.setText("");
       }
       
       
       }catch (SQLException ex){
        Logger.getLogger(EmployeeLogin.class.getName()).log(Level.SEVERE,null,ex);   
               }
       
       
       
       
     
        
       
    }//GEN-LAST:event_logAdminActionPerformed

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminPinCode;
    private javax.swing.JTextField adminuser;
    private javax.swing.JButton backAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logAdmin;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
