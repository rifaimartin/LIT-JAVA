package session1;


import java.io.IOException;
import java.io.PrintWriter;

public class MyClass {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        PrintWriter writer2 = new PrintWriter(System.out); // System.out.println is a PrintWriter
        writer2.println("Jack, 8");
        writer2.close();
        int status;


        // TODO:
        // nama, tinggi badan
        try(PrintWriter writer = new PrintWriter("output.txt")) {
            writer.println("Jack, 8");
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}