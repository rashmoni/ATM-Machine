package utils;

import Customer.Customer;

import java.io.*;
import java.util.Scanner;

public class FileWriter {
    private static Scanner scanner;
    private static String filepath = "assets/details.txt";
    public static void editRecord(Customer customer) {
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        try {
            java.io.FileWriter fw = new java.io.FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            scanner = new Scanner(new File(filepath));
            String editTerm = customer.getAccNumber();
            String updatedText = customer.toString();

            while (scanner.hasNextLine()) {
                String scannedLine = scanner.nextLine();
                int firstComma = scannedLine.indexOf(",");
                if (scannedLine.substring(0, firstComma).equals(editTerm)) {
                    pw.print(updatedText + "\n");
                } else
                    pw.print(scannedLine + "\n");
            }
            scanner.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        } catch (IOException e) {
            System.out.println("Error when updating the File ");
            throw new RuntimeException(e);
        }
    }

    public static void addNewRecord(Customer newCustomer) {
        String textToSave = newCustomer.toString();
        File file = new File(filepath);
        try {
            java.io.FileWriter writer = new java.io.FileWriter(file, true);
            PrintWriter dataOut = new PrintWriter(writer);
            dataOut.print("\n" + textToSave);
            dataOut.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
