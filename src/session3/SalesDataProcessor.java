package session3;

import java.io.*;
import java.util.*;

public class SalesDataProcessor {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        String inputFile = "sales.csv";          // file input CSV
        String outputFile = "sales_report.txt";  // file output laporan
        List<Map<String, String>> salesData = new ArrayList<>();

        // Baca data dari CSV
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isHeader = true;
            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // skip header
                    continue;
                }
                String[] values = line.split(",");
                Map<String, String> sale = new HashMap<>();
                sale.put("Product", values[0]);
                sale.put("Price", values[1]);
                sale.put("Quantity", values[2]);
                salesData.add(sale);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Proses data → hitung total sales per product
        Map<String, Double> productSales = new HashMap<>();
        for (Map<String, String> sale : salesData) {
            String product = sale.get("Product");
            double price = Double.parseDouble(sale.get("Price"));
            int quantity = Integer.parseInt(sale.get("Quantity"));
            double total = price * quantity;
            productSales.put(product, productSales.getOrDefault(product, 0.0) + total);
        }

        // Tulis laporan ke file TXT
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Product Sales Report\n");
            writer.write("--------------------\n");
            for (Map.Entry<String, Double> entry : productSales.entrySet()) {
                writer.write(entry.getKey() + ": $" + String.format("%.2f", entry.getValue()) + "\n");
            }
            System.out.println("Sales report generated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
