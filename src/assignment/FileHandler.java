package assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
  private String filePath;
  private List<String> records;

  // Constructor that accepts a file path and initializes the records list
  public FileHandler(String filePath) {
    this.filePath = filePath;
    this.records = new ArrayList<>();
    loadExistingRecords();
  }

  private void loadExistingRecords() {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        records.add(line);
      }
    } catch (IOException e) {
      System.err.println("Error loading records: " + e.getMessage());
    }
  }

  public List<String[]> readData() {
    List<String[]> datas = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] data = line.split(",");
        datas.add(data);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return datas;
  }

  public int getLastId() {
    int lastId = 0;
    if (!records.isEmpty()) {
      String[] parts = records.get(records.size() - 1).split(",");
      lastId = Integer.parseInt(parts[0]); // Assuming ID is the first column
    }
    return lastId;
  }

  // add a record to the list
  public void addRecord(String... columns) {
    StringBuilder record = new StringBuilder();
    for (int i = 0; i < columns.length; i++) {
      if (i > 0) {
        record.append(",");
      }
      record.append(columns[i]);
    }
    records.add(record.toString());
  }

  // Save all records to the file
  public void saveAllRecords() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
      for (String record : records) {
        writer.write(record);
        writer.newLine();
      }
      System.out.println("All records saved successfully.");
    } catch (IOException e) {
      System.err.println("Error saving records: " + e.getMessage());
    }
  }

  public void writeRecords(List<String> records) throws IOException {
    try (FileWriter writer = new FileWriter(filePath, false)) {
      for (String record : records) {
        writer.write(record + System.lineSeparator());
      }
    }
  }

  public void clearFileContents() {
    try (FileWriter writer = new FileWriter(filePath, false)) {
      writer.close();
    } catch (IOException e) {
      System.err.println("Error clearing file contents: " + e.getMessage());
    }
  }
}
