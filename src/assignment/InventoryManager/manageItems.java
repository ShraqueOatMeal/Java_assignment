/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.InventoryManager;

import assignment.FileHandler;
import javax.swing.table.DefaultTableModel;

import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class manageItems extends javax.swing.JFrame {
  private InventoryManager inventoryManager;

  /**
   * Creates new form manageItems
   */
  public manageItems() {
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
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jButton8 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    jButton9 = new javax.swing.JButton();
    jButton10 = new javax.swing.JButton();
    jButton11 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(950, 600));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("Manage Items ");

    jPanel1.setBackground(new java.awt.Color(0, 0, 0));

    jButton8.setBackground(new java.awt.Color(0, 0, 0));
    jButton8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jButton8.setForeground(new java.awt.Color(204, 204, 204));
    jButton8.setText("<");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton8ActionPerformed(evt);
      }
    });

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

    jButton7.setText("Add");

    jButton9.setText("Delete");

    jButton10.setText("Save");

    jButton11.setText("Edit");

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {

        },
        new String[] {
            "Item ID", "Item Name", "Item Quantity", "Item Price", "Threshold"
        }) {
      boolean[] canEdit = new boolean[] {
          false, false, false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });
    jScrollPane1.setViewportView(jTable1);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(678, 678, 678)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)))
                .addContainerGap(163, Short.MAX_VALUE)));

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton8ActionPerformed
    inventoryManagerPage inventoryManager = new inventoryManagerPage();
    inventoryManager.setVisible(true);
    inventoryManager.pack();
    inventoryManager.setLocationRelativeTo(null);
    this.dispose();
  }// GEN-LAST:event_jButton8ActionPerformed

  private Object jButton10ActionPerformed(ActionEvent evt) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'jButton10ActionPerformed'");
  }

  private void loadTable() {
    InventoryManager inventoryManager = new InventoryManager();
    List<String[]> manageItems = inventoryManager.updateStockLevels();

    // Initialize the table model again (if needed)
    DefaultTableModel model = new DefaultTableModel(
        new Object[][] {},
        new String[] { "Item ID", "Item Name", "Threshold", "Item Price", "Item Quantity" });
    jTable1.setModel(model);

    model.setRowCount(0); // Clear any existing rows

    // Add rows to the table
    for (String[] row : manageItems) {
      model.addRow(row);
    }
  }

  private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton7ActionPerformed
    dialog = new javax.swing.JDialog(this, "Add New Item", true);

    // Fields
    itemIDField = new javax.swing.JTextField(15);
    itemNameField = new javax.swing.JTextField(15);
    ThresholdField = new javax.swing.JTextField(15);
    itemPriceField = new javax.swing.JTextField(15);
    itemQuantityField = new javax.swing.JTextField(15);

    // Labels
    JLabel itemIDLabel = new JLabel("Item ID:");
    JLabel itemNameLabel = new JLabel("Item Name:");
    JLabel ThresholdLabel = new JLabel("Threshold:");
    JLabel itemPriceLabel = new JLabel("Item Price:");
    JLabel itemQuantityLabel = new JLabel("Item Quantity:");

    // Button
    JButton buttonUpdate = new JButton("Update Item");
    buttonUpdate.addActionListener(e -> {
      try {
        String itemID = itemIDField.getText().trim();
        String itemName = itemNameField.getText().trim();
        int Threshold = Integer.parseInt(ThresholdField.getText().trim());
        int itemPrice = Integer.parseInt(itemPriceField.getText().trim());
        int itemQuantity = Integer.parseInt(itemQuantityField.getText().trim());

        // Ensure the Item ID follows the I0** format
        if (!itemID.matches("I\\d{3}")) {
          itemID = String.format("I%03d", Integer.parseInt(itemID));
        }

        if (itemID.isEmpty() || itemName.isEmpty() || Threshold <= 0 || itemPrice <= 0 || itemQuantity <= 0) {
          JOptionPane.showMessageDialog(dialog, "All fields are required!");
          return;
        }

        if (inventoryManager.addItem(itemID, itemName, Threshold, itemPrice, itemQuantity)) {
          dialog.dispose();
          loadTable();
        }
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(dialog, "Error Adding Item");
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
                .addComponent(itemIDLabel)
                .addComponent(itemNameLabel)
                .addComponent(ThresholdLabel)
                .addComponent(itemPriceLabel)
                .addComponent(itemQuantityLabel))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(itemIDField)
                .addComponent(itemNameField)
                .addComponent(ThresholdField)
                .addComponent(itemPriceField)
                .addComponent(itemQuantityField)
                .addComponent(buttonUpdate)));

    layout.setVerticalGroup(
        layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(itemIDLabel)
                .addComponent(itemIDField))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(itemNameLabel)
                .addComponent(itemNameField))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ThresholdLabel)
                .addComponent(ThresholdField))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(itemPriceLabel)
                .addComponent(itemPriceField))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(itemQuantityLabel)
                .addComponent(itemQuantityField))
            .addComponent(buttonUpdate));

    dialog.pack();
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
  }

  private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
    // GEN-FIRST:event_jButton9ActionPerformed
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
      JOptionPane.showMessageDialog(this, "Please select a item to delete");
      return;
    }

    String itemID = (String) jTable1.getValueAt(selectedRow, 0);

    int confirm = JOptionPane.showConfirmDialog(
        this,
        "Are you sure you want to delete "
            + itemID
            + "?");

    if (confirm == JOptionPane.YES_OPTION) {
      if (inventoryManager.removeItem(itemID)) {
        loadTable();
      }
    }
  }

  private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
      JOptionPane.showMessageDialog(this, "Please select an item to edit!");
      return;
    }

    // Get the selected item's details
    String itemID = (String) jTable1.getValueAt(selectedRow, 0);
    String itemName = (String) jTable1.getValueAt(selectedRow, 1);
    int Threshold = Integer.parseInt(jTable1.getValueAt(selectedRow, 2).toString());
    int itemPrice = Integer.parseInt(jTable1.getValueAt(selectedRow, 3).toString());
    int itemQuantity = Integer.parseInt(jTable1.getValueAt(selectedRow, 4).toString());

    // Create a dialog for editing the item
    JDialog editDialog = new JDialog(this, "Edit Item", true);
    editDialog.setLayout(new GridLayout(5, 2));

    // Create text fields for editing
    JTextField editItemNameField = new JTextField(itemName);
    JTextField editThresholdField = new JTextField(String.valueOf(Threshold));
    JTextField editItemPriceField = new JTextField(String.valueOf(itemPrice));
    JTextField editItemQuantityField = new JTextField(String.valueOf(itemQuantity));

    // Add components to the dialog
    editDialog.add(new JLabel("Item Name:"));
    editDialog.add(editItemNameField);
    editDialog.add(new JLabel("Threshold:"));
    editDialog.add(editThresholdField);
    editDialog.add(new JLabel("Item Price:"));
    editDialog.add(editItemPriceField);
    editDialog.add(new JLabel("Item Quantity:"));
    editDialog.add(editItemQuantityField);

    // Add an "Update" button
    JButton submitButton = new JButton("Update");
    submitButton.addActionListener(e -> {
      try {
        String newItemName = editItemNameField.getText().trim();
        int newThreshold = Integer.parseInt(editThresholdField.getText().trim());
        int newItemPrice = Integer.parseInt(editItemPriceField.getText().trim());
        int newItemQuantity = Integer.parseInt(editItemQuantityField.getText().trim());

        // Debugging logs
        System.out.println("Updating item with ID: " + itemID);

        // Update the item in the inventory manager
        if (inventoryManager.updateItem(itemID, newItemName, newThreshold, newItemPrice, newItemQuantity)) {
          // Directly update the table
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          model.setValueAt(newItemName, selectedRow, 1);
          model.setValueAt(newThreshold, selectedRow, 2);
          model.setValueAt(newItemPrice, selectedRow, 3);
          model.setValueAt(newItemQuantity, selectedRow, 4);

          editDialog.dispose();
          JOptionPane.showMessageDialog(this, "Item updated successfully!");
        } else {
          JOptionPane.showMessageDialog(this, "Error updating item");
        }
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Invalid input. Please enter numbers for status, price, and quantity.");
      }
    });

    editDialog.add(submitButton);
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
      java.util.logging.Logger.getLogger(manageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(manageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(manageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(manageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new manageItems().setVisible(true);
      }
    });
  }

  private javax.swing.JDialog dialog;
  private javax.swing.JTextField itemIDField;
  private javax.swing.JTextField itemNameField;
  private javax.swing.JTextField ThresholdField;
  private javax.swing.JTextField itemPriceField;
  private javax.swing.JTextField itemQuantityField;
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
  private javax.swing.JPanel jPanel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  // End of variables declaration//GEN-END:variables
}
