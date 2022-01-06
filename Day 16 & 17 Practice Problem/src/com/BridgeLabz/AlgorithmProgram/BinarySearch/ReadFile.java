package com.BridgeLabz.AlgorithmProgram.BinarySearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {
    public static ArrayList<String> readFile() {
        ArrayList<String> dataArray = new ArrayList<>();
        String data = " ";
        String filePath = "C:\\Users\\vivks\\Desktop\\BridgeLabzFellowshipPP\\Day 16 & 17 Practice Problem\\" +
                "src\\com\\BridgeLabz\\AlgorithmProgram\\BinarySearch\\demo.txt" ;

        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                data = myReader.nextLine().replaceAll(",", data);
                String[] data1 = data.split("\\W+");
                for(String s: data1)
                    dataArray.add(s);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return dataArray;
    }
}