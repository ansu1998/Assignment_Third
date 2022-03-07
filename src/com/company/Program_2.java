//Java Program to Create String from Contents of a File

package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Program_2 {
        public static String fileToString(String p)
        {
            Path path = Paths.get(p);
            byte[] b = {};
            try {
                b = Files.readAllBytes(path);
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            String contents = new String(b);
            return contents;
        }
        public static void main(String[] args)
        {
            System.out.print(fileToString("E:\\god\\test1.txt"));
        }
    }
