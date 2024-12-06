package assignment;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;;

public class SalesReportPrinter implements Printable {
  private final String date;
  private final String salesPerson;
  private final DefaultTableModel tableData;
  private final DecimalFormat df = new DecimalFormat("#,##0.00");

  public SalesReportPrinter(String date, String salesPerson, DefaultTableModel tableData) {
    this.date = date;
    this.salesPerson = salesPerson;
    this.tableData = tableData;
  }

  @Override
  public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
    if (pageIndex > 0) {
      return NO_SUCH_PAGE;
    }

    Graphics2D g2d = (Graphics2D) graphics;
    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

    int y = 20;
    int lineHeight = 15;

    // Header
    g2d.setFont(new Font("Arial", Font.BOLD, 16));
    g2d.drawString("Daily Sales Report", 50, y);
    y += lineHeight * 2;

    // Report details
    g2d.setFont(new Font("Arial", Font.PLAIN, 12));
    g2d.drawString("Date: " + date, 50, y);
    y += lineHeight;
    g2d.drawString("Sales Person: " + salesPerson, 50, y);
    y += lineHeight * 2;

    // Column headers
    g2d.setFont(new Font("Arial", Font.BOLD, 12));
    g2d.drawString("Item ID", 50, y);
    g2d.drawString("Item Name", 120, y);
    g2d.drawString("Quantity", 280, y);
    g2d.drawString("Price (RM)", 350, y);
    g2d.drawString("Total (RM)", 430, y);
    y += lineHeight;

    // Draw line under headers
    g2d.drawLine(50, y - 5, 500, y - 5);

    // Items
    double totalQuantity = 0;
    double totalAmount = 0;
    g2d.setFont(new Font("Arial", Font.PLAIN, 12));

    for (int i = 0; i < tableData.getRowCount(); i++) {
      String itemId = tableData.getValueAt(i, 0).toString();
      String itemName = tableData.getValueAt(i, 1).toString();
      double quantity = Double.parseDouble(tableData.getValueAt(i, 2).toString());
      double price = Double.parseDouble(tableData.getValueAt(i, 3).toString().replace(",", ""));
      double total = Double.parseDouble(tableData.getValueAt(i, 4).toString().replace(",", ""));

      g2d.drawString(itemId, 50, y);
      g2d.drawString(itemName, 120, y);
      g2d.drawString(df.format(quantity), 280, y);
      g2d.drawString(df.format(price), 350, y);
      g2d.drawString(df.format(total), 430, y);

      totalQuantity += quantity;
      totalAmount += total;
      y += lineHeight;
    }

    // Draw line above summary
    y += lineHeight;
    g2d.drawLine(50, y - 5, 500, y - 5);

    // Summary
    g2d.setFont(new Font("Arial", Font.BOLD, 12));
    g2d.drawString("Summary", 50, y);
    y += lineHeight;

    g2d.setFont(new Font("Arial", Font.PLAIN, 12));
    g2d.drawString("Total Items Sold: " + df.format(totalQuantity), 50, y);
    y += lineHeight;
    g2d.drawString("Total Sales Amount: RM " + df.format(totalAmount), 50, y);

    return PAGE_EXISTS;
  }
}
