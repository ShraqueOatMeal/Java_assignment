package assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import java.awt.print.PrinterJob;

public class SalesReportPreview extends JDialog {
  private JTextArea previewArea;

  public SalesReportPreview(JFrame parent, String date, String salesPerson, DefaultTableModel tableModel) {
    super(parent, "Sales Report Preview", true);

    // Create components
    previewArea = new JTextArea(25, 50);
    previewArea.setEditable(false);
    previewArea.setFont(new Font("Monospaced", Font.PLAIN, 12));

    // Generate report content
    StringBuilder report = new StringBuilder();
    report.append("                         SALES REPORT\n");
    report.append("========================================================\n\n");
    report.append("Date: ").append(date).append("\n");
    report.append("Sales Person: ").append(salesPerson).append("\n\n");
    report.append("---------------------------------------------------------\n");
    report.append(String.format("%-10s %-20s %10s %12s %12s\n",
        "Item ID", "Item Name", "Quantity", "Price", "Total"));
    report.append("---------------------------------------------------------\n");

    double grandTotal = 0;
    DecimalFormat df = new DecimalFormat("#,##0.00");

    // Add table data
    for (int i = 0; i < tableModel.getRowCount(); i++) {
      String itemId = tableModel.getValueAt(i, 0).toString();
      String itemName = tableModel.getValueAt(i, 1).toString();
      String quantity = tableModel.getValueAt(i, 2).toString();
      String price = tableModel.getValueAt(i, 3).toString();
      String total = tableModel.getValueAt(i, 4).toString();

      report.append(String.format("%-10s %-20s %10s %12s %12s\n",
          itemId,
          itemName.length() > 20 ? itemName.substring(0, 17) + "..." : itemName,
          quantity,
          price,
          total));

      grandTotal += Double.parseDouble(total.replace(",", ""));
    }

    report.append("---------------------------------------------------\n");
    report.append(String.format("%54s %12s\n", "Grand Total:", df.format(grandTotal)));
    report.append("===================================================\n");

    previewArea.setText(report.toString());

    // Layout
    setLayout(new BorderLayout());
    add(new JScrollPane(previewArea), BorderLayout.CENTER);

    JPanel buttonPanel = new JPanel();
    JButton printButton = new JButton("Print");
    JButton closeButton = new JButton("Close");

    printButton.addActionListener(e -> {
      try {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(new SalesReportPrinter(date, salesPerson, tableModel));
        if (job.printDialog()) {
          job.print();
          JOptionPane.showMessageDialog(this,
              "Report printed successfully", "Success",
              JOptionPane.INFORMATION_MESSAGE);
        }
      } catch (PrinterException ex) {
        JOptionPane.showMessageDialog(this,
            "Error printing report: " + ex.getMessage(),
            "Print Error",
            JOptionPane.ERROR_MESSAGE);
      }
    });

    closeButton.addActionListener(e -> dispose());

    buttonPanel.add(printButton);
    buttonPanel.add(closeButton);
    add(buttonPanel, BorderLayout.SOUTH);

    // Window settings
    pack();
    setLocationRelativeTo(parent);
  }
}
