package session1;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

class ReaderCLI {

    public static int  tambah (int variable1, int  variable3) {
        int result;
        result = variable1 + variable3;
        return  result;
    }


    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("output.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}