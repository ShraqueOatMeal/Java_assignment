/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import assignment.Adminstrator.adminstrator;

/**
 *
 * @author Admin
 */
public class Login extends javax.swing.JFrame {

  /**
   * Creates new form Login
   */
  public Login() {
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
    jPanel2 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jPasswordField1 = new javax.swing.JPasswordField();
    jTextField2 = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Login");
    setPreferredSize(new java.awt.Dimension(800, 500));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
    jPanel1.setLayout(null);

    jPanel2.setBackground(new java.awt.Color(255, 255, 102));
    jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel5.setText("Java Assignment");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel5)
                .addContainerGap(124, Short.MAX_VALUE)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE)));

    jPanel1.add(jPanel2);
    jPanel2.setBounds(0, 0, 390, 520);

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("Login");
    jPanel1.add(jLabel1);
    jLabel1.setBounds(530, 60, 100, 50);

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setText("Email");
    jPanel1.add(jLabel2);
    jLabel2.setBounds(440, 154, 40, 20);

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel3.setText("Password");
    jPanel1.add(jLabel3);
    jLabel3.setBounds(440, 260, 60, 14);
    jPanel1.add(jPasswordField1);
    jPasswordField1.setBounds(440, 280, 310, 50);

    jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    jTextField2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField2ActionPerformed(evt);
      }
    });
    jPanel1.add(jTextField2);
    jTextField2.setBounds(440, 180, 310, 50);

    jLabel4.setText("I dont have a account");
    jPanel1.add(jLabel4);
    jLabel4.setBounds(440, 420, 120, 14);

    jButton2.setBackground(new java.awt.Color(255, 255, 255));
    jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jButton2.setText("Login");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton2);
    jButton2.setBounds(440, 350, 80, 40);

    jButton3.setText("Forget Password?");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });
    jPanel1.add(jButton3);
    jButton3.setBounds(610, 340, 140, 23);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField2ActionPerformed
    // TODO add your handling code here:
  }// GEN-LAST:event_jTextField2ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
    String email = jTextField2.getText();
    String password = new String(jPasswordField1.getPassword());
    if (authenticated(email, password)) {
      JOptionPane.showMessageDialog(this, "Logged in successfully");
      adminstrator adminFrame = new adminstrator();
      adminFrame.setVisible(true);
      adminFrame.pack();
      adminFrame.setLocationRelativeTo(null);
      this.dispose();
    }
  }// GEN-LAST:event_jButton2ActionPerformed

  private boolean authenticated(String email, String password) {
    try (BufferedReader br = new BufferedReader(new FileReader("src/assignment/database/users.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] user = line.split(",");
        if (user[1].equals(email) && user[3].equals(password)) {
          return true;
        } else {
          JOptionPane.showMessageDialog(this, "Invalid email or password");
          return false;
        }
      }
    } catch (IOException e) {
      JOptionPane.showMessageDialog(this, "Cannot read file");
      e.printStackTrace();
    }
    return false;
  }

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
    changePassword changePasswordFrame = new changePassword();
    changePasswordFrame.setVisible(true);
    changePasswordFrame.pack();
    changePasswordFrame.setLocationRelativeTo(null);
    this.dispose();

  }// GEN-LAST:event_jButton3ActionPerformed

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
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    // </editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPasswordField jPasswordField1;
  private javax.swing.JTextField jTextField2;
  // End of variables declaration//GEN-END:variables
}
