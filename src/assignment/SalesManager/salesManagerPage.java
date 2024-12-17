package assignment.SalesManager;

import assignment.UserType;
import assignment.Adminstrator.adminstratorPage;
import assignment.Login;
import javax.swing.JOptionPane;
import assignment.Session;

/**
 *
 * @author Admin
 */
public class salesManagerPage extends javax.swing.JFrame {
  private SalesManager salesManager = new SalesManager();

  /**
   * Creates new form salesManager
   */
  public salesManagerPage() {
    initComponents();
    loadAdminPage();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    logoutButton = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(850, 600));

    jPanel1.setBackground(new java.awt.Color(0, 0, 0));

    jButton1.setBackground(new java.awt.Color(0, 0, 0));
    jButton1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Create Requisition");
    jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton4.setBackground(new java.awt.Color(0, 0, 0));
    jButton4.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
    jButton4.setForeground(new java.awt.Color(255, 255, 255));
    jButton4.setText("Enter Daily Sales");
    jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jButton2.setBackground(new java.awt.Color(0, 0, 0));
    jButton2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
    jButton2.setForeground(new java.awt.Color(255, 255, 255));
    jButton2.setText("Check Stock Level");
    jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jButton5.setBackground(new java.awt.Color(0, 0, 0));
    jButton5.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
    jButton5.setForeground(new java.awt.Color(255, 255, 255));
    jButton5.setText("View Purchase Orders");
    jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("Sales Manager");

    jTextField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 450,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE)));
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 299,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    logoutButton.setBackground(new java.awt.Color(0, 0, 0));
    logoutButton.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
    logoutButton.setForeground(new java.awt.Color(255, 255, 255));
    logoutButton.setText("Logout");
    logoutButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    logoutButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        logoutButtonActionPerformed(evt);
      }
    });

    jButton6.setText("Admin");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182,
                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton6)
                .addContainerGap(147, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void loadAdminPage() {
    Session currentSession = Session.getInstance();

    // Check if the current user's access level indicates admin (1 = Admin)
    if (currentSession != null && currentSession.getAccessLevel() != 1) {
      // Open the Admin page
      jButton6.setVisible(false); // Hide the Admin button if the user is not an Admin
    }
  }

  private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutButtonActionPerformed
    if (JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm Logout",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
      salesManager.logout();
      this.dispose();
    }
  } // GEN-LAST:event_backButtonActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
    createRequisition createRequisitionFrame = new createRequisition();
    createRequisitionFrame.setVisible(true);
    createRequisitionFrame.pack();
    createRequisitionFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton1ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
    enterDailySales enterDailySalesFrame = new enterDailySales();
    enterDailySalesFrame.setVisible(true);
    enterDailySalesFrame.pack();
    enterDailySalesFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton4ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
    checkStockLevel checkStockLevelFrame = new checkStockLevel();
    checkStockLevelFrame.setVisible(true);
    checkStockLevelFrame.pack();
    checkStockLevelFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton2ActionPerformed

  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
    viewPurchaseOrder viewPurchaseOrderFrame = new viewPurchaseOrder();
    viewPurchaseOrderFrame.setVisible(true);
    viewPurchaseOrderFrame.pack();
    viewPurchaseOrderFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton5ActionPerformed

  private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backButtonActionPerformed
    if (JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Confirm Logout",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
      Session.getInstance().clearSession();
      Login loginFrame = new Login();
      loginFrame.setVisible(true);
      loginFrame.pack();
      loginFrame.setLocationRelativeTo(null);
      this.dispose();
    }
  } // GEN-LAST:event_backButtonActionPerformed

  private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
    adminstratorPage adminstratorPageFrame = new adminstratorPage();
    adminstratorPageFrame.setVisible(true);
    adminstratorPageFrame.pack();
    adminstratorPageFrame.setLocationRelativeTo(null);
    this.dispose(); // Close the current Finance Manager page

  }

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
      java.util.logging.Logger.getLogger(salesManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
          ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(salesManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
          ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(salesManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
          ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(salesManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
          ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new salesManagerPage().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JButton logoutButton;
  // End of variables declaration//GEN-END:variables
}
