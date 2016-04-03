/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.csvapplication.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Chetan
 */
public class ReadCSV {

    public ReadCSV() {

    }

    public void readFile() {

        String line = "";
        String csvSplit = ",";

        try {
            BufferedReader reader = new BufferedReader(new FileReader("d:/Employees.csv"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] Salary = line.split(csvSplit);
                int i = Integer.parseInt(Salary[4]);
                if (i <= 10000) {
                    WriteCSV w = new WriteCSV();
                    w.fwrite(line);
                    System.out.println("data written...");
                }
            }
//               System.out.println("Salary is greater than 10000");
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
