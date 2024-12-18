package com.qaScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
    public static void main(String[] args) {
        FileInputStream fls = null;
        try {
            fls = new FileInputStream("D:/Mithun.txt");
            int c;
            // Read the file character by character until the end of the file (-1)
            while ((c = fls.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Files not found " + e.getMessage());
            ;
        } catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());

        } finally {
            // Ensure the file input stream is closed in the finally block
            try {
                if (fls != null) {
                    fls.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file " + e.getMessage());
            }
        }
    }
}

