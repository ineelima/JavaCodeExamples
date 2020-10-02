package com.enexus.java;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
    public class ReadAndWriteFile {
    public static void main(String[] args) throws IOException {
        String strPath = "C:\\Users\\ineel\\IdeaProjects\\EnexusGlobaljavaCodes\\src\\main\\resources\\numbers.txt";
        String strPathToWrite="C:\\Users\\ineel\\IdeaProjects\\EnexusGlobaljavaCodes\\src\\main\\resources\\writeNumbers.txt";
        readTextFile(strPath,strPathToWrite);
       // writeTextFile(sPathToWrite);
    }
//    private static void writeTextFile(String strPathToWrite) throws IOException {
//        try {
//            FileWriter fr = new FileWriter(strPathToWrite);
//            BufferedWriter br = new BufferedWriter(fr);
//            br.write("Hi");
//            br.close();
////            String strLine;
////            while ((strLine = br.readLine()) != null) {
////                System.out.println(strLine);
////            }
//        } catch (Exception a) {
//            System.out.println(a);
//        }
//
//    }

    public static void ReverseAnumber(int num) {
        int orig_num = num;
        int temp = 0;
        int reverse = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println("the reversed number is " + reverse);
    }



    private static void readTextFile(String strPath,String strPathToWrite) {
        try {
            FileReader fr = new FileReader(strPath);
            BufferedReader br = new BufferedReader(fr);
            String strLine;
            FileWriter frw = new FileWriter(strPathToWrite);
            BufferedWriter brw = new BufferedWriter(frw);
            String ch;

//            while ((strLine = br.readLine()) != null) {
//                brw.write(strLine);
//                brw.newLine();
//                //System.out.println(strLine);
//                }

            List<String> tmp = new ArrayList<String>();

            do {
                strLine = br.readLine();
                tmp.add(strLine);
                System.out.println(strLine);
            } while (strLine != null);

//            while ((strLine = br.readLine()) != null) {
//                brw.write(strLine);
//                brw.newLine();
//                //System.out.println(strLine);
//                }
            for(int i=tmp.size()-1;i>=0;i--) {
              strLine=tmp.get(i);
              System.out.println(tmp.get(i));
              brw.write(tmp.get(i));
//                  brw.newLine();
            }

            br.close();
            brw.close();
        } catch (Exception a) {
        }
    }
}

