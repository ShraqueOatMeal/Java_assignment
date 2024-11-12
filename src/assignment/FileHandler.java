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

  public List<String[]> readUserData() {
    List<String[]> users = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = br.readLine()) != null) {
        String[] user = line.split(",");
        users.add(user);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return users;
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
  public void addRecord(int id, String... columns) {
    StringBuilder record = new StringBuilder();
    record.append(id);
    for (String column : columns) {
      record.append(",").append(column);
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
}
