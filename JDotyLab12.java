/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package csci1011.jdotylab12;

/**
 * CSCI 1011 Lab 12
 * @author Jason Doty
 * This program prints reads and appends from the scanner object
 */

import java.io.*;
import java.util.Scanner;

public class JDotyLab12 {

   public static void main(String[] args) {
        // Test openFileForWriting
        PrintWriter writer = openFileForWriting("testfile.txt");
        System.out.println("Opened file testfile.txt for writing");
        writeLines(writer); // Write lines to the file
        writer.close();
        System.out.println("Wrote 2 lines to testfile.txt");

        // Test openFileForReading
        Scanner reader = openFileForReading("testfile.txt");
        System.out.println("Opened file testfile.txt for reading");
        readLinesFromFile(reader); // Read and display lines from the file
        reader.close();

        // Test openFileForAppending
        PrintWriter appendWriter = openFileForAppending("testfile.txt");
        System.out.println("Opened file testfile.txt for appending");
        writeLines(appendWriter); // Append lines to the file
        appendWriter.close();
        System.out.println("Wrote 2 lines to testfile.txt");

        // Test openFileForReading again
        reader = openFileForReading("testfile.txt");
        System.out.println("Opened file testfile.txt for reading");
        readLinesFromFile(reader); // Read and display lines from the file
        reader.close();
    }

    // Method to open a file for writing
    public static PrintWriter openFileForWriting(String fileName) {
        try {
            return new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            System.exit(1);
            return null; // Unreachable, but required for compilation
        }
    }

    // Method to open a file for appending
    public static PrintWriter openFileForAppending(String fileName) {
        try {
            return new PrintWriter(new FileOutputStream(fileName, true));
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            System.exit(1);
            return null; // Unreachable, but required for compilation
        }
    }

    // Method to open a file for reading
    public static Scanner openFileForReading(String fileName) {
        try {
            return new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            System.exit(1);
            return null; // Unreachable, but required for compilation
        }
    }

    // Method to write lines to the PrintWriter object
    public static void writeLines(PrintWriter writer) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text you want to write to the file. Enter a blank line when you are done:");

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            writer.println(line);
        }
    }

    // Method to read lines from a Scanner object and display them
    public static void readLinesFromFile(Scanner scanner) {
        int lineCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            lineCount++;
        }
        System.out.println("Read " + lineCount + " lines from testfile.txt");
    }
}
