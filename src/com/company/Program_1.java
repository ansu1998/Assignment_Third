//Delete a non-empty directory
package com.company;
import java.io.File;


public class Program_1 {
    public static void main(String[] args) {

        try {
            File directory = new File("E:\\ansu");

            File[] files = directory.listFiles();

            for(File file : files) {
                System.out.println(file + " deleted.");
                file.delete();
            }
            if(directory.delete()) {
                System.out.println("Directory Deleted");
            }
            else {
                System.out.println("Directory not Found");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
