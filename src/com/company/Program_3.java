//Java program to count the number of lines in a file using Scanner class

package com.company;

import java.io.File;
import java.util.Scanner;

class Program_3 {
    public static void main(String[] args) {

        int count = 0;

        try {
            File file = new File("E:\\god\\test1.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                sc.nextLine();
                count++;
            }
            System.out.println("Total Number of Lines: " + count);
            sc.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

