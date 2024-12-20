/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.SalesManager;

import assignment.SalesManager.SalesManager;
import assignment.FileHandler;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class checkStockLevel extends javax.swing.JFrame {
  private SalesManager salesManager = new SalesManager();

  /**
   * Creates new form checkStockLevel
   */
  public checkStockLevel() {
    initComponents();
    salesManager.loadTable(jTable1);
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
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jButton2 = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton8 = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    belowThresholdButton = new javax.swing.JToggleButton();
    searchTextField = new javax.swing.JTextField();
    searchButton = new javax.swing.JButton();
    filterLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(950, 600));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("Check Stock Level");

    jPanel2.setBackground(new java.awt.Color(0, 0, 0));

    jButton2.setBackground(new java.awt.Color(0, 0, 0));
    jButton2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jButton2.setForeground(new java.awt.Color(255, 255, 255));
    jButton2.setText("<");
    jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

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

    jButton5.setBackground(new java.awt.Color(0, 0, 0));
    jButton5.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
    jButton5.setForeground(new java.awt.Color(255, 255, 255));
    jButton5.setText("Check Stock Level");
    jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jButton8.setBackground(new java.awt.Color(0, 0, 0));
    jButton8.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
    jButton8.setForeground(new java.awt.Color(255, 255, 255));
    jButton8.setText("View Purchase Orders");
    jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton8ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(287, 287, 287)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "Item ID", "Item Name", "Item Quantity", "Threshold"
        }) {
      Class[] types = new Class[] {
          java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
      };
      boolean[] canEdit = new boolean[] {
          false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types[columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    jTable1.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(jTable1);

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
    jLabel2.setText("Search:");

    belowThresholdButton.setText("Below Threshold");
    belowThresholdButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        belowThresholdButtonActionPerformed(evt);
      }
    });

    searchButton.setText("Search");
    searchButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        searchButtonActionPerformed(evt);
      }
    });

    filterLabel.setText("Filter:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 319,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(searchButton)))
                            .addGap(105, 105, 105)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(filterLabel)
                                .addComponent(belowThresholdButton))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(filterLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(belowThresholdButton)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE)));

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchButtonActionPerformed
    String searchText = searchTextField.getText().trim();
    if (!searchText.isEmpty()) {
      searchAndDisplayResult(searchText);
    } else {
      JOptionPane.showMessageDialog(this, "Please enter an item ID or Item Name", "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void searchAndDisplayResult(String searchText) {
    FileHandler fileHandler = new FileHandler("src/assignment/database/stock.txt");
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); // Clear existing rows

    List<String[]> lines = fileHandler.readData(); // Read all lines from stock.txt
    for (String[] data : lines) {
      if (data.length >= 4 && (data[0].trim().equals(searchText)) || (data[1].trim().equals(searchText))) {
        model.addRow(new Object[] {
            data[0].trim(), // Item ID
            data[1].trim(), // Item Name
            data[2].trim(), // Item Quantity
            data[3].trim() // Restock Level
        });
      }
    }
    if (model.getRowCount() == 0) {
      JOptionPane.showMessageDialog(this, "No matching items found", "No Matching Items", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void belowThresholdButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_belowThresholdButtonActionPerformed
    salesManager.showBelowStockLevel(this, belowThresholdButton, jTable1);
  }

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
    salesManagerPage salesManagerFrame = new salesManagerPage();
    salesManagerFrame.setVisible(true);
    salesManagerFrame.pack();
    salesManagerFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton2ActionPerformed

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

  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton5ActionPerformed
    checkStockLevel checkStockLevelFrame = new checkStockLevel();
    checkStockLevelFrame.setVisible(true);
    checkStockLevelFrame.pack();
    checkStockLevelFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton5ActionPerformed

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
      java.util.logging.Logger.getLogger(checkStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(checkStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(checkStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(checkStockLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new checkStockLevel().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JToggleButton belowThresholdButton;
  private javax.swing.JLabel filterLabel;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton8;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JButton searchButton;
  private javax.swing.JTextField searchTextField;
  // End of variables declaration//GEN-END:variables
}
