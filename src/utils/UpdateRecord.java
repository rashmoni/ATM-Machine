package utils;

import Customer.Customer;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class UpdateRecord {
    private static Scanner scanner;

    public static void editRecord(Customer customer) {

        String filepath = "assets/details.txt";
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        try {
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            scanner= new Scanner(new File(filepath));
            String editTerm = customer.getAccNumber();
            String updatedText = customer.toString();

            while (scanner.hasNextLine()){
                String scannedLine = scanner.nextLine();
                int firstComma = scannedLine.indexOf(",");
                if (scannedLine.substring(0,firstComma).equals(editTerm)){
                    pw.print(updatedText+"\n");
                }
                else
                    pw.print(scannedLine+"\n");
            }
            scanner.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump=new File(filepath);
            newFile.renameTo(dump);
        } catch (IOException e) {
            System.out.println("Error when updating the File ");
            throw new RuntimeException(e);
        }
    }

    public static void addNewRecord(Customer newCustomer) {
        String filePath = "assets/details.txt";
        String textToSave = newCustomer.toString();
        File file = new File(filePath);

        try {
            FileWriter writer = new FileWriter(file, true);
            PrintWriter dataOut = new PrintWriter(writer);
            dataOut.print("\n"+textToSave);
            dataOut.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        }
    }
