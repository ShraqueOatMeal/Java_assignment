/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.SalesManager;

/**
 *
 * @author Admin
 */
public class viewItems extends javax.swing.JFrame {

  /**
   * Creates new form viewItems
   */
  public viewItems() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    backButton = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    jButton8 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(950, 600));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("View Items Page");

    jPanel4.setBackground(new java.awt.Color(255, 255, 153));

    backButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    backButton.setText("<");
    backButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jButton3.setBackground(new java.awt.Color(204, 255, 204));
    jButton3.setText("Create Requisition");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jButton6.setBackground(new java.awt.Color(204, 255, 204));
    jButton6.setText("Generate Sales Report");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
      }
    });

    jButton4.setBackground(new java.awt.Color(204, 255, 204));
    jButton4.setText("View Items");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jButton5.setBackground(new java.awt.Color(204, 255, 204));
    jButton5.setText("Enter Daily Sales");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jButton7.setBackground(new java.awt.Color(204, 255, 204));
    jButton7.setText("Check Stock Level");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton7ActionPerformed(evt);
      }
    });

    jButton8.setBackground(new java.awt.Color(204, 255, 204));
    jButton8.setText("View Purchase Orders");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton8ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addContainerGap(23, Short.MAX_VALUE)));

    jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
    jLabel2.setText("Enter Item Name: ");

    jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

    jButton1.setText("S");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "Item ID", "Item Name", "Item Quantity", "Item Status"
        }) {
      Class[] types = new Class[] {
          java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean[] {
          true, true, true, false
      };

      public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    jScrollPane1.setViewportView(jTable1);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addGap(0, 0, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63,
                                    Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
    salesManagerPage salesManagerFrame = new salesManagerPage();
    salesManagerFrame.setVisible(true);
    salesManagerFrame.pack();
    salesManagerFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
    createRequisition createRequisitionFrame = new createRequisition();
    createRequisitionFrame.setVisible(true);
    createRequisitionFrame.pack();
    createRequisitionFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton3ActionPerformed

  private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
    generateSalesReport generateSalesReportFrame = new generateSalesReport();
    generateSalesReportFrame.setVisible(true);
    generateSalesReportFrame.pack();
    generateSalesReportFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton6ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
    viewItems viewItemsFrame = new viewItems();
    viewItemsFrame.setVisible(true);
    viewItemsFrame.pack();
    viewItemsFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton4ActionPerformed

  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
    enterDailySales enterDailySalesFrame = new enterDailySales();
    enterDailySalesFrame.setVisible(true);
    enterDailySalesFrame.pack();
    enterDailySalesFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton5ActionPerformed

  private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
    checkStockLevel checkStockLevelFrame = new checkStockLevel();
    checkStockLevelFrame.setVisible(true);
    checkStockLevelFrame.pack();
    checkStockLevelFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton7ActionPerformed

  private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
    viewPurchaseOrder viewPurchaseOrderFrame = new viewPurchaseOrder();
    viewPurchaseOrderFrame.setVisible(true);
    viewPurchaseOrderFrame.pack();
    viewPurchaseOrderFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton8ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // (optional) ">
    /*
     * If Nimbus (introduced in Java SE 6) is not available, stay with the default
     * look and feel.
     * For details see
     * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(viewItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(viewItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(viewItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(viewItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new viewItems().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton backButton;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JButton jButton8;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTextField jTextField1;
  // End of variables declaration//GEN-END:variables
}
