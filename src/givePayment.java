
public class givePayment extends javax.swing.JFrame {

    
    public givePayment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        id01 = new javax.swing.JTextField();
        name01 = new javax.swing.JTextField();
        balance01 = new javax.swing.JTextField();
        position01 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        rp = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        gpButton = new javax.swing.JButton();
        text_gp = new javax.swing.JTextField();
        totalpay = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 570, 90);

        id01.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        id01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id01ActionPerformed(evt);
            }
        });
        jPanel1.add(id01);
        id01.setBounds(150, 140, 240, 30);

        name01.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        name01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(name01);
        name01.setBounds(150, 190, 240, 30);

        balance01.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        balance01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(balance01);
        balance01.setBounds(150, 240, 240, 30);

        position01.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        position01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(position01);
        position01.setBounds(150, 290, 240, 30);

        EmployeeTable.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(EmployeeTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 350, 570, 150);

        rp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        rp.setText("SHOW RECENT PAYMENTS");
        rp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rpActionPerformed(evt);
            }
        });
        jPanel1.add(rp);
        rp.setBounds(230, 510, 190, 23);

        cancel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cancel.setText("CANCEL");
        jPanel1.add(cancel);
        cancel.setBounds(450, 510, 90, 23);

        gpButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        gpButton.setText("GIVEPAY");
        jPanel1.add(gpButton);
        gpButton.setBounds(440, 140, 100, 23);

        text_gp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        text_gp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(text_gp);
        text_gp.setBounds(440, 170, 100, 50);

        totalpay.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        totalpay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(totalpay);
        totalpay.setBounds(440, 270, 100, 40);

        jLabel1.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel1.setText("TOTAL BALANCE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 250, 112, 15);

        jLabel2.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel2.setText("EMPLOYEE  INFORMATION");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 90, 180, 20);

        jLabel3.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel3.setText("ID:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 145, 40, 20);

        jLabel4.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel4.setText("EMPLOYEE NAME:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 200, 130, 15);

        jLabel5.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel5.setText("BALANCE:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 250, 80, 15);

        jLabel6.setFont(new java.awt.Font("Century", 1, 12)); // NOI18N
        jLabel6.setText("POSITION :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 300, 80, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void id01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id01ActionPerformed

    private void rpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rpActionPerformed

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
            java.util.logging.Logger.getLogger(givePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(givePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(givePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(givePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new givePayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JTextField balance01;
    private javax.swing.JButton cancel;
    private javax.swing.JButton gpButton;
    private javax.swing.JTextField id01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name01;
    private javax.swing.JTextField position01;
    private javax.swing.JButton rp;
    private javax.swing.JTextField text_gp;
    private javax.swing.JTextField totalpay;
    // End of variables declaration//GEN-END:variables
}