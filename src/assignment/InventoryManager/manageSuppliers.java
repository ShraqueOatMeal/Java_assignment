/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.InventoryManager;

import java.util.List;
import assignment.FileHandler;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class manageSuppliers extends javax.swing.JFrame {
  private InventoryManager inventoryManager;

  /**
   * Creates new form manageSuppliers
   */
  public manageSuppliers() {
    inventoryManager = new InventoryManager();
    initComponents();
    loadTable();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jButton8 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    jButton7 = new javax.swing.JButton();
    jButton9 = new javax.swing.JButton();
    jButton10 = new javax.swing.JButton();
    jButton11 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(950, 600));

    jPanel1.setBackground(new java.awt.Color(0, 0, 0));

    jButton8.setBackground(new java.awt.Color(0, 0, 0));
    jButton8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jButton8.setForeground(new java.awt.Color(204, 204, 204));
    jButton8.setText("H");

    jButton2.setBackground(new java.awt.Color(0, 0, 0));
    jButton2.setForeground(new java.awt.Color(255, 255, 255));
    jButton2.setText("Manage Suppliers");
    jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    jButton2.setBorderPainted(false);
    jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jButton1.setBackground(new java.awt.Color(0, 0, 0));
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("Manage Items");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton4.setBackground(new java.awt.Color(0, 0, 0));
    jButton4.setForeground(new java.awt.Color(255, 255, 255));
    jButton4.setText("Track Inventory Value");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jButton6.setBackground(new java.awt.Color(0, 0, 0));
    jButton6.setForeground(new java.awt.Color(255, 255, 255));
    jButton6.setText("Update Stock Levels");
    jButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton6ActionPerformed(evt);
      }
    });

    jButton7.addActionListener(evt -> jButton7ActionPerformed(evt));
    jButton9.addActionListener(evt -> jButton9ActionPerformed(evt));
    jButton11.addActionListener(evt -> jButton11ActionPerformed(evt));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(316, Short.MAX_VALUE)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("Manage Suppliers");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "Supplier ID", "Supplier Name", "Supplier Item ID"
        }));
    jScrollPane1.setViewportView(jTable1);

    jButton7.setText("Add");

    jButton9.setText("Delete");

    jButton10.setText("Save");

    jButton11.setText("Edit");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)))
                .addContainerGap(148, Short.MAX_VALUE)));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void loadTable() {
    InventoryManager inventoryManager = new InventoryManager();
    List<String[]> manageSuppliers = inventoryManager.manageSuppliers();

    // Initialize the table model again (if needed)
    DefaultTableModel model = new DefaultTableModel(
        new Object[][] {},
        new String[] { "Supplier ID", "Supplier Name", "Supplier Item ID" });
    jTable1.setModel(model);

    model.setRowCount(0); // Clear any existing rows

    // Add rows to the table
    for (String[] row : manageSuppliers) {
      model.addRow(row);
    }
  }

  private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
    dialog = new javax.swing.JDialog(this, "Add New Supplier", true);

    // Fields
    supplierIDField = new javax.swing.JTextField(15);
    supplierNameField = new javax.swing.JTextField(15);
    supplierItemIDField = new javax.swing.JTextField(15);

    // Labels
    JLabel supplierIDLabel = new JLabel("Supplier ID:");
    JLabel supplierNameLabel = new JLabel("Supplier Name:");
    JLabel supplierItemIDLabel = new JLabel("Supplier Item ID:");

    // Button
    JButton buttonUpdate = new JButton("Update Supplier");
    buttonUpdate.addActionListener(e -> {
      try {
        String supplierID = supplierIDField.getText().trim();
        String supplierName = supplierNameField.getText().trim();
        String supplierItemID = supplierItemIDField.getText().trim();

        if (supplierID.isEmpty() || supplierName.isEmpty() || supplierItemID.isEmpty()) {
          JOptionPane.showMessageDialog(dialog, "All fields are required!");
          return;
        }
        if (inventoryManager.addSupplier(supplierID, supplierName, supplierItemID)) {
          dialog.dispose();
          loadTable();
        }
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(dialog, "Error Adding Supplier");
      }
    });

    // Set up layout
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(dialog.getContentPane());
    dialog.getContentPane().setLayout(layout);
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

    layout.setHorizontalGroup(
        layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(supplierIDLabel)
                .addComponent(supplierNameLabel)
                .addComponent(supplierItemIDLabel))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(supplierIDField)
                .addComponent(supplierNameField)
                .addComponent(supplierItemIDField)
                .addComponent(buttonUpdate)));

    layout.setVerticalGroup(
        layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(supplierIDLabel)
                .addComponent(supplierIDField))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(supplierNameLabel)
                .addComponent(supplierNameField))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(supplierItemIDLabel)
                .addComponent(supplierItemIDField))
            .addComponent(buttonUpdate));

    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
  }

  public void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
    // GEN-FIRST:event_jButton9ActionPerformed
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
      JOptionPane.showMessageDialog(this, "Please select a supplier to delete");
      return;
    }

    String supplierID = (String) jTable1.getValueAt(selectedRow, 0);

    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to delete "
            + supplierID
            + "?");

    if (confirm == JOptionPane.YES_OPTION) {
      if (inventoryManager.removeSupplier(supplierID)) {
        loadTable();
      }
    }
  }

  public void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
      JOptionPane.showMessageDialog(this, "Please select a supplier to edit!");
      return;
    }

    // Get the selected supplier's details
    String supplierID = (String) jTable1.getValueAt(selectedRow, 0);
    String supplierName = (String) jTable1.getValueAt(selectedRow, 1);
    String supplierItemID = (String) jTable1.getValueAt(selectedRow, 2);

    // Create a dialog for editing the supplier
    JDialog editDialog = new JDialog(this, "Edit Supplier", true);
    GroupLayout layout = new GroupLayout(editDialog.getContentPane());
    editDialog.getContentPane().setLayout(layout);

    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);

    // Components
    JLabel supplierIDLabel = new JLabel("Supplier ID:");
    JTextField editSupplierIDField = new JTextField(supplierID);
    JLabel supplierNameLabel = new JLabel("Supplier Name:");
    JTextField editSupplierNameField = new JTextField(supplierName);
    JLabel supplierItemIDLabel = new JLabel("Supplier Item ID:");
    JTextField editSupplierItemIDField = new JTextField(supplierItemID);
    JButton submitButton = new JButton("Update");

    // Add components to the dialog
    editDialog.add(new JLabel("Supplier ID:"));
    editDialog.add(editSupplierIDField);
    editDialog.add(new JLabel("Supplier Name:"));
    editDialog.add(editSupplierNameField);
    editDialog.add(new JLabel("Supplier Item ID:"));
    editDialog.add(editSupplierItemIDField);

    // Add an "Update" button
    // Button Action
    submitButton.addActionListener(e -> {
      String newSupplierID = editSupplierIDField.getText().trim();
      String newSupplierName = editSupplierNameField.getText().trim();
      String newSupplierItemID = editSupplierItemIDField.getText().trim();

      if (inventoryManager.updateSupplier(newSupplierID, newSupplierName, newSupplierItemID)) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setValueAt(newSupplierID, selectedRow, 0);
        model.setValueAt(newSupplierName, selectedRow, 1);
        model.setValueAt(newSupplierItemID, selectedRow, 2);

        editDialog.dispose();

        JOptionPane.showMessageDialog(this, "Supplier updated successfully!");
      } else {
        JOptionPane.showMessageDialog(this, "Error updating supplier");
      }
    });

    // Group Layout Horizontal
    layout.setHorizontalGroup(
        layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(supplierIDLabel)
                .addComponent(supplierNameLabel)
                .addComponent(supplierItemIDLabel))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(editSupplierIDField)
                .addComponent(editSupplierNameField)
                .addComponent(editSupplierItemIDField)
                .addComponent(submitButton)));

    // Group Layout Vertical
    layout.setVerticalGroup(
        layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(supplierIDLabel)
                .addComponent(editSupplierIDField))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(supplierNameLabel)
                .addComponent(editSupplierNameField))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(supplierItemIDLabel)
                .addComponent(editSupplierItemIDField))
            .addComponent(submitButton));

    editDialog.pack();
    editDialog.setLocationRelativeTo(this);
    editDialog.setVisible(true);
  }

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
    manageSuppliers manageSuppliersFrame = new manageSuppliers();
    manageSuppliersFrame.setVisible(true);
    manageSuppliersFrame.pack();
    manageSuppliersFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
    manageItems manageItemsFrame = new manageItems();
    manageItemsFrame.setVisible(true);
    manageItemsFrame.pack();
    manageItemsFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton1ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
    trackInventoryValue trackInventoryValueFrame = new trackInventoryValue();
    trackInventoryValueFrame.setVisible(true);
    trackInventoryValueFrame.pack();
    trackInventoryValueFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton4ActionPerformed

  private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton6ActionPerformed
    updateStockLevels updateStockLevelsFrame = new updateStockLevels();
    updateStockLevelsFrame.setVisible(true);
    updateStockLevelsFrame.pack();
    updateStockLevelsFrame.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton6ActionPerformed

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
      java.util.logging.Logger.getLogger(manageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(manageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(manageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(manageSuppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new manageSuppliers().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton10;
  private javax.swing.JButton jButton11;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JButton jButton8;
  private javax.swing.JButton jButton9;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JDialog dialog;
  private javax.swing.JTextField supplierIDField;
  private javax.swing.JTextField supplierNameField;
  private javax.swing.JTextField supplierItemIDField;
  // End of variables declaration//GEN-END:variables
}
